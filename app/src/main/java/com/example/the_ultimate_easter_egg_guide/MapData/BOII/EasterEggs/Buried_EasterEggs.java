package com.example.the_ultimate_easter_egg_guide.MapData.BOII.EasterEggs;

import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEgg;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEggStep;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.Procedure;

import java.util.Arrays;
import java.util.List;

public class Buried_EasterEggs
{
    public static final EasterEgg MinedGames_Maxis =
            new EasterEgg(
                    "Mined Games - Dr.Maxis",
                    "All players receive every perk for the remainder of the game."
            )

                    .addStep(new EasterEggStep("Build the Gallows")
                            .addSubStep(new EasterEggStep(
                                            "This Easter egg requires four players. Build the gallows beside the Courthouse to commit the game to Dr. Maxis' path."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep("Light Bulb")
                                    .addSubStep(new EasterEggStep(
                                            "Find the light bulb on the boxes in the room above Arthur's jail cell."
                                    ))
                                    .addImage()
                            )
                            .addSubStep(new EasterEggStep("Battery")
                                    .addSubStep(new EasterEggStep(
                                            "Find the battery behind the altar or podium inside the Church."
                                    ))
                                    .addImage()
                            )
                            .addSubStep(new EasterEggStep("Spool of Wire")
                                    .addSubStep(new EasterEggStep(
                                            "Find the spool of wire in the lower Gunsmith room near the entrance to the tunnels."
                                    ))
                                    .addImage()
                            )
                            .addSubStep(new EasterEggStep("Antenna")
                                    .addSubStep(new EasterEggStep(
                                            "Find the antenna in one of the stables on the lower floor of the Barn."
                                    ))
                                    .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Place all four parts onto the gallows beside the Courthouse."
                            ))
                    )

