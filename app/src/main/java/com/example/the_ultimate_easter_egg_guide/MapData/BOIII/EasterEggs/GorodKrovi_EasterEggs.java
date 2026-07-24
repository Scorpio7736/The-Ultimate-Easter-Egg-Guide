package com.example.the_ultimate_easter_egg_guide.MapData.BOIII.EasterEggs;

import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEgg;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEggStep;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.Procedure;

import java.util.Arrays;
import java.util.List;

public class GorodKrovi_EasterEggs
{
    public static final EasterEgg LoveAndWar =
            new EasterEgg("Love and War")

                    .addStep(new EasterEggStep("Activate the Hatchery Generator and Solve the Valve Puzzle")
                            .addSubStep(new EasterEggStep("Turn on the power inside Dragon Command and interact with S.O.P.H.I.A."))
                            .addSubStep(new EasterEggStep("Build the Dragon Network Controller, ride a dragon to the Hatchery, and obtain the Dragon Strike."))
                            .addSubStep(new EasterEggStep("In the Hatchery basement, destroy a Valkyrie Drone near the covered generator to activate it.").addImage())
                            .addSubStep(new EasterEggStep("Shoot the Dragon Egg from the rafters near the sewer exit and collect it for the Gauntlet of Siegfried quest.").addImage())
                            .addSubStep(new EasterEggStep("After activating the generator, return to the main map and locate the six pressure valves."))
                            .addSubStep(new EasterEggStep("The valves are inside Dragon Command, the Infirmary, Tank Factory, upper Armory, third-floor Department Store, and Supply Depot.").addImage())
                            .addSubStep(new EasterEggStep("Find the valve producing a whistling sound. This valve contains the Master Code Cylinder and should not be adjusted."))
                            .addSubStep(new EasterEggStep("Rotate the other five valves until one valve displays a green light and the remaining five display blue lights."))
                            .addSubStep(new EasterEggStep("Collect the released Master Code Cylinder and insert it into S.O.P.H.I.A."))
                    )

                    .addStep(new EasterEggStep("Enter the KRONOS Password")
                            .addSubStep(new EasterEggStep("Locate the rotating letter cylinders to the left of S.O.P.H.I.A.").addImage())
                            .addSubStep(new EasterEggStep("Shoot the sides of the cylinders until they spell KRONOS from top to bottom."))
                            .addSubStep(new EasterEggStep("Interact with the confirmation button beneath the cylinders."))
                            .addSubStep(new EasterEggStep("If the password is entered incorrectly, the controls cannot be used again until the next round."))
                    )

                    .addStep(new EasterEggStep("Collect the Six Silver Trophies")
                            .addSubStep(new EasterEggStep("Shoot the raised hand of the right-side statue across from Dragon Command and collect the Gersh Soul trophy from the rubble below.").addImage())
                            .addSubStep(new EasterEggStep("Fire the Guard of Fafnir at the broken pipe outside the Double Tap room and collect the Valkyrie Drone trophy.").addImage())
                            .addSubStep(new EasterEggStep("Activate the Gigant Laser Beam trap in the Supply Depot and collect the Mangler trophy from the opened safe after the trap ends.").addImage())
                            .addSubStep(new EasterEggStep("While traveling through the sewer from the Hatchery, shoot the red ceiling light. Return to the Hatchery and collect the Group 935 trophy from the toilet.").addImage())
                            .addSubStep(new EasterEggStep("Use the Dragon Strike on the water-filled crater outside the Supply Depot and collect the Nuke trophy.").addImage())
                            .addSubStep(new EasterEggStep("Release the Dragon Whelp from the Gauntlet of Siegfried, then use the 115 Punch on the safe inside the Operations Bunker to obtain the Groph Pod trophy.").addImage())
                            .addSubStep(new EasterEggStep("Place all six trophies beneath the large monitor opposite S.O.P.H.I.A.").addImage())
                    )

