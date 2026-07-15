package com.example.the_ultimate_easter_egg_guide.Models.Storyline;

public enum StorylineItems
{
    PlayerCharacter("Playable Characters"),
    NonPlayerCharacter("Non-Playable Characters"),
    Creatures("Creatures"),
    Items("Items"),
    Map("Maps"),
    Organizations("Organizations"),
    Youtubers("Cod Zombies YouTubers");


    public final String itemName;
    StorylineItems(String itemName)
    {
        this.itemName = itemName;
    }
}
