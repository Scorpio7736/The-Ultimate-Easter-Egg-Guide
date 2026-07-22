package com.example.the_ultimate_easter_egg_guide.Pages;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.example.the_ultimate_easter_egg_guide.Models.PageController_BaseClass;
import com.example.the_ultimate_easter_egg_guide.R;

public class ContactUs_PAGE extends PageController_BaseClass {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_us_page);

        // This page is under construction
        enableConstructionBlur();
    }
}
