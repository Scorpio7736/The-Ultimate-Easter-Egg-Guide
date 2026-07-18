package com.example.the_ultimate_easter_egg_guide.Pages.Navigation;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.the_ultimate_easter_egg_guide.MapData.Maps;
import com.example.the_ultimate_easter_egg_guide.MapData.MapsWarehouse;
import com.example.the_ultimate_easter_egg_guide.Models.NavPageController_BaseClass;
import com.example.the_ultimate_easter_egg_guide.Models.Games;
import com.example.the_ultimate_easter_egg_guide.Helper.MapAdapter;
import com.example.the_ultimate_easter_egg_guide.Helper.PageTransitionManager;
import com.example.the_ultimate_easter_egg_guide.Pages.MapDisplay_Page;
import com.example.the_ultimate_easter_egg_guide.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapsSelection_Page extends NavPageController_BaseClass implements MapAdapter.OnMapClickListener {

    private boolean isGridView = true;
    private RecyclerView mapsRecyclerView;
    private MapAdapter mapAdapter;
    private Games currentSelectedGame;
    private final Map<Games, MapAdapter> gridAdapters = new HashMap<>();
    private final Map<Games, MapAdapter> listAdapters = new HashMap<>();
    private final Map<Games, Drawable> backgroundCache = new HashMap<>();
    private final Games DEFAULT_GAME = ENABLE_TESTING ? Games.Test : Games.World_At_War;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maps_selection_page);
        
        setupBaseNavigation();

        mapsRecyclerView = findViewById(R.id.maps_recycler_view);

        setupGameFilter(R.id.myDropdown, false, game -> {
            currentSelectedGame = game;
            if (currentSelectedGame != null) {
                loadGameData(currentSelectedGame, true);
            }
        });

        // Initialize with default
        currentSelectedGame = DEFAULT_GAME;
        loadGameData(currentSelectedGame, false);

        // Sync spinner selection
        List<Games> visibleGames = Games.getVisibleGames(ENABLE_TESTING);
        int index = visibleGames.indexOf(DEFAULT_GAME);
        if (index != -1) {
            ((Spinner)findViewById(R.id.myDropdown)).setSelection(index);
        }

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

        // Navigation bar settings button removed, handled by base class
    }

    @Override
    public void onMapClick(Maps map) {
        Intent intent = new Intent(MapsSelection_Page.this, MapDisplay_Page.class);
        intent.putExtra("MAP_ID", map.name());
        PageTransitionManager.startActivityWithFade(MapsSelection_Page.this, intent);
    }

    private void loadGameData(Games selectedGame, boolean animate) {
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

    private int getBackgroundForGame(Games game) {
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

    @Override
    public void onMapsButtonClick(View view) {
        // Already on this page
    }
}
