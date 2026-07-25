package com.example.the_ultimate_easter_egg_guide.MapData.Test.Buildables;

import com.example.the_ultimate_easter_egg_guide.Models.Maps.Buildable;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.BuildableStep;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEgg;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.Procedure;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEggStep;
import com.example.the_ultimate_easter_egg_guide.R;

import java.util.Arrays;
import java.util.List;

public class TestMap2_Buildables
{
    public static final Buildable TestBuildable = new Buildable("Test Map 2 Buildable", "Custom Wonder Weapon")
            .addStep(new BuildableStep("Part 1: The Engine")
                    .addImage(R.drawable.default_test_image))
            .addStep(new BuildableStep("Part 2: The Fuel"));

    public static final List<Buildable> TestMap2_Buildables = Arrays.asList(TestBuildable);
}
