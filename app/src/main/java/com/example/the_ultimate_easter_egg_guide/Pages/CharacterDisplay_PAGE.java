package com.example.the_ultimate_easter_egg_guide.Pages;

import android.os.Bundle;
import com.example.the_ultimate_easter_egg_guide.Models.PageController_BaseClass;
import com.example.the_ultimate_easter_egg_guide.Storyline.CharacterData.Player_Characters;
import com.example.the_ultimate_easter_egg_guide.Storyline.NpcData.NonPlayer_Characters;
import com.example.the_ultimate_easter_egg_guide.R;

public class CharacterDisplay_PAGE extends PageController_BaseClass {

    private Player_Characters playerCharacter;
    private NonPlayer_Characters nonPlayerCharacter;
    private boolean isPlayerCharacter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.character_display_page);
        SetThisBackground(R.drawable.character_bio_bkg);

        if (getIntent().hasExtra("CHARACTER_ID")) {
            String charId = getIntent().getStringExtra("CHARACTER_ID");
            isPlayerCharacter = getIntent().getBooleanExtra("IS_PLAYER_CHARACTER", true);

            if (isPlayerCharacter) {
                try {
                    playerCharacter = Player_Characters.valueOf(charId);
                } catch (Exception e) {
                    playerCharacter = null;
                }
            } else {
                try {
                    nonPlayerCharacter = NonPlayer_Characters.valueOf(charId);
                } catch (Exception e) {
                    nonPlayerCharacter = null;
                }
            }

            if (playerCharacter != null || nonPlayerCharacter != null) {
                loadCharacterData();
            }
        }
    }

    private void loadCharacterData() {
        // Implementation for displaying character data (bio, image, etc.) will go here
    }
}
