package com.example.the_ultimate_easter_egg_guide.Models;

import com.example.the_ultimate_easter_egg_guide.EasterEgg.EasterEgg;
import com.example.the_ultimate_easter_egg_guide.MapData.TestMapEggWarehouse;

import java.util.ArrayList;
import java.util.List;

public enum MapsEggHandler
{

    TestEgg1(
            TestMapEggWarehouse.TestMap1_mainQuests,
            TestMapEggWarehouse.TestMap1_sideQuests,
            TestMapEggWarehouse.TestMap1_Buildables
    );

    public List<EasterEgg> mainQuests = new ArrayList<EasterEgg>();
    public List<EasterEgg> sideQuests = new ArrayList<EasterEgg>();
    public List<EasterEgg> Buildables = new ArrayList<EasterEgg>();

    MapsEggHandler(List<EasterEgg> mainQuests, List<EasterEgg> sideQuests, List<EasterEgg> Buildables)
    {
        this.mainQuests = mainQuests;
        this.sideQuests = sideQuests;
        this.Buildables = Buildables;
    }
}