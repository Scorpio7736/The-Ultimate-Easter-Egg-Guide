package com.example.the_ultimate_easter_egg_guide.StorylineData.GroupsData;

import com.example.the_ultimate_easter_egg_guide.Models.Storyline.IStorylineItem;
import com.example.the_ultimate_easter_egg_guide.Models.Games;
import com.example.the_ultimate_easter_egg_guide.R;

import java.util.Arrays;
import java.util.List;

public enum Groups implements IStorylineItem
{
    TEST("TEST", R.drawable.app_icon, Arrays.asList(Games.Test), "Category:Organizations"),
    Group935("Group 935", R.drawable.app_icon, Games.GetAllGamesBetween(Games.World_At_War, Games.Black_Ops_IV), "Group_935"),
    Division9("Division 9", R.drawable.app_icon, Arrays.asList(Games.Black_Ops_III), "Division_9"),
    Ascension("The Ascension Group", R.drawable.app_icon, Arrays.asList(Games.Black_Ops_I, Games.Black_Ops_III), "Ascension_Group"),
    BrokenArrow("Broken Arrow", R.drawable.app_icon, Arrays.asList(Games.Black_Ops_II, Games.Black_Ops_IV), "Broken_Arrow"),
    USGovernment("US Government", R.drawable.app_icon, Games.GetAllGamesBetween(Games.World_At_War, Games.Black_Ops_IV), "United_States_Government"),
    DepartmentOfDefence("Department of Defense", R.drawable.app_icon, Arrays.asList(Games.Black_Ops_I, Games.Black_Ops_IV), "Department_of_Defense"),
    CIA("C.I.A.", R.drawable.app_icon, Arrays.asList(Games.Black_Ops_II), "Central_Intelligence_Agency"),
    CDC("C.D.C.", R.drawable.app_icon, Arrays.asList(Games.Black_Ops_II), "Centers_for_Disease_Control_and_Prevention"),
    SovietUnion("Soviet Union", R.drawable.app_icon, Arrays.asList(Games.Black_Ops_I, Games.Black_Ops_III), "Soviet_Union"),
    TheKeepers("The Keepers", R.drawable.app_icon, Arrays.asList(Games.Black_Ops_III, Games.Black_Ops_IV), "Keeper"),
    TheApothicons("The Apothicons", R.drawable.app_icon, Arrays.asList(Games.Black_Ops_III, Games.Black_Ops_IV), "Apothicon"),
    Requiem("Requiem", R.drawable.app_icon, Arrays.asList(Games.Black_Ops_Cold_War), "Office_of_Requiem"),
    OmegaGroup("Omega Group", R.drawable.app_icon, Arrays.asList(Games.Black_Ops_Cold_War), "Omega_Group");

    public final String displayName;
    public final int groupImage;
    public final List<Games> gamesList;
    public final String fandomLink;

    Groups(String displayName, int groupImage, List<Games> gamesList, String fandomPath)
    {
        this.displayName = displayName;
        this.groupImage = groupImage;
        this.gamesList = gamesList;
        this.fandomLink = "https://callofduty.fandom.com/wiki/" + fandomPath;
    }

    @Override
    public int getCharacterImage() {
        return groupImage;
    }

    @Override
    public String getCharacterName() {
        return displayName;
    }

    @Override
    public Object getCharacterGroup() {
        return "Organization";
    }
}