                    .addStep(new EasterEggStep("Complete S.O.P.H.I.A.'s Six Challenges")
                            .addSubStep(new EasterEggStep("Press the button beneath the trophy monitor to begin a challenge. The first five challenges occur in a random order and failed challenges can be retried during the next round."))

                            .addSubStep(new EasterEggStep("Bomb Defusal")
                                    .addSubStep(new EasterEggStep("Watch the monitor and record the slow sequence showing the six bomb locations."))
                                    .addSubStep(new EasterEggStep("Defuse the bombs in the displayed order before the timer expires.").addImage())
                                    .addSubStep(new EasterEggStep("The bombs are located in Dragon Command, the Infirmary, Armory, Tank Factory, Supply Depot, and Department Store.")))

                            .addSubStep(new EasterEggStep("Capture Gersh")
                                    .addSubStep(new EasterEggStep("Search the map for the glowing yellow Gersh orb and follow its high-pitched humming sound.").addImage())
                                    .addSubStep(new EasterEggStep("Damage the orb with a Pack-A-Punched weapon until it turns purple and teleports."))
                                    .addSubStep(new EasterEggStep("Follow and damage Gersh repeatedly until he is fully captured.")))

                            .addSubStep(new EasterEggStep("Escort the Russian Mangler")
                                    .addSubStep(new EasterEggStep("Locate the friendly Mangler that spawns near the Tank Factory."))
                                    .addSubStep(new EasterEggStep("Shoot off its arm cannon without killing it to make it move more quickly."))
                                    .addSubStep(new EasterEggStep("Protect and escort the Mangler to the staircase inside Dragon Command.").addImage()))

                            .addSubStep(new EasterEggStep("Escort the Valkyrie Drone")
                                    .addSubStep(new EasterEggStep("Locate the damaged Valkyrie Drone near the Tank Factory."))
                                    .addSubStep(new EasterEggStep("Protect the drone while it travels through the map toward Dragon Command."))
                                    .addSubStep(new EasterEggStep("Keep zombies away until the drone reaches the upper Dragon Command area.").addImage()))

                            .addSubStep(new EasterEggStep("Protect the Groph Pod")
                                    .addSubStep(new EasterEggStep("Locate the Groph Pod using the green beam visible in the sky."))
                                    .addSubStep(new EasterEggStep("Defend the pod from attacking zombies until it opens.").addImage())
                                    .addSubStep(new EasterEggStep("Release the Dragon Whelp from a fully charged Gauntlet of Siegfried to retrieve the cargo."))
                                    .addSubStep(new EasterEggStep("Collect the cargo dropped by the Whelp and place it on the tray beneath S.O.P.H.I.A.")))

                            .addSubStep(new EasterEggStep("Complete the Information Download")
                                    .addSubStep(new EasterEggStep("After completing the first five challenges, collect the keycard from the drawer beneath the monitor.").addImage())
                                    .addSubStep(new EasterEggStep("Take the keycard to the red terminal on the middle floor of the Hatchery."))
                                    .addSubStep(new EasterEggStep("Interact with the terminal to begin a four-wave Mangler lockdown."))
                                    .addSubStep(new EasterEggStep("Survive until the information download finishes, retrieve the keycard, and return it to S.O.P.H.I.A.")))
                    )

                    .addStep(new EasterEggStep("Deliver the Power Core to Nikolai")
                            .addSubStep(new EasterEggStep("Interact with S.O.P.H.I.A. after completing all six challenges and collect the power core.").addImage())
                            .addSubStep(new EasterEggStep("Go to Belinski Square and face Nikolai's disabled mech."))
                            .addSubStep(new EasterEggStep("Release the Dragon Whelp from the Gauntlet of Siegfried toward the mech."))
                            .addSubStep(new EasterEggStep("The Whelp will deliver the power core and reactivate Nikolai's mech."))
                            .addSubStep(new EasterEggStep("Return to Dragon Command and interact with S.O.P.H.I.A. again."))
                            .addSubStep(new EasterEggStep("S.O.P.H.I.A. will detach from her console and fly toward Nikolai's mech."))
                    )

