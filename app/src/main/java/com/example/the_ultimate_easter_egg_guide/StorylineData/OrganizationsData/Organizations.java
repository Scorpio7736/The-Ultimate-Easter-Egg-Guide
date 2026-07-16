package com.example.the_ultimate_easter_egg_guide.StorylineData.OrganizationsData;

import com.example.the_ultimate_easter_egg_guide.Models.Storyline.IStorylineItems;
import com.example.the_ultimate_easter_egg_guide.Models.Games;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.OrganizationGroups;
import com.example.the_ultimate_easter_egg_guide.R;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum Organizations implements IStorylineItems
{
    TEST("Test Organization", R.drawable.app_icon, OrganizationGroups.TEST, Collections.singletonList(Games.Test), "Category:Organizations"),
    Group935("Group 935", R.drawable.group935_pfp, OrganizationGroups.German, Games.GetAllGamesBetween(Games.World_At_War, Games.Black_Ops_IV), "Group_935"),
    Division9("Division 9", R.drawable.division9_pfp, OrganizationGroups.Japanese, Collections.singletonList(Games.Black_Ops_III), "Division_9"),
    Ascension("The Ascension Group", R.drawable.ascensiongroup_pfp, OrganizationGroups.Soviet, Arrays.asList(Games.Black_Ops_I, Games.Black_Ops_III), "Ascension_Group"),
    BrokenArrow("Broken Arrow", R.drawable.brokenarrow_pfp, OrganizationGroups.American, Arrays.asList(Games.Black_Ops_II, Games.Black_Ops_IV), "Broken_Arrow"),
    USGovernment("US Government", R.drawable.usgovernment_pfp, OrganizationGroups.American, Games.GetAllGamesBetween(Games.World_At_War, Games.Black_Ops_IV), "United_States_Government"),
    DepartmentOfDefence("Department of Defense", R.drawable.departmentofdefense_pfp, OrganizationGroups.American, Arrays.asList(Games.Black_Ops_I, Games.Black_Ops_IV), "Department_of_Defense"),
    CIA("C.I.A.", R.drawable.cia_pfp, OrganizationGroups.American, Collections.singletonList(Games.Black_Ops_II), "Central_Intelligence_Agency"),
    CDC("C.D.C.", R.drawable.cdc_pfp, OrganizationGroups.American, Collections.singletonList(Games.Black_Ops_II), "Centers_for_Disease_Control_and_Prevention"),
    SovietUnion("Soviet Union", R.drawable.ussr_pfp, OrganizationGroups.Soviet, Arrays.asList(Games.Black_Ops_I, Games.Black_Ops_III), "Soviet_Union"),
    TheKeepers("The Keepers", R.drawable.keepers_pfp, OrganizationGroups.Extraterrestrial, Arrays.asList(Games.Black_Ops_III, Games.Black_Ops_IV), "Keeper"),
    TheApothicons("The Apothicons", R.drawable.apothicon_pfp, OrganizationGroups.Extraterrestrial, Arrays.asList(Games.Black_Ops_III, Games.Black_Ops_IV), "Apothicon"),
    Requiem("Requiem", R.drawable.requiem_pfp, OrganizationGroups.American, Collections.singletonList(Games.Black_Ops_Cold_War), "Office_of_Requiem"),
    OmegaGroup("Omega Group", R.drawable.omegagroup_pfp, OrganizationGroups.Soviet, Collections.singletonList(Games.Black_Ops_Cold_War), "Omega_Group");


    public final String displayName;
    public final int organizationImage;
    public final OrganizationGroups organization;
    public final List<Games> gamesList;
    public final String fandomLink;

    Organizations(String displayName, int organizationImage, OrganizationGroups organization, List<Games> gamesList, String fandomPath)
    {
        this.displayName = displayName;
        this.organizationImage = organizationImage;
        this.organization = organization;
        this.gamesList = gamesList;
        this.fandomLink = "https://callofduty.fandom.com/wiki/" + fandomPath;
    }

    @Override
    public int GetImage() {
        return organizationImage;
    }

    @Override
    public String GetDisplayName() {
        return displayName;
    }

    @Override
    public Object GetGroup() {
        return "Organization";
    }
}
