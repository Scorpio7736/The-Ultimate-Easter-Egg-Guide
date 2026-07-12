package com.example.the_ultimate_easter_egg_guide.Models.Storyline;

public enum Player_CharacterGroup
{
    TEST,
    WAW_Nacht("World At War Nacht Der Untoten Crew"),
    WAW_Verruckt("World At War Verruckt Crew"),
    Ultimis,
    FIVE("Five Crew"),
    CallOfTheDead("Call of the Dead Crew"),
    Victis,
    MobOfTheDead("Mob of the Dead Crew"),
    Primis,
    ShadowsOfEvil("Sadows of Evil Crew");

    public final String displayName;

    Player_CharacterGroup(String displayName)
    {
        this.displayName = displayName;
    }

    Player_CharacterGroup()
    {
        this.displayName = this.name();
    }
}
