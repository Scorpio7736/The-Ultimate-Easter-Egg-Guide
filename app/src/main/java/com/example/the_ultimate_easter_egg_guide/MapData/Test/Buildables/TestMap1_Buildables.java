package com.example.the_ultimate_easter_egg_guide.MapData.Test.Buildables;

import com.example.the_ultimate_easter_egg_guide.Models.Maps.Buildable;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.BuildableStep;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEgg;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEggStep;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.Procedure;
import com.example.the_ultimate_easter_egg_guide.R;

import java.util.Arrays;
import java.util.List;

public class TestMap1_Buildables
{
    public static final Buildable TestEggBuildable1 = new Buildable("Boss Battle Prep")
            .addStep(new BuildableStep("Build the Shield")
                    .addSubStep(new BuildableStep("Find Handle"))
                    .addSubStep(new BuildableStep("Find Frame"))
                    .addSubStep(new BuildableStep("Find Glass")))
            .addStep(new BuildableStep("Charge the Soul Jar")
                    .addImage(R.drawable.default_test_image)
                    .addSubStep(new BuildableStep("Find Jar from image below")
                            .addImage(R.drawable.default_test_image)))
            .addStep(new BuildableStep("Enter the Portal"));

    public static final List<Buildable> TestMap1_Buildables = Arrays.asList(
            TestEggBuildable1
    );
}
