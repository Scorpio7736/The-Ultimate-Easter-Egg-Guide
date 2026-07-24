package com.example.the_ultimate_easter_egg_guide.MapData.Test.Buildables;

import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEgg;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEggStep;
import com.example.the_ultimate_easter_egg_guide.R;

import java.util.Arrays;
import java.util.List;

public class TestMap1_Buildables
{
    public static final EasterEgg TestEggBuildable1 = new EasterEgg("Boss Battle Prep")
            .addStep(new EasterEggStep("Build the Shield")
                    .addSubStep(new EasterEggStep("Find Handle"))
                    .addSubStep(new EasterEggStep("Find Frame"))
                    .addSubStep(new EasterEggStep("Find Glass")))
            .addStep(new EasterEggStep("Charge the Soul Jar")
                    .addImage(R.drawable.default_test_image)
                    .addSubStep(new EasterEggStep("Find Jar from image below")
                            .addImage(R.drawable.default_test_image)))
            .addStep(new EasterEggStep("Enter the Portal"));

    public static final List<EasterEgg> TestMap1_Buildables = Arrays.asList(
            TestEggBuildable1
    );
}
