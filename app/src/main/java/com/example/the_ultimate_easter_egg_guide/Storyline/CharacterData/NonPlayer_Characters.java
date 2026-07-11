package com.example.the_ultimate_easter_egg_guide.Storyline.CharacterData;

import com.example.the_ultimate_easter_egg_guide.Models.Storyline.CharacterVersion;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.CharacterGroup;
import com.example.the_ultimate_easter_egg_guide.Models.games;
import com.example.the_ultimate_easter_egg_guide.R;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public enum NonPlayer_Characters
{

    LudwigMaxis_Ultimis(
            "Dr. Ludwig Maxis",
            "Ludwig",
            "",
            "Maxis",
            new Date(),
            CharacterVersion.Ultimis,
            CharacterGroup.Group935_Ultimis,
            Arrays.asList("Maxis"),
            R.drawable.ludwigmaxis_pfp,
            games.World_At_War,
            games.Black_Ops_IV
    ),
    SamanthaMaxis(
            "Samantha Maxis",
            "Samantha",
            "",
            "Maxis",
            new Date(),
            CharacterVersion.Ultimis,
            CharacterGroup.Group935_Ultimis,
            Arrays.asList("Sam"),
            R.drawable.samanthamaxis_pfp,
            games.World_At_War,
            games.Black_Ops_VII
    ),
    Sophia(
            "Sophia",
            "Sophia",
            "",
            "",
            new Date(),
            CharacterVersion.Single,
            CharacterGroup.Group935_Ultimis,
            Arrays.asList(),
            R.drawable.sophia_pfp,
            games.Black_Ops_I,
            games.Black_Ops_III
    ),
    Groph(
            "Dr. Groph",
            "",
            "",
            "Groph",
            new Date(),
            CharacterVersion.Single,
            CharacterGroup.Group935_Ultimis,
            Arrays.asList(),
            R.drawable.groph_pfp,
            games.Black_Ops_I,
            games.Black_Ops_III
    ),
    Schuster(
            "Dr. Schuster",
            "",
            "",
            "Schuster",
            new Date(),
            CharacterVersion.Single,
            CharacterGroup.Group935_Ultimis,
            Arrays.asList(),
            R.drawable.schuster_pfp,
            games.World_At_War,
            games.Black_Ops_IV
    ),
    CorneliusPernell(
            "Cornelius Pernell",
            "Cornelius",
            "",
            "Pernell",
            new Date(),
            CharacterVersion.Single,
            CharacterGroup.BrokenArrow,
            Arrays.asList("Peter's Handler"),
            R.drawable.app_icon,
            games.World_At_War,
            games.Black_Ops_IV
    ),
    PeterMcCain(
            "Peter McCain",
            "Peter",
            "",
            "McCain",
            new Date(),
            CharacterVersion.Single,
            CharacterGroup.USGovernment,
            Arrays.asList(),
            R.drawable.petermccain_pfp,
            games.World_At_War,
            games.Black_Ops_IV
    ),
    Hale(
            "Dr. Hale",
            "",
            "",
            "Hale",
            new Date(),
            CharacterVersion.Single,
            CharacterGroup.BrokenArrow,
            Arrays.asList(),
            R.drawable.app_icon,
            games.Black_Ops_IV,
            games.Black_Ops_IV
    ),
    GeorgeSawyer(
            "George Sawyer",
            "George",
            "",
            "Sawyer",
            new Date(),
            CharacterVersion.Single,
            CharacterGroup.USGovernment,
            Arrays.asList(),
            R.drawable.app_icon,
            games.Black_Ops_IV,
            games.Black_Ops_IV
    ),
    YuriZavoyski_Ather(
            "Dr. Yuri Zavoyski",
            "Yuri",
            "",
            "Zavoyski",
            new Date(),
            CharacterVersion.Ather,
            CharacterGroup.Ascension,
            Arrays.asList("The Pentagon Theif", "IDENT K-642"),
            R.drawable.yurizavoyski_pfp,
            games.Black_Ops_I,
            games.Black_Ops_IV
    ),
    AntonGersh(
            "Dr. Anton Gersh",
            "Anton",
            "",
            "Gersh",
            new Date(),
            CharacterVersion.Single,
            CharacterGroup.Ascension,
            Arrays.asList("Anomaly"),
            R.drawable.antongersh_pfp,
            games.Black_Ops_I,
            games.Black_Ops_IV
    ),
    HarveyYena(
            "Dr. Harvey Yena",
            "Harvey",
            "",
            "Yena",
            new Date(),
            CharacterVersion.Single,
            CharacterGroup.Group935_Ultimis,
            Arrays.asList("Hyena"),
            R.drawable.app_icon,
            games.Black_Ops_I,
            games.Black_Ops_IV
    ),
    PabloMarinus(
            "Pablo Marinus",
            "Pablo",
            "",
            "Marinus",
            new Date(),
            CharacterVersion.Single,
            CharacterGroup.Group935TestSubject,
            Arrays.asList("The Speciment from Mexico", "Sir Pablo Marinus", "Hermit"),
            R.drawable.pablomarinus_pfp,
            games.Black_Ops_I,
            games.Black_Ops_IV
    ),
    Lehmkuhl(
            "General Lehmkuhl",
            "",
            "",
            "Lehmkuhl",
            new Date(),
            CharacterVersion.Single,
            CharacterGroup.NaziGermany,
            Arrays.asList(),
            R.drawable.app_icon,
            games.Black_Ops_III,
            games.Black_Ops_III
    ),
    Rushmore(
            "Rushmore",
            "Rushmore",
            "",
            "",
            new Date(),
            CharacterVersion.Single,
            CharacterGroup.BrokenArrow,
            Arrays.asList(),
            R.drawable.rushmore_pfp,
            games.Black_Ops_IV,
            games.Black_Ops_IV
    ),
    Weiss(
            "Officer Weiss",
            "",
            "",
            "Weiss",
            new Date(),
            CharacterVersion.Single,
            CharacterGroup.BrokenArrow,
            Arrays.asList(),
            R.drawable.app_icon,
            games.Black_Ops_IV,
            games.Black_Ops_IV
    ),
    GeorgeBarkley(
            "Director George Barkley",
            "George",
            "",
            "Barkley",
            new Date(),
            CharacterVersion.Single,
            CharacterGroup.BrokenArrow,
            Arrays.asList(),
            R.drawable.app_icon,
            games.Black_Ops_II,
            games.Black_Ops_IV
    ),
    Layman(
            "Dr. Layman",
            "",
            "",
            "Layman",
            new Date(),
            CharacterVersion.Single,
            CharacterGroup.USGovernment,
            Arrays.asList(),
            R.drawable.app_icon,
            games.Black_Ops_IV,
            games.Black_Ops_IV
    ),
    Monty(
            "Dr. Monty",
            "",
            "",
            "Monty",
            new Date(),
            CharacterVersion.Single,
            CharacterGroup.Agartha,
            Arrays.asList("Dr.Monty", "The Great Dragon", "The Beast", "Beelzebub", "Lucifer", "Satan", "The Devil", "M", "Doctor Minty"),
            R.drawable.monty_pfp,
            games.Black_Ops_III,
            games.Black_Ops_VI
    ),
    TheShadowman(
        "The Shadowman",
        "",
        "",
        "",
        new Date(),
        CharacterVersion.Single,
        CharacterGroup.DarkAther,
        Arrays.asList("Tony \"Hale\" Rapt", "Mr. Rapt", "The Dark One", "\"My Lord\""),
        R.drawable.shadowman_pfp,
        games.Black_Ops_III,
        games.Black_Ops_IV
    ),
    Brutus(
            "Brutus",
            "",
            "",
            "",
            new Date(),
            CharacterVersion.Single,
            CharacterGroup.Purgatory,
            Arrays.asList("Warden", "Herr Warden", "Devil Warden", "Pathetic Wretch"),
            R.drawable.brutus_pfp,
            games.Black_Ops_II,
            games.Black_Ops_VI
    ),
    StanleyFerguson(
            "Stanley Ferguson",
            "Stanley",
            "",
            "Ferguson",
            new Date(),
            CharacterVersion.Single,
            CharacterGroup.Purgatory,
            Arrays.asList(),
            R.drawable.stanleyfurguson_pfp,
            games.Black_Ops_II,
            games.Black_Ops_IV
    ),
    GeorgeRomero(
            "George Romero",
            "George",
            "Andrew",
            "Romero",
            new Date(),
            CharacterVersion.Single,
            CharacterGroup.SiberianFacility,
            Arrays.asList("The Director", "The godfather of all Zombies", "Uber Zombie"),
            R.drawable.georgeromero_pfp,
            games.Black_Ops_I,
            games.Black_Ops_IV
    ),
    Brock(
            "Brock",
            "Brock",
            "",
            "",
            new Date(),
            CharacterVersion.Single,
            CharacterGroup.ShangriLa,
            Arrays.asList(),
            R.drawable.app_icon,
            games.Black_Ops_I,
            games.Black_Ops_III
    ),
    Gary(
            "Gary",
            "Gary",
            "",
            "",
            new Date(),
            CharacterVersion.Single,
            CharacterGroup.ShangriLa,
            Arrays.asList(),
            R.drawable.app_icon,
            games.Black_Ops_I,
            games.Black_Ops_IV
    );



//Template(
//      "Template",
//      "Template",
//      "",
//      "",
//      new Date(),
//      CharacterVersion.Single,
//      CharacterGroup.Victis,
//      Arrays.asList("Template", "Template"),
//      R.drawable.app_icon,
//      games.Black_Ops_II,
//      games.Black_Ops_IV
//),

    public final String characterName;
    public final String characterFirstName;
    public final String characterMiddleName;
    public final String characterLastName;
    public final Date characterBirthday;
    public final CharacterVersion characterVersion;
    public final CharacterGroup characterGroup;
    public final List<String> characterNicknames;
    public final int characterImage;
    public final games firstappearance;
    public final games finalappearance;


    NonPlayer_Characters(String characterName, String characterFirstName, String characterMiddleName, String characterLastName, Date characterBirthday, CharacterVersion characterVersion, CharacterGroup characterGroup, List<String> characterNicknames, int characterImage, games firstappearance, games finalappearance)
    {
        this.characterName = characterName;
        this.characterFirstName = characterFirstName;
        this.characterMiddleName = characterMiddleName;
        this.characterLastName = characterLastName;
        this.characterBirthday = characterBirthday;
        this.characterVersion = characterVersion;
        this.characterGroup = characterGroup;
        this.characterNicknames = characterNicknames;
        this.characterImage = characterImage;
        this.firstappearance = firstappearance;
        this.finalappearance = finalappearance;
    }
}
