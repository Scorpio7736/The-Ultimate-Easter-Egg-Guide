package com.example.the_ultimate_easter_egg_guide.Pages;

import android.os.Bundle;
import android.widget.Toast;

import com.example.the_ultimate_easter_egg_guide.Models.PageController_BaseClass;
import com.example.the_ultimate_easter_egg_guide.Storyline.CharacterData.Player_Characters;
import com.example.the_ultimate_easter_egg_guide.R;

public class CharacterDisplay_PAGE extends PageController_BaseClass {

    private Player_Characters selectedCharacter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.character_display_page);
        SetThisBackground(R.drawable.character_bio_bkg);

        if (getIntent().hasExtra("CHARACTER_ID")) {
            String charId = getIntent().getStringExtra("CHARACTER_ID");
            try {
                selectedCharacter = Player_Characters.valueOf(charId);
            } catch (Exception e) {
                selectedCharacter = null;
            }

            if (selectedCharacter != null) {
                loadCharacterData();
            }
        }
    }

    private void loadCharacterData()
    {

    }
}
