package com.example.the_ultimate_easter_egg_guide.Models.Storyline;

public enum YoutuberGroups
{
    TEST("TEST"),
    Storyline("Zombies Storyline"),
    CustomZombies("Custom Zombies"),
    EasterEggHunter("Easter Egg Guides"),
    ZombiesOGs("OG Zombies YouTubers"), //Mostly for YouTubers who have stopped posting or fell off.
    ZHouse("Z-House"),
    RestInPeace("Gone but Never Forgotten");

    public String displayName;

    YoutuberGroups(String displayName)
    {
        this.displayName = displayName;
    }
}
