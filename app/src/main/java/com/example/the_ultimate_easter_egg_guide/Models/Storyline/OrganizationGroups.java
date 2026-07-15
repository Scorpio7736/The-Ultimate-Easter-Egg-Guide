package com.example.the_ultimate_easter_egg_guide.Models.Storyline;

public enum OrganizationGroups
{
    TEST("Test"),
    German("German"),
    Japanese("Japanese"),
    American("American"),
    Soviet("Soviet"),
    Extraterrestrial("Extraterrestrial");

    public final String displayName;

    OrganizationGroups(String displayName)
    {
        this.displayName = displayName;
    }
}
