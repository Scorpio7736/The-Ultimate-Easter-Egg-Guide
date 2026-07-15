package com.example.the_ultimate_easter_egg_guide.StorylineData.CreaturesData;

import com.example.the_ultimate_easter_egg_guide.Models.Storyline.CreatureGroups;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.IStorylineItems;
import com.example.the_ultimate_easter_egg_guide.Models.Games;
import com.example.the_ultimate_easter_egg_guide.R;

import java.util.Arrays;
import java.util.List;

public enum Friendly_Creatures implements IStorylineItems
{
    Test("Test", R.drawable.app_icon, CreatureGroups.TEST, Arrays.asList(Games.Test), ""),

    Leroy("Arthur (Leroy)", R.drawable.leroy_pfp, CreatureGroups.Special, Arrays.asList(Games.Black_Ops_II), "Arthur_(Zombies)"),

    TEDD("T.E.D.D.", R.drawable.tedd_pfp, CreatureGroups.Special, Arrays.asList(Games.Black_Ops_II), "T.E.D.D."),

    MaxisDrone("Maxis Drone", R.drawable.app_icon, CreatureGroups.Special, Arrays.asList(Games.Black_Ops_II, Games.Black_Ops_III), "Maxis_Drone"),

    CivilProtector("Civil Protector", R.drawable.app_icon, CreatureGroups.Special, Arrays.asList(Games.Black_Ops_III), "Civil_Protector"),

    KeeperProtector("Keeper Protector", R.drawable.app_icon, CreatureGroups.Special, Arrays.asList(Games.Black_Ops_III), "Keeper_Protector"),

    DragonWhelp("Dragon Whelp", R.drawable.app_icon, CreatureGroups.Special, Arrays.asList(Games.Black_Ops_III), "Gauntlet_of_Siegfried"),

    WolfSpirit("Wolf Spirit", R.drawable.app_icon, CreatureGroups.Special, Arrays.asList(Games.Black_Ops_III), "Wrath_of_the_Ancients"),

    FriendlyThrasher("Friendly Thrasher", R.drawable.app_icon, CreatureGroups.Special, Arrays.asList(Games.Black_Ops_III), "Thrasher"),

    FriendlySpider("Friendly Spider", R.drawable.app_icon, CreatureGroups.Special, Arrays.asList(Games.Black_Ops_III), "Spider_(Zombies)");

    public final String displayName;
    public final int creatureCover;
    public final CreatureGroups creatureGroup;
    public final List<Games> gamesList;
    public final String fandomLink;

    @Override
    public int GetImage() {
        return creatureCover;
    }

    @Override
    public String GetDisplayName() {
        return displayName;
    }

    @Override
    public Object GetGroup() {
        return creatureGroup;
    }


    Friendly_Creatures(String displayName, int creatureCover, CreatureGroups creatureGroup, List<Games> gamesList, String fandomPath)
    {
        this.displayName = displayName;
        this.creatureCover = creatureCover;
        this.creatureGroup = creatureGroup;
        this.gamesList = gamesList;
        this.fandomLink = "https://callofduty.fandom.com/wiki/" + fandomPath;
    }
}