                    .addStep(new EasterEggStep("Enter the Boss Arena")
                            .addSubStep(new EasterEggStep("Prepare upgraded weapons, perks, ammunition, fresh shields, Monkey Bombs, and the Dragon Strike before continuing."))
                            .addSubStep(new EasterEggStep("Enter the sewer pipe beneath S.O.P.H.I.A.'s former location.").addImage())
                            .addSubStep(new EasterEggStep("The sewer will transport every player into the boss arena."))
                            .addSubStep(new EasterEggStep("Interact with the central button to begin the battle."))
                    )

                    .addStep(new EasterEggStep("Defeat the Dragon and Nikolai")
                            .addSubStep(new EasterEggStep("Avoid the Dragon's fire by remaining near the arena edges or protecting yourself with the Guard of Fafnir."))
                            .addSubStep(new EasterEggStep("When Nikolai harpoons the Dragon, shoot the exposed weak point.").addImage())
                            .addSubStep(new EasterEggStep("Destroy the weak points on the Dragon's right wing, left side of its belly, and neck."))
                            .addSubStep(new EasterEggStep("After the Dragon is killed, Nikolai will become hostile."))
                            .addSubStep(new EasterEggStep("Destroy the two yellow lights on the front of Nikolai's mech.").addImage())
                            .addSubStep(new EasterEggStep("Destroy the two yellow power cores that rise from the mech's shoulders during its attacks."))
                            .addSubStep(new EasterEggStep("Destroy the final power core exposed in the center of the mech."))
                            .addSubStep(new EasterEggStep("Defeating Nikolai completes Love and War and plays the ending cutscene."))
                    )
            ;


    public static final EasterEgg DeadEnded =
            new EasterEgg("Dead Ended")

                    .addStep(new EasterEggStep("Activate Vodka Bottle 1")
                            .addSubStep(new EasterEggStep("Enter the first floor of the Department Store immediately after leaving Belinski Square."))
                            .addSubStep(new EasterEggStep("Interact with the vodka bottle resting on the couch or furniture inside the room.").addImage())
                    )

                    .addStep(new EasterEggStep("Activate Vodka Bottle 2")
                            .addSubStep(new EasterEggStep("Go through the courtyard beyond Jugger-Nog toward the Operations Bunker."))
                            .addSubStep(new EasterEggStep("Interact with the vodka bottle lying in the shallow water near the rubble.").addImage())
                    )

                    .addStep(new EasterEggStep("Activate Vodka Bottle 3")
                            .addSubStep(new EasterEggStep("Enter the Supply Depot and locate the shelving across from its main entrance."))
                            .addSubStep(new EasterEggStep("Interact with the final vodka bottle to begin playing \"Dead Ended.\"").addImage())
                    )
            ;


    public static final EasterEgg AceOfSpades =
            new EasterEgg("Ace of Spades (Motörhead)")

                    .addStep(new EasterEggStep("Activate Ace of Spades Card 1")
                            .addSubStep(new EasterEggStep("Enter the Tank Factory room containing Double Tap Root Beer."))
                            .addSubStep(new EasterEggStep("Interact with the Ace of Spades card attached to the nearby chalkboard.").addImage())
                    )

                    .addStep(new EasterEggStep("Activate Ace of Spades Card 2")
                            .addSubStep(new EasterEggStep("Go to the upper floor of Dragon Command near the Mystery Box location."))
                            .addSubStep(new EasterEggStep("Interact with the Ace of Spades card resting on the desk.").addImage())
                    )

                    .addStep(new EasterEggStep("Activate Ace of Spades Card 3")
                            .addSubStep(new EasterEggStep("Ride a dragon to the Hatchery and enter the Pack-A-Punch floor."))
                            .addSubStep(new EasterEggStep("Interact with the Ace of Spades card on the desk or shelving beside Pack-A-Punch to begin the song.").addImage())
                    )
            ;


    public static final EasterEgg SamanthasSorrow =
            new EasterEgg("Samantha's Sorrow", "A Max Ammo power-up.")

                    .addStep(new EasterEggStep("Summon the Samantha Doll")
                            .addSubStep(new EasterEggStep("Obtain Monkey Bombs from the Mystery Box."))
                            .addSubStep(new EasterEggStep("Throw a Monkey Bomb into three separate areas that are actively burning from a Dragon's fire.").addImage())
                            .addSubStep(new EasterEggStep("After the confirmation sound, return to the challenge graves in Belinski Square."))
                            .addSubStep(new EasterEggStep("Interact with the Samantha doll in front of the tombstone near the fountain and graveyard.").addImage())
                    )

                    .addStep(new EasterEggStep("Find the Five Hidden Dolls")
                            .addSubStep(new EasterEggStep("Listen for Samantha's Lullaby to locate the first hidden doll."))
                            .addSubStep(new EasterEggStep("Shoot the doll before the allotted time expires.").addImage())
                            .addSubStep(new EasterEggStep("Each successfully shot doll disappears and causes another doll to spawn elsewhere on the map."))
                            .addSubStep(new EasterEggStep("Continue listening for and shooting dolls until all five have been found."))
                            .addSubStep(new EasterEggStep("If Samantha laughs, return to the grave and restart the hide-and-seek game."))
                    )

                    .addStep(new EasterEggStep("Complete the Game")
                            .addSubStep(new EasterEggStep("Return to the tombstone after finding all five dolls."))
                            .addSubStep(new EasterEggStep("Interact with the Samantha doll that has reappeared in front of the grave.").addImage())
                            .addSubStep(new EasterEggStep("A skeletal hand will pull the doll into the grave, a Max Ammo will appear, and \"Samantha's Sorrow\" will begin playing."))
                    )
            ;


    public static final EasterEgg TiamatsMaw =
            new EasterEgg("Tiamat's Maw (Shield Upgrade)")

                    .addStep(new EasterEggStep("Complete the Shield Kill Challenge")
                            .addSubStep(new EasterEggStep("Build and collect the Guard of Fafnir."))
                            .addSubStep(new EasterEggStep("Kill approximately 50 zombies using either the shield bash or its green fireball attack."))
                            .addSubStep(new EasterEggStep("Listen for an audio cue confirming that enough shield kills have been completed."))
                    )

                    .addStep(new EasterEggStep("Survive the Dragon Fire")
                            .addSubStep(new EasterEggStep("Stand in an area being burned by a Dragon while holding the Guard of Fafnir.").addImage())
                            .addSubStep(new EasterEggStep("Remain in the fire for its full duration while blocking with the shield."))
                            .addSubStep(new EasterEggStep("Repeat if necessary until a second confirmation sound is heard."))
                    )

                    .addStep(new EasterEggStep("Shoot the Three Purple Symbols")
                            .addSubStep(new EasterEggStep("Use the shield's fireball attack on the purple symbol outside the Dragon Command dragon platform.").addImage())
                            .addSubStep(new EasterEggStep("Shoot the purple symbol above the Dragon platform inside the Supply Depot.").addImage())
                            .addSubStep(new EasterEggStep("Shoot the purple symbol on the fallen robot's shoulder beside the Tank Factory dragon platform.").addImage())
                    )

                    .addStep(new EasterEggStep("Upgrade the Shield")
                            .addSubStep(new EasterEggStep("Return to Belinski Square and locate the dead Dragon beside the challenge graves."))
                            .addSubStep(new EasterEggStep("Place the Guard of Fafnir into the exposed remains of the Dragon.").addImage())
                            .addSubStep(new EasterEggStep("After several seconds, the shield will return as Tiamat's Maw with increased durability and stronger red fireballs."))
                            .addSubStep(new EasterEggStep("All replacement shields collected from the crafting table will now be upgraded."))
                    )
            ;


