package com.example.the_ultimate_easter_egg_guide.Models.Storyline;

public enum CharacterGroup
{
    TEST,
    Primis,
    Ultimis,
    Victis,
    MobOfTheDead("Mob of the Dead Crew"),
    CallOfTheDead("Call of the Dead Crew"),
    USGovernment("United States Government"),
    WAW_Nacht("World At War Nacht Der Untoten Crew"),
    WAW_Verruckt("World At War Verruckt Crew"),
    ShadowsOfEvil("Sadows of Evil Crew"),

    //======================= Non Player Character
    Purgatory,
    SiberianFacility("Call of the Dead"),
    Group935_Ultimis("Group 935 - Ultimis"),
    Group935_Primis("Group 935 - Primis"),
    Agartha,
    DarkAther("The Dark Ather"),
    Ascension("The Ascension Group"),
    BrokenArrow("Broken Arrow"),
    Division9("Division 9"),
    ImerialJapan("The Empire of Japan"),
    NaziGermany("Nazi Germany"),
    ImperialGermany("Imperial Germany"),
    SovietUnion("The Soviet Union"),
    Group935TestSubject("Group 935 Test Subjects"),
    CIA("The C.I.A"),
    CDC("The C.D.C"),
    ShangriLa("Shangri La"),
    YouTubers("Cod Zombies YouTubers");

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
