package com.example.the_ultimate_easter_egg_guide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MapsSelection_Page extends AppCompatActivity {

    private boolean isGridView = true;
    private GridView mapsGridView;
    private List<MapNames> currentMaps = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PageTransitionManager.setupTransitions(this);
        setContentView(R.layout.maps_selection_page);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        mapsGridView = findViewById(R.id.maps_grid_view);

        Spinner spinner = findViewById(R.id.myDropdown);
        List<String> gameNames = new ArrayList<>();
        for (games game : games.values()) {
            gameNames.add(game.gameName);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, gameNames);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                games selectedGame = games.values()[position];
                currentMaps = MapNames.getMapsForGame(selectedGame);
                updateGridView();
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

    private void updateGridView() {
        if (isGridView) {
            mapsGridView.setNumColumns(2);
        } else {
            mapsGridView.setNumColumns(1);
        }
        MapAdapter mapAdapter = new MapAdapter(this, currentMaps, isGridView);
        mapsGridView.setAdapter(mapAdapter);
    }

    public void onHomeButtonClick(View view) {
        PageTransitionManager.startActivityWithFade(this, Home_PAGE.class);
    }

    public void onMapsButtonClick(View view) {
        // Already on this page
    }
}