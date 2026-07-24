package com.example.the_ultimate_easter_egg_guide.MapData.Test;

import com.example.the_ultimate_easter_egg_guide.MapData.Test.EasterEggs.TestMap1_EasterEggs;
import com.example.the_ultimate_easter_egg_guide.MapData.Test.EasterEggs.TestMap2_EasterEggs;
import com.example.the_ultimate_easter_egg_guide.MapData.Test.EasterEggs.TestMap3_EasterEggs;
import com.example.the_ultimate_easter_egg_guide.MapData.Test.EasterEggs.TestMap4_EasterEggs;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.MapData;

public class TEST_EggWarehouse
{
    public static final MapData TestMap1 = new MapData(
            TestMap1_EasterEggs.TestMap1_mainQuests,
            TestMap1_EasterEggs.TestMap1_sideQuests,
            TestMap1_EasterEggs.TestMap1_Buildables
    );

    public static final MapData TestMap2 = new MapData(
            TestMap2_EasterEggs.TestMap2_mainQuests,
            TestMap2_EasterEggs.TestMap2_sideQuests,
            TestMap2_EasterEggs.TestMap2_Buildables
    );

    public static final MapData TestMap3 = new MapData(
            TestMap3_EasterEggs.TestMap3_mainQuests,
            TestMap3_EasterEggs.TestMap3_sideQuests,
            TestMap3_EasterEggs.TestMap3_Buildables
    );

    public static final MapData TestMap4 = new MapData(
            TestMap4_EasterEggs.TestMap4_mainQuests,
            TestMap4_EasterEggs.TestMap4_sideQuests,
            TestMap4_EasterEggs.TestMap4_Buildables
    );
}
