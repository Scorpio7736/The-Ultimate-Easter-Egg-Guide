package com.example.the_ultimate_easter_egg_guide.Pages;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.the_ultimate_easter_egg_guide.R;

public class Template_PAGE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.template_page);
    }

    public void onHomeButtonClick(View view) {
        startActivity(new Intent(this, Home_PAGE.class));
    }

    public void onMapsButtonClick(View view) {
        startActivity(new Intent(this, MapsSelection_Page.class));
    }

    public void onSettingsButtonClick(View view) {
        // Replace Settings_PAGE.class with your actual settings activity name.
    }

    public void onTemplateButtonClick(View view) {
        // Already on the template page.
    }
}
