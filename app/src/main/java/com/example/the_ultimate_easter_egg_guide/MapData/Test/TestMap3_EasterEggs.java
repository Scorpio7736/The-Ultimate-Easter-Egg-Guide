package com.example.the_ultimate_easter_egg_guide.MapData.Test;

import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEgg;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEggStep;
import com.example.the_ultimate_easter_egg_guide.R;

import java.util.Arrays;
import java.util.List;

public class TestMap3_EasterEggs
{
    public static final EasterEgg TestMainQuest = new EasterEgg("Test Map 3 Main Quest", "Free Ray Gun for everyone!")
        .addStep(new EasterEggStep("Locate the 3 Golden Goblets")
            .addSubStep(new EasterEggStep("Goblet 1: In the Wine Cellar"))
            .addSubStep(new EasterEggStep("Goblet 2: In the Dining Room"))
            .addSubStep(new EasterEggStep("Goblet 3: In the Master Bedroom")))
        .addStep(new EasterEggStep("Fill them with the blood of the undead")
            .addImage(R.drawable.default_test_image))
        .addStep(new EasterEggStep("Toast to the end of the world"));

    public static final List<EasterEgg> TestMap3_mainQuests = Arrays.asList(TestMainQuest);
    public static final List<EasterEgg> TestMap3_sideQuests = Arrays.asList();
    public static final List<EasterEgg> TestMap3_Buildables = Arrays.asList();
}