    public static final EasterEgg DragonWings =
            new EasterEgg("Dragon Wings")

                    .addStep(new EasterEggStep("Ride from Dragon Command")
                            .addSubStep(new EasterEggStep("Use the Dragon Network Controller at Dragon Command and ride the Dragon to the Hatchery.").addImage())
                    )

                    .addStep(new EasterEggStep("Ride from the Supply Depot")
                            .addSubStep(new EasterEggStep("Use the Dragon Network Controller at the Supply Depot and ride the Dragon to the Hatchery.").addImage())
                    )

                    .addStep(new EasterEggStep("Ride from the Tank Factory")
                            .addSubStep(new EasterEggStep("Use the Dragon Network Controller at the Tank Factory and ride the Dragon to the Hatchery.").addImage())
                    )

                    .addStep(new EasterEggStep("Collect the Dragon Wings")
                            .addSubStep(new EasterEggStep("After using all three Dragon platforms, go to the upper floor of the Department Store."))
                            .addSubStep(new EasterEggStep("Collect the Dragon Wings from the mannequin.").addImage())
                            .addSubStep(new EasterEggStep("The Wings reduce fire and explosive damage and allow free instant travel to the Hatchery from Dragon platforms."))
                    )
            ;


    public static final EasterEgg ManglerHelmet =
            new EasterEgg("Mangler Helmet")

                    .addStep(new EasterEggStep("Complete the Mangler Challenges")
                            .addSubStep(new EasterEggStep("Shoot the helmets off five Russian Manglers before killing them.").addImage())
                            .addSubStep(new EasterEggStep("Shoot and destroy the arm cannons of five Russian Manglers before killing them.").addImage())
                            .addSubStep(new EasterEggStep("Separate audio cues confirm completion of the helmet and arm-cannon requirements."))
                    )

                    .addStep(new EasterEggStep("Collect the Mangler Helmet")
                            .addSubStep(new EasterEggStep("Go to the Department Store floor containing the L-CAR 9 wall-buy."))
                            .addSubStep(new EasterEggStep("Collect the Mangler Helmet from the mannequin near the L-CAR 9.").addImage())
                            .addSubStep(new EasterEggStep("The helmet increases damage dealt to Manglers and reduces damage received from them."))
                    )
            ;


    public static final EasterEgg MonkeyBombUpgrade =
            new EasterEgg("Monkey Bomb Upgrade")

                    .addStep(new EasterEggStep("Collect a Flowerpot")
                            .addSubStep(new EasterEggStep("Find your player-specific flowerpot. Each player can see and collect only one of the available pots."))
                            .addSubStep(new EasterEggStep("Possible locations include Dragon Command, two desks inside the Supply Depot, and the Department Store near the L-CAR 9.").addImage())
                    )

                    .addStep(new EasterEggStep("Light and Collect a Candle")
                            .addSubStep(new EasterEggStep("Build the Guard of Fafnir and locate your player-specific candle."))
                            .addSubStep(new EasterEggStep("Possible candle locations include the Department Store, Supply Depot, Tank Factory, and the bed beside the Infirmary stairs.").addImage())
                            .addSubStep(new EasterEggStep("Shoot the candle using the shield's fireball attack and collect it after it ignites."))
                    )

                    .addStep(new EasterEggStep("Charge the Upgrade")
                            .addSubStep(new EasterEggStep("Kill approximately 40 to 50 zombies using Monkey Bomb explosions."))
                            .addSubStep(new EasterEggStep("Collect the glowing blue power-up that appears after enough Monkey Bomb kills.").addImage())
                    )

                    .addStep(new EasterEggStep("Upgrade the Monkey Bombs")
                            .addSubStep(new EasterEggStep("Return to your challenge grave in Belinski Square."))
                            .addSubStep(new EasterEggStep("Throw a Monkey Bomb onto the grave marked by your green flame.").addImage())
                            .addSubStep(new EasterEggStep("Interact with the green flame when the prompt appears."))
                            .addSubStep(new EasterEggStep("Your Monkey Bombs will be upgraded into Dubstep Monkey Bombs."))
                    )
            ;


