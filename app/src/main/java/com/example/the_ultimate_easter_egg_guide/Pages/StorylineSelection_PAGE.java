package com.example.the_ultimate_easter_egg_guide.Pages;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.the_ultimate_easter_egg_guide.Helper.PageTransitionManager;
import com.example.the_ultimate_easter_egg_guide.Helper.StorylineCharacterAdapter;
import com.example.the_ultimate_easter_egg_guide.Models.PageController_BaseClass;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.StorylineItems;
import com.example.the_ultimate_easter_egg_guide.Storyline.CharacterData.Player_Characters;
import com.example.the_ultimate_easter_egg_guide.Storyline.CharacterData.NonPlayer_Characters;
import com.example.the_ultimate_easter_egg_guide.R;

import java.util.ArrayList;
import java.util.List;

public class StorylineSelection_PAGE extends PageController_BaseClass implements StorylineCharacterAdapter.OnCharacterClickListener {

    private StorylineItems currentCategory;
    private RecyclerView recyclerView;
    private GridLayoutManager gridLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.storyline_page);

        setupBaseNavigation();

        recyclerView = findViewById(R.id.storyline_recycler_view);
        gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(gridLayoutManager);

        setupCategorySpinner();
    }

    private void setupCategorySpinner() {
        Spinner spinner = findViewById(R.id.storyline_spinner);
        List<String> categories = new ArrayList<>();
        for (StorylineItems item : StorylineItems.values()) {
            categories.add(item.itemName);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, categories);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                currentCategory = StorylineItems.values()[position];
                loadCategoryData(currentCategory);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Do nothing
            }
        });
    }

    private void loadCategoryData(StorylineItems category) {
        if (category == StorylineItems.PlayerCharacter || category == StorylineItems.NonPlayerCharacter) {
            StorylineCharacterAdapter adapter = new StorylineCharacterAdapter(category, ENABLE_TESTING, this);
            gridLayoutManager.setSpanSizeLookup(adapter.getSpanSizeLookup());
            recyclerView.setAdapter(adapter);
            recyclerView.scheduleLayoutAnimation();
        } else {
            // Placeholder for other categories
            recyclerView.setAdapter(null);
        }
    }

    @Override
    public void onPlayerCharacterClick(Player_Characters character) {
        Intent intent = new Intent(this, CharacterDisplay_PAGE.class);
        intent.putExtra("CHARACTER_ID", character.name());
        intent.putExtra("IS_PLAYER_CHARACTER", true);
        PageTransitionManager.startActivityWithFade(this, intent);
    }

    @Override
    public void onNonPlayerCharacterClick(NonPlayer_Characters character) {
        Intent intent = new Intent(this, CharacterDisplay_PAGE.class);
        intent.putExtra("CHARACTER_ID", character.name());
        intent.putExtra("IS_PLAYER_CHARACTER", false);
        PageTransitionManager.startActivityWithFade(this, intent);
    }

    @Override
    public void onStorylineButtonClick(View view) {
        // Already on this page
    }
}
