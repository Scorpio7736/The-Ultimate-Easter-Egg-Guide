package com.example.the_ultimate_easter_egg_guide.MapData.Test;

import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEgg;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEggStep;

import java.util.Arrays;
import java.util.List;

public class TestMap4_EasterEggs
{
    public static final EasterEgg TestMainQuest = new EasterEgg("Test Map 4: The Final Test")
        .addStep(new EasterEggStep("Step A: No Images here"))
        .addStep(new EasterEggStep("Step B: Just some text"));

    public static final List<EasterEgg> TestMap4_mainQuests = Arrays.asList(TestMainQuest);
    public static final List<EasterEgg> TestMap4_sideQuests = Arrays.asList();
    public static final List<EasterEgg> TestMap4_Buildables = Arrays.asList();
}