                    .addStep(new EasterEggStep("Destroy the Four Red Orbs")
                            .addSubStep(new EasterEggStep(
                                            "Build a Turbine and a Subsurface Resonator. Place the Turbine behind the Resonator so it emits a sonic blast toward each red orb."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep("Orb 1")
                                    .addSubStep(new EasterEggStep(
                                            "Destroy the orb in the alley between the Saloon and Candy Store."
                                    ))
                                    .addImage()
                            )
                            .addSubStep(new EasterEggStep("Orb 2")
                                    .addSubStep(new EasterEggStep(
                                            "Destroy the orb behind the rock to the left of the Church entrance."
                                    ))
                                    .addImage()
                            )
                            .addSubStep(new EasterEggStep("Orb 3")
                                    .addSubStep(new EasterEggStep(
                                            "Destroy the orb in the upper tunnel system above the town."
                                    ))
                                    .addImage()
                            )
                            .addSubStep(new EasterEggStep("Orb 4")
                                    .addSubStep(new EasterEggStep(
                                            "Destroy the orb in the foliage beside the Mansion entrance when approaching from the maze."
                                    ))
                                    .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Knock Down the Lantern")
                            .addSubStep(new EasterEggStep(
                                    "After all four orbs have been destroyed, watch for the purple lantern flying between the Courthouse, Church, and Jail."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Cook and throw a grenade so the explosion knocks the lantern out of the air."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Collect the lantern before it disappears."
                            ))
                    )

                    .addStep(new EasterEggStep("Charge the Lantern")
                            .addSubStep(new EasterEggStep(
                                    "The player carrying the lantern must remain close to the zombies being killed."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Kill zombies using Arthur after giving him Candy, a Trample Steam, a Subsurface Resonator, a Head Chopper, or a Nuke power-up."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Continue until Maxis confirms that the lantern has collected enough energy."
                            ))
                    )

                    .addStep(new EasterEggStep("Place and Decode the Lantern")
                            .addSubStep(new EasterEggStep(
                                            "Take the charged lantern to the symbol on the roof of the Gunsmith and place it on the wall."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "A Pigpen or tic-tac-toe cipher will appear above the lantern."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Decode the first letter of each line to identify three of the five signs located in the tunnels."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "The possible signs are DRY GULCHER SHAFT, LUNGER UNDERMINES, CONSUMPTION CROSS, GROUND BITER PITS, and BONE ORCHARD VEIN."
                            ))
                    )

                    .addStep(new EasterEggStep("Activate the Tunnel Signs")
                            .addSubStep(new EasterEggStep(
                                    "Obtain the Galvaknuckles or Bowie Knife."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Find the three tunnel signs identified by the cipher and melee them in the exact order shown by the decoded message."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "The third correct sign will create a glowing wisp."
                            ))
                    )

                    .addStep(new EasterEggStep("Prepare the Wisp Route")
                            .addSubStep(new EasterEggStep(
                                    "Obtain Vulture Aid so the wisp can be seen clearly."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Open the 1,250-point couch connecting the tunnels to the upper floor of the Gunsmith."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Give Arthur Booze so he destroys the barrier between the General Store and Candy Store."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Place a Time Bomb before the first wisp reaches the gallows."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Guide the First Wisp")
                            .addSubStep(new EasterEggStep(
                                    "Follow the wisp from the tunnels toward the gallows."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Keep living zombies close to the wisp throughout its route. Nearby zombies provide the energy required to keep the wisp active."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "The wisp travels through the tunnels, Jail, Barn, Gunsmith, Saloon, Candy Store, and Courthouse areas."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "When the wisp reaches the gallows, it will charge the first energy container."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Travel Back with the Time Bomb")
                            .addSubStep(new EasterEggStep(
                                    "After the first container has been charged, activate the previously placed Time Bomb."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "The game will return to the moment before the first wisp was activated while keeping the gallows' first container charged."
                            ))
                    )

                    .addStep(new EasterEggStep("Guide the Second Wisp")
                            .addSubStep(new EasterEggStep(
                                    "Melee the three decoded tunnel signs again in the correct order."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Guide the second wisp along the same route while keeping zombies close to it."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Allow the second wisp to reach the gallows and charge the remaining energy container."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Locate the Bells and Switchboard")
                            .addSubStep(new EasterEggStep(
                                            "One player must enter the Mansion and locate the nine-light switchboard on the sofa beyond the secret bookcase."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "The other three players must separate between the Candy Store, Barn, and Courthouse."
                            ))
                            .addSubStep(new EasterEggStep("Candy Store Bells")
                                    .addSubStep(new EasterEggStep(
                                            "Find the three bells on the upper floor of the Candy Store: on the square table, near the pots by the couch, and on the chair beside the stairway door."
                                    ))
                                    .addImage()
                            )
                            .addSubStep(new EasterEggStep("Barn Bells")
                                    .addSubStep(new EasterEggStep(
                                            "Find the three bells on hay bales around the upper level of the Barn."
                                    ))
                                    .addImage()
                            )
                            .addSubStep(new EasterEggStep("Courthouse Bells")
                                    .addSubStep(new EasterEggStep(
                                            "Find the three bells on the ground floor of the Courthouse: near the entrance corner, beside the judge's podium, and on the nearby table."
                                    ))
                                    .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Complete the Bell Sequence")
                            .addSubStep(new EasterEggStep(
                                    "Activate the Mansion switchboard. One yellow light will appear in its three-by-three grid."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "The Mansion player must call out the illuminated row and column so the appropriate player can ring the matching bell."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "A correct bell turns the light green and activates the next yellow light."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Continue until all nine lights are green. The board resets if a bell is not rung quickly enough."
                            ))
                    )

                    .addStep(new EasterEggStep("Make a Wish")
                            .addSubStep(new EasterEggStep(
                                    "Give Arthur Booze while he is facing the fountain outside the Mansion so he destroys it."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Interact with the destroyed fountain and select the prompt to make a wish."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Complete the Sharpshooter Challenge")
                            .addSubStep(new EasterEggStep(
                                    "Four groups of metal targets will appear simultaneously around the map."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Assign one player to the Candy Store and Courthouse area, one to the Mansion windows, one inside the Saloon, and one beside the Jail."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Every player must shoot all targets in their assigned area before any target disappears."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "When every target is destroyed, Maxis' path is complete and all players receive every perk for the remainder of the game."
                            ))
                    )
            ;


    public static final EasterEgg MinedGames_Richtofen =
            new EasterEgg(
                    "Mined Games - Richtofen",
                    "All players receive every perk for the remainder of the game."
            )

                    .addStep(new EasterEggStep("Build the Guillotine")
                            .addSubStep(new EasterEggStep(
                                            "This Easter egg requires four players for its later stages. Build the guillotine beside the Saloon to commit the game to Richtofen's path."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep("Satellite Dish")
                                    .addSubStep(new EasterEggStep(
                                            "Find the satellite dish on the upper floor of the Saloon near the fence closest to the guillotine."
                                    ))
                                    .addImage()
                            )
                            .addSubStep(new EasterEggStep("Spool of Wire")
                                    .addSubStep(new EasterEggStep(
                                            "Find the spool of wire in the lower Gunsmith room near the tunnel entrance."
                                    ))
                                    .addImage()
                            )
                            .addSubStep(new EasterEggStep("Crystal")
                                    .addSubStep(new EasterEggStep(
                                            "Enter the tunnels from the Saloon, turn left twice, jump over the opening, and collect the crystal from the debris."
                                    ))
                                    .addImage()
                            )
                            .addSubStep(new EasterEggStep("Antenna")
                                    .addSubStep(new EasterEggStep(
                                            "Find the antenna inside one of the lower Barn stables near the tunnels."
                                    ))
                                    .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Place all four parts onto the guillotine."
                            ))
                    )

                    .addStep(new EasterEggStep("Power the Four Red Orbs")
                            .addSubStep(new EasterEggStep(
                                            "Obtain the Paralyzer from the Mystery Box."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Continuously fire the Paralyzer at each red orb until it changes appearance and produces a confirmation sound."
                            ))
                            .addSubStep(new EasterEggStep("Orb 1")
                                    .addSubStep(new EasterEggStep(
                                            "Charge the orb in the alley between the Saloon and Candy Store."
                                    ))
                                    .addImage()
                            )
                            .addSubStep(new EasterEggStep("Orb 2")
                                    .addSubStep(new EasterEggStep(
                                            "Charge the orb behind the rock to the left of the Church."
                                    ))
                                    .addImage()
                            )
                            .addSubStep(new EasterEggStep("Orb 3")
                                    .addSubStep(new EasterEggStep(
                                            "Charge the orb in the tunnel system above the town."
                                    ))
                                    .addImage()
                            )
                            .addSubStep(new EasterEggStep("Orb 4")
                                    .addSubStep(new EasterEggStep(
                                            "Charge the orb in the foliage beside the Mansion entrance from the maze."
                                    ))
                                    .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Knock Down the Lantern")
                            .addSubStep(new EasterEggStep(
                                    "Watch for the purple lantern flying between the Courthouse, Church, and Jail."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Use a cooked grenade to knock the lantern out of the air."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Collect the lantern before it disappears."
                            ))
                    )

                    .addStep(new EasterEggStep("Charge the Lantern")
                            .addSubStep(new EasterEggStep(
                                    "Carry the lantern into the Mansion."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Kill approximately ten Mansion ghosts while the lantern carrier remains close to them."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Continue until Richtofen confirms that the lantern is fully charged."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Place and Decode the Lantern")
                            .addSubStep(new EasterEggStep(
                                            "Place the charged lantern on the symbol on the roof of the Gunsmith."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "Decode the Pigpen or tic-tac-toe cipher that appears above it."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "The cipher identifies three signs from DRY GULCHER SHAFT, LUNGER UNDERMINES, CONSUMPTION CROSS, GROUND BITER PITS, and BONE ORCHARD VEIN."
                            ))
                    )

                    .addStep(new EasterEggStep("Activate the Tunnel Signs")
                            .addSubStep(new EasterEggStep(
                                    "Find the three signs identified by the decoded message."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Melee all three signs using the Galvaknuckles or Bowie Knife. The order does not matter on Richtofen's path."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "The final activated sign will create a glowing wisp."
                            ))
                    )

                    .addStep(new EasterEggStep("Move the Wisp to the Guillotine")
                            .addSubStep(new EasterEggStep(
                                    "Purchase Vulture Aid so the wisp and its path can be seen."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Run through the wisp each time it appears. You have approximately 15 seconds to reach its next location before it disappears."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Follow it through the tunnels, Barn, Jail, General Store, Candy Store or Gunsmith, and finally to the guillotine."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "If the wisp disappears, melee the three tunnel signs again."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Charge the Guillotine")
                            .addSubStep(new EasterEggStep(
                                    "When the wisp reaches the guillotine, lure zombies close to it."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "The wisp will enter nearby zombies. Kill each affected zombie so its energy transfers into the guillotine."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Continue until several energy orbs circle the guillotine crystal and Richtofen asks for a Time Bomb."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Enter Infinity Mode")
                            .addSubStep(new EasterEggStep(
                                            "Obtain a Time Bomb and place it directly on the guillotine's workbench."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Have all four players stand around the guillotine and activate the Time Bomb."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "The players will travel to Round Infinity. The screen becomes black and white, and the zombies are nearly invulnerable."
                            ))
                    )

                    .addStep(new EasterEggStep("Find the Future Switch")
                            .addSubStep(new EasterEggStep(
                                    "Search the dead bodies of Misty, Marlton, Stuhlinger, and Russman during the limited Infinity Mode timer."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Bodies can appear near the guillotine, Saloon, Gunsmith, Barn, Jail, General Store, Candy Store, Church, or Mansion."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "One body will be holding a small lever or switch. Collect it before the players return to the present."
                            ))
                    )

                    .addStep(new EasterEggStep("Install the Future Switch")
                            .addSubStep(new EasterEggStep(
                                            "After returning from Infinity Mode, place the collected switch onto the guillotine."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "The switch cannot be installed while the players are still in Round Infinity."
                            ))
                    )

                    .addStep(new EasterEggStep("Activate the Maze Switches")
                            .addSubStep(new EasterEggStep(
                                            "Enter the maze and locate the red, green, blue, and yellow switches attached to four gates or hedges."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "The four players must activate the switches in the correct randomly selected order."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "After all four switches have been pulled, correctly positioned switches will spark."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "If all four do not spark, reset the puzzle by pulling the remaining switches, regrouping in town, and passing through the Mansion again."
                            ))
                    )

                    .addStep(new EasterEggStep("Make a Wish")
                            .addSubStep(new EasterEggStep(
                                    "Have Arthur destroy the fountain in front of the Mansion using Booze."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Interact with the destroyed fountain and select the prompt to make a wish."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Complete the Sharpshooter Challenge")
                            .addSubStep(new EasterEggStep(
                                    "Metal targets will appear beside the Candy Store and Courthouse, in the Mansion windows, inside the Saloon, and beside the Jail."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Assign one player to each area and destroy every target before any disappear."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "The Paralyzer can be used to destroy the targets."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "When all targets are destroyed, Richtofen's path is complete and every player receives all perks for the remainder of the game."
                            ))
                    )
            ;


    public static final EasterEgg AlwaysRunning =
            new EasterEgg("Always Running")

                    .addStep(new EasterEggStep("Activate Teddy Bear 1")
                            .addSubStep(new EasterEggStep(
                                            "Go to the tunnel entrance near Quick Revive and interact with the teddy bear sitting beside the hay."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Activate Teddy Bear 2")
                            .addSubStep(new EasterEggStep(
                                            "Enter the lower floor of the Candy Store and interact with the teddy bear inside one of the candy barrels."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Activate Teddy Bear 3")
                            .addSubStep(new EasterEggStep(
                                    "Enter the Mansion and locate the room containing Double Tap Root Beer."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Interact with the teddy bear in the corner of the room. After all three bears are activated, \"Always Running\" by Malukah will begin playing."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final EasterEgg NavTableAndNavcards =
            new EasterEgg("NAV Table & Navcards")

                    .addStep(new EasterEggStep("Open the Processing Portal")
                            .addSubStep(new EasterEggStep(
                                    "Have Arthur destroy the fountain outside the Mansion."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Enter the maze and destroy the fountain in its center using grenades or a powerful weapon."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Jump into the portal beneath the destroyed fountain to return to the lower Processing area."
                            ))
                    )

                    .addStep(new EasterEggStep("Build the Buried NAV Table")
                            .addSubStep(new EasterEggStep(
                                            "Collect the wooden board, radio or card reader, and electrical box from the enclosed area behind the Barn and Gunsmith."
                                    )
                                            .addImage()
                                            .addImage()
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "Collect the meteorite from the floor near the NAV Table location in the lower Processing area."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Install all four parts at the invisible construction point beside the cabinets."
                            ))
                    )

                    .addStep(new EasterEggStep("Collect the Buried Navcard")
                            .addSubStep(new EasterEggStep(
                                    "Reenter the Mansion from the maze side."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Walk toward the piano, turn toward the staircase, and inspect the nearby bookcases."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Collect the Navcard from the far-right side of the bookcase."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Insert the Correct Navcard")
                            .addSubStep(new EasterEggStep(
                                    "The Navcard collected on Buried is intended for the TranZit NAV Table."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "The Navcard collected on Die Rise is inserted into the completed Buried NAV Table."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "A successful insertion causes the Buried icon on the world map to emit lightning after the corresponding main quest is complete."
                            ))
                    )
            ;


    public static final EasterEgg DartBoardAndGhostPiano =
            new EasterEgg("Dart Board & Ghost Piano")

                    .addStep(new EasterEggStep("Obtain the Ballistic Knife")
                            .addSubStep(new EasterEggStep(
                                            "Obtain the Ballistic Knife from the Mystery Box."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Hit the Dartboard Bullseye")
                            .addSubStep(new EasterEggStep(
                                    "Enter the Saloon and locate the dartboard."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Fire the Ballistic Knife directly into the center bullseye."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "A successful bullseye causes the nearby piano to begin playing by itself."
                            ))
                    )

                    .addStep(new EasterEggStep("Find the Ghost Pianist")
                            .addSubStep(new EasterEggStep(
                                    "Travel through the Mansion and exit into the maze."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Return through the rear Mansion entrance and look toward the piano."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "A Mansion ghost will be sitting at the piano and playing it."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Tip the Ghost")
                            .addSubStep(new EasterEggStep(
                                    "Interact with the ghost pianist to tip her ten points."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "The ghost will reward the player with a free random perk."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final EasterEgg EasterEggTrackerAndEndgameSongs =
            new EasterEgg("Easter Egg Tracker & Endgame Songs")

                    .addStep(new EasterEggStep("Inspect the Easter Egg Tracker")
                            .addSubStep(new EasterEggStep(
                                            "Locate the Easter Egg Tracker on the ground floor at the rear of the Courthouse."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Its three columns represent Tower of Babble on TranZit, High Maintenance on Die Rise, and Mined Games on Buried."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Each row represents one player. Blue lights indicate Richtofen completions, while orange lights indicate Maxis completions."
                            ))
                    )

                    .addStep(new EasterEggStep("Complete the Victis Easter Eggs")
                            .addSubStep(new EasterEggStep(
                                    "All four players must complete Tower of Babble, High Maintenance, and Mined Games for the same character."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Every required NAV Table must also be constructed with the correct Navcard inserted."
                            ))
                    )

                    .addStep(new EasterEggStep("Activate the Endgame")
                            .addSubStep(new EasterEggStep(
                                            "When all twelve tracker lights show the same color, open or shoot the tracker panel and interact with the button inside."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Activating the endgame permanently resets the stored Easter egg progress for the three maps."
                            ))
                    )

                    .addStep(new EasterEggStep("Endgame Results")
                            .addSubStep(new EasterEggStep("Richtofen Ending")
                                    .addSubStep(new EasterEggStep(
                                            "Richtofen destroys Maxis and partially enters Stuhlinger's body. All players receive a permanent Fire Sale and a special Mule Kick that supports four weapons."
                                    ))
                            )
                            .addSubStep(new EasterEggStep("Maxis Ending")
                                    .addSubStep(new EasterEggStep(
                                            "Maxis takes control of the Aether and traps Richtofen inside a blue-eyed zombie. Killing the Richtofen zombie produces a power-up."
                                    ))
                            )
                            .addSubStep(new EasterEggStep(
                                    "Completing the appropriate endgame sequence also activates the hidden Buried version of \"Samantha's Lullaby.\""
                            ))
                    )
            ;


    public static final EasterEgg MansionGhostPerk =
            new EasterEgg("Mansion Ghost Perk", "A free random perk.")

                    .addStep(new EasterEggStep("Pass Through the Mansion")
                            .addSubStep(new EasterEggStep(
                                    "Enter the Mansion from the town side and proceed through the building toward the maze."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Mansion ghosts steal 2,000 points each time they hit a player, so eliminate them before they get close."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Eliminate the Final Ghost")
                            .addSubStep(new EasterEggStep(
                                    "After exiting into the maze, defeat every remaining ghost that followed the players outside."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "The final ghost will drop a free random perk bottle."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final EasterEgg TimeBombPerkTrick =
            new EasterEgg("Time Bomb Perk Trick", "Two free random perks from one Mansion visit.")

                    .addStep(new EasterEggStep("Place the Time Bomb")
                            .addSubStep(new EasterEggStep(
                                    "Obtain a Time Bomb from the Mystery Box."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Place the Time Bomb before entering the Mansion or before killing the final Mansion ghost."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Earn the First Perk")
                            .addSubStep(new EasterEggStep(
                                    "Pass through the Mansion and kill every ghost."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Allow the final ghost to drop its perk bottle, but do not collect it."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Return and Earn Another Perk")
                            .addSubStep(new EasterEggStep(
                                    "Activate the Time Bomb to return to the moment before the Mansion was cleared."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Collect the first perk bottle and eliminate the Mansion ghosts again."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "The final ghost can drop a second random perk bottle."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final EasterEgg ChalkWeaponPlacement =
            new EasterEgg("Chalk Weapon Placement")
                    .addStep(new EasterEggStep("Place the Weapon Chalk Drawings")
                            .addSubStep(new EasterEggStep(
                                            "Collect the weapon chalk drawings from the lower Gunsmith. The Remington 870 MCS chalk is located near Quick Revive."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "The available drawings include the Remington 870 MCS, PDW-57, AK-74u, Galvaknuckles, SVU-AS, and AN-94."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Carry one chalk drawing at a time to any empty question-mark weapon outline around the map."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Hold interact to draw the weapon onto the wall. Each placement awards 1,000 points, and the final placement awards 2,000 points."
                            ))
                    )
            ;


    public static final EasterEgg CraftingTables =
            new EasterEgg("Crafting Tables")

                    .addStep(new EasterEggStep("Jail Crafting Table")
                            .addSubStep(new EasterEggStep(
                                            "The first crafting table is on the upper floor of the building containing Arthur's jail cell, directly across from the General Store."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Saloon Crafting Table")
                            .addSubStep(new EasterEggStep(
                                            "The second crafting table is inside the Saloon, beside the main entrance."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Courthouse Crafting Table")
                            .addSubStep(new EasterEggStep(
                                            "The third crafting table is against the left wall immediately after entering the Courthouse."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Church Crafting Table")
                            .addSubStep(new EasterEggStep(
                                            "The fourth crafting table is against the left wall inside the Church, beside the staircase."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final EasterEgg Turbine =
            new EasterEgg("Turbine")

                    .addStep(new EasterEggStep("Collect the Mannequin")
                            .addSubStep(new EasterEggStep(
                                            "Enter the General Store and find the headless mannequin in the back-right corner of the small ground-floor office."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Collect the Fan")
                            .addSubStep(new EasterEggStep(
                                            "Go to the upper floor of the General Store and find the fan on a desk inside the back room."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Collect the Plane Tail")
                            .addSubStep(new EasterEggStep(
                                            "Find the model-plane tail on the shelving along the left side of the General Store's ground floor."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Build the Turbine")
                            .addSubStep(new EasterEggStep(
                                    "Take all three parts to any unused crafting table and assemble the Turbine."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "The Turbine powers the Subsurface Resonator and can attract nearby zombies."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final EasterEgg NavTable =
            new EasterEgg("NAV Table")

                    .addStep(new EasterEggStep("Open the Portal to Processing")
                            .addSubStep(new EasterEggStep(
                                    "Have Arthur destroy the Mansion fountain, then destroy the fountain in the center of the maze."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Use the portal under the maze fountain to reach the lower Processing area."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Collect the Wooden Board")
                            .addSubStep(new EasterEggStep(
                                            "Find the wooden board in the enclosed area behind the Barn and Gunsmith."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Collect the Card Reader and Electrical Box")
                            .addSubStep(new EasterEggStep(
                                            "Find the radio or card reader and electrical box in the same enclosed area behind the Barn and Gunsmith."
                                    )
                                            .addImage()
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Collect the Meteorite")
                            .addSubStep(new EasterEggStep(
                                            "Find the purple meteorite on the floor beside the cabinets in the lower Processing area."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Assemble the NAV Table")
                            .addSubStep(new EasterEggStep(
                                    "Install all four parts at the construction location on the wall beside the Processing-area cabinets."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Once built, insert the Navcard collected on Die Rise into the Buried NAV Table."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final EasterEgg TrampleSteam =
            new EasterEgg("Trample Steam")

                    .addStep(new EasterEggStep("Collect the Bellows")
                            .addSubStep(new EasterEggStep(
                                            "Find the bellows somewhere inside the upper floor of the General Store."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Collect the Screen")
                            .addSubStep(new EasterEggStep(
                                            "Find the square metal screen inside the General Store."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Collect the Compressor")
                            .addSubStep(new EasterEggStep(
                                            "Find the compressor or motor inside the General Store."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Collect the Flag")
                            .addSubStep(new EasterEggStep(
                                            "Find the red flag inside the General Store."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Build the Trample Steam")
                            .addSubStep(new EasterEggStep(
                                    "Take all four parts to any unused crafting table and assemble the Trample Steam."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "The Trample Steam launches players and zombies, allowing players to cross gaps and low barriers."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final EasterEgg SubsurfaceResonator =
            new EasterEgg("Subsurface Resonator")

                    .addStep(new EasterEggStep("Collect the Roulette Wheel")
                            .addSubStep(new EasterEggStep(
                                            "Find the roulette wheel inside the General Store."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Collect the Card Table")
                            .addSubStep(new EasterEggStep(
                                            "Find the folding card-table component inside the General Store."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Collect the Roulette Table")
                            .addSubStep(new EasterEggStep(
                                            "Find the main roulette-table component inside the General Store."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Collect the Pipe")
                            .addSubStep(new EasterEggStep(
                                            "Find the metal pipe inside the General Store, commonly near the upper staircase."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Build and Power the Resonator")
                            .addSubStep(new EasterEggStep(
                                    "Take all four components to an unused crafting table and assemble the Subsurface Resonator."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Place an active Turbine directly behind the Resonator to power it."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "The powered device emits sonic blasts that kill zombies and can destroy the red orbs during Maxis' Mined Games path."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final EasterEgg HeadChopper =
            new EasterEgg("Head Chopper")

                    .addStep(new EasterEggStep("Collect the Saw Blade")
                            .addSubStep(new EasterEggStep(
                                            "Find the circular saw blade inside a wooden barrel in the General Store."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Collect the Lever")
                            .addSubStep(new EasterEggStep(
                                            "Find the lever component inside the General Store."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Collect the Gears")
                            .addSubStep(new EasterEggStep(
                                            "Find the set of gears inside the General Store."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Collect the Stand")
                            .addSubStep(new EasterEggStep(
                                            "Find the mounting stand in the back room of the General Store."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Build the Head Chopper")
                            .addSubStep(new EasterEggStep(
                                    "Take all four parts to any unused crafting table and assemble the Head Chopper."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Place the Head Chopper on the ground or attach it to a wall. Its blade automatically activates when zombies approach."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "The blade can also injure players who stand too close."
                                    )
                                            .addImage()
                            )
                    )
            ;

    public static final List<EasterEgg> Buried_MainQuests = Arrays.asList(
        MinedGames_Maxis,
        MinedGames_Richtofen
    );
    public static final List<EasterEgg> Buried_SideQuests = Arrays.asList(
        MinedGames_Maxis,
        MinedGames_Richtofen,
        AlwaysRunning,
        NavTableAndNavcards,
        DartBoardAndGhostPiano,
        EasterEggTrackerAndEndgameSongs,
        MansionGhostPerk,
        TimeBombPerkTrick,
        ChalkWeaponPlacement
    );
    public static final List<Procedure> Buried_Buildables = Arrays.asList(
        CraftingTables,
        Turbine,
        NavTable,
        TrampleSteam,
        SubsurfaceResonator,
        HeadChopper
    );
}
