package com.example.the_ultimate_easter_egg_guide;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MapsSelection_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maps_selection_page);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        Spinner spinner = findViewById(R.id.myDropdown);
        List<String> gameNames = new ArrayList<>();
        for (games game : games.gamesList) {
            gameNames.add(game.gameName);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, gameNames);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        ImageButton settingsButton = findViewById(R.id.nav_settings_button);
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MapsSelection_Page.this, Settings_PAGE.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });
    }

    public void onHomeButtonClick(View view) {
        Intent intent = new Intent(this, Home_PAGE.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(intent);
    }



    public void onMapsButtonClick(View view) {
        // Already on this page
    }
}