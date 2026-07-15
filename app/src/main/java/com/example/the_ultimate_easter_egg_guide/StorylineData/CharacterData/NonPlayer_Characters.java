package com.example.the_ultimate_easter_egg_guide.StorylineData.CharacterData;

import com.example.the_ultimate_easter_egg_guide.Models.Storyline.CharacterVersions;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.IStorylineItems;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.NonPlayer_CharacterGroups;

import com.example.the_ultimate_easter_egg_guide.Models.Games;
import com.example.the_ultimate_easter_egg_guide.R;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public enum NonPlayer_Characters implements IStorylineItems
{

    TEST(
            "TESTING NPC",
            "Test",
            "Test",
            "Test",
            new Date(2000,1,1),
            CharacterVersions.Single,
            NonPlayer_CharacterGroups.TEST,
            Arrays.asList("Maxis"),
            R.drawable.default_test_image,
            Games.Test,
            Games.Test
    ),
    LudwigMaxis_Ultimis(
            "Dr. Ludwig Maxis",
            "Ludwig",
            "",
            "Maxis",
            new Date(),
            CharacterVersions.Ultimis,
            NonPlayer_CharacterGroups.Group935_Ultimis,
            Arrays.asList("Maxis"),
            R.drawable.ludwigmaxis_pfp,
            Games.World_At_War,
            Games.Black_Ops_IV
    ),
    SamanthaMaxis(
            "Samantha Maxis",
            "Samantha",
            "",
            "Maxis",
            new Date(),
            CharacterVersions.Ultimis,
            NonPlayer_CharacterGroups.Group935_Ultimis,
            Arrays.asList("Sam"),
            R.drawable.samanthamaxis_pfp,
            Games.World_At_War,
            Games.Black_Ops_IV
    ),
    Sophia(
            "Sophia",
            "Sophia",
            "",
            "",
            new Date(),
            CharacterVersions.Single,
            NonPlayer_CharacterGroups.Group935_Ultimis,
            Arrays.asList(),
            R.drawable.blank_pfp,
            Games.Black_Ops_I,
            Games.Black_Ops_III
    ),
    Groph(
            "Dr. Groph",
            "",
            "",
            "Groph",
            new Date(),
            CharacterVersions.Single,
            NonPlayer_CharacterGroups.Group935_Ultimis,
            Arrays.asList(),
            R.drawable.blank_pfp,
            Games.Black_Ops_I,
            Games.Black_Ops_III
    ),
    Schuster(
            "Dr. Schuster",
            "",
            "",
            "Schuster",
            new Date(),
            CharacterVersions.Single,
            NonPlayer_CharacterGroups.Group935_Ultimis,
            Arrays.asList(),
            R.drawable.schuster_pfp,
            Games.World_At_War,
            Games.Black_Ops_IV
    ),
    CorneliusPernell(
            "Cornelius Pernell",
            "Cornelius",
            "",
            "Pernell",
            new Date(),
            CharacterVersions.Single,
            NonPlayer_CharacterGroups.USGovernment,
            Arrays.asList("Peter's Handler"),
            R.drawable.blank_pfp,
            Games.World_At_War,
            Games.Black_Ops_IV
    ),
    PeterMcCain(
            "Peter McCain",
            "Peter",
            "",
            "McCain",
            new Date(),
            CharacterVersions.Single,
            NonPlayer_CharacterGroups.USGovernment,
            Arrays.asList(),
            R.drawable.petermccain_pfp,
            Games.World_At_War,
            Games.Black_Ops_IV
    ),
    Hale(
            "Dr. Hale",
            "",
            "",
            "Hale",
            new Date(),
            CharacterVersions.Single,
            NonPlayer_CharacterGroups.BrokenArrow,
            Arrays.asList(),
            R.drawable.blank_pfp,
            Games.Black_Ops_IV,
            Games.Black_Ops_IV
    ),
    GeorgeSawyer(
            "George Sawyer",
            "George",
            "",
            "Sawyer",
            new Date(),
            CharacterVersions.Single,
            NonPlayer_CharacterGroups.USGovernment,
            Arrays.asList(),
            R.drawable.blank_pfp,
            Games.Black_Ops_IV,
            Games.Black_Ops_IV
    ),
    Barkley(
            "Barkley",
            "",
            "",
            "",
            new Date(),
            CharacterVersions.Single,
            NonPlayer_CharacterGroups.BrokenArrow,
            Arrays.asList(),
            R.drawable.blank_pfp,
            Games.Black_Ops_IV,
            Games.Black_Ops_IV
    ),
    HarveyYena(
            "Dr. Harvey Yena",
            "Harvey",
            "",
            "Yena",
            new Date(),
            CharacterVersions.Single,
            NonPlayer_CharacterGroups.SovietUnion,
            Arrays.asList(),
            R.drawable.blank_pfp,
            Games.Black_Ops_I,
            Games.Black_Ops_I
    ),
    YuriZavoyski(
            "Dr. Yuri Zavoyski",
            "Yuri",
            "",
            "Zavoyski",
            new Date(),
            CharacterVersions.Single,
            NonPlayer_CharacterGroups.SovietUnion,
            Arrays.asList(),
            R.drawable.yurizavoyski_pfp,
            Games.Black_Ops_I,
            Games.Black_Ops_III
    ),
    AntonGersh(
            "Dr. Anton Gersh",
            "Anton",
            "",
            "Gersh",
            new Date(),
            CharacterVersions.Single,
            NonPlayer_CharacterGroups.SovietUnion,
            Arrays.asList(),
            R.drawable.antongersh_pfp,
            Games.Black_Ops_I,
            Games.Black_Ops_III
    ),
    Brock(
            "Brock",
            "",
            "",
            "",
            new Date(),
            CharacterVersions.Single,
            NonPlayer_CharacterGroups.Other,
            Arrays.asList(),
            R.drawable.blank_pfp,
            Games.Black_Ops_I,
            Games.Black_Ops_III
    ),
    Gary(
            "Gary",
            "",
            "",
            "",
            new Date(),
            CharacterVersions.Single,
            NonPlayer_CharacterGroups.Other,
            Arrays.asList(),
            R.drawable.blank_pfp,
            Games.Black_Ops_I,
            Games.Black_Ops_III
    ),
    Leroy(
            "Leroy",
            "Arthur",
            "",
            "",
            new Date(),
            CharacterVersions.Single,
            NonPlayer_CharacterGroups.Other,
            Arrays.asList("The Giant"),
            R.drawable.leroy_pfp,
            Games.Black_Ops_II,
            Games.Black_Ops_II
    ),
    Monty(
            "Dr. Monty",
            "",
            "",
            "Monty",
            new Date(),
            CharacterVersions.Single,
            NonPlayer_CharacterGroups.Agartha,
            Arrays.asList("The Duck"),
            R.drawable.blank_pfp,
            Games.Black_Ops_III,
            Games.Black_Ops_III
    ),
    Shadowman(
            "The Shadowman",
            "",
            "",
            "",
            new Date(),
            CharacterVersions.Single,
            NonPlayer_CharacterGroups.DarkAther,
            Arrays.asList("Mr. Rapt"),
            R.drawable.shadowman_pfp,
            Games.Black_Ops_III,
            Games.Black_Ops_IV
    ),
    PabloMarinus(
            "Pablo Marinus",
            "Pablo",
            "",
            "Marinus",
            new Date(),
            CharacterVersions.Single,
            NonPlayer_CharacterGroups.Group935TestSubject,
            Arrays.asList("The Mexican"),
            R.drawable.pablomarinus_pfp,
            Games.Black_Ops_I,
            Games.Black_Ops_IV
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
    public final CharacterVersions characterVersions;
    public final NonPlayer_CharacterGroups nonPlayerCharacterGroup;
    public final List<String> characterNicknames;
    public final int characterImage;
    public final Games firstappearance;
    public final Games finalappearance;


    @Override
    public int GetImage() {
        return characterImage;
    }

    @Override
    public String GetDisplayName() {
        return characterName;
    }

    @Override
    public Object GetGroup() {
        return nonPlayerCharacterGroup;
    }


    NonPlayer_Characters(String characterName, String characterFirstName, String characterMiddleName, String characterLastName, Date characterBirthday, CharacterVersions characterVersion, NonPlayer_CharacterGroups nonPlayerCharacterGroup, List<String> characterNicknames, int characterImage, Games firstappearance, Games finalappearance)
    {
        this.characterName = characterName;
        this.characterFirstName = characterFirstName;
        this.characterMiddleName = characterMiddleName;
        this.characterLastName = characterLastName;
        this.characterBirthday = characterBirthday;
        this.characterVersions = characterVersion;
        this.nonPlayerCharacterGroup = nonPlayerCharacterGroup;
        this.characterNicknames = characterNicknames;
        this.characterImage = characterImage;
        this.firstappearance = firstappearance;
        this.finalappearance = finalappearance;
    }
}
