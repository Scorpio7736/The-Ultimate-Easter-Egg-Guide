package com.example.the_ultimate_easter_egg_guide.Models;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;

import androidx.annotation.Nullable;

import com.example.the_ultimate_easter_egg_guide.Helper.PageTransitionManager;
import com.example.the_ultimate_easter_egg_guide.Pages.Home_PAGE;
import com.example.the_ultimate_easter_egg_guide.Pages.MapsSelection_Page;
import com.example.the_ultimate_easter_egg_guide.Pages.Settings_PAGE;
import com.example.the_ultimate_easter_egg_guide.Pages.StorylineSelection_PAGE;
import com.example.the_ultimate_easter_egg_guide.Pages.Tools_PAGE;
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
        View title = findViewById(R.id.game_filter_title);
        View spinner = findViewById(R.id.game_filter_spinner);
        int visibility = visible ? View.VISIBLE : View.GONE;
        
        if (title != null) title.setVisibility(visibility);
        if (spinner != null) spinner.setVisibility(visibility);
    }

    protected interface OnGameSelectedListener {
        void onGameSelected(@Nullable Games selectedGame);
    }

    protected void setupGameFilter(OnGameSelectedListener listener) {
        Spinner gameFilterSpinner = findViewById(R.id.game_filter_spinner);
        if (gameFilterSpinner == null) return;

        List<String> gameNames = new ArrayList<>();
        gameNames.add("All Games");
        for (Games game : Games.values()) {
            if (ENABLE_TESTING || game != Games.Test) {
                gameNames.add(game.gameName);
            }
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, gameNames);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        gameFilterSpinner.setAdapter(adapter);

        gameFilterSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Games selectedGame = null;
                if (position != 0) {
                    int gameIndex = position - 1;
                    List<Games> availableGames = new ArrayList<>();
                    for (Games g : Games.values()) {
                        if (ENABLE_TESTING || g != Games.Test) {
                            availableGames.add(g);
                        }
                    }
                    selectedGame = availableGames.get(gameIndex);
                }
                if (listener != null) listener.onGameSelected(selectedGame);
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
