package com.example.the_ultimate_easter_egg_guide.MapData.Test;

import com.example.the_ultimate_easter_egg_guide.MapData.Test.Buildables.TestMap1_Buildables;
import com.example.the_ultimate_easter_egg_guide.MapData.Test.Buildables.TestMap2_Buildables;
import com.example.the_ultimate_easter_egg_guide.MapData.Test.Buildables.TestMap3_Buildables;
import com.example.the_ultimate_easter_egg_guide.MapData.Test.Buildables.TestMap4_Buildables;
import com.example.the_ultimate_easter_egg_guide.MapData.Test.EasterEggs.TestMap1_EasterEggs;
import com.example.the_ultimate_easter_egg_guide.MapData.Test.EasterEggs.TestMap2_EasterEggs;
import com.example.the_ultimate_easter_egg_guide.MapData.Test.EasterEggs.TestMap3_EasterEggs;
import com.example.the_ultimate_easter_egg_guide.MapData.Test.EasterEggs.TestMap4_EasterEggs;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.MapData;

public class TEST_MapDataWarehouse
{
    public static final MapData TestMap1 = new MapData(
            TestMap1_EasterEggs.TestMap1_mainQuests,
            TestMap1_EasterEggs.TestMap1_sideQuests,
            TestMap1_Buildables.TestMap1_Buildables
    );

    public static final MapData TestMap2 = new MapData(
            TestMap2_EasterEggs.TestMap2_mainQuests,
            TestMap2_EasterEggs.TestMap2_sideQuests,
            TestMap2_Buildables.TestMap2_Buildables
    );

    public static final MapData TestMap3 = new MapData(
            TestMap3_EasterEggs.TestMap3_mainQuests,
            TestMap3_EasterEggs.TestMap3_sideQuests,
            TestMap3_Buildables.TestMap3_Buildables
    );

    public static final MapData TestMap4 = new MapData(
            TestMap4_EasterEggs.TestMap4_mainQuests,
            TestMap4_EasterEggs.TestMap4_sideQuests,
            TestMap4_Buildables.TestMap4_Buildables
    );
}