    public static final EasterEgg RevelationsMusicSheets =
            new EasterEgg("Revelations Music Sheets")

                    .addStep(new EasterEggStep("Find the Revelations Sheet Music")
                            .addSubStep(new EasterEggStep("Inspect the sheets of music resting on pianos around Gorod Krovi.").addImage())
                            .addSubStep(new EasterEggStep("The combined sheets contain the notes for the musical theme later used on Revelations."))
                            .addSubStep(new EasterEggStep("The sheets are a visual reference and do not activate a playable song on Gorod Krovi."))
                    )
            ;


    public static final EasterEgg YenaLetter =
            new EasterEgg("Yena Letter")

                    .addStep(new EasterEggStep("Find Harvey Yena's Letter")
                            .addSubStep(new EasterEggStep("Locate the Group 935 letter addressed to General Lehmkuhl.").addImage())
                            .addSubStep(new EasterEggStep("The letter discusses the Dragons, the Hatchery, Die Glocke research, dimensional displacement, and S.O.P.H.I.A.'s security requirements."))
                            .addSubStep(new EasterEggStep("The letter is signed by Harvey Yena."))
                    )
            ;


    public static final EasterEgg TimeAttackMeleeWeapons =
            new EasterEgg("Time Attack (Melee Weapons)")

                    .addStep(new EasterEggStep("Unlock the Wrench")
                            .addSubStep(new EasterEggStep("Complete Round 5 and reach Round 6 before the game timer reaches 5 minutes."))
                            .addSubStep(new EasterEggStep("Collect the Wrench from the Time Attack board inside the Operations Bunker.").addImage())
                            .addSubStep(new EasterEggStep("The Wrench can kill normal zombies with one hit until approximately Round 10."))
                    )

                    .addStep(new EasterEggStep("Unlock the Malice")
                            .addSubStep(new EasterEggStep("Complete Round 10 and reach Round 11 before the game timer reaches 13 minutes."))
                            .addSubStep(new EasterEggStep("Collect the Malice from the Time Attack board inside the Operations Bunker.").addImage())
                            .addSubStep(new EasterEggStep("The Malice can kill normal zombies with one hit until approximately Round 15."))
                    )

                    .addStep(new EasterEggStep("Unlock Slash N' Burn")
                            .addSubStep(new EasterEggStep("Complete Round 15 and reach Round 16 before the game timer reaches 24 minutes."))
                            .addSubStep(new EasterEggStep("Collect Slash N' Burn from the Time Attack board inside the Operations Bunker.").addImage())
                            .addSubStep(new EasterEggStep("Slash N' Burn can kill normal zombies with one hit until approximately Round 25."))
                    )

                    .addStep(new EasterEggStep("Unlock the Fury's Song")
                            .addSubStep(new EasterEggStep("Complete Round 20 and reach Round 21 before the game timer reaches 32 minutes."))
                            .addSubStep(new EasterEggStep("Collect the Fury's Song sword from the Time Attack board inside the Operations Bunker.").addImage())
                            .addSubStep(new EasterEggStep("The Fury's Song can kill normal zombies with one hit until approximately Round 35."))
                    )
            ;


    public static final EasterEgg GuardOfFafnir =
            new EasterEgg("Guard of Fafnir")

                    .addStep(new EasterEggStep("Collect the Department Store Shield Part")
                            .addSubStep(new EasterEggStep("Search the route between the Department Store, Jugger-Nog, and the Operations Bunker."))
                            .addSubStep(new EasterEggStep("The part can appear on the chair beside Jugger-Nog, on the truck door below Jugger-Nog, or on the beds near the Operations Bunker entrance.").addImage())
                    )

