package com.example.the_ultimate_easter_egg_guide.MapData.BOII;

import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEgg;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEggStep;

import java.util.Arrays;
import java.util.List;

public class Nuketown_EasterEggs
{
    public static final EasterEgg SamanthasLullaby =
            new EasterEgg("Samanta's Lullaby")

                    .addStep(new EasterEggStep("Activate Teddy Bear 1")
                            .addSubStep(new EasterEggStep(
                                    "Go to the yellow school bus in the center starting area."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Look through the bus windows and interact with the teddy bear sitting on one of the rear seats."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Activate Teddy Bear 2")
                            .addSubStep(new EasterEggStep(
                                    "Open the Yellow House and go to the upstairs bedroom."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Interact with the teddy bear resting on the top bunk bed."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Activate Teddy Bear 3")
                            .addSubStep(new EasterEggStep(
                                    "Go to the backyard of the Green House."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Look through the small opening near the bottom of the white fence and interact with the teddy bear positioned outside the playable area."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "After all three teddy bears have been activated, \"Samantha's Lullaby\" will begin playing."
                            ))
                    )
            ;


    public static final EasterEgg ComingHome8Bit =
            new EasterEgg("Coming Home (8-bit) - Song")

                    .addStep(new EasterEggStep("Remove Every Mannequin Head")
                            .addSubStep(new EasterEggStep(
                                    "Search the entire playable area for the mannequins positioned around the houses, yards, street, and central vehicles."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Shoot or knife the head off every mannequin."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Some mannequins are positioned outside the playable boundaries, so carefully inspect the areas beyond the fences."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "After the final mannequin head has been removed, the 8-bit version of \"Coming Home\" will begin playing."
                            ))
                    )
            ;


    public static final EasterEgg Pareidolia =
            new EasterEgg("Pareidolia - Song")

                    .addStep(new EasterEggStep("Remove Every Mannequin Head")
                            .addSubStep(new EasterEggStep(
                                    "Search the houses, yards, central street, and areas outside the playable boundaries for every mannequin."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Shoot or knife the head off each mannequin."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "The mannequin Easter egg is associated with the 8-bit versions of \"Pareidolia\" and \"Coming Home,\" depending on the documented game version or update."
                            ))
                    )
            ;


    public static final EasterEgg ReDammed8Bit =
            new EasterEgg("ReDammed (8-bit) - Song")

                    .addStep(new EasterEggStep("Set the Clock to 1")
                            .addSubStep(new EasterEggStep(
                                            "Watch the clock beside the Nuketown population counter in the center of the map."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Kill zombies until the population counter completes enough cycles for the clock hand to move to the number 1."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "The clock moves forward each time the population counter resets."
                            ))
                    )

                    .addStep(new EasterEggStep("Set the Population Counter to 15")
                            .addSubStep(new EasterEggStep(
                                    "Continue killing zombies while the clock hand remains positioned on 1."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Stop when the Nuketown population counter displays 15."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "The clock and population counter should now visually form the number 115."
                            ))
                    )

                    .addStep(new EasterEggStep("Collect the Shed Power-Up")
                            .addSubStep(new EasterEggStep(
                                    "Go to the backyard of the Yellow House."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Purchase the door to the damaged power-up shed for 3,000 points."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Collect the power-up while the clock displays 1 and the population counter displays 15."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "The 8-bit version of \"Re-Damned\" will begin playing."
                            ))
                    )
            ;


    public static final EasterEgg RichtofenTV =
            new EasterEgg("Richtofen TV Transmission")

                    .addStep(new EasterEggStep("Listen to Richtofen's Transmissions")
                            .addSubStep(new EasterEggStep(
                                            "Continue progressing through the rounds and listen for Richtofen's television transmissions."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Different transmissions can be heard near the beginnings of rounds 3, 6, 16, 21, and 25."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "The recordings follow Richtofen's progress during the events of the Moon Easter egg."
                            ))
                    )
            ;


    public static final EasterEgg MarltonBunker =
            new EasterEgg("Marlton Bunker")

                    .addStep(new EasterEggStep("Find the Fallout Shelter")
                            .addSubStep(new EasterEggStep(
                                            "Go to the backyard of the Green House and locate the closed fallout-shelter bunker."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Listen to Marlton")
                            .addSubStep(new EasterEggStep(
                                    "Knife the fallout-shelter door to hear Marlton Johnson speaking from inside the bunker."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Return and knife the door during different rounds to hear additional dialogue."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Marlton survives the destruction of Nuketown by sheltering inside this bunker before later appearing as a member of the Victis crew."
                            ))
                    )
            ;


    public static final EasterEgg TranzitBusHorn =
            new EasterEgg("Tranzit Bus Horn")

                    .addStep(new EasterEggStep("Reach Round 5")
                            .addSubStep(new EasterEggStep(
                                    "Continue playing until the beginning of Round 5."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Listen for the horn of the TranZit bus sounding in the distance outside Nuketown."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final EasterEgg ZombieEyes =
            new EasterEgg("Zombie Eyes")

                    .addStep(new EasterEggStep("Reach Round 25")
                            .addSubStep(new EasterEggStep(
                                    "Continue surviving until the beginning of Round 25."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Listen to Richtofen's final transmission as he completes the soul-switching portion of his plan on Moon."
                            ))
                    )

                    .addStep(new EasterEggStep("Observe the Zombies")
                            .addSubStep(new EasterEggStep(
                                            "After Richtofen's transmission, the zombies' eyes will change from yellow to blue."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Richtofen will replace Samantha as the announcer heard when power-ups are collected."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "The change represents Richtofen taking control of the zombies during the events of Richtofen's Grand Scheme."
                            ))
                    )
            ;


    public static final List<EasterEgg> Nuketown_SideQuests = Arrays.asList(

            SamanthasLullaby,
            ComingHome8Bit,
            Pareidolia,
            ReDammed8Bit,
            RichtofenTV,
            MarltonBunker,
            TranzitBusHorn
    );
    public static final List<EasterEgg> Nuketown_MainQuests = Arrays.asList(
            ZombieEyes
    );
}
