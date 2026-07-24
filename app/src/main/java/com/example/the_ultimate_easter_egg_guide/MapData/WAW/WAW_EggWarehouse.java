package com.example.the_ultimate_easter_egg_guide.MapData.WAW;

import com.example.the_ultimate_easter_egg_guide.MapData.WAW.EasterEggs.DerReise_EasterEggs;
import com.example.the_ultimate_easter_egg_guide.MapData.WAW.EasterEggs.Nacht_EasterEggs;
import com.example.the_ultimate_easter_egg_guide.MapData.WAW.EasterEggs.ShiNo_EasterEggs;
import com.example.the_ultimate_easter_egg_guide.MapData.WAW.EasterEggs.Verruckt_EasterEggs;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.MapData;

public class WAW_EggWarehouse
{
    public static final MapData Nacht = new MapData(
            null,
            Nacht_EasterEggs.Nacht_sideQuests,
            null
    );

    public static final MapData Verruckt = new MapData(
            null,
            Verruckt_EasterEggs.Verruckt_sideQuests,
            null
    );

    public static final MapData ShiNoNuma = new MapData(
            null,
            ShiNo_EasterEggs.ShiNo_sideQuests,
            null
    );

    public static final MapData DerReise = new MapData(
            DerReise_EasterEggs.DerReise_MainQuests,
            DerReise_EasterEggs.DerReise_sideQuests,
            null
    );
}