                    .addStep(new EasterEggStep("Collect the Infirmary and Armory Shield Parts")
                            .addSubStep(new EasterEggStep("Search the Infirmary route above the Operations Bunker for the second shield part."))
                            .addSubStep(new EasterEggStep("Possible locations include the ground beside the staircase, the nearby beds, or the wall beside Stamin-Up.").addImage())
                            .addSubStep(new EasterEggStep("Search the Armory for the final shield part."))
                            .addSubStep(new EasterEggStep("Possible locations include the wall beside a Wunderfizz location, beside the crashed subway entrance, or on the upper Armory wall.").addImage())
                    )

                    .addStep(new EasterEggStep("Build the Guard of Fafnir")
                            .addSubStep(new EasterEggStep("Take all three shield parts to the crafting table in the underground Operations Bunker."))
                            .addSubStep(new EasterEggStep("Build and collect the Guard of Fafnir.").addImage())
                            .addSubStep(new EasterEggStep("The shield blocks Dragon fire, protects the player's back, performs melee attacks, and fires green fireballs."))
                    )
            ;


    public static final EasterEgg GauntletOfSiegfried =
            new EasterEgg("Gauntlet of Siegfried")

                    .addStep(new EasterEggStep("Collect and Heat the Dragon Egg")
                            .addSubStep(new EasterEggStep("Ride a Dragon to the Hatchery and enter its basement."))
                            .addSubStep(new EasterEggStep("Shoot the green Dragon Egg from the rafters beside the sewer exit and collect it.").addImage())
                            .addSubStep(new EasterEggStep("Place the Egg inside a Dragon nest near the Infirmary, Armory, Dragon Command, or Belinski Square.").addImage())
                            .addSubStep(new EasterEggStep("Allow a Dragon to breathe fire over the area or call a Dragon Strike onto the nest."))
                            .addSubStep(new EasterEggStep("Wait for the Egg to cool during the remainder of the current round and the following full round, then collect it."))
                    )

                    .addStep(new EasterEggStep("Complete the Dragon Egg Challenges")
                            .addSubStep(new EasterEggStep("Place the cooled Dragon Egg into your challenge grave in Belinski Square."))
                            .addSubStep(new EasterEggStep("Complete the three displayed challenges: kill Napalm Zombies, obtain penetrating multikills, and obtain melee kills.").addImage())
                            .addSubStep(new EasterEggStep("Return to the challenge grave after completing all three requirements and retrieve the Egg."))
                    )

                    .addStep(new EasterEggStep("Incubate the Dragon Egg")
                            .addSubStep(new EasterEggStep("Return to the Hatchery basement and place the Egg inside the central incubator.").addImage())
                            .addSubStep(new EasterEggStep("Survive the lockdown while killing zombies near the incubator to charge the Egg."))
                            .addSubStep(new EasterEggStep("Finish the current round and one additional full round after S.O.P.H.I.A. announces that incubation is complete."))
                            .addSubStep(new EasterEggStep("Collect the fully incubated Dragon Egg."))
                    )

                    .addStep(new EasterEggStep("Collect the Gauntlet of Siegfried")
                            .addSubStep(new EasterEggStep("Return the incubated Dragon Egg to your challenge grave in Belinski Square."))
                            .addSubStep(new EasterEggStep("Interact with the completed challenge marker and collect the Gauntlet of Siegfried.").addImage())
                            .addSubStep(new EasterEggStep("The Gauntlet provides the 115 Punch, a flamethrower attack, and the ability to deploy a Dragon Whelp."))
                    )
            ;


    public static final EasterEgg DragonStrike =
            new EasterEgg("Dragon Strike")

                    .addStep(new EasterEggStep("Begin the Hatchery Lockdown")
                            .addSubStep(new EasterEggStep("Build the Dragon Network Controller and ride a Dragon to the Hatchery."))
                            .addSubStep(new EasterEggStep("Go to the upper Pack-A-Punch floor and interact with the crystal console in the center of the room.").addImage())
                            .addSubStep(new EasterEggStep("Every player in the Hatchery must interact with the console to begin the lockdown."))
                    )

                    .addStep(new EasterEggStep("Survive and Collect the Dragon Strike")
                            .addSubStep(new EasterEggStep("Survive four waves of zombies and Russian Manglers."))
                            .addSubStep(new EasterEggStep("Use the mounted MG42s and Pack-A-Punch area for additional firepower."))
                            .addSubStep(new EasterEggStep("After completing the final wave, return to the opened console and collect the Dragon Strike Controller.").addImage())
                            .addSubStep(new EasterEggStep("The Dragon Strike marks an area for a Dragon bombardment and attracts nearby zombies before the strike lands."))
                    )
            ;


    public static final EasterEgg DragonNetworkController =
            new EasterEgg("Dragon Network Controller")

                    .addStep(new EasterEggStep("Activate S.O.P.H.I.A.")
                            .addSubStep(new EasterEggStep("Turn on the power inside Dragon Command.").addImage())
                            .addSubStep(new EasterEggStep("Interact with the button beneath S.O.P.H.I.A.'s central console."))
                            .addSubStep(new EasterEggStep("Zombies can now begin dropping colored Code Cylinders."))
                    )

                    .addStep(new EasterEggStep("Complete the Dragon Command Groph Module")
                            .addSubStep(new EasterEggStep("Collect the Dragon Command Code Cylinder from a defeated zombie."))
                            .addSubStep(new EasterEggStep("Insert it into the matching console inside Dragon Command.").addImage())
                            .addSubStep(new EasterEggStep("Follow the green beam to the fallen Groph Pod and defend it until it opens."))
                            .addSubStep(new EasterEggStep("Collect the Dragon Network Controller component from the pod."))
                    )

                    .addStep(new EasterEggStep("Complete the Supply Depot Groph Module")
                            .addSubStep(new EasterEggStep("Collect the Supply Depot Code Cylinder and insert it into the Supply Depot console.").addImage())
                            .addSubStep(new EasterEggStep("Follow the green beam and defend the Groph Pod until it opens."))
                            .addSubStep(new EasterEggStep("Collect the second Dragon Network Controller component."))
                    )

                    .addStep(new EasterEggStep("Complete the Tank Factory Groph Module")
                            .addSubStep(new EasterEggStep("Collect the Tank Factory Code Cylinder and insert it into the Tank Factory console.").addImage())
                            .addSubStep(new EasterEggStep("Follow the green beam and defend the Groph Pod until it opens."))
                            .addSubStep(new EasterEggStep("Collect the final Dragon Network Controller component."))
                    )

                    .addStep(new EasterEggStep("Assemble and Use the Controller")
                            .addSubStep(new EasterEggStep("Take the three components to the Dragon Network console inside the Operations Bunker.").addImage())
                            .addSubStep(new EasterEggStep("Install all three components to activate the Dragon transportation network."))
                            .addSubStep(new EasterEggStep("Use a controller at Dragon Command, the Supply Depot, or the Tank Factory to summon a Dragon."))
                            .addSubStep(new EasterEggStep("Ride the Dragon to the Hatchery and Pack-A-Punch area.").addImage())
                    )
            ;

    public static final List<EasterEgg> GorodKrovi_MainQuests = Arrays.asList(
        LoveAndWar
    );
    public static final List<EasterEgg> GorodKrovi_SideQuests = Arrays.asList(
        DeadEnded,
        AceOfSpades,
        SamanthasSorrow,
        TiamatsMaw,
        DragonWings,
        ManglerHelmet,
        MonkeyBombUpgrade,
        RevelationsMusicSheets,
        YenaLetter,
        TimeAttackMeleeWeapons

    );

    public static final List<Procedure> GorodKrovi_Buildables = Arrays.asList(
        GuardOfFafnir,
        GauntletOfSiegfried,
        DragonStrike,
        DragonNetworkController
    );
}
