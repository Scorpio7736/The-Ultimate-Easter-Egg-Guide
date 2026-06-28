package com.example.the_ultimate_easter_egg_guide.Pages;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.the_ultimate_easter_egg_guide.Models.MapType;
import com.example.the_ultimate_easter_egg_guide.MapData.Maps;
import com.example.the_ultimate_easter_egg_guide.Helper.PageTransitionManager;
import com.example.the_ultimate_easter_egg_guide.R;
import com.google.android.material.card.MaterialCardView;

public class MapDisplay_Page extends AppCompatActivity {

    private Maps selectedMap;
    private final Handler trailerHandler = new Handler();
    private Runnable trailerRunnable;

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
        VideoView mapTrailerVideo = findViewById(R.id.map_trailer_video);
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
                if (selectedMap.eggData != null) {
                    mainQuestCount.setText(String.valueOf(selectedMap.eggData.mainQuests.size()));
                    sideQuestCount.setText(String.valueOf(selectedMap.eggData.sideQuests.size()));
                    buildablesCount.setText(String.valueOf(selectedMap.eggData.Buildables.size()));
                } else {
                    mainQuestCount.setText("0");
                    sideQuestCount.setText("0");
                    buildablesCount.setText("0");
                }

                // Handle Trailer Delay
                if (selectedMap.mapTrailer != -1) {
                    setupTrailer(mapCoverImage, mapTrailerVideo);
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
            if (selectedMap != null && selectedMap.eggData != null) {
                android.content.Intent intent = new android.content.Intent(this, EggDisplay_Page.class);
                intent.putExtra("MAP_ID", selectedMap.name());
                intent.putExtra("CATEGORY", "MAIN_QUEST");
                PageTransitionManager.startActivityWithFade(this, intent);
            } else {
                Toast.makeText(this, "No Main Quests available", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.option_side_quests).setOnClickListener(v -> {
            if (selectedMap != null && selectedMap.eggData != null) {
                android.content.Intent intent = new android.content.Intent(this, EggDisplay_Page.class);
                intent.putExtra("MAP_ID", selectedMap.name());
                intent.putExtra("CATEGORY", "SIDE_QUESTS");
                PageTransitionManager.startActivityWithFade(this, intent);
            } else {
                Toast.makeText(this, "No Side Quests available", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.option_buildables).setOnClickListener(v -> {
            if (selectedMap != null && selectedMap.eggData != null) {
                android.content.Intent intent = new android.content.Intent(this, EggDisplay_Page.class);
                intent.putExtra("MAP_ID", selectedMap.name());
                intent.putExtra("CATEGORY", "BUILDABLES");
                PageTransitionManager.startActivityWithFade(this, intent);
            } else {
                Toast.makeText(this, "No Buildables available", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.option_storyline).setOnClickListener(v -> {
            Toast.makeText(this, "Storyline coming soon!", Toast.LENGTH_SHORT).show();
        });
    }

    private void setupTrailer(ImageView mapCoverImage, VideoView mapTrailerVideo) {
        String path = "android.resource://" + getPackageName() + "/" + selectedMap.mapTrailer;
        mapTrailerVideo.setVideoURI(Uri.parse(path));
        mapTrailerVideo.setZOrderMediaOverlay(true);
        
        mapTrailerVideo.setOnPreparedListener(mp -> {
            mp.setLooping(false); // Disable looping to detect completion
            mp.setVolume(0f, 0f); // Keep it muted

            // Scaling logic to "center crop" the video so it fills the slot
            float videoWidth = mp.getVideoWidth();
            float videoHeight = mp.getVideoHeight();
            float videoAspectRatio = videoWidth / videoHeight;

            float viewWidth = mapTrailerVideo.getWidth();
            float viewHeight = mapTrailerVideo.getHeight();
            float viewAspectRatio = viewWidth / viewHeight;

            if (videoAspectRatio > viewAspectRatio) {
                // Video is wider than the view - scale width
                mapTrailerVideo.setScaleX(videoAspectRatio / viewAspectRatio);
            } else {
                // Video is taller than the view - scale height
                mapTrailerVideo.setScaleY(viewAspectRatio / videoAspectRatio);
            }
        });

        mapTrailerVideo.setOnCompletionListener(mp -> {
            if (!isFinishing() && !isDestroyed()) {
                // Video ended, fade back to cover image
                mapCoverImage.setVisibility(View.VISIBLE);
                mapCoverImage.animate()
                    .alpha(1f)
                    .setDuration(1000)
                    .start();
                
                mapTrailerVideo.animate()
                    .alpha(0f)
                    .setDuration(1000)
                    .withEndAction(() -> {
                        mapTrailerVideo.setVisibility(View.INVISIBLE);
                        mapTrailerVideo.setAlpha(1f); // Reset alpha for next play
                    })
                    .start();

                // Wait 10 seconds before playing again
                trailerHandler.postDelayed(trailerRunnable, 10000);
            }
        });

        trailerRunnable = () -> {
            if (!isFinishing() && !isDestroyed()) {
                mapTrailerVideo.setVisibility(View.VISIBLE);
                mapTrailerVideo.start();
                
                mapCoverImage.animate()
                    .alpha(0f)
                    .setDuration(1000)
                    .withEndAction(() -> mapCoverImage.setVisibility(View.GONE))
                    .start();
            }
        };

        // Initial 5 second delay for the first play
        trailerHandler.postDelayed(trailerRunnable, 5000);
    }

    @Override
    protected void onPause() {
        super.onPause();
        VideoView mapTrailerVideo = findViewById(R.id.map_trailer_video);
        if (mapTrailerVideo.isPlaying()) {
            mapTrailerVideo.pause();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (trailerHandler != null && trailerRunnable != null) {
            trailerHandler.removeCallbacks(trailerRunnable);
        }
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
