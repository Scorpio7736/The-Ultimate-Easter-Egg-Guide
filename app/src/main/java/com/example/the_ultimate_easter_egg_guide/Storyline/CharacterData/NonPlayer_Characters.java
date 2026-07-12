package com.example.the_ultimate_easter_egg_guide.Storyline.CharacterData;

import com.example.the_ultimate_easter_egg_guide.Models.Storyline.CharacterVersion;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.IStorylineItem;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.NonPlayer_CharacterGroup;

import com.example.the_ultimate_easter_egg_guide.Models.games;
import com.example.the_ultimate_easter_egg_guide.R;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public enum NonPlayer_Characters implements IStorylineItem
{

    TEST(
            "TESTING NPC",
            "Test",
            "Test",
            "Test",
            new Date(2000,1,1),
            CharacterVersion.Single,
            NonPlayer_CharacterGroup.TEST,
            Arrays.asList("Maxis"),
            R.drawable.default_test_image,
            games.Test,
            games.Test
    ),
    LudwigMaxis_Ultimis(
            "Dr. Ludwig Maxis",
            "Ludwig",
            "",
            "Maxis",
            new Date(),
            CharacterVersion.Ultimis,
            NonPlayer_CharacterGroup.Group935_Ultimis,
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
            NonPlayer_CharacterGroup.Group935_Ultimis,
            Arrays.asList("Sam"),
            R.drawable.samanthamaxis_pfp,
            games.World_At_War,
            games.Black_Ops_IV
    ),
    Sophia(
            "Sophia",
            "Sophia",
            "",
            "",
            new Date(),
            CharacterVersion.Single,
            NonPlayer_CharacterGroup.Group935_Ultimis,
            Arrays.asList(),
            R.drawable.blank_pfp,
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
            NonPlayer_CharacterGroup.Group935_Ultimis,
            Arrays.asList(),
            R.drawable.blank_pfp,
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
            NonPlayer_CharacterGroup.Group935_Ultimis,
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
            NonPlayer_CharacterGroup.USGovernment,
            Arrays.asList("Peter's Handler"),
            R.drawable.blank_pfp,
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
            NonPlayer_CharacterGroup.USGovernment,
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
            NonPlayer_CharacterGroup.BrokenArrow,
            Arrays.asList(),
            R.drawable.blank_pfp,
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
            NonPlayer_CharacterGroup.USGovernment,
            Arrays.asList(),
            R.drawable.blank_pfp,
            games.Black_Ops_IV,
            games.Black_Ops_IV
    ),
    Barkley(
            "Barkley",
            "",
            "",
            "",
            new Date(),
            CharacterVersion.Single,
            NonPlayer_CharacterGroup.BrokenArrow,
            Arrays.asList(),
            R.drawable.blank_pfp,
            games.Black_Ops_IV,
            games.Black_Ops_IV
    ),
    HarveyYena(
            "Dr. Harvey Yena",
            "Harvey",
            "",
            "Yena",
            new Date(),
            CharacterVersion.Single,
            NonPlayer_CharacterGroup.SovietUnion,
            Arrays.asList(),
            R.drawable.blank_pfp,
            games.Black_Ops_I,
            games.Black_Ops_I
    ),
    YuriZavoyski(
            "Dr. Yuri Zavoyski",
            "Yuri",
            "",
            "Zavoyski",
            new Date(),
            CharacterVersion.Single,
            NonPlayer_CharacterGroup.SovietUnion,
            Arrays.asList(),
            R.drawable.yurizavoyski_pfp,
            games.Black_Ops_I,
            games.Black_Ops_III
    ),
    AntonGersh(
            "Dr. Anton Gersh",
            "Anton",
            "",
            "Gersh",
            new Date(),
            CharacterVersion.Single,
            NonPlayer_CharacterGroup.SovietUnion,
            Arrays.asList(),
            R.drawable.antongersh_pfp,
            games.Black_Ops_I,
            games.Black_Ops_III
    ),
    Brock(
            "Brock",
            "",
            "",
            "",
            new Date(),
            CharacterVersion.Single,
            NonPlayer_CharacterGroup.Other,
            Arrays.asList(),
            R.drawable.blank_pfp,
            games.Black_Ops_I,
            games.Black_Ops_III
    ),
    Gary(
            "Gary",
            "",
            "",
            "",
            new Date(),
            CharacterVersion.Single,
            NonPlayer_CharacterGroup.Other,
            Arrays.asList(),
            R.drawable.blank_pfp,
            games.Black_Ops_I,
            games.Black_Ops_III
    ),
    Leroy(
            "Leroy",
            "Arthur",
            "",
            "",
            new Date(),
            CharacterVersion.Single,
            NonPlayer_CharacterGroup.Other,
            Arrays.asList("The Giant"),
            R.drawable.leroy_pfp,
            games.Black_Ops_II,
            games.Black_Ops_II
    ),
    Monty(
            "Dr. Monty",
            "",
            "",
            "Monty",
            new Date(),
            CharacterVersion.Single,
            NonPlayer_CharacterGroup.Agartha,
            Arrays.asList("The Duck"),
            R.drawable.blank_pfp,
            games.Black_Ops_III,
            games.Black_Ops_III
    ),
    Shadowman(
            "The Shadowman",
            "",
            "",
            "",
            new Date(),
            CharacterVersion.Single,
            NonPlayer_CharacterGroup.DarkAther,
            Arrays.asList("Mr. Rapt"),
            R.drawable.shadowman_pfp,
            games.Black_Ops_III,
            games.Black_Ops_IV
    ),
    PabloMarinus(
            "Pablo Marinus",
            "Pablo",
            "",
            "Marinus",
            new Date(),
            CharacterVersion.Single,
            NonPlayer_CharacterGroup.Group935TestSubject,
            Arrays.asList("The Mexican"),
            R.drawable.pablomarinus_pfp,
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
    //      R.drawable.blank_pfp,
    //      games.Black_Ops_II,
    //      games.Black_Ops_IV
    //),

    public final String characterName;
    public final String characterFirstName;
    public final String characterMiddleName;
    public final String characterLastName;
    public final Date characterBirthday;
    public final CharacterVersion characterVersion;
    public final NonPlayer_CharacterGroup nonPlayerCharacterGroup;
    public final List<String> characterNicknames;
    public final int characterImage;
    public final games firstappearance;
    public final games finalappearance;


    @Override
    public int getCharacterImage() {
        return characterImage;
    }

    @Override
    public String getCharacterName() {
        return characterName;
    }

    @Override
    public Object getCharacterGroup() {
        return nonPlayerCharacterGroup;
    }


    NonPlayer_Characters(String characterName, String characterFirstName, String characterMiddleName, String characterLastName, Date characterBirthday, CharacterVersion characterVersion, NonPlayer_CharacterGroup nonPlayerCharacterGroup, List<String> characterNicknames, int characterImage, games firstappearance, games finalappearance)
    {
        this.characterName = characterName;
        this.characterFirstName = characterFirstName;
        this.characterMiddleName = characterMiddleName;
        this.characterLastName = characterLastName;
        this.characterBirthday = characterBirthday;
        this.characterVersion = characterVersion;
        this.nonPlayerCharacterGroup = nonPlayerCharacterGroup;
        this.characterNicknames = characterNicknames;
        this.characterImage = characterImage;
        this.firstappearance = firstappearance;
        this.finalappearance = finalappearance;
    }
}
