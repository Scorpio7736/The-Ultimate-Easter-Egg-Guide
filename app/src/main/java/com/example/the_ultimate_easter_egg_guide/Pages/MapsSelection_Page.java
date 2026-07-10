package com.example.the_ultimate_easter_egg_guide.Pages;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.the_ultimate_easter_egg_guide.MapData.Maps;
import com.example.the_ultimate_easter_egg_guide.MapData.MapsWarehouse;
import com.example.the_ultimate_easter_egg_guide.Models.games;
import com.example.the_ultimate_easter_egg_guide.Helper.MapAdapter;
import com.example.the_ultimate_easter_egg_guide.Helper.PageTransitionManager;
import com.example.the_ultimate_easter_egg_guide.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import android.widget.ImageButton;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapsSelection_Page extends AppCompatActivity implements MapAdapter.OnMapClickListener {

    private boolean isGridView = true;
    private RecyclerView mapsRecyclerView;
    private MapAdapter mapAdapter;
    private games currentSelectedGame;
    private final Map<games, MapAdapter> gridAdapters = new HashMap<>();
    private final Map<games, MapAdapter> listAdapters = new HashMap<>();
    private final Map<games, Drawable> backgroundCache = new HashMap<>();

    // Configuration for game selection
    private static final boolean DEV_MODE = false; // Set to true to ONLY show TEST game and maps
    private static final games DEFAULT_GAME = DEV_MODE ? games.Test : games.World_At_War;
    private static final List<games> EXCLUDED_GAMES = java.util.Arrays.asList(games.Test);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PageTransitionManager.setupTransitions(this);
        setContentView(R.layout.maps_selection_page);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        mapsRecyclerView = findViewById(R.id.maps_recycler_view);

        Spinner spinner = findViewById(R.id.myDropdown);
        List<games> filteredGames = new ArrayList<>();
        List<String> gameNames = new ArrayList<>();
        for (games game : games.values()) {
            if (DEV_MODE) {
                if (game == games.Test) {
                    filteredGames.add(game);
                    gameNames.add(game.gameName);
                }
            } else {
                if (!EXCLUDED_GAMES.contains(game)) {
                    filteredGames.add(game);
                    gameNames.add(game.gameName);
                }
            }
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, gameNames);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        // Find index of default game, otherwise use 0
        int defaultPosition = 0;
        for (int i = 0; i < filteredGames.size(); i++) {
            if (filteredGames.get(i) == DEFAULT_GAME) {
                defaultPosition = i;
                break;
            }
        }
        spinner.setSelection(defaultPosition);
        currentSelectedGame = filteredGames.get(defaultPosition);

        // Initialize with selected game immediately
        loadGameData(currentSelectedGame, false);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstSelection = true;

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (isFirstSelection) {
                    isFirstSelection = false;
                    return; // Skip animation on first automated selection
                }
                currentSelectedGame = filteredGames.get(position);
                loadGameData(currentSelectedGame, true);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Do nothing
            }
        });

        FloatingActionButton toggleButton = findViewById(R.id.view_toggle_button);
        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isGridView = !isGridView;
                if (isGridView) {
                    toggleButton.setImageResource(R.drawable.ic_view_list);
                    Toast.makeText(MapsSelection_Page.this, "Switched to Grid View", Toast.LENGTH_SHORT).show();
                } else {
                    toggleButton.setImageResource(R.drawable.ic_view_module);
                    Toast.makeText(MapsSelection_Page.this, "Switched to List View", Toast.LENGTH_SHORT).show();
                }
                updateGridView();
            }
        });

        ImageButton settingsButton = findViewById(R.id.nav_settings_button);
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PageTransitionManager.startActivityWithFade(MapsSelection_Page.this, Settings_PAGE.class);
            }
        });
    }

    @Override
    public void onMapClick(Maps map) {
        Intent intent = new Intent(MapsSelection_Page.this, MapDisplay_Page.class);
        intent.putExtra("MAP_ID", map.name());
        PageTransitionManager.startActivityWithFade(MapsSelection_Page.this, intent);
    }

    private void loadGameData(games selectedGame, boolean animate) {
        currentSelectedGame = selectedGame;
        ImageView backgroundImage = findViewById(R.id.background_image);

        // Lazy load background drawable only when needed
        if (!backgroundCache.containsKey(selectedGame)) {
            backgroundCache.put(selectedGame, ContextCompat.getDrawable(this, getBackgroundForGame(selectedGame)));
        }
        Drawable background = backgroundCache.get(selectedGame);

        if (animate) {
            // Fade out current content
            mapsRecyclerView.animate().alpha(0f).setDuration(200).withLayer().withEndAction(() -> {
                backgroundImage.setImageDrawable(background);
                updateGridView();
                // Fade back in
                mapsRecyclerView.animate().alpha(1f).setDuration(300).withLayer().start();
            }).start();
        } else {
            // Instant load for startup
            backgroundImage.setImageDrawable(background);
            updateGridView();
        }
    }

    private void updateGridView() {
        // Lazy load adapters only when the specific game is selected
        if (isGridView) {
            mapsRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));
            if (!gridAdapters.containsKey(currentSelectedGame)) {
                gridAdapters.put(currentSelectedGame, new MapAdapter(MapsWarehouse.getMapsForGame(currentSelectedGame), true, this));
            }
            mapAdapter = gridAdapters.get(currentSelectedGame);
        } else {
            mapsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
            if (!listAdapters.containsKey(currentSelectedGame)) {
                listAdapters.put(currentSelectedGame, new MapAdapter(MapsWarehouse.getMapsForGame(currentSelectedGame), false, this));
            }
            mapAdapter = listAdapters.get(currentSelectedGame);
        }
        
        mapsRecyclerView.setAdapter(mapAdapter);
        
        // Trigger the layout animation to hide data swap popping
        mapsRecyclerView.scheduleLayoutAnimation();
    }

    private int getBackgroundForGame(games game) {
        switch (game) {
            case World_At_War:
                return R.drawable.waw_bkg_m;
            case Black_Ops_I:
                return R.drawable.boi_bkg_m;
            case Black_Ops_II:
                return R.drawable.boii_bkg_m;
            case Black_Ops_III:
                return R.drawable.boiii_bkg_m;
            case Black_Ops_IV:
                return R.drawable.boiv_bkg_m;
            case Black_Ops_Cold_War:
            case Black_Ops_VI:
            case Black_Ops_VII:
            case Test:
            default:
                return R.drawable.general_bkg;
        }
    }

    public void onHomeButtonClick(View view) {
        PageTransitionManager.startActivityWithFade(this, Home_PAGE.class);
    }

    public void onMapsButtonClick(View view) {
        // Already on this page
    }

    public void onStorylineButtonClick(View view) {
        PageTransitionManager.startActivityWithFade(this, Storyline_PAGE.class);
    }

    public void onToolsButtonClick(View view) {
        PageTransitionManager.startActivityWithFade(this, Tools_PAGE.class);
    }
}
