package com.example.the_ultimate_easter_egg_guide.MapData.BOI.EasterEggs;

import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEgg;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEggStep;

import java.util.Arrays;
import java.util.List;

public class COTD_EasterEggs
{
    public static final EasterEgg StandIn = new EasterEgg("Stand In")
            .addStep(new EasterEggStep("Find and Install the Fuse")
                    .addSubStep(new EasterEggStep(
                                    "Turn on the power using the power switch located inside the ship's control room."
                            )
                                    .addImage()
                    )
                    .addSubStep(new EasterEggStep(
                                    "Go to the room underneath PhD Flopper and locate the locked vault door."
                            )
                                    .addImage()
                    )
                    .addSubStep(new EasterEggStep(
                            "Knife the vault door and listen to Richtofen explain that the Ultimis crew is trapped inside."
                    ))
                    .addSubStep(new EasterEggStep(
                            "Return to the room containing PhD Flopper and locate the missing fuse. It can appear in one of three locations."
                    ))
                    .addSubStep(new EasterEggStep("Fuse Location 1")
                            .addSubStep(new EasterEggStep(
                                    "Look on the table beside the PhD Flopper machine."
                            ))
                            .addImage()
                    )
                    .addSubStep(new EasterEggStep("Fuse Location 2")
                            .addSubStep(new EasterEggStep(
                                    "Look on the table against the opposite wall near the batteries."
                            ))
                            .addImage()
                    )
                    .addSubStep(new EasterEggStep("Fuse Location 3")
                            .addSubStep(new EasterEggStep(
                                    "Look on the floor between the green cabinet and the wall."
                            ))
                            .addImage()
                    )
                    .addSubStep(new EasterEggStep(
                                    "Collect the fuse and place it inside the fuse box directly to the right of the vault door."
                            )
                                    .addImage()
                    )
            )

            .addStep(new EasterEggStep("Destroy the Security Generators")
                    .addSubStep(new EasterEggStep(
                            "After installing the fuse, Nikolai will accidentally activate the MDT security system."
                    ))
                    .addSubStep(new EasterEggStep(
                            "Destroy the four glowing generators using explosive weapons. Semtex Grenades, the Scavenger, China Lake, Crossbow, and M67 Grenades work well."
                    ))
                    .addSubStep(new EasterEggStep("Generator 1")
                            .addSubStep(new EasterEggStep(
                                    "The first generator is directly across from the vault door containing the Ultimis crew."
                            ))
                            .addImage()
                    )
                    .addSubStep(new EasterEggStep("Generator 2")
                            .addSubStep(new EasterEggStep(
                                    "The second generator is outside the left window of the Stamin-Up building."
                            ))
                            .addImage()
                    )
                    .addSubStep(new EasterEggStep("Generator 3")
                            .addSubStep(new EasterEggStep(
                                    "The third generator is over the left railing of the ship near Double Tap Root Beer."
                            ))
                            .addImage()
                    )
                    .addSubStep(new EasterEggStep("Generator 4")
                            .addSubStep(new EasterEggStep(
                                    "The fourth generator is between the second ship and the spawn area, positioned between two ice shelves."
                            ))
                            .addImage()
                    )
                    .addSubStep(new EasterEggStep(
                            "After all four generators stop glowing, return to the vault and knife the door again."
                    ))
            )

            .addStep(new EasterEggStep("Configure the Ship Controls")
                    .addSubStep(new EasterEggStep(
                                    "Go to the ship's control room where the power switch is located."
                            )
                                    .addImage()
                    )
                    .addSubStep(new EasterEggStep(
                                    "Turn the steering wheel until its brown handle points toward the 5 o'clock position."
                            )
                                    .addImage()
                    )
                    .addSubStep(new EasterEggStep(
                                    "Of the three levers beside the wheel, pull the left lever once and the right lever three times."
                            )
                                    .addImage()
                    )
                    .addSubStep(new EasterEggStep(
                            "A foghorn will sound and a submarine will surface. A green beam will then shine into the lighthouse."
                    ))
            )

