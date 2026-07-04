package com.example.the_ultimate_easter_egg_guide.Pages;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;

import com.example.the_ultimate_easter_egg_guide.Models.EasterEgg.EasterEgg;
import com.example.the_ultimate_easter_egg_guide.Helper.EggAdapter;
import com.example.the_ultimate_easter_egg_guide.Helper.PageTransitionManager;
import com.example.the_ultimate_easter_egg_guide.MapData.Maps;
import com.example.the_ultimate_easter_egg_guide.Models.MapType;
import com.example.the_ultimate_easter_egg_guide.R;

import java.util.ArrayList;
import java.util.List;

public class EggDisplay_Page extends AppCompatActivity implements EggAdapter.OnEggClickListener {

    private Maps selectedMap;
    private List<EasterEgg> eggsToShow = new ArrayList<>();
    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PageTransitionManager.setupTransitions(this);
        setContentView(R.layout.egg_display_page);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        ImageView backgroundImage = findViewById(R.id.background_image);
        TextView categoryTitle = findViewById(R.id.egg_category_title);
        recyclerView = findViewById(R.id.eggs_recycler_view);

        if (getIntent().hasExtra("MAP_ID") && getIntent().hasExtra("CATEGORY")) {
            String mapId = getIntent().getStringExtra("MAP_ID");
            String category = getIntent().getStringExtra("CATEGORY");

            try {
                selectedMap = Maps.valueOf(mapId);
            } catch (Exception e) {
                selectedMap = null;
            }

            if (selectedMap != null) {
                // Set background
                backgroundImage.setImageResource(getBackgroundForMapType(selectedMap.mapType));

                // Load eggs based on category
                if (selectedMap.eggData != null) {
                    switch (category) {
                        case "MAIN_QUEST":
                            categoryTitle.setText("Main Quests");
                            eggsToShow = selectedMap.eggData.mainQuests;
                            break;
                        case "SIDE_QUESTS":
                            categoryTitle.setText("Side Quests");
                            eggsToShow = selectedMap.eggData.sideQuests;
                            break;
                        case "BUILDABLES":
                            categoryTitle.setText("Buildables");
                            eggsToShow = selectedMap.eggData.Buildables;
                            break;
                    }
                }
            }
        }

        // Setup RecyclerView
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        EggAdapter adapter = new EggAdapter(eggsToShow, this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onEggClick(EasterEgg egg, int position, boolean isExpanding) {
        if (isExpanding && layoutManager != null) {
            recyclerView.postDelayed(() -> {
                View itemView = layoutManager.findViewByPosition(position);
                if (itemView != null) {
                    // Check if the item's bottom is near or past the recycler view's bottom
                    int itemBottom = itemView.getBottom();
                    int rvHeight = recyclerView.getHeight();
                    
                    // If the item is in the bottom portion of the screen or cut off, scroll it to the top
                    if (itemBottom > rvHeight * 0.75) {
                        RecyclerView.SmoothScroller smoothScroller = new LinearSmoothScroller(this) {
                            @Override
                            protected int getVerticalSnapPreference() {
                                return LinearSmoothScroller.SNAP_TO_START;
                            }

                            @Override
                            protected float calculateSpeedPerPixel(android.util.DisplayMetrics displayMetrics) {
                                return 150f / displayMetrics.densityDpi;
                            }
                        };
                        smoothScroller.setTargetPosition(position);
                        layoutManager.startSmoothScroll(smoothScroller);
                    }
                }
            }, 100);
        }
    }

    private int getBackgroundForMapType(MapType mapType) {
        if (mapType == null) return R.drawable.general_bkg;
        switch (mapType) {
            case Group_935: return R.drawable.group935_bkg;
            case Division_9: return R.drawable.division9_bkg;
            case Ascension_Group: return R.drawable.ascension_bkg;
            case Broken_Arrow: return R.drawable.broken_arrow_bkg;
            case US_Government: return R.drawable.us_gov_bkg;
            case Jungle: return R.drawable.jungle_bkg;
            case Broken_Earth: return R.drawable.broken_earth_bkg;
            case Purgatory: return R.drawable.purgatory_bkg;
            case Crazy_Place: return R.drawable.crazy_place_bkg;
            case Agartha: return R.drawable.agartha_bkg;
            case Group_935_Lunar: return R.drawable.lunargroup935_bkg;
            case Morge_City: return R.drawable.city_bkg;
            case Group_935_Winter: return R.drawable.group935winter_bkg;
            default: return R.drawable.general_bkg;
        }
    }

    public void onHomeButtonClick(View view) {
        PageTransitionManager.startActivityWithFade(this, Home_PAGE.class);
    }

    public void onMapsButtonClick(View view) {
        PageTransitionManager.startActivityWithFade(this, MapsSelection_Page.class);
    }
}
