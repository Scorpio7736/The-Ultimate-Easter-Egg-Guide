package com.example.the_ultimate_easter_egg_guide.Models.Storyline;

public enum NonPlayer_CharacterGroup
{
    TEST,
    Primis,
    Ultimis,
    Victis,
    USGovernment("United States Government"),
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
    Other("Other");

    public final String displayName;

    NonPlayer_CharacterGroup(String displayName)
    {
        this.displayName = displayName;
    }

    NonPlayer_CharacterGroup()
    {
        this.displayName = this.name();
    }
}