            .addStep(new EasterEggStep("Obtain the Golden Rod")
                    .addSubStep(new EasterEggStep(
                                    "Obtain the V-R11 from the Mystery Box."
                            )
                                    .addImage()
                    )
                    .addSubStep(new EasterEggStep(
                                    "At the bottom of the lighthouse, shoot a zombie with the V-R11 while the green beam is active."
                            )
                                    .addImage()
                    )
                    .addSubStep(new EasterEggStep(
                            "The zombie will transform into a human and begin floating upward through the lighthouse."
                    ))
                    .addSubStep(new EasterEggStep(
                            "Kill the transformed human before he reaches the top of the lighthouse. High-damage weapons such as the Scavenger or Ray Gun are recommended."
                    ))
                    .addSubStep(new EasterEggStep(
                                    "After the human is killed, collect the Golden Rod that appears at the bottom of the lighthouse."
                            )
                                    .addImage()
                    )
                    .addSubStep(new EasterEggStep(
                                    "Take the Golden Rod to the vault and insert it into the transfer tube beside the door."
                            )
                                    .addImage()
                    )
            )

            .addStep(new EasterEggStep("Send the Crew to Paradise")
                    .addSubStep(new EasterEggStep(
                            "Wait for Richtofen and the other characters to finish speaking."
                    ))
                    .addSubStep(new EasterEggStep(
                            "Knife the fuse box beside the vault door one final time."
                    ))
                    .addSubStep(new EasterEggStep(
                                    "The Ultimis crew will teleport away and a Lightning Bolt power-up containing the Wunderwaffe DG-2 will appear outside the vault."
                            )
                                    .addImage()
                    )
            )
            ;


    public static final EasterEgg EnsembleCast = new EasterEgg("Ensemble Cast")
            .addStep(new EasterEggStep("Find and Install the Fuse")
                    .addSubStep(new EasterEggStep(
                            "This quest requires at least two players."
                    ))
                    .addSubStep(new EasterEggStep(
                                    "Turn on the power using the switch inside the ship's control room."
                            )
                                    .addImage()
                    )
                    .addSubStep(new EasterEggStep(
                                    "Go to the room underneath PhD Flopper and knife the locked vault door."
                            )
                                    .addImage()
                    )
                    .addSubStep(new EasterEggStep(
                            "Listen to Richtofen explain that the Ultimis crew is trapped inside and requires a fuse."
                    ))
                    .addSubStep(new EasterEggStep(
                                    "Search the PhD Flopper room for the fuse. It can appear beside a locker, behind the batteries, or on the table beside PhD Flopper."
                            )
                                    .addImage()
                                    .addImage()
                                    .addImage()
                    )
                    .addSubStep(new EasterEggStep(
                                    "Collect the fuse, place it inside the fuse box beside the vault door, and knife the door again."
                            )
                                    .addImage()
                    )
            )

            .addStep(new EasterEggStep("Destroy the Security Generators")
                    .addSubStep(new EasterEggStep(
                            "Destroy the four glowing MDT security generators using explosive weapons."
                    ))
                    .addSubStep(new EasterEggStep("Generator 1")
                            .addSubStep(new EasterEggStep(
                                    "Directly across from the vault door containing the Ultimis crew."
                            ))
                            .addImage()
                    )
                    .addSubStep(new EasterEggStep("Generator 2")
                            .addSubStep(new EasterEggStep(
                                    "Outside the left window of the Stamin-Up building."
                            ))
                            .addImage()
                    )
                    .addSubStep(new EasterEggStep("Generator 3")
                            .addSubStep(new EasterEggStep(
                                    "Over the left railing of the ship near Double Tap Root Beer."
                            ))
                            .addImage()
                    )
                    .addSubStep(new EasterEggStep("Generator 4")
                            .addSubStep(new EasterEggStep(
                                    "Between the second ship and the spawn area, positioned between two ice shelves."
                            ))
                            .addImage()
                    )
                    .addSubStep(new EasterEggStep(
                            "After all four generators stop glowing, return to the vault and knife the door."
                    ))
            )

            .addStep(new EasterEggStep("Deliver Nikolai's Vodka")
                    .addSubStep(new EasterEggStep(
                            "Nikolai will ask the players to bring him a bottle of vodka."
                    ))
                    .addSubStep(new EasterEggStep(
                            "The vodka will be frozen inside a block of ice at one of four possible locations."
                    ))
                    .addSubStep(new EasterEggStep("Vodka Location 1")
                            .addSubStep(new EasterEggStep(
                                    "On the railing above the staircase leading to PhD Flopper."
                            ))
                            .addImage()
                    )
                    .addSubStep(new EasterEggStep("Vodka Location 2")
                            .addSubStep(new EasterEggStep(
                                    "On the railing above the staircase leading toward the AK-74u."
                            ))
                            .addImage()
                    )
                    .addSubStep(new EasterEggStep("Vodka Location 3")
                            .addSubStep(new EasterEggStep(
                                    "On a railing near the M16 wall-buy on the ship."
                            ))
                            .addImage()
                    )
                    .addSubStep(new EasterEggStep("Vodka Location 4")
                            .addSubStep(new EasterEggStep(
                                    "On the walkway connecting the two halves of the ship near the MP40."
                            ))
                            .addImage()
                    )
                    .addSubStep(new EasterEggStep(
                            "Have one player stand beneath the bottle while another player knifes the ice. The lower player must catch the bottle as it falls."
                    ))
                    .addSubStep(new EasterEggStep(
                            "If the bottle is missed, another bottle will spawn at a different location."
                    ))
                    .addSubStep(new EasterEggStep(
                                    "Place the vodka into the transfer tube beside the vault door and knife the door again."
                            )
                                    .addImage()
                    )
            )

            .addStep(new EasterEggStep("Activate the Morse Code Radios")
                    .addSubStep(new EasterEggStep(
                            "Activate four radios in the correct order. There is no time limit between radios."
                    ))
                    .addSubStep(new EasterEggStep("Radio 1")
                            .addSubStep(new EasterEggStep(
                                    "Underneath the power room, on top of an electrical cabinet on the right side."
                            ))
                            .addImage()
                    )
                    .addSubStep(new EasterEggStep("Radio 2")
                            .addSubStep(new EasterEggStep(
                                    "Beside Stamin-Up, sitting on top of a barrel."
                            ))
                            .addImage()
                    )
                    .addSubStep(new EasterEggStep("Radio 3")
                            .addSubStep(new EasterEggStep(
                                    "Near the rear of the second ship by the Semtex wall-buy, inside the train car beside a window."
                            ))
                            .addImage()
                    )
                    .addSubStep(new EasterEggStep("Radio 4")
                            .addSubStep(new EasterEggStep(
                                    "Underneath the stairs leading to the vault door, on top of a cabinet."
                            ))
                            .addImage()
                    )
                    .addSubStep(new EasterEggStep(
                            "When the radios have been activated correctly, Morse code will play and a glowing light will appear near Mule Kick."
                    ))
            )

            .addStep(new EasterEggStep("Configure the Ship Controls")
                    .addSubStep(new EasterEggStep(
                                    "Go to the ship's control room where the power switch is located."
                            )
                                    .addImage()
                    )
                    .addSubStep(new EasterEggStep(
                                    "Turn the steering wheel until the brown handle points toward the 5 o'clock position."
                            )
                                    .addImage()
                    )
                    .addSubStep(new EasterEggStep(
                                    "Pull the left lever once and the right lever three times."
                            )
                                    .addImage()
                    )
                    .addSubStep(new EasterEggStep(
                            "A submarine will surface near the ship and sound a sequence using its foghorn."
                    ))
            )

            .addStep(new EasterEggStep("Activate the Foghorns")
                    .addSubStep(new EasterEggStep(
                            "Wait until fog is covering the map before attempting this step."
                    ))
                    .addSubStep(new EasterEggStep(
                            "Activate the four foghorns surrounding the lighthouse in the correct order."
                    ))
                    .addSubStep(new EasterEggStep("Foghorn 1")
                            .addSubStep(new EasterEggStep(
                                    "At the base of the lighthouse beside the pool of water, near the AK-74u side."
                            ))
                            .addImage()
                    )
                    .addSubStep(new EasterEggStep("Foghorn 2")
                            .addSubStep(new EasterEggStep(
                                    "After sliding toward Speed Cola, turn right around the corner and locate the foghorn in the water."
                            ))
                            .addImage()
                    )
                    .addSubStep(new EasterEggStep("Foghorn 3")
                            .addSubStep(new EasterEggStep(
                                    "At the base of the lighthouse on the opposite side, beside the building."
                            ))
                            .addImage()
                    )
                    .addSubStep(new EasterEggStep("Foghorn 4")
                            .addSubStep(new EasterEggStep(
                                    "After sliding toward Speed Cola, look behind the large rock in the center of the area."
                            ))
                            .addImage()
                    )
                    .addSubStep(new EasterEggStep(
                            "When the sequence is correct, the submarine will shine a green beam toward the top of the lighthouse."
                    ))
            )

