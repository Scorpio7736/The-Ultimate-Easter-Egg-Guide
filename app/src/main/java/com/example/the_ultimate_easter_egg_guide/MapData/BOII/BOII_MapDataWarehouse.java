package com.example.the_ultimate_easter_egg_guide.MapData.BOII;

import com.example.the_ultimate_easter_egg_guide.MapData.BOII.Buildables.Buried_Buildables;
import com.example.the_ultimate_easter_egg_guide.MapData.BOII.Buildables.DieRise_Buildables;
import com.example.the_ultimate_easter_egg_guide.MapData.BOII.Buildables.MOTD_Buildables;
import com.example.the_ultimate_easter_egg_guide.MapData.BOII.Buildables.Origins_Buildables;
import com.example.the_ultimate_easter_egg_guide.MapData.BOII.Buildables.Tranzit_Buildables;
import com.example.the_ultimate_easter_egg_guide.MapData.BOII.EasterEggs.Buried_EasterEggs;
import com.example.the_ultimate_easter_egg_guide.MapData.BOII.EasterEggs.DieRise_EasterEggs;
import com.example.the_ultimate_easter_egg_guide.MapData.BOII.EasterEggs.MOTD_EasterEggs;
import com.example.the_ultimate_easter_egg_guide.MapData.BOII.EasterEggs.Nuketown_EasterEggs;
import com.example.the_ultimate_easter_egg_guide.MapData.BOII.EasterEggs.Origins_EasterEggs;
import com.example.the_ultimate_easter_egg_guide.MapData.BOII.EasterEggs.Tranzit_EasterEggs;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.MapData;

public class BOII_MapDataWarehouse
{
    public static final MapData Tranzit = new MapData(Tranzit_EasterEggs.Tranzit_MainQuests, Tranzit_EasterEggs.Tranzit_SideQuests, Tranzit_Buildables.Tranzit_Buildables);
    public static final MapData Town = new MapData(null, null, null);
    public static final MapData Farm = new MapData(null, null, null);
    public static final MapData BusDepot = new MapData(null, null, null);
    public static final MapData Nuketown = new MapData(Nuketown_EasterEggs.Nuketown_MainQuests, Nuketown_EasterEggs.Nuketown_SideQuests, null);
    public static final MapData DieRise = new MapData(DieRise_EasterEggs.DieRise_MainQuests, DieRise_EasterEggs.DieRise_SideQuests, DieRise_Buildables.DieRise_Buildables);
    public static final MapData MobOfTheDead = new MapData(MOTD_EasterEggs.MOTD_MainQuests, MOTD_EasterEggs.MOTD_SideQuests, MOTD_Buildables.MOTD_Buildables);
    public static final MapData Buried = new MapData(Buried_EasterEggs.Buried_MainQuests, Buried_EasterEggs.Buried_SideQuests, Buried_Buildables.Buried_Buildables);
    public static final MapData Origins = new MapData(Origins_EasterEggs.Origins_MainQuests, Origins_EasterEggs.Origins_SideQuests, Origins_Buildables.Origins_Buildables);
}
