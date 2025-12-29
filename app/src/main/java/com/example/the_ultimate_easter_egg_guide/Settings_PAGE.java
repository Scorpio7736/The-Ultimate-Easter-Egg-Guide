package com.example.the_ultimate_easter_egg_guide;

import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

public class Settings_PAGE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_page);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        setupSwitch(R.id.switch1, R.id.expandable_layout1);
        setupSwitch(R.id.switch2, R.id.expandable_layout2);
        setupSwitch(R.id.switch3, R.id.expandable_layout3);
        setupSwitch(R.id.switch4, R.id.expandable_layout4);
        setupSwitch(R.id.switch5, R.id.expandable_layout5);
        setupSwitch(R.id.switch6, R.id.expandable_layout6);
        setupSwitch(R.id.switch7, R.id.expandable_layout7);
        setupSwitch(R.id.switch8, R.id.expandable_layout8);
    }

    private void setupSwitch(int switchId, int layoutId) {
        Switch switchView = findViewById(switchId);
        LinearLayout expandableLayout = findViewById(layoutId);
        ViewGroup parent = (ViewGroup) expandableLayout.getParent();

        switchView.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                AutoTransition autoTransition = new AutoTransition();
                autoTransition.setDuration(250);
                TransitionManager.beginDelayedTransition(parent, autoTransition);
                if (isChecked) {
                    expandableLayout.setVisibility(View.VISIBLE);
                } else {
                    expandableLayout.setVisibility(View.GONE);
                }
            }
        });
    }
}