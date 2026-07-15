package com.example.the_ultimate_easter_egg_guide.Models.Storyline;

public enum ItemGroups
{
    TEST("Test Items"),
    WonderWeapon("Wonder Weapons"),
    StorylineItem("Storyline Items"),
    PerkaCola("Perk a Colas");

    public final String displayName;
    ItemGroups(String displayName)
    {
        this.displayName = displayName;
    }
}