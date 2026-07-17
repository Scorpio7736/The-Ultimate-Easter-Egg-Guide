package com.example.the_ultimate_easter_egg_guide.Pages.Navigation;

import android.os.Bundle;
import android.view.View;

import com.example.the_ultimate_easter_egg_guide.Models.NavPageController_BaseClass;
import com.example.the_ultimate_easter_egg_guide.R;

public class Tools_PAGE extends NavPageController_BaseClass {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tools_page);

        setupBaseNavigation();
    }

    @Override
    public void onToolsButtonClick(View view) {
        // Already on this page
    }
}
