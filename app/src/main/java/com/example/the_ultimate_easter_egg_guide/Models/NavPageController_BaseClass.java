package com.example.the_ultimate_easter_egg_guide.Models;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.the_ultimate_easter_egg_guide.Helper.PageTransitionManager;
import com.example.the_ultimate_easter_egg_guide.Pages.Navigation.Home_PAGE;
import com.example.the_ultimate_easter_egg_guide.Pages.Navigation.MapsSelection_Page;
import com.example.the_ultimate_easter_egg_guide.Pages.Navigation.Settings_PAGE;
import com.example.the_ultimate_easter_egg_guide.Pages.Navigation.StorylineSelection_PAGE;
import com.example.the_ultimate_easter_egg_guide.Pages.Navigation.Tools_PAGE;
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
        setupGameFilter(R.id.game_filter_spinner, listener);
    }

    protected void setupGameFilter(int spinnerId, OnGameSelectedListener listener) {
        setupGameFilter(spinnerId, true, listener);
    }

    protected void setupGameFilter(int spinnerId, boolean includeAllOption, OnGameSelectedListener listener) {
        setupFilter(spinnerId, Games.class, includeAllOption ? "All Games" : null, (OnFilterSelectedListener<Games>) listener::onGameSelected);
    }

    protected <T extends Enum<T>> void setupFilter(Class<T> enumClass, String allOptionText, OnFilterSelectedListener<T> listener) {
        setupFilter(R.id.game_filter_spinner, enumClass, allOptionText, listener);
    }

    protected <T extends Enum<T>> void setupFilter(int spinnerId, Class<T> enumClass, @Nullable String allOptionText, OnFilterSelectedListener<T> listener) {
        Spinner filterSpinner = findViewById(spinnerId);
        if (filterSpinner == null) return;

        List<String> displayNames = new ArrayList<>();
        boolean hasAllOptionLocal = false;
        if (!ENABLE_TESTING && allOptionText != null) {
            displayNames.add(allOptionText);
            hasAllOptionLocal = true;
        }
        final boolean hasAllOption = hasAllOptionLocal;
        
        List<T> filteredConstants = new ArrayList<>();
        
        if (enumClass == Games.class) {
            List<Games> visibleGames = Games.getVisibleGames(ENABLE_TESTING);
            for (Games game : visibleGames) {
                displayNames.add(game.gameName);
                filteredConstants.add((T) game);
            }
        } else {
            T[] enumConstants = enumClass.getEnumConstants();
            if (enumConstants != null) {
                for (T constant : enumConstants) {
                    String displayName = constant.name();
                    if (constant instanceof ItemGroups) {
                        if (ENABLE_TESTING) {
                            if (constant != ItemGroups.TEST) continue;
                        } else {
                            if (constant == ItemGroups.TEST) continue;
                        }
                        displayName = ((ItemGroups) constant).displayName;
                    }
                    displayNames.add(displayName);
                    filteredConstants.add(constant);
                }
            }
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, displayNames);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        filterSpinner.setAdapter(adapter);

        filterSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                T selectedItem = null;
                if (ENABLE_TESTING || !hasAllOption) {
                    if (position < filteredConstants.size()) {
                        selectedItem = filteredConstants.get(position);
                    }
                } else {
                    if (position != 0) {
                        selectedItem = filteredConstants.get(position - 1);
                    }
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

    @Override
    protected void enableConstructionBlur() {
        super.enableConstructionBlur();

        ViewGroup rootView = findViewById(android.R.id.content);
        if (rootView == null || rootView.getChildCount() == 0) return;

        // Get the original layout root to check for fitsSystemWindows
        View originalRoot = rootView.getChildAt(0);

        // Create a new ConstraintLayout to hold the navigation buttons
        ConstraintLayout navContainer = new ConstraintLayout(this);
        navContainer.setLayoutParams(new FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));
        
        // Ensure the container respects system bars (status bar, nav bar) 
        // if the original page did, keeping the nav bar in the same spot.
        navContainer.setFitsSystemWindows(originalRoot.getFitsSystemWindows());

        // Lift all navigation components above the blur overlay
        int[] navIds = getExcludedTransitionIds();
        for (int id : navIds) {
            View v = findViewById(id);
            if (v != null) {
                ViewGroup parent = (ViewGroup) v.getParent();
                if (parent != null && parent != navContainer) {
                    parent.removeView(v);
                    navContainer.addView(v);
                }
            }
        }

        // Add the container to the root view (it will be the last child, hence on top)
        rootView.addView(navContainer);
    }
}
