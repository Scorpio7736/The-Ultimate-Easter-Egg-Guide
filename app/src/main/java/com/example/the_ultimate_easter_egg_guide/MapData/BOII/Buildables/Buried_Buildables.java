package com.example.the_ultimate_easter_egg_guide.MapData.BOII.Buildables;

import com.example.the_ultimate_easter_egg_guide.Models.Maps.Buildable;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.Buildable;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.BuildableStep;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.Procedure;

import java.util.Arrays;
import java.util.List;

public class Buried_Buildables
{
    public static final Buildable CraftingTables =
            new Buildable("Crafting Tables")

                    .addStep(new BuildableStep("Jail Crafting Table")
                            .addSubStep(new BuildableStep(
                                            "The first crafting table is on the upper floor of the building containing Arthur's jail cell, directly across from the General Store."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Saloon Crafting Table")
                            .addSubStep(new BuildableStep(
                                            "The second crafting table is inside the Saloon, beside the main entrance."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Courthouse Crafting Table")
                            .addSubStep(new BuildableStep(
                                            "The third crafting table is against the left wall immediately after entering the Courthouse."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Church Crafting Table")
                            .addSubStep(new BuildableStep(
                                            "The fourth crafting table is against the left wall inside the Church, beside the staircase."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final Buildable Turbine =
            new Buildable("Turbine")

                    .addStep(new BuildableStep("Collect the Mannequin")
                            .addSubStep(new BuildableStep(
                                            "Enter the General Store and find the headless mannequin in the back-right corner of the small ground-floor office."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Fan")
                            .addSubStep(new BuildableStep(
                                            "Go to the upper floor of the General Store and find the fan on a desk inside the back room."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Plane Tail")
                            .addSubStep(new BuildableStep(
                                            "Find the model-plane tail on the shelving along the left side of the General Store's ground floor."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Build the Turbine")
                            .addSubStep(new BuildableStep(
                                    "Take all three parts to any unused crafting table and assemble the Turbine."
                            ))
                            .addSubStep(new BuildableStep(
                                            "The Turbine powers the Subsurface Resonator and can attract nearby zombies."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final Buildable NavTable =
            new Buildable("NAV Table")

                    .addStep(new BuildableStep("Open the Portal to Processing")
                            .addSubStep(new BuildableStep(
                                    "Have Arthur destroy the Mansion fountain, then destroy the fountain in the center of the maze."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Use the portal under the maze fountain to reach the lower Processing area."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Wooden Board")
                            .addSubStep(new BuildableStep(
                                            "Find the wooden board in the enclosed area behind the Barn and Gunsmith."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Card Reader and Electrical Box")
                            .addSubStep(new BuildableStep(
                                            "Find the radio or card reader and electrical box in the same enclosed area behind the Barn and Gunsmith."
                                    )
                                            .addImage()
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Meteorite")
                            .addSubStep(new BuildableStep(
                                            "Find the purple meteorite on the floor beside the cabinets in the lower Processing area."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Assemble the NAV Table")
                            .addSubStep(new BuildableStep(
                                    "Install all four parts at the construction location on the wall beside the Processing-area cabinets."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Once built, insert the Navcard collected on Die Rise into the Buried NAV Table."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final Buildable TrampleSteam =
            new Buildable("Trample Steam")

                    .addStep(new BuildableStep("Collect the Bellows")
                            .addSubStep(new BuildableStep(
                                            "Find the bellows somewhere inside the upper floor of the General Store."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Screen")
                            .addSubStep(new BuildableStep(
                                            "Find the square metal screen inside the General Store."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Compressor")
                            .addSubStep(new BuildableStep(
                                            "Find the compressor or motor inside the General Store."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Flag")
                            .addSubStep(new BuildableStep(
                                            "Find the red flag inside the General Store."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Build the Trample Steam")
                            .addSubStep(new BuildableStep(
                                    "Take all four parts to any unused crafting table and assemble the Trample Steam."
                            ))
                            .addSubStep(new BuildableStep(
                                            "The Trample Steam launches players and zombies, allowing players to cross gaps and low barriers."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final Buildable SubsurfaceResonator =
            new Buildable("Subsurface Resonator")

                    .addStep(new BuildableStep("Collect the Roulette Wheel")
                            .addSubStep(new BuildableStep(
                                            "Find the roulette wheel inside the General Store."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Card Table")
                            .addSubStep(new BuildableStep(
                                            "Find the folding card-table component inside the General Store."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Roulette Table")
                            .addSubStep(new BuildableStep(
                                            "Find the main roulette-table component inside the General Store."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Pipe")
                            .addSubStep(new BuildableStep(
                                            "Find the metal pipe inside the General Store, commonly near the upper staircase."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Build and Power the Resonator")
                            .addSubStep(new BuildableStep(
                                    "Take all four components to an unused crafting table and assemble the Subsurface Resonator."
                            ))
                            .addSubStep(new BuildableStep(
                                    "Place an active Turbine directly behind the Resonator to power it."
                            ))
                            .addSubStep(new BuildableStep(
                                            "The powered device emits sonic blasts that kill zombies and can destroy the red orbs during Maxis' Mined Games path."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final Buildable HeadChopper =
            new Buildable("Head Chopper")

                    .addStep(new BuildableStep("Collect the Saw Blade")
                            .addSubStep(new BuildableStep(
                                            "Find the circular saw blade inside a wooden barrel in the General Store."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Lever")
                            .addSubStep(new BuildableStep(
                                            "Find the lever component inside the General Store."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Gears")
                            .addSubStep(new BuildableStep(
                                            "Find the set of gears inside the General Store."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Stand")
                            .addSubStep(new BuildableStep(
                                            "Find the mounting stand in the back room of the General Store."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Build the Head Chopper")
                            .addSubStep(new BuildableStep(
                                    "Take all four parts to any unused crafting table and assemble the Head Chopper."
                            ))
                            .addSubStep(new BuildableStep(
                                    "Place the Head Chopper on the ground or attach it to a wall. Its blade automatically activates when zombies approach."
                            ))
                            .addSubStep(new BuildableStep(
                                            "The blade can also injure players who stand too close."
                                    )
                                            .addImage()
                            )
                    )
            ;

    public static final List<Buildable> Buried_Buildables = Arrays.asList(
            CraftingTables,
            Turbine,
            NavTable,
            TrampleSteam,
            SubsurfaceResonator,
            HeadChopper
    );
}
