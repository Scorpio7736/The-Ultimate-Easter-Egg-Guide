package com.example.the_ultimate_easter_egg_guide.MapData.BOII.Buildables;

import android.os.Build;

import com.example.the_ultimate_easter_egg_guide.Models.Maps.Buildable;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.BuildableStep;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.Procedure;

import java.util.Arrays;
import java.util.List;

public class DieRise_Buildables
{

    public static final Buildable TrampleSteam =
            new Buildable("Trample Steam")

                    .addStep(new BuildableStep("Collect the Chicken Wire")
                            .addSubStep(new BuildableStep(
                                    "Search immediately to the left of the first purchasable Spawn Room door."
                            ))
                            .addSubStep(new BuildableStep(
                                            "If it is not there, purchase the door and search against the wall on the left side of the next room."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Motor")
                            .addSubStep(new BuildableStep(
                                    "Search on top of the lobby desk in the starting room."
                            ))
                            .addSubStep(new BuildableStep(
                                            "If it is not on the desk, search the corner beside the collapsed stairwell."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Bellows")
                            .addSubStep(new BuildableStep(
                                    "Search halfway up the left staircase inside the starting room."
                            ))
                            .addSubStep(new BuildableStep(
                                            "If it is not on the staircase, purchase the door and look against the wall on the right side of the hallway."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Flag")
                            .addSubStep(new BuildableStep(
                                    "Search beside the broken chair at the bottom of the right staircase in Spawn."
                            ))
                            .addSubStep(new BuildableStep(
                                            "If it is not beside the chair, search near the top of the escalator where the flag may be leaning against the railing."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Build the Trample Steam")
                            .addSubStep(new BuildableStep(
                                    "Carry each part to the workbench in the room adjacent to the Spawn Room."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Place all four parts onto the workbench and collect the completed Trample Steam."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                    "The Trample Steam can launch players across gaps and instantly kill zombies or Jumping Jacks that step onto it."
                            ))
                            .addSubStep(new BuildableStep(
                                    "If the device breaks, return to the workbench to collect a replacement."
                            ))
                    )
            ;


    public static final Buildable Sliquifier =
            new Buildable("Sliquifier")

                    .addStep(new BuildableStep("Reach the Sliquifier Workbench")
                            .addSubStep(new BuildableStep(
                                    "Turn on the power and travel to the lower floor beneath the Power Room."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Locate the Sliquifier workbench near the kitchen and refrigerator."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Mannequin Foot")
                            .addSubStep(new BuildableStep(
                                    "Find the mannequin foot near the top of the staircase beside the television."
                            ))
                            .addSubStep(new BuildableStep(
                                            "This part always appears in the same location and forms the Sliquifier's stock."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Gas Canister")
                            .addSubStep(new BuildableStep(
                                    "Search inside the green cage beside the Sliquifier workbench."
                            ))
                            .addSubStep(new BuildableStep(
                                            "If it is not inside the cage, search the tables surrounding the Power Switch."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Handbrake")
                            .addSubStep(new BuildableStep(
                                    "Search the tables beside the elevators in the Power Room."
                            ))
                            .addSubStep(new BuildableStep(
                                            "If it is not in the Power Room, search beside the refrigerator near the Sliquifier workbench."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Wires and Discs")
                            .addSubStep(new BuildableStep(
                                    "Search the barrel beside the debris blocking the staircase."
                            ))
                            .addSubStep(new BuildableStep(
                                            "If the part is not on the barrel, search the wooden stand in the upstairs laundry and shower room."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Build the Sliquifier")
                            .addSubStep(new BuildableStep(
                                    "Place all four parts onto the workbench beneath the Power Room."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Only one player can initially collect the built Sliquifier in a cooperative game."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                    "After the built Sliquifier is lost or traded away, it becomes available through the Mystery Box."
                            ))
                            .addSubStep(new BuildableStep(
                                    "The Sliquifier creates pools of slippery liquid and can cause damaging chain reactions between nearby zombies."
                            ))
                    )
            ;


    public static final Buildable NavTable =
            new Buildable("NAV Table")

                    .addStep(new BuildableStep("Collect the Wooden Table")
                            .addSubStep(new BuildableStep(
                                    "Go to the Dragon Building rooftop."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Find the Wooden Table underneath the metal walkway beside an air vent."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Radio")
                            .addSubStep(new BuildableStep(
                                    "Face the rooftop staircase leading to the floor below."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Find the Radio on the rooftop floor to the right of the staircase."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Element 115 Meteorite")
                            .addSubStep(new BuildableStep(
                                    "Search the debris on the rooftop near the Claymore wall-buy."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Collect the purple Element 115 Meteorite from the ground."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Power Box")
                            .addSubStep(new BuildableStep(
                                    "Enter the small hidden rooftop area containing the separated perk elevator and a Mystery Box spawn."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Find the Power Box on the floor outside the elevator beside the zombie barrier."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Assemble the NAV Table")
                            .addSubStep(new BuildableStep(
                                    "Carry the four parts separately to the construction point beneath the radio tower and metal dragon walkway."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Place all four parts to complete the NAV Table."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                    "The completed Die Rise NAV Table accepts the Navcard collected on TranZit."
                            ))
                    )
            ;

    public static final List<Buildable> DieRise_Buildables = Arrays.asList(
            TrampleSteam,
            Sliquifier,
            NavTable
    );
}
