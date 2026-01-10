package com.example.the_ultimate_easter_egg_guide;

import java.util.List;
public class zm_Map
{
    String mapName;
    List<zm_Quest> mainQuests;
    List<zm_Quest> sideQuests;
    List<zm_Quest> buildableQuests;

    public zm_Map(String mapName, List<zm_Quest> mainQuests, List<zm_Quest> sideQuests, List<zm_Quest> buildableQuests)
    {
        this.mapName = mapName;
        this.mainQuests = mainQuests;
        this.sideQuests = sideQuests;
        this.buildableQuests = buildableQuests;
    }



}
