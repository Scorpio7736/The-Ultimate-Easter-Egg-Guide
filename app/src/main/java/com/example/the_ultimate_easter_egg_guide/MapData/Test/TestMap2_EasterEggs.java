package com.example.the_ultimate_easter_egg_guide.MapData.Test;

import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEgg;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEggStep;
import com.example.the_ultimate_easter_egg_guide.R;

import java.util.Arrays;
import java.util.List;

public class TestMap2_EasterEggs
{
    public static final EasterEgg TestMainQuest = new EasterEgg("Test Map 2 Main Quest", "Permanent Perks + All Weapons Pack-a-Punched")
        .addStep(new EasterEggStep("Step 1: The Beginning")
            .addSubStep(new EasterEggStep("Open the first door")
                .addImage(R.drawable.default_test_image)))
        .addStep(new EasterEggStep("Step 2: Collect Parts")
            .addSubStep(new EasterEggStep("Part A found in Spawn"))
            .addSubStep(new EasterEggStep("Part B found in the Theater")))
        .addStep(new EasterEggStep("Step 3: Final Boss")
            .addImage(R.drawable.default_test_image));

    public static final EasterEgg TestSideQuest = new EasterEgg("Test Map 2 Side Quest")
        .addStep(new EasterEggStep("Find the hidden radio")
            .addImage(R.drawable.default_test_image))
        .addStep(new EasterEggStep("Listen to the message"));

    public static final EasterEgg TestBuildable = new EasterEgg("Test Map 2 Buildable", "Custom Wonder Weapon")
        .addStep(new EasterEggStep("Part 1: The Engine")
            .addImage(R.drawable.default_test_image))
        .addStep(new EasterEggStep("Part 2: The Fuel"));

    public static final List<EasterEgg> TestMap2_mainQuests = Arrays.asList(TestMainQuest);
    public static final List<EasterEgg> TestMap2_sideQuests = Arrays.asList(TestSideQuest);
    public static final List<EasterEgg> TestMap2_Buildables = Arrays.asList(TestBuildable);
}
