package com.example.the_ultimate_easter_egg_guide.Pages.Navigation;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;

import com.example.the_ultimate_easter_egg_guide.Models.NavPageController_BaseClass;
import com.example.the_ultimate_easter_egg_guide.R;

public class Settings_PAGE extends NavPageController_BaseClass
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_page);

        setupBaseNavigation();
        enableConstructionBlur();

        setupSwitch(R.id.switch1, R.id.expandable_layout1);
        setupSwitch(R.id.switch2, R.id.expandable_layout2);
        setupSwitch(R.id.switch3, R.id.expandable_layout3);
        setupSwitch(R.id.switch4, R.id.expandable_layout4);
        setupSwitch(R.id.switch5, R.id.expandable_layout5);
        setupSwitch(R.id.switch6, R.id.expandable_layout6);
        setupSwitch(R.id.switch7, R.id.expandable_layout7);
        setupSwitch(R.id.switch8, R.id.expandable_layout8);
    }

    private void setupSwitch(int switchId, int layoutId)
    {
        Switch switchView = findViewById(switchId);
        LinearLayout expandableLayout = findViewById(layoutId);

        switchView.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked)
                {
                    expandableLayout.setVisibility(View.VISIBLE);
                }
                else
                {
                    expandableLayout.setVisibility(View.GONE);
                }
            }
        });
    }

}
