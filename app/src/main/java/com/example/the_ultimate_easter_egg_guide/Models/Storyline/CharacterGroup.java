package com.example.the_ultimate_easter_egg_guide.Models.Storyline;

public enum CharacterGroup
{
    Primis,
    Ultimis,
    Victis,
    MobOfTheDead("Mob of the Dead"),
    CallOfTheDead("Call of the Dead"),
    USGovernment("United States Government"),
    WAW_Nacht("World At War Nacht Der Untoten Crew"),
    WAW_Verruckt("World At War Verruckt Crew"),

    //======================= Non Player Character
    Group935_Ultimis,
    Group935_Primis,
    Agartha,
    DarkAther,
    Ascension,
    BrokenArrow,
    Division9,
    ImerialJapan,
    NaziGermany,
    ImperialGermany,
    SovietUnion;

    public final String displayName;

    CharacterGroup(String displayName)
    {
        this.displayName = displayName;
    }

    CharacterGroup()
    {
        this.displayName = this.name();
    }
}
