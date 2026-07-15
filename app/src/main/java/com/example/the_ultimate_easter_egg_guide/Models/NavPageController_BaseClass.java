package com.example.the_ultimate_easter_egg_guide.Models;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.example.the_ultimate_easter_egg_guide.Helper.PageTransitionManager;
import com.example.the_ultimate_easter_egg_guide.Pages.Home_PAGE;
import com.example.the_ultimate_easter_egg_guide.Pages.MapsSelection_Page;
import com.example.the_ultimate_easter_egg_guide.Pages.Settings_PAGE;
import com.example.the_ultimate_easter_egg_guide.Pages.StorylineSelection_PAGE;
import com.example.the_ultimate_easter_egg_guide.Pages.Tools_PAGE;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.ItemGroups;
import com.example.the_ultimate_easter_egg_guide.R;

import java.util.ArrayList;
import java.util.List;

public abstract class NavPageController_BaseClass extends PageController_BaseClass
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PageTransitionManager.setupTransitions(this, getExcludedTransitionIds());

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }

    protected int[] getExcludedTransitionIds() {
        return new int[]{
                R.id.navigation_bar,
                R.id.nav_home_button,
                R.id.nav_maps_button,
                R.id.nav_blank_button_1,
                R.id.nav_blank_button_2,
                R.id.nav_settings_button
        };
    }

    /**
     * Call this in onCreate after setContentView to automatically link the settings button
     * if it exists in the layout.
     */
    protected void setupBaseNavigation() {
        ImageButton settingsButton = findViewById(R.id.nav_settings_button);
        if (settingsButton != null) {
            settingsButton.setOnClickListener(v ->
                    PageTransitionManager.startActivityWithFade(this, Settings_PAGE.class));
        }
    }

    protected void setGameFilterVisibility(boolean visible) {
        setGameFilterVisibility(visible, "Filter by Game");
    }

    protected void setGameFilterVisibility(boolean visible, String titleText) {
        TextView title = findViewById(R.id.game_filter_title);
        View spinner = findViewById(R.id.game_filter_spinner);
        int visibility = visible ? View.VISIBLE : View.GONE;
        
        if (title != null) {
            title.setVisibility(visibility);
            title.setText(titleText);
        }
        if (spinner != null) spinner.setVisibility(visibility);
    }

    protected interface OnGameSelectedListener {
        void onGameSelected(@Nullable Games selectedGame);
    }

    protected interface OnFilterSelectedListener<T> {
        void onFilterSelected(@Nullable T selectedItem);
    }

    protected void setupGameFilter(OnGameSelectedListener listener) {
        setupFilter(Games.class, "All Games", (OnFilterSelectedListener<Games>) listener::onGameSelected);
    }

    protected <T extends Enum<T>> void setupFilter(Class<T> enumClass, String allOptionText, OnFilterSelectedListener<T> listener) {
        Spinner filterSpinner = findViewById(R.id.game_filter_spinner);
        if (filterSpinner == null) return;

        List<String> displayNames = new ArrayList<>();
        displayNames.add(allOptionText);
        
        T[] enumConstants = enumClass.getEnumConstants();
        List<T> filteredConstants = new ArrayList<>();
        
        if (enumConstants != null) {
            for (T constant : enumConstants) {
                // Special handling for Games which has a gameName field
                String displayName = constant.name();
                if (constant instanceof Games) {
                    if (!ENABLE_TESTING && constant == Games.Test) continue;
                    displayName = ((Games) constant).gameName;
                } else if (constant instanceof ItemGroups) {
                    if (!ENABLE_TESTING && constant == ItemGroups.TEST) continue;
                    displayName = ((ItemGroups) constant).displayName;
                }
                
                displayNames.add(displayName);
                filteredConstants.add(constant);
            }
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, displayNames);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        filterSpinner.setAdapter(adapter);

        filterSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                T selectedItem = null;
                if (position != 0) {
                    selectedItem = filteredConstants.get(position - 1);
                }
                if (listener != null) listener.onFilterSelected(selectedItem);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });
    }

    public void onHomeButtonClick(View view) {
        if (!(this instanceof Home_PAGE)) {
            PageTransitionManager.startActivityWithFade(this, Home_PAGE.class);
        }
    }

    public void onMapsButtonClick(View view) {
        if (!(this instanceof MapsSelection_Page)) {
            PageTransitionManager.startActivityWithFade(this, MapsSelection_Page.class);
        }
    }

    public void onStorylineButtonClick(View view) {
        if (!(this instanceof StorylineSelection_PAGE)) {
            PageTransitionManager.startActivityWithFade(this, StorylineSelection_PAGE.class);
        }
    }

    public void onToolsButtonClick(View view) {
        if (!(this instanceof Tools_PAGE)) {
            PageTransitionManager.startActivityWithFade(this, Tools_PAGE.class);
        }
    }
}
