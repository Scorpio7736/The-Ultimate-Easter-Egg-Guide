package com.example.the_ultimate_easter_egg_guide.MapData.BOI;

import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEgg;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEggStep;

import java.util.Arrays;
import java.util.List;

public class KinoDerToten_EasterEggs
{
    public static final EasterEgg Song_115 = new EasterEgg("115 - Song")
            .addStep(new EasterEggStep("Activate Element 115 Rock 1")
                    .addSubStep(new EasterEggStep(
                                    "In the starting Lobby, locate the Element 115 rock inside a glass jar in the corner beside the lower-floor window."
                            )
                                    .addImage()
                    )
            )

            .addStep(new EasterEggStep("Activate Element 115 Rock 2")
                    .addSubStep(new EasterEggStep(
                                    "Go to the Dressing Room and locate the Element 115 rock on the black table near a window, behind two mannequins."
                            )
                                    .addImage()
                    )
            )

            .addStep(new EasterEggStep("Activate Element 115 Rock 3")
                    .addSubStep(new EasterEggStep(
                                    "Go to the Storage Room and locate the Element 115 rock on a shelf beside one of the windows."
                            )
                                    .addImage()
                    )
                    .addSubStep(new EasterEggStep(
                            "After interacting with all three rocks, \"115\" by Elena Siegman will begin playing."
                    ))
            )
            ;


    public static final EasterEgg Film_Reels = new EasterEgg("The Film Reels")
            .addStep(new EasterEggStep("Collect Film Reel 1")
                    .addSubStep(new EasterEggStep(
                                    "Link the teleporter on the Stage to the mainframe in the starting Lobby and use it to enter the Pack-A-Punch projector room."
                            )
                                    .addImage()
                    )
                    .addSubStep(new EasterEggStep(
                            "When the Pack-A-Punch timer expires, the teleporter may temporarily send you to one of four random rooms."
                    ))
                    .addSubStep(new EasterEggStep(
                            "Search the random room for a film reel marked with the Group 935 logo and hold interact to collect it."
                    ))
                    .addSubStep(new EasterEggStep("Normal Samantha's Room Locations")
                            .addSubStep(new EasterEggStep(
                                    "The reel may be on the table, on the bed, or leaning against the rocking chair."
                            ))
                            .addImage()
                    )
                    .addSubStep(new EasterEggStep("Destroyed Samantha's Room Locations")
                            .addSubStep(new EasterEggStep(
                                    "The reel may be on the bed, leaning against the overturned table, or near the window."
                            ))
                            .addImage()
                    )
                    .addSubStep(new EasterEggStep("Dentist's Office Locations")
                            .addSubStep(new EasterEggStep(
                                    "The reel may be on the cart beside the dentist's chair or on one of the two counters."
                            ))
                            .addImage()
                    )
                    .addSubStep(new EasterEggStep("Conference Room Locations")
                            .addSubStep(new EasterEggStep(
                                    "The reel may be on the television, underneath the projector, or on the table in front of the player."
                            ))
                            .addImage()
                    )
                    .addSubStep(new EasterEggStep(
                                    "The next time you teleport to the Pack-A-Punch room, face the projector and hold interact to insert and play the reel."
                            )
                                    .addImage()
                    )
            )

            .addStep(new EasterEggStep("Collect Film Reel 2")
                    .addSubStep(new EasterEggStep(
                            "Use the teleporter again and search the random room you enter after leaving the Pack-A-Punch room."
                    ))
                    .addSubStep(new EasterEggStep(
                                    "Collect the second available film reel and insert it into the projector during a later teleport."
                            )
                                    .addImage()
                    )
            )

            .addStep(new EasterEggStep("Collect Film Reel 3")
                    .addSubStep(new EasterEggStep(
                            "Continue using the teleporter until you enter a random room containing the third film reel."
                    ))
                    .addSubStep(new EasterEggStep(
                                    "Collect the final reel and insert it into the projector during another visit to the Pack-A-Punch room."
                            )
                                    .addImage()
                    )
                    .addSubStep(new EasterEggStep(
                            "Only three film reels appear during a match, even though the teleporter can send players to four different random rooms."
                    ))
            )
            ;


    public static final EasterEgg KnockingChest = new EasterEgg("Knocking Chest");


    public static final EasterEgg Radios = new EasterEgg("Radios")
            .addStep(new EasterEggStep("Activate Radio 1")
                    .addSubStep(new EasterEggStep(
                            "Enter the Theater and look inside the large chandelier hanging above the seating area."
                    ))
                    .addSubStep(new EasterEggStep(
                                    "Shoot the hidden radio or damage it with an explosive to activate the first recording."
                            )
                                    .addImage()
                    )
            )

            .addStep(new EasterEggStep("Activate Radio 2")
                    .addSubStep(new EasterEggStep(
                            "Go to the Alley beside Double Tap Root Beer and look through the nearby barrier toward the distant communications tower."
                    ))
                    .addSubStep(new EasterEggStep(
                                    "Locate the radio at the top of the tower and shoot it with a long-range weapon to activate the second recording."
                            )
                                    .addImage()
                    )
            )
            ;

    public static final List<EasterEgg> KinoDerToten_sideQuests = Arrays.asList(
            Song_115,
            Film_Reels,
            Radios
    );
}
