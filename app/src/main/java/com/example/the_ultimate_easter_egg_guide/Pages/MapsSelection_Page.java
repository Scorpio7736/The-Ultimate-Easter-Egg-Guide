package com.example.the_ultimate_easter_egg_guide.Pages;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.example.the_ultimate_easter_egg_guide.MapData.Maps;
import com.example.the_ultimate_easter_egg_guide.Models.games;
import com.example.the_ultimate_easter_egg_guide.Helper.MapAdapter;
import com.example.the_ultimate_easter_egg_guide.Helper.PageTransitionManager;
import com.example.the_ultimate_easter_egg_guide.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapsSelection_Page extends AppCompatActivity {

    private boolean isGridView = true;
    private GridView mapsGridView;
    private List<Maps> currentMaps = new ArrayList<>();
    private MapAdapter mapAdapter;
    private games currentSelectedGame;
    private final Map<games, MapAdapter> gridAdapters = new HashMap<>();
    private final Map<games, MapAdapter> listAdapters = new HashMap<>();
    private final Map<games, Drawable> backgroundCache = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PageTransitionManager.setupTransitions(this);
        setContentView(R.layout.maps_selection_page);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        // Pre-cache all map lists, adapters, and backgrounds to eliminate lag during switching
        for (games game : games.values()) {
            List<Maps> maps = Maps.getMapsForGame(game);
            gridAdapters.put(game, new MapAdapter(this, maps, true));
            listAdapters.put(game, new MapAdapter(this, maps, false));
            backgroundCache.put(game, ContextCompat.getDrawable(this, getBackgroundForGame(game)));
        }

        mapsGridView = findViewById(R.id.maps_grid_view);
        mapsGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Maps clickedMap = currentMaps.get(position);
                Intent intent = new Intent(MapsSelection_Page.this, MapDisplay_Page.class);
                intent.putExtra("MAP_ID", clickedMap.name());
                PageTransitionManager.startActivityWithFade(MapsSelection_Page.this, intent);
            }
        });

        Spinner spinner = findViewById(R.id.myDropdown);
        List<String> gameNames = new ArrayList<>();
        for (games game : games.values()) {
            gameNames.add(game.gameName);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, gameNames);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        // Find index of World at War as default, otherwise use 0
        int defaultPosition = 0;
        for (int i = 0; i < games.values().length; i++) {
            if (games.values()[i] == games.World_At_War) {
                defaultPosition = i;
                break;
            }
        }
        spinner.setSelection(defaultPosition);
        currentSelectedGame = games.values()[defaultPosition];

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
                currentSelectedGame = games.values()[position];
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

    private void loadGameData(games selectedGame, boolean animate) {
        currentSelectedGame = selectedGame;
        ImageView backgroundImage = findViewById(R.id.background_image);

        if (animate) {
            // Fade out current content
            mapsGridView.animate().alpha(0f).setDuration(200).withLayer().withEndAction(() -> {
                backgroundImage.setImageDrawable(backgroundCache.get(selectedGame));
                updateGridView();
                // Fade back in
                mapsGridView.animate().alpha(1f).setDuration(300).withLayer().start();
            }).start();
        } else {
            // Instant load for startup
            backgroundImage.setImageDrawable(backgroundCache.get(selectedGame));
            updateGridView();
        }
    }

    private void updateGridView() {
        if (isGridView) {
            mapsGridView.setNumColumns(2);
            mapAdapter = gridAdapters.get(currentSelectedGame);
        } else {
            mapsGridView.setNumColumns(1);
            mapAdapter = listAdapters.get(currentSelectedGame);
        }
        
        mapsGridView.setAdapter(mapAdapter);
        
        // Update currentMaps for click listener
        currentMaps = Maps.getMapsForGame(currentSelectedGame);
        
        // Trigger the layout animation to hide data swap popping
        mapsGridView.scheduleLayoutAnimation();
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
}