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
    TEST("Test NPC", NonPlayer_CharacterGroups.TEST, R.drawable.default_test_image, Collections.singletonList(Games.Test)),
    LudwigMaxis_Ultimis("Dr. Ludwig Maxis", NonPlayer_CharacterGroups.Group935_Ultimis, R.drawable.ludwigmaxis_pfp, Games.GetAllGamesBetween(Games.World_At_War, Games.Black_Ops_IV)),
    SamanthaMaxis("Samantha Maxis", NonPlayer_CharacterGroups.Group935_Ultimis, R.drawable.samanthamaxis_pfp, Games.GetAllGamesBetween(Games.World_At_War, Games.Black_Ops_IV)),
    Sophia("Sophia", NonPlayer_CharacterGroups.Group935_Ultimis, R.drawable.blank_pfp, Arrays.asList(Games.Black_Ops_I, Games.Black_Ops_III)),
    Groph("Dr. Groph", NonPlayer_CharacterGroups.Group935_Ultimis, R.drawable.blank_pfp, Arrays.asList(Games.Black_Ops_I, Games.Black_Ops_III)),
    Schuster("Dr. Schuster", NonPlayer_CharacterGroups.Group935_Ultimis, R.drawable.schuster_pfp, Arrays.asList(Games.World_At_War, Games.Black_Ops_I, Games.Black_Ops_III, Games.Black_Ops_IV)),
    CorneliusPernell("Cornelius Pernell", NonPlayer_CharacterGroups.USGovernment, R.drawable.blank_pfp, Arrays.asList(Games.World_At_War, Games.Black_Ops_I, Games.Black_Ops_IV)),
    PeterMcCain("Peter McCain", NonPlayer_CharacterGroups.USGovernment, R.drawable.petermccain_pfp, Arrays.asList(Games.World_At_War, Games.Black_Ops_I, Games.Black_Ops_III, Games.Black_Ops_IV)),
    Hale("Dr. Hale", NonPlayer_CharacterGroups.BrokenArrow, R.drawable.blank_pfp, Collections.singletonList(Games.Black_Ops_IV)),
    GeorgeSawyer("George Sawyer", NonPlayer_CharacterGroups.USGovernment, R.drawable.blank_pfp, Collections.singletonList(Games.Black_Ops_IV)),
    Barkley("Barkley", NonPlayer_CharacterGroups.BrokenArrow, R.drawable.blank_pfp, Collections.singletonList(Games.Black_Ops_IV)),
    HarveyYena("Dr. Harvey Yena", NonPlayer_CharacterGroups.SovietUnion, R.drawable.blank_pfp, Collections.singletonList(Games.Black_Ops_I)),
    YuriZavoyski("Dr. Yuri Zavoyski", NonPlayer_CharacterGroups.SovietUnion, R.drawable.yurizavoyski_pfp, Arrays.asList(Games.Black_Ops_I, Games.Black_Ops_III)),
    AntonGersh("Dr. Anton Gersh", NonPlayer_CharacterGroups.SovietUnion, R.drawable.antongersh_pfp, Arrays.asList(Games.Black_Ops_I, Games.Black_Ops_III)),
    Brock("Brock", NonPlayer_CharacterGroups.Other, R.drawable.blank_pfp, Arrays.asList(Games.Black_Ops_I, Games.Black_Ops_III)),
    Gary("Gary", NonPlayer_CharacterGroups.Other, R.drawable.blank_pfp, Arrays.asList(Games.Black_Ops_I, Games.Black_Ops_III)),
    Leroy("Leroy", NonPlayer_CharacterGroups.Other, R.drawable.leroy_pfp, Collections.singletonList(Games.Black_Ops_II)),
    Monty("Dr. Monty", NonPlayer_CharacterGroups.Agartha, R.drawable.blank_pfp, Collections.singletonList(Games.Black_Ops_III)),
    Shadowman("The Shadowman", NonPlayer_CharacterGroups.DarkAther, R.drawable.shadowman_pfp, Games.GetAllGamesBetween(Games.Black_Ops_III, Games.Black_Ops_IV)),
    PabloMarinus("Pablo Marinus", NonPlayer_CharacterGroups.Group935TestSubject, R.drawable.pablomarinus_pfp, Arrays.asList(Games.Black_Ops_I, Games.Black_Ops_III, Games.Black_Ops_IV));

    public final String characterName;
    public final NonPlayer_CharacterGroups nonPlayerCharacterGroup;
    public final int characterImage;
    public final List<Games> gamesList;

    NonPlayer_Characters(String characterName, NonPlayer_CharacterGroups nonPlayerCharacterGroup, int characterImage, List<Games> gamesList)
    {
        this.characterName = characterName;
        this.nonPlayerCharacterGroup = nonPlayerCharacterGroup;
        this.characterImage = characterImage;
        this.gamesList = gamesList;
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
}