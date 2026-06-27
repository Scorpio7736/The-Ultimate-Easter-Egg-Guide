package com.example.the_ultimate_easter_egg_guide.Pages;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.the_ultimate_easter_egg_guide.Models.MapType;
import com.example.the_ultimate_easter_egg_guide.MapData.Maps;
import com.example.the_ultimate_easter_egg_guide.Helper.PageTransitionManager;
import com.example.the_ultimate_easter_egg_guide.R;
import com.google.android.material.card.MaterialCardView;

public class MapDisplay_Page extends AppCompatActivity {

    private Maps selectedMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PageTransitionManager.setupTransitions(this);
        setContentView(R.layout.map_display_page);
        
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        ImageView backgroundImage = findViewById(R.id.background_image);
        TextView mapTitle = findViewById(R.id.map_title);
        ImageView mapCoverImage = findViewById(R.id.map_cover_image);
        TextView mapDescription = findViewById(R.id.map_description);
        MaterialCardView descriptionHeader = findViewById(R.id.description_header);
        ImageView descriptionArrow = findViewById(R.id.description_arrow);
        
        TextView mainQuestCount = findViewById(R.id.main_quest_count);
        TextView sideQuestCount = findViewById(R.id.side_quest_count);
        TextView buildablesCount = findViewById(R.id.buildables_count);

        // Receive data from Intent
        if (getIntent().hasExtra("MAP_ID")) {
            String mapId = getIntent().getStringExtra("MAP_ID");
            try {
                selectedMap = Maps.valueOf(mapId);
            } catch (Exception e) {
                selectedMap = null;
            }

            if (selectedMap != null) {
                // Set text and images
                mapTitle.setText(selectedMap.mapName);
                mapCoverImage.setImageResource(selectedMap.mapCover);
                mapDescription.setText(selectedMap.mapDescription);

                // Change background based on MapType
                int backgroundResId = getBackgroundForMapType(selectedMap.mapType);
                backgroundImage.setImageResource(backgroundResId);

                // Set Egg Counts
                if (selectedMap.eggHandler != null) {
                    mainQuestCount.setText(String.valueOf(selectedMap.eggHandler.mainQuests.size()));
                    sideQuestCount.setText(String.valueOf(selectedMap.eggHandler.sideQuests.size()));
                    buildablesCount.setText(String.valueOf(selectedMap.eggHandler.Buildables.size()));
                } else {
                    mainQuestCount.setText("0");
                    sideQuestCount.setText("0");
                    buildablesCount.setText("0");
                }
            }
        }

        // Toggle description dropdown
        descriptionHeader.setOnClickListener(v -> {
            if (mapDescription.getVisibility() == View.VISIBLE) {
                mapDescription.setVisibility(View.GONE);
                descriptionArrow.setRotation(0);
            } else {
                mapDescription.setVisibility(View.VISIBLE);
                descriptionArrow.setRotation(180);
            }
        });

        // Option click listeners
        findViewById(R.id.option_main_quest).setOnClickListener(v -> {
            Toast.makeText(this, "Opening Main Quest for " + selectedMap.mapName, Toast.LENGTH_SHORT).show();
            // TODO: Start Main Quest Activity
        });

        findViewById(R.id.option_side_quests).setOnClickListener(v -> {
            Toast.makeText(this, "Opening Side Quests for " + selectedMap.mapName, Toast.LENGTH_SHORT).show();
            // TODO: Start Side Quests Activity
        });

        findViewById(R.id.option_buildables).setOnClickListener(v -> {
            Toast.makeText(this, "Opening Buildables for " + selectedMap.mapName, Toast.LENGTH_SHORT).show();
            // TODO: Start Buildables Activity
        });

        findViewById(R.id.option_storyline).setOnClickListener(v -> {
            Toast.makeText(this, "Opening Storyline for " + selectedMap.mapName, Toast.LENGTH_SHORT).show();
            // TODO: Start Storyline Activity
        });
    }

    private int getBackgroundForMapType(MapType mapType) {
        if (mapType == null) return R.drawable.general_bkg;
        
        switch (mapType) {
            case Group_935:
                return R.drawable.group935_bkg;
            case Division_9:
                return R.drawable.division9_bkg;
            case Ascension_Group:
                return R.drawable.ascension_bkg;
            case Broken_Arrow:
                return R.drawable.broken_arrow_bkg;
            case US_Government:
                return R.drawable.us_gov_bkg;
            case Jungle:
                return R.drawable.jungle_bkg;
            case Broken_Earth:
                return R.drawable.broken_earth_bkg;
            case Purgatory:
                return R.drawable.purgatory_bkg;
            case Crazy_Place:
                return R.drawable.crazy_place_bkg;
            case Agartha:
                return R.drawable.agartha_bkg;
            case Group_935_Lunar:
                return R.drawable.lunargroup935_bkg;
            case Morge_City:
                return R.drawable.city_bkg;
            default:
                return R.drawable.general_bkg;
        }
    }

    public void onHomeButtonClick(View view) {
        PageTransitionManager.startActivityWithFade(this, Home_PAGE.class);
    }

    public void onMapsButtonClick(View view) {
        PageTransitionManager.startActivityWithFade(this, MapsSelection_Page.class);
    }
}
