package com.example.the_ultimate_easter_egg_guide.Pages;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.example.the_ultimate_easter_egg_guide.Models.PageController_BaseClass;
import com.example.the_ultimate_easter_egg_guide.R;

public class QuickRefDisplay_PAGE extends PageController_BaseClass {

    public static final String EXTRA_IMAGE_ID = "EXTRA_IMAGE_ID";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quick_ref_display_page);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        ImageView imageView = findViewById(R.id.quick_ref_image);
        ImageButton closeButton = findViewById(R.id.close_button);

        int imageId = getIntent().getIntExtra(EXTRA_IMAGE_ID, -1);
        if (imageId != -1) {
            imageView.setImageResource(imageId);
        }

        closeButton.setOnClickListener(v -> finish());
    }
}
