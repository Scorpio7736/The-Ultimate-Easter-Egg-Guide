package com.example.the_ultimate_easter_egg_guide.Pages.Navigation;

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
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.ItemGroups;
import com.example.the_ultimate_easter_egg_guide.Models.Games;
import com.example.the_ultimate_easter_egg_guide.Pages.CharacterDisplay_PAGE;
import com.example.the_ultimate_easter_egg_guide.StorylineData.CharacterData.Player_Characters;
import com.example.the_ultimate_easter_egg_guide.StorylineData.CharacterData.NonPlayer_Characters;
import com.example.the_ultimate_easter_egg_guide.StorylineData.CreaturesData.Enemy_Creatures;
import com.example.the_ultimate_easter_egg_guide.StorylineData.CreaturesData.Friendly_Creatures;
import com.example.the_ultimate_easter_egg_guide.StorylineData.OrganizationsData.Organizations;
import com.example.the_ultimate_easter_egg_guide.StorylineData.ItemsData.Items;
import com.example.the_ultimate_easter_egg_guide.StorylineData.MapsData.StorylineMaps;
import com.example.the_ultimate_easter_egg_guide.StorylineData.CodZombiesYoutubersData.CodZombies_Youtubers;
import com.example.the_ultimate_easter_egg_guide.R;

import java.util.ArrayList;
import java.util.List;

public class StorylineSelection_PAGE extends NavPageController_BaseClass implements StorylineCharacterAdapter.OnCharacterClickListener {

    private StorylineItems currentCategory;
    private Games selectedGame = null;
    private ItemGroups selectedItemGroup = null;
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
        boolean showGameFilter = category == StorylineItems.Creatures || 
                               category == StorylineItems.Organizations ||
                               category == StorylineItems.NonPlayerCharacter || 
                               category == StorylineItems.PlayerCharacter ||
                               category == StorylineItems.Map;
        
        boolean showGroupFilter = category == StorylineItems.Items;

        if (showGameFilter) {
            setGameFilterVisibility(true, "Filter by Game");
            setupGameFilter(game -> {
                selectedGame = game;
                refreshAdapter();
            });
        } else if (showGroupFilter) {
            setGameFilterVisibility(true, "Filter by Group");
            setupFilter(ItemGroups.class, "All Groups", group -> {
                selectedItemGroup = group;
                refreshAdapter();
            });
        } else {
            setGameFilterVisibility(false);
            selectedGame = null;
            selectedItemGroup = null;
        }

        refreshAdapter();
    }

    private void refreshAdapter() {
        if (currentCategory == StorylineItems.PlayerCharacter || 
            currentCategory == StorylineItems.NonPlayerCharacter || 
            currentCategory == StorylineItems.Youtubers ||
            currentCategory == StorylineItems.Creatures ||
            currentCategory == StorylineItems.Items ||
            currentCategory == StorylineItems.Organizations ||
            currentCategory == StorylineItems.Map) {
            
            StorylineCharacterAdapter adapter = new StorylineCharacterAdapter(currentCategory, ENABLE_TESTING, selectedGame, selectedItemGroup, this);
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
    public void onFriendlyCreatureClick(Friendly_Creatures creature) {
        if (creature.fandomLink != null && !creature.fandomLink.isEmpty()) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(creature.fandomLink));
            startActivity(intent);
        } else {
            Toast.makeText(this, "Fandom link not available", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onGroupClick(Organizations group) {
        if (group.fandomLink != null && !group.fandomLink.isEmpty()) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(group.fandomLink));
            startActivity(intent);
        } else {
            Toast.makeText(this, "Fandom link not available", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onItemClick(Items item) {
        if (item.fandomLink != null && !item.fandomLink.isEmpty()) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(item.fandomLink));
            startActivity(intent);
        } else {
            Toast.makeText(this, "Fandom link not available", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onMapClick(StorylineMaps map) {
        if (map.fandomLink != null && !map.fandomLink.isEmpty()) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(map.fandomLink));
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
