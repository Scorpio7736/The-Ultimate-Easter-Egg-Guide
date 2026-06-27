package com.example.the_ultimate_easter_egg_guide.Models.EasterEgg;

import java.util.ArrayList;
import java.util.List;

public class MapEggData {
    public final List<EasterEgg> mainQuests;
    public final List<EasterEgg> sideQuests;
    public final List<EasterEgg> Buildables;

    public MapEggData(List<EasterEgg> mainQuests, List<EasterEgg> sideQuests, List<EasterEgg> Buildables) {
        this.mainQuests = mainQuests != null ? mainQuests : new ArrayList<>();
        this.sideQuests = sideQuests != null ? sideQuests : new ArrayList<>();
        this.Buildables = Buildables != null ? Buildables : new ArrayList<>();
    }
}
