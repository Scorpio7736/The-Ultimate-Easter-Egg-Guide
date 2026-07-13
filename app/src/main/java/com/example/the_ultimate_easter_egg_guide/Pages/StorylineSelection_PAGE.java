package com.example.the_ultimate_easter_egg_guide.Pages;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.the_ultimate_easter_egg_guide.Helper.PageTransitionManager;
import com.example.the_ultimate_easter_egg_guide.Helper.StorylineCharacterAdapter;
import com.example.the_ultimate_easter_egg_guide.Models.NavPageController_BaseClass;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.StorylineItems;
import com.example.the_ultimate_easter_egg_guide.Models.games;
import com.example.the_ultimate_easter_egg_guide.Storyline.CharacterData.Player_Characters;
import com.example.the_ultimate_easter_egg_guide.Storyline.CharacterData.NonPlayer_Characters;
import com.example.the_ultimate_easter_egg_guide.Storyline.CreaturesData.Enemy_Creatures;
import com.example.the_ultimate_easter_egg_guide.Storyline.CodZombiesYoutubersData.CodZombies_Youtubers;
import com.example.the_ultimate_easter_egg_guide.R;

import java.util.ArrayList;
import java.util.List;

public class StorylineSelection_PAGE extends NavPageController_BaseClass implements StorylineCharacterAdapter.OnCharacterClickListener {

    private StorylineItems currentCategory;
    private games selectedGame = null;
    private RecyclerView recyclerView;
    private GridLayoutManager gridLayoutManager;
    private Spinner gameFilterSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.storyline_page);

        setupBaseNavigation();

        recyclerView = findViewById(R.id.storyline_recycler_view);
        gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(gridLayoutManager);

        gameFilterSpinner = findViewById(R.id.game_filter_spinner);

        setupCategorySpinner();
        setupGameFilterSpinner();
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

    private void setupGameFilterSpinner() {
        List<String> gameNames = new ArrayList<>();
        gameNames.add("All Games");
        for (games game : games.values()) {
            if (ENABLE_TESTING || game != games.Test) {
                gameNames.add(game.gameName);
            }
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, gameNames);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        gameFilterSpinner.setAdapter(adapter);

        gameFilterSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    selectedGame = null;
                } else {
                    // Offset by 1 because of "All Games"
                    int gameIndex = position - 1;
                    List<games> availableGames = new ArrayList<>();
                    for (games g : games.values()) {
                        if (ENABLE_TESTING || g != games.Test) {
                            availableGames.add(g);
                        }
                    }
                    selectedGame = availableGames.get(gameIndex);
                }
                loadCategoryData(currentCategory);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });
    }

    private void loadCategoryData(StorylineItems category) {
        if (category == StorylineItems.Creatures) {
            gameFilterSpinner.setVisibility(View.VISIBLE);
        } else {
            gameFilterSpinner.setVisibility(View.GONE);
            selectedGame = null;
        }

        if (category == StorylineItems.PlayerCharacter || 
            category == StorylineItems.NonPlayerCharacter || 
            category == StorylineItems.Youtubers ||
            category == StorylineItems.Creatures) {
            
            StorylineCharacterAdapter adapter = new StorylineCharacterAdapter(category, ENABLE_TESTING, selectedGame, this);
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
    public void onEnemyCreatureClick(Enemy_Creatures creature) {
        if (creature.fandomLink != null && !creature.fandomLink.isEmpty()) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(creature.fandomLink));
            startActivity(intent);
        } else {
            Toast.makeText(this, "Fandom link not available", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onYoutuberClick(CodZombies_Youtubers youtuber) {
        if (youtuber.channelLink != null && !youtuber.channelLink.isEmpty()) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(youtuber.channelLink));
            startActivity(intent);
        } else {
            Toast.makeText(this, "Channel link not available", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onStorylineButtonClick(View view) {
        // Already on this page
    }
}
