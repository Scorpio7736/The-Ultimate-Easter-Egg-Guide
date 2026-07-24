package com.example.the_ultimate_easter_egg_guide.Models.Maps;

import java.util.ArrayList;
import java.util.List;

public class MapData {
    public final List<EasterEgg> mainQuests;
    public final List<EasterEgg> sideQuests;
    public final List<Procedure> Buildables;

    public MapData(List<EasterEgg> mainQuests, List<EasterEgg> sideQuests, List<Procedure> Buildables) {
        this.mainQuests = mainQuests != null ? mainQuests : new ArrayList<>();
        this.sideQuests = sideQuests != null ? sideQuests : new ArrayList<>();
        this.Buildables = Buildables != null ? Buildables : new ArrayList<>();
    }
}
