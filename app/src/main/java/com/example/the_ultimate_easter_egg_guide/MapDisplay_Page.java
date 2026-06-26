package com.example.the_ultimate_easter_egg_guide;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MapDisplay_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PageTransitionManager.setupTransitions(this);
        setContentView(R.layout.map_display_page);
        
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        ImageView backgroundImage = findViewById(R.id.background_image);

        // Receive data from Intent if needed
        if (getIntent().hasExtra("MAP_NAME")) {
            String mapName = getIntent().getStringExtra("MAP_NAME");
            
            // Find the MapNames enum entry to get the MapType
            MapNames selectedMap = findMapByName(mapName);

            if (selectedMap != null) {
                // Change background based on MapType
                int backgroundResId = getBackgroundForMapType(selectedMap.mapType);
                backgroundImage.setImageResource(backgroundResId);
            }
        }
    }

    private MapNames findMapByName(String name) {
        for (MapNames map : MapNames.values()) {
            if (map.mapName.equalsIgnoreCase(name)) {
                return map;
            }
        }
        return null;
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
