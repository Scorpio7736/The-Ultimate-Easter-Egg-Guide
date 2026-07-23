package com.example.the_ultimate_easter_egg_guide.StorylineData.CharacterData;

import com.example.the_ultimate_easter_egg_guide.Models.Games;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.IStorylineItems;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.NonPlayer_CharacterGroups;
import com.example.the_ultimate_easter_egg_guide.R;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum NonPlayer_Characters implements IStorylineItems
{
    TEST(
            "Test NPC",
            NonPlayer_CharacterGroups.TEST,
            R.drawable.default_test_image,
            Collections.singletonList(Games.Test),
            null
    ),

    LudwigMaxis_Ultimis(
            "Dr. Ludwig Maxis",
            NonPlayer_CharacterGroups.Group935_Ultimis,
            R.drawable.ludwigmaxis_pfp,
            Games.GetAllGamesBetween(Games.World_At_War, Games.Black_Ops_IV),
            "Ludwig_Maxis"
    ),

    SamanthaMaxis(
            "Samantha Maxis",
            NonPlayer_CharacterGroups.Group935_Ultimis,
            R.drawable.samanthamaxis_pfp,
            Games.GetAllGamesBetween(Games.World_At_War, Games.Black_Ops_IV),
            "Samantha_Maxis"
    ),

    Sophia(
            "Sophia",
            NonPlayer_CharacterGroups.Group935_Ultimis,
            R.drawable.blank_pfp,
            Arrays.asList(Games.Black_Ops_I, Games.Black_Ops_III),
            "Sophia"
    ),

    Groph(
            "Dr. Groph",
            NonPlayer_CharacterGroups.Group935_Ultimis,
            R.drawable.blank_pfp,
            Arrays.asList(Games.Black_Ops_I, Games.Black_Ops_III),
            "Groph"
    ),

    Schuster(
            "Dr. Schuster",
            NonPlayer_CharacterGroups.Group935_Ultimis,
            R.drawable.schuster_pfp,
            Arrays.asList(
                    Games.World_At_War,
                    Games.Black_Ops_I,
                    Games.Black_Ops_III,
                    Games.Black_Ops_IV
            ),
            "Schuster"
    ),

    CorneliusPernell(
            "Cornelius Pernell",
            NonPlayer_CharacterGroups.USGovernment,
            R.drawable.blank_pfp,
            Arrays.asList(
                    Games.World_At_War,
                    Games.Black_Ops_I,
                    Games.Black_Ops_IV
            ),
            "Cornelius_Pernell"
    ),

    PeterMcCain(
            "Peter McCain",
            NonPlayer_CharacterGroups.USGovernment,
            R.drawable.petermccain_pfp,
            Arrays.asList(
                    Games.World_At_War,
                    Games.Black_Ops_I,
                    Games.Black_Ops_III,
                    Games.Black_Ops_IV
            ),
            "Peter_McCain"
    ),

    Hale(
            "Dr. Hale",
            NonPlayer_CharacterGroups.BrokenArrow,
            R.drawable.blank_pfp,
            Collections.singletonList(Games.Black_Ops_IV),
            "Hale"
    ),

    GeorgeSawyer(
            "George Sawyer",
            NonPlayer_CharacterGroups.USGovernment,
            R.drawable.blank_pfp,
            Collections.singletonList(Games.Black_Ops_IV),
            "George_Sawyer"
    ),

    Barkley(
            "George Barkley",
            NonPlayer_CharacterGroups.BrokenArrow,
            R.drawable.blank_pfp,
            Collections.singletonList(Games.Black_Ops_IV),
            "George_Barkley"
    ),

    HarveyYena(
            "Dr. Harvey Yena",
            NonPlayer_CharacterGroups.SovietUnion,
            R.drawable.blank_pfp,
            Collections.singletonList(Games.Black_Ops_I),
            "Harvey_Yena"
    ),

    YuriZavoyski(
            "Dr. Yuri Zavoyski",
            NonPlayer_CharacterGroups.SovietUnion,
            R.drawable.yurizavoyski_pfp,
            Arrays.asList(Games.Black_Ops_I, Games.Black_Ops_III),
            "Yuri_Zavoyski_(Aether)"
    ),

    AntonGersh(
            "Dr. Anton Gersh",
            NonPlayer_CharacterGroups.SovietUnion,
            R.drawable.antongersh_pfp,
            Arrays.asList(Games.Black_Ops_I, Games.Black_Ops_III),
            "Anton_Gersh"
    ),

    Brock(
            "Brock",
            NonPlayer_CharacterGroups.Other,
            R.drawable.blank_pfp,
            Arrays.asList(Games.Black_Ops_I, Games.Black_Ops_III),
            "Brock"
    ),

    Gary(
            "Gary",
            NonPlayer_CharacterGroups.Other,
            R.drawable.blank_pfp,
            Arrays.asList(Games.Black_Ops_I, Games.Black_Ops_III),
            "Gary"
    ),

    Leroy(
            "Leroy",
            NonPlayer_CharacterGroups.Other,
            R.drawable.leroy_pfp,
            Collections.singletonList(Games.Black_Ops_II),
            "Arthur"
    ),

    Monty(
            "Dr. Monty",
            NonPlayer_CharacterGroups.Agartha,
            R.drawable.monty_pfp,
            Collections.singletonList(Games.Black_Ops_III),
            "Monty_(Zombies)"
    ),

    Shadowman(
            "The Shadowman",
            NonPlayer_CharacterGroups.DarkAther,
            R.drawable.shadowman_pfp,
            Games.GetAllGamesBetween(Games.Black_Ops_III, Games.Black_Ops_IV),
            "Shadowman"
    ),

    PabloMarinus(
            "Pablo Marinus",
            NonPlayer_CharacterGroups.Group935TestSubject,
            R.drawable.pablomarinus_pfp,
            Arrays.asList(
                    Games.Black_Ops_I,
                    Games.Black_Ops_III,
                    Games.Black_Ops_IV
            ),
            "Pablo_Marinus"
    );


    public final String characterName;
    public final NonPlayer_CharacterGroups nonPlayerCharacterGroup;
    public final int characterImage;
    public final List<Games> gamesList;
    public final String fandomLink;


    NonPlayer_Characters(
            String characterName,
            NonPlayer_CharacterGroups nonPlayerCharacterGroup,
            int characterImage,
            List<Games> gamesList,
            String fandomPath
    )
    {
        this.characterName = characterName;
        this.nonPlayerCharacterGroup = nonPlayerCharacterGroup;
        this.characterImage = characterImage;
        this.gamesList = gamesList;

        this.fandomLink = fandomPath == null
                ? null
                : "https://callofduty.fandom.com/wiki/" + fandomPath;
    }


    @Override
    public int GetImage()
    {
        return characterImage;
    }


    @Override
    public String GetDisplayName()
    {
        return characterName;
    }


    @Override
    public Object GetGroup()
    {
        return nonPlayerCharacterGroup;
    }


    public String GetFandomLink()
    {
        return fandomLink;
    }
}