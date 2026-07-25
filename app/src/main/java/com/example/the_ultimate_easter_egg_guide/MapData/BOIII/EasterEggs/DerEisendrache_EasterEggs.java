package com.example.the_ultimate_easter_egg_guide.MapData.BOIII.EasterEggs;

import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEgg;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEggStep;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.Procedure;

import java.util.Arrays;
import java.util.List;

public class DerEisendrache_EasterEggs
{
    public static final EasterEgg MyBrothersKeeper =
            new EasterEgg("My Brother's keeper")

                    .addStep(new EasterEggStep("Prepare the Elemental Bows and Ragnarok DG-4")
                            .addSubStep(new EasterEggStep(
                                    "Build the Wrath of the Ancients and upgrade the required number of bows."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "In a Ranked game, one upgraded bow is required per player. A solo Ranked game requires one bow, while a four-player or Unranked game requires all four bows."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Build the Ragnarok DG-4 before entering the boss fight."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Activate the Teleporter and Follow the Wisps")
                            .addSubStep(new EasterEggStep(
                                            "Use the Wrath of the Ancients to shoot the six electrical prongs above the teleporter until each one glows gold."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Advance to the next round. A glowing blue wisp will appear at one of eight possible locations."
                            ))
                            .addSubStep(new EasterEggStep("Wisp Location 1")
                                    .addSubStep(new EasterEggStep(
                                            "The clock inside the room above the Church."
                                    ))
                                    .addImage()
                            )
                            .addSubStep(new EasterEggStep("Wisp Location 2")
                                    .addSubStep(new EasterEggStep(
                                            "The clock inside the Church."
                                    ))
                                    .addImage()
                            )
                            .addSubStep(new EasterEggStep("Wisp Location 3")
                                    .addSubStep(new EasterEggStep(
                                            "The radio equipment inside the Church Control Room."
                                    ))
                                    .addImage()
                            )
                            .addSubStep(new EasterEggStep("Wisp Location 4")
                                    .addSubStep(new EasterEggStep(
                                            "The electrical equipment inside the Power Room."
                                    ))
                                    .addImage()
                            )
                            .addSubStep(new EasterEggStep("Wisp Location 5")
                                    .addSubStep(new EasterEggStep(
                                            "The globe inside Maxis' room."
                                    ))
                                    .addImage()
                            )
                            .addSubStep(new EasterEggStep("Wisp Location 6")
                                    .addSubStep(new EasterEggStep(
                                            "The boxes in the room above Double Tap Root Beer."
                                    ))
                                    .addImage()
                            )
                            .addSubStep(new EasterEggStep("Wisp Location 7")
                                    .addSubStep(new EasterEggStep(
                                            "The rear of the damaged vehicle near Double Tap Root Beer."
                                    ))
                                    .addImage()
                            )
                            .addSubStep(new EasterEggStep("Wisp Location 8")
                                    .addSubStep(new EasterEggStep(
                                            "The telephone or radio equipment inside the Quick Revive room."
                                    ))
                                    .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Shoot the glowing object using an upgraded bow. Repeat this four times without allowing the wisp to disappear."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "After the fourth successful shot, return to the teleporter. The pad will glow purple."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Travel Through Time and Open the Safe")
                            .addSubStep(new EasterEggStep(
                                    "Have every player stand on the charged teleporter to travel into the past."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Collect the blue soul canister from the left side of the room."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "Collect the electrical fuses from the box on the right side of the room."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "Watch Dr. Groph enter the three-symbol combination into the safe and remember the symbols in their exact order."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "Return to the Death Ray and install one of the fuses into its central control unit."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Set the Death Ray control panel to \"Protect.\""
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Use the Death Ray at least once to activate the computer beside the Clock Tower."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Enter the three safe symbols into the computer from top to bottom."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "Return to the teleporter room and collect the two Tesla-coil fuses and floppy disk from the opened safe."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Complete Samantha Says and Crash Dempsey's Rocket")
                            .addSubStep(new EasterEggStep(
                                            "Place one Tesla-coil fuse into each of the two electrical towers beside the Death Ray."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Set the Death Ray control panel to \"Destroy.\""
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Insert the floppy disk into the computer beside the Clock Tower."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Complete the Samantha Says memory game by matching each displayed symbol to its corresponding button."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Travel to the Rocket Launch Site and complete the second Samantha Says game on the computer terminals."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "If the Rocket Launch Site game is failed, the Clock Tower game must be completed again."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Return to the Death Ray and set the control panel back to \"Protect.\""
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Press the green button behind the Death Ray. The Tesla coils will strike Dempsey's rocket and cause it to crash into the courtyard."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "Collect the Golden Rod or Vril Generator from the crashed cryogenic capsule."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Return to the Past and Retrieve the Stone Tablet")
                            .addSubStep(new EasterEggStep(
                                    "Advance the round and repeat the wisp process to recharge the teleporter."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Travel into the past again."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Interact with the open book or Apothicon container to the right of the teleporter."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "The interaction will open the previously locked crate near the room's exit."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Collect the stone tablet from the opened crate before returning to the present."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Escort and Charge the Keeper")
                            .addSubStep(new EasterEggStep(
                                            "Place the Golden Rod into the knight's tomb in the room where the Wrath of the Ancients is collected."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "A spectral Keeper will appear and travel to four locations around the castle."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Place the stone tablet into its slot near Double Tap Root Beer when the Keeper reaches that location."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "At each location, stand inside the Keeper's glowing circle and observe the elemental color around the screen."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Kill zombies using the upgraded bow matching the displayed elemental color."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "The four possible locations are the courtyard, the area near Mule Kick, the Double Tap courtyard, and the corridor connecting the Power Room to the Church."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Follow the fully charged Keeper into the Pyramid Room."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Place the blue soul canister into the empty slot on the Pyramid."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Prepare weapons, perks, ammunition, fresh shields, and fully charged Ragnarok DG-4s before continuing."
                            ))
                    )

                    .addStep(new EasterEggStep("Defeat the Keeper Boss")
                            .addSubStep(new EasterEggStep(
                                            "Have every player place their Ragnarok DG-4 on the blue anti-gravity pressure plates surrounding the Pyramid."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "The players will be teleported into the Keeper boss arena."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Survive the Skeleton Zombies while watching the Keeper's attacks."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "When the Keeper teleports to the center and begins charging its electrical attack, place a Ragnarok DG-4 inside the glowing center point beneath it."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "The Ragnarok will interrupt the attack and expose the glowing symbol on the Keeper's chest."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Fire upgraded bows and high-damage weapons into the Keeper's exposed chest."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Hide behind a pillar if the electrical attack is not interrupted in time."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Defeat the Panzer Soldats that spawn between damage phases."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Repeat the Ragnarok and damage sequence until the Keeper is destroyed."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Use the Summoning Key and Destroy Griffin Station")
                            .addSubStep(new EasterEggStep(
                                            "After returning to the Pyramid Room, interact with the glowing orb above the Pyramid."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "Place the Summoning Key into the Pyramid and then collect it again."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Return to the computer beside the Clock Tower where the safe combination was entered."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Insert the Summoning Key into the computer."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "The castle will launch its missiles toward Griffin Station and the Moon."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "The ending cutscene will begin, completing My Brother's Keeper."
                            ))
                    )
            ;


    public static final EasterEgg DeadAgain =
            new EasterEgg("Dead Again - Song")

                    .addStep(new EasterEggStep("Activate Teddy Bear 1")
                            .addSubStep(new EasterEggStep(
                                            "Go to the jail cell near Jugger-Nog and interact with the large teddy bear."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Activate Teddy Bear 2")
                            .addSubStep(new EasterEggStep(
                                            "Enter Samantha's bedroom and interact with the teddy bear sitting on the chair."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Activate Teddy Bear 3")
                            .addSubStep(new EasterEggStep(
                                            "Travel to the Rocket Launch Site and interact with the teddy bear inside the truck near the Wunder Sphere."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "After all three teddy bears have been activated, \"Dead Again\" will begin playing."
                            ))
                    )
            ;


    public static final EasterEgg Samanthaslullaby =
            new EasterEgg("Samantha's Lullaby - Song")

                    .addStep(new EasterEggStep("Activate Samantha's Music Box")
                            .addSubStep(new EasterEggStep(
                                    "Enter Samantha's bedroom."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Interact with the small music box on the nightstand beside her bed."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "The figure inside the box will begin spinning and a modified version of \"Samantha's Lullaby\" will play."
                            ))
                    )
            ;


    public static final EasterEgg DiesIrae =
            new EasterEgg("Die Irae - Song")

                    .addStep(new EasterEggStep("Activate Gramophone 1")
                            .addSubStep(new EasterEggStep(
                                    "Locate the gramophone beside the staircase connecting the Pyramid Room to the knight's tomb."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Hold interact on the gramophone."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Activate Gramophone 2")
                            .addSubStep(new EasterEggStep(
                                    "Locate the gramophone beside Speed Cola in the Church Control Room."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Hold interact on the gramophone."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Activate Gramophone 3")
                            .addSubStep(new EasterEggStep(
                                    "Enter Samantha's bedroom and locate the gramophone on the shelf near the mirror."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Interact with the final gramophone to play \"Requiem Aeternam: Sequentia – Dies Irae.\""
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final EasterEgg ControlRoomDisco =
            new EasterEgg("Control Room Disco")

                    .addStep(new EasterEggStep("Stop the Moon")
                            .addSubStep(new EasterEggStep(
                                            "Enter the Church Control Room and look at the model of Earth hanging from the ceiling."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "A small Moon and rocket rotate around the Earth."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Shoot the Moon to stop it from rotating."
                            ))
                    )

                    .addStep(new EasterEggStep("Align and Shoot the Rocket")
                            .addSubStep(new EasterEggStep(
                                    "Wait until the rocket moves beside the stopped Moon."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Shoot the rocket while the Earth, Moon, and rocket are aligned."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "The Control Room lights and disco music will activate."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "The disco can be activated again after the lights and music stop."
                            ))
                    )
            ;


    public static final EasterEgg Plunger =
            new EasterEgg("Toilet Plunger")

                    .addStep(new EasterEggStep("Open the Clock Tower Wall")
                            .addSubStep(new EasterEggStep(
                                            "Begin the Fire Bow upgrade and destroy the marked wall on the upper floor of the Clock Tower."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Build and fully charge the Ragnarok DG-4."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Place the Ragnarok DG-4 on the floor inside the opened Clock Tower room."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Set the Clock to 9:35")
                            .addSubStep(new EasterEggStep(
                                            "Go to the lower level of the Clock Tower and interact with the small lever beside the doorway leading to the Wunder Sphere landing point."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "The large clock will begin moving."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Interact with the lever again to stop the clock at approximately 9:35."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "A successful attempt commonly leaves the clock displaying approximately 9:36."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Activate the Pyramid Time Portal")
                            .addSubStep(new EasterEggStep(
                                            "Go to the Pyramid Room and look for a glowing energy orb above the Pyramid."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Wait for anti-gravity to activate."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Wall-run repeatedly over the illuminated symbol on the wall to the right of the main staircase."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "The player will be teleported into the past."
                            ))
                    )

                    .addStep(new EasterEggStep("Collect the Plunger")
                            .addSubStep(new EasterEggStep(
                                    "While in the past, look at the table to the left of the teleporter."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Collect the Toilet Plunger before returning to the present."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Upgrade the Plunger")
                            .addSubStep(new EasterEggStep(
                                    "Kill a Panzer Soldat using any weapon while carrying the Plunger."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "The Plunger will ignite for approximately four minutes."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "While burning, the upgraded Plunger can kill Panzer Soldats with a single melee strike."
                            ))
                    )
            ;


    public static final EasterEgg SkeletonZombies =
            new EasterEgg("Skeleton Zombies")

                    .addStep(new EasterEggStep("Activate the Three Hidden Skulls")
                            .addSubStep(new EasterEggStep(
                                    "Obtain the Wrath of the Ancients and equip the In Plain Sight GobbleGum."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Activate In Plain Sight. The three hidden skulls are only visible while the GobbleGum is active."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Shoot the skull beside Mule Kick using the Wrath of the Ancients."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "Shoot the skull in front of the central stained-glass window inside the Church."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "Shoot the skull on the wall beside Double Tap Root Beer."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "After all three skulls have been activated, normal zombies will be replaced by Skeleton Zombies."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "To deactivate the effect, interact with the three skulls on the chair in front of the Church dragon."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final EasterEgg Newspaper =
            new EasterEgg("Newspaper (Plunger)")

                    .addStep(new EasterEggStep("Change the Control Room Newspaper")
                            .addSubStep(new EasterEggStep(
                                    "Obtain the upgraded, flaming Plunger."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Enter the Church Control Room and locate the newspaper on the table."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Kill zombies with the flaming Plunger while standing near the newspaper."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "The newspaper will first change to report possible zombies in London."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Continue killing zombies nearby and the article will change again to report a major outbreak and an emergency Parliamentary meeting."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final EasterEgg FreeMegaGobbleGum =
            new EasterEgg("Free Mega GobbleGum")

                    .addStep(new EasterEggStep("Collect the Plant")
                            .addSubStep(new EasterEggStep(
                                    "Enter the castle teleporter room."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Collect the small plant from the shelf near the teleporter."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Plant It in the Past")
                            .addSubStep(new EasterEggStep(
                                    "Travel into the past using either the main Easter egg teleporter process or the Plunger time-travel process."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Place the plant onto the same shelf while inside the past version of the teleporter room."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Collect the Mega GobbleGum")
                            .addSubStep(new EasterEggStep(
                                    "Return to the present and revisit the shelf in the teleporter room."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "The plant will have grown."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Interact with the grown plant to receive a free random Mega GobbleGum."
                                    )
                                            .addImage()
                            )
                    )
            ;

    public static final List<EasterEgg> DerEisendrache_MainQuests = Arrays.asList(
        MyBrothersKeeper
    );
    public static final List<EasterEgg> DerEisendrache_SideQuests = Arrays.asList(
        DeadAgain,
        Samanthaslullaby,
        DiesIrae,
        ControlRoomDisco,
        Plunger,
        SkeletonZombies,
        Newspaper,
        FreeMegaGobbleGum
    );


}