            .addStep(new EasterEggStep("Set the Lighthouse Dials")
                    .addSubStep(new EasterEggStep(
                            "Set the four numbered dials inside the lighthouse to the code 2746 from top to bottom."
                    ))
                    .addSubStep(new EasterEggStep(
                                    "The dial colors from the top floor to the bottom floor are yellow, orange, blue, and purple."
                            )
                                    .addImage()
                    )
                    .addSubStep(new EasterEggStep(
                            "First, turn the purple dial until it displays 6."
                    ))
                    .addSubStep(new EasterEggStep(
                            "Turn the orange dial until the blue dial displays 4."
                    ))
                    .addSubStep(new EasterEggStep(
                            "Turn the yellow dial until the orange dial displays 7."
                    ))
                    .addSubStep(new EasterEggStep(
                            "Turn the yellow dial until it displays 2 while counting how many times it was turned."
                    ))
                    .addSubStep(new EasterEggStep(
                            "Turn the purple dial the same number of times that the yellow dial was just turned."
                    ))
                    .addSubStep(new EasterEggStep(
                                    "Turn the blue dial until it displays 4 again. The finished code should read yellow 2, orange 7, blue 4, and purple 6."
                            )
                                    .addImage()
                    )
                    .addSubStep(new EasterEggStep(
                            "When the dials are correct, the submarine's green beam will reflect down through the lighthouse."
                    ))
            )

            .addStep(new EasterEggStep("Obtain the Golden Rod")
                    .addSubStep(new EasterEggStep(
                                    "Obtain the V-R11 from the Mystery Box."
                            )
                                    .addImage()
                    )
                    .addSubStep(new EasterEggStep(
                                    "At the bottom of the lighthouse, shoot a zombie with the V-R11 while the green beam is active."
                            )
                                    .addImage()
                    )
                    .addSubStep(new EasterEggStep(
                            "The zombie will transform into a human and begin floating upward through the green beam."
                    ))
                    .addSubStep(new EasterEggStep(
                            "Kill the transformed human before he reaches the top. High-damage weapons such as the Scavenger or Ray Gun are recommended."
                    ))
                    .addSubStep(new EasterEggStep(
                                    "Collect the Golden Rod that descends to the bottom of the lighthouse."
                            )
                                    .addImage()
                    )
                    .addSubStep(new EasterEggStep(
                                    "Take the Golden Rod to the vault and place it inside the transfer tube previously used for the vodka."
                            )
                                    .addImage()
                    )
            )

            .addStep(new EasterEggStep("Send the Crew to Paradise")
                    .addSubStep(new EasterEggStep(
                            "Wait for Richtofen and the other characters to finish speaking."
                    ))
                    .addSubStep(new EasterEggStep(
                            "Knife the fuse box beside the vault door one final time."
                    ))
                    .addSubStep(new EasterEggStep(
                                    "The Ultimis crew will teleport away and a Lightning Bolt power-up containing the Wunderwaffe DG-2 will appear outside the vault."
                            )
                                    .addImage()
                    )
            )
            ;


    public static final EasterEgg NotReadyToDie = new EasterEgg("Not Ready to Die - Song")
            .addStep(new EasterEggStep("Activate Element 115 Fragment 1")
                    .addSubStep(new EasterEggStep(
                            "In the spawn area, go to the waterfront where George Romero first emerges."
                    ))
                    .addSubStep(new EasterEggStep(
                                    "Locate the three metal barrels against the ice wall. Interact with the Element 115 fragment sitting on top of the left barrel."
                            )
                                    .addImage()
                    )
            )

            .addStep(new EasterEggStep("Activate Element 115 Fragment 2")
                    .addSubStep(new EasterEggStep(
                            "Enter the ship and go to the kitchen and dining area."
                    ))
                    .addSubStep(new EasterEggStep(
                                    "Find the booths near the center of the ship. Interact with the Element 115 fragment sitting on the left seat of the rightmost booth."
                            )
                                    .addImage()
                    )
            )

            .addStep(new EasterEggStep("Activate Element 115 Fragment 3")
                    .addSubStep(new EasterEggStep(
                            "Go to the PhD Flopper room near the base of the lighthouse."
                    ))
                    .addSubStep(new EasterEggStep(
                            "Locate the overturned bed and the nearby nightstand containing a clock."
                    ))
                    .addSubStep(new EasterEggStep(
                                    "Interact with the Element 115 fragment underneath the nightstand. After all three fragments are activated, \"Not Ready to Die\" by Avenged Sevenfold will begin playing."
                            )
                                    .addImage()
                    )
            )
            ;

    public static final List<EasterEgg> COTD_MainQuests = Arrays.asList(
        StandIn,
        EnsembleCast
    );
    public static final List<EasterEgg> COTD_SideQuests = Arrays.asList(
        NotReadyToDie
    );
}
