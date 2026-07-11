package com.example.the_ultimate_easter_egg_guide.Models.Storyline;

public enum YoutuberGroups
{
    TEST("TEST"),
    Storyline("Zombies Storyline"),
    CustomZombies("Custom Zombies"),
    EasterEggHunter("Easter Egg Guides"),
    ZHouse("Z-House");

    public String displayName;

    YoutuberGroups(String displayName)
    {
        this.displayName = displayName;
    }
}
