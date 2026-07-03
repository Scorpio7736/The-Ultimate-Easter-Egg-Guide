package com.example.the_ultimate_easter_egg_guide.MapData.Test;

import com.example.the_ultimate_easter_egg_guide.Models.EasterEgg.EasterEgg;
import com.example.the_ultimate_easter_egg_guide.Models.EasterEgg.EasterEggStep;
import com.example.the_ultimate_easter_egg_guide.R;

import java.util.Arrays;
import java.util.List;

public class TestMap1_EasterEggs
{
    public static final EasterEgg TestEggQuest1 = new EasterEgg("Main Quest Egg TEST")
        .addStep(new EasterEggStep("Activate the Power")
            .addImage(R.drawable.cursed_richtofen))
            
        .addStep(new EasterEggStep("Find the Artifacts")
            .addSubStep(new EasterEggStep("Substep: Find the Golden Key")
                .addImage(R.drawable.cursed_richtofen))
            .addSubStep(new EasterEggStep("Substep: Find the Silver Shield")))
            
        .addStep(new EasterEggStep("Defeat the Guardian")
            .addImage(R.drawable.cursed_richtofen));

    public static final EasterEgg TestEggQuest2 = new EasterEgg("The Ancient Ritual")
        .addStep(new EasterEggStep("Collect 3 Skulls")
            .addSubStep(new EasterEggStep("Skull in the Library"))
            .addSubStep(new EasterEggStep("Skull in the Courtyard"))
            .addSubStep(new EasterEggStep("Skull in the Dungeon")))
        .addStep(new EasterEggStep("Place them on the Altar")
            .addImage(R.drawable.cursed_richtofen))
        .addStep(new EasterEggStep("Survive the Soul Wave"));

    public static final EasterEgg TestEggSideQuest1 = new EasterEgg("Mechanical Upgrade")
        .addStep(new EasterEggStep("Power up the Generators")
            .addImage(R.drawable.cursed_richtofen))
        .addStep(new EasterEggStep("Calibrate the Terminal")
            .addSubStep(new EasterEggStep("Input Code: 115"))
            .addSubStep(new EasterEggStep("Wait for sequence to complete")))
        .addStep(new EasterEggStep("Collect Upgraded Weapon"));

    public static final EasterEgg TestEggSideQuest2 = new EasterEgg("Hidden Song")
        .addStep(new EasterEggStep("Find the First Teddy Bear")
            .addImage(R.drawable.cursed_richtofen))
        .addStep(new EasterEggStep("Find the Second Teddy Bear"))
        .addStep(new EasterEggStep("Find the Third Teddy Bear")
            .addImage(R.drawable.cursed_richtofen));

    public static final EasterEgg TestEggBuildable1 = new EasterEgg("Boss Battle Prep")
        .addStep(new EasterEggStep("Build the Shield")
            .addSubStep(new EasterEggStep("Find Handle"))
            .addSubStep(new EasterEggStep("Find Frame"))
            .addSubStep(new EasterEggStep("Find Glass")))
        .addStep(new EasterEggStep("Charge the Soul Jar")
            .addImage(R.drawable.cursed_richtofen)
            .addSubStep(new EasterEggStep("Find Jar from image below")
                .addImage(R.drawable.cursed_richtofen)))
        .addStep(new EasterEggStep("Enter the Portal"));

    //==============================================================================================
    public static final List<EasterEgg> TestMap1_mainQuests = Arrays.asList(
            TestEggQuest1,
            TestEggQuest2
    );
    public static final List<EasterEgg> TestMap1_sideQuests = Arrays.asList(
            TestEggSideQuest1,
            TestEggSideQuest2
    );
    public static final List<EasterEgg> TestMap1_Buildables = Arrays.asList(
            TestEggBuildable1
    );
}
