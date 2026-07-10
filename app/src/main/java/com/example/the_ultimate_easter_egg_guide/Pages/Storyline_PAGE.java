package com.example.the_ultimate_easter_egg_guide.Pages;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.the_ultimate_easter_egg_guide.Helper.PageTransitionManager;
import com.example.the_ultimate_easter_egg_guide.Helper.StorylineCharacterAdapter;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.StorylineItems;
import com.example.the_ultimate_easter_egg_guide.R;

import java.util.ArrayList;
import java.util.List;

public class Storyline_PAGE extends AppCompatActivity {

    private StorylineItems currentCategory;
    private RecyclerView recyclerView;
    private GridLayoutManager gridLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PageTransitionManager.setupTransitions(this);
        setContentView(R.layout.storyline_page);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

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
        if (category == StorylineItems.PlayerCharacter) {
            StorylineCharacterAdapter adapter = new StorylineCharacterAdapter();
            gridLayoutManager.setSpanSizeLookup(adapter.getSpanSizeLookup());
            recyclerView.setAdapter(adapter);
        } else {
            // Placeholder for other categories
            recyclerView.setAdapter(null);
        }
    }

    public void onHomeButtonClick(View view) {
        PageTransitionManager.startActivityWithFade(this, Home_PAGE.class);
    }

    public void onMapsButtonClick(View view) {
        PageTransitionManager.startActivityWithFade(this, MapsSelection_Page.class);
    }

    public void onStorylineButtonClick(View view) {
        // Already on this page
    }

    public void onToolsButtonClick(View view) {
        PageTransitionManager.startActivityWithFade(this, Tools_PAGE.class);
    }
}
