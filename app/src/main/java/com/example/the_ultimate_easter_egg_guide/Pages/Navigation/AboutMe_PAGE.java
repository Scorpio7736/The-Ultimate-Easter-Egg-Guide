package com.example.the_ultimate_easter_egg_guide.Pages.Navigation;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.example.the_ultimate_easter_egg_guide.Models.PageController_BaseClass;
import com.example.the_ultimate_easter_egg_guide.R;

public class AboutMe_PAGE extends PageController_BaseClass {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_me_page);
        enableConstructionBlur();
        setupContent();
    }

    private void setupContent() {
        TextView description = findViewById(R.id.about_me_description);
        TextView contact = findViewById(R.id.about_me_contact);
        TextView team = findViewById(R.id.about_me_team);
        TextView acknowledgements = findViewById(R.id.about_me_acknowledgements);
        TextView audioCredits = findViewById(R.id.about_me_audio_credits);
        TextView legal = findViewById(R.id.about_me_legal);
        TextView accessibility = findViewById(R.id.about_me_accessibility);

        if (description != null) {
            description.setText("The Ultimate Easter Egg Guide is an unofficial, community-driven Android companion app for Call of Duty Zombies. Our goal is to bring Easter egg guides, map information, character biographies, storyline references, and other useful Zombies resources together in one convenient mobile application.");
        }

        if (contact != null) {
            contact.setText("• Jack London / Scorpio7736 (GitHub: https://github.com/Scorpio7736)\n• Jack@thelondons.com");
        }

        if (team != null) {
            team.setText("• Jack London / Scorpio7736 – Project Creator & Developer");
        }

        if (acknowledgements != null) {
            acknowledgements.setText("This project would not be possible without the developers, researchers, guide creators, wiki editors, video creators, and community members who have documented Call of Duty Zombies over the years. Special thanks to the Call of Duty Wiki on Fandom and COD Zombies Tracker for their invaluable resources.");
        }

        if (audioCredits != null) {
            audioCredits.setText("Music:\nDamned by Kevin Sherwood:\n• damned_boiiii.mp3\n• damned_boiii.mp3\n• damned_boii.mp3\n• damned_boi.mp3\n\nOther Audio:\n• easter_egg_found.mp3\n\nSpecial thanks to the musicians and production teams who contributed to the atmosphere of Zombies throughout the franchise.");
        }

        if (legal != null) {
            legal.setText("The Ultimate Easter Egg Guide is an unofficial fan project. This project is not affiliated with, authorized by, sponsored by, or endorsed by Activision, Treyarch, Microsoft, or any other company associated with the Call of Duty franchise. All rights to Call of Duty, Black Ops, and associated materials belong to their respective owners.");
        }

        if (accessibility != null) {
            accessibility.setText("We designed our interface with accessibility as a priority, ensuring high contrast and clear navigation for all users. We welcome community feedback to continue improving the experience for everyone.");
        }
    }
}
