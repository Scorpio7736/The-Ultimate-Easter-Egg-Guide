package com.example.the_ultimate_easter_egg_guide.Models.Storyline;

public enum StorylineItems
{
    PlayerCharacter("Playable Characters"),
    NonPlayerCharacter("Non-Playable Characters"),
    Map("Maps"),
    Groups("Groups");


    public String itemName;
    StorylineItems(String itemName)
    {
        this.itemName = itemName;
    }
}
