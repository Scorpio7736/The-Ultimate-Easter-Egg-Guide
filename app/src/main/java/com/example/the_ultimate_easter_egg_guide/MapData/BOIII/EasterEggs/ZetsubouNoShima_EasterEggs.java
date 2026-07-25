package com.example.the_ultimate_easter_egg_guide.MapData.BOIII.EasterEggs;

import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEgg;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEggStep;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.Procedure;

import java.util.Arrays;
import java.util.List;

public class ZetsubouNoShima_EasterEggs
{
    public static final EasterEgg SeedsOfDoubt =
            new EasterEgg(
                    "Seeds of Doubt",
                    "All perks available on the map, the Seeds of Doubt achievement, 5,000 XP, and the Zetsubou No Shima Gateworm icon."
            )

                    .addStep(new EasterEggStep("Complete the Main Quest Prerequisites")
                            .addSubStep(new EasterEggStep("Turn on the main power and open the Bunker."))
                            .addSubStep(new EasterEggStep("Complete all three Trials of the Ancients for every player in the game.").addImage())
                            .addSubStep(new EasterEggStep("Obtain the Skull of Nan Sapwe.").addImage())
                            .addSubStep(new EasterEggStep("Build the KT-4 and upgrade it into the Masamune.").addImage())
                            .addSubStep(new EasterEggStep("Build the Zombie Shield and electrify it by standing at the Trials altar while lightning strikes.").addImage())
                            .addSubStep(new EasterEggStep("Build a Gas Mask for every player entering the boss area.").addImage())
                            .addSubStep(new EasterEggStep("Equip the Anywhere But Here! GobbleGum on at least one player before starting the match."))
                    )

                    .addStep(new EasterEggStep("Reveal the Elevator Machinery")
                            .addSubStep(new EasterEggStep("Enter the Living Quarters in the Bunker and go to the room containing the purple water."))
                            .addSubStep(new EasterEggStep("Use the Skull of Nan Sapwe's Mesmerize ability on the torn blueprint mounted on the wall across from the purple water.").addImage())
                            .addSubStep(new EasterEggStep("Go to the unusable elevator across from the doorway leading to the anti-aircraft platform."))
                            .addSubStep(new EasterEggStep("Use Mesmerize on the concealed wall directly to the left of the elevator.").addImage())
                            .addSubStep(new EasterEggStep("The wall will disappear and reveal the broken elevator generator, which requires three Cogs."))
                    )

                    .addStep(new EasterEggStep("Collect the Three Cogs")

                            .addSubStep(new EasterEggStep("Anywhere But Here! Cog")
                                    .addSubStep(new EasterEggStep("Use Anywhere But Here! after revealing the elevator machinery."))
                                    .addSubStep(new EasterEggStep("The GobbleGum will transport the player into a secret room above Lab A."))
                                    .addSubStep(new EasterEggStep("Collect the Cog from the floor and exit through the opening in the wall.").addImage()))

                            .addSubStep(new EasterEggStep("Anti-Aircraft Gun Cog")
                                    .addSubStep(new EasterEggStep("Plant one or more Seeds and water each plant with blue water once per round for three rounds."))
                                    .addSubStep(new EasterEggStep("Shoot each growing plant with the KT-4 once during every round."))
                                    .addSubStep(new EasterEggStep("Open the completed plants until one produces an anti-aircraft shell.").addImage())
                                    .addSubStep(new EasterEggStep("Load the shell into the rear of the FlaK 88 cannon on the anti-aircraft platform.").addImage())
                                    .addSubStep(new EasterEggStep("Wait for the large cargo plane to fly into the cannon's firing path and activate the cannon."))
                                    .addSubStep(new EasterEggStep("Follow the smoking debris and collect the Cog where it landed.").addImage())
                                    .addSubStep(new EasterEggStep("The Cog can land near the large tree outside the Bunker, near the Lab A Zipline staircase, or beside the meteorite behind Lab B.")))

                            .addSubStep(new EasterEggStep("Zipline Cog")
                                    .addSubStep(new EasterEggStep("After every player completes their Trials, equip a Zombie Shield and stand at the Trials altar until lightning electrifies it.").addImage())
                                    .addSubStep(new EasterEggStep("Travel to the Zipline connecting the Docks and Lab A."))
                                    .addSubStep(new EasterEggStep("In solo, melee the Zipline control panel with the electrified shield and immediately ride from the Docks toward Lab A."))
                                    .addSubStep(new EasterEggStep("Melee while passing over the small dock to drop from the Zipline and land beside the Cog.").addImage())
                                    .addSubStep(new EasterEggStep("In cooperative games, one player rides the Zipline while another melees the control panel with the electrified shield as the rider passes over the dock."))
                                    .addSubStep(new EasterEggStep("Collect the Cog from the isolated dock beneath the Zipline.")))
                    )

                    .addStep(new EasterEggStep("Activate the Elevator")
                            .addSubStep(new EasterEggStep("Return all three Cogs to the hidden generator beside the elevator.").addImage())
                            .addSubStep(new EasterEggStep("Install the Cogs to restore power to the elevator."))
                            .addSubStep(new EasterEggStep("Make sure every player has a Gas Mask before using the elevator."))
                            .addSubStep(new EasterEggStep("Make sure at least one player is carrying the Masamune."))
                            .addSubStep(new EasterEggStep("Enter the elevator and activate it to descend into the secret Division 9 facility."))
                            .addSubStep(new EasterEggStep("Use the Masamune to destroy the three glowing vine barriers blocking the hallway.").addImage())
                    )

                    .addStep(new EasterEggStep("Defeat the Giant Thrasher")
                            .addSubStep(new EasterEggStep("Enter the final chamber and shoot the glowing spore on the Giant Thrasher's exposed arm using the Masamune.").addImage())
                            .addSubStep(new EasterEggStep("Survive the continuous waves of zombies, Spiders, and normal Thrashers while waiting for another weak point to appear."))
                            .addSubStep(new EasterEggStep("Shoot each newly exposed arm spore with the Masamune."))
                            .addSubStep(new EasterEggStep("Avoid the Giant Thrasher's vine attack through the center of the arena."))
                            .addSubStep(new EasterEggStep("Destroy all four arm spores to defeat the Giant Thrasher and begin the ending cutscene.").addImage())
                            .addSubStep(new EasterEggStep("After the cutscene, every player receives all perks available on the map."))
                    )
            ;


    public static final EasterEgg DeadFlowers =
            new EasterEgg("Dead Flowers - Song")

                    .addStep(new EasterEggStep("Activate Sock Monkey 1")
                            .addSubStep(new EasterEggStep("Go behind Lab A to the area containing the blue Element 115 water."))
                            .addSubStep(new EasterEggStep("Interact with the sock monkey sitting on the generator beside the perk-machine location.").addImage())
                    )

                    .addStep(new EasterEggStep("Activate Sock Monkey 2")
                            .addSubStep(new EasterEggStep("Enter Lab B and go to its upper floor."))
                            .addSubStep(new EasterEggStep("Interact with the sock monkey on the surgical table beside the floodlight and zombie diagrams.").addImage())
                    )

                    .addStep(new EasterEggStep("Activate Sock Monkey 3")
                            .addSubStep(new EasterEggStep("Enter the lower Bunker laboratory near Mule Kick."))
                            .addSubStep(new EasterEggStep("Interact with the sock monkey on the table between the KT-4 and Masamune workbenches.").addImage())
                            .addSubStep(new EasterEggStep("After all three sock monkeys have been activated, \"Dead Flowers\" will begin playing."))
                    )
            ;


    public static final EasterEgg SamanthasLullaby =
            new EasterEgg("Samantha's Lullaby - Song")

                    .addStep(new EasterEggStep("Fill the Melody Bulbs")
                            .addSubStep(new EasterEggStep("Enter the Living Quarters and go to the wall beside the purple Element 115 water."))
                            .addSubStep(new EasterEggStep("Locate the seven glass melody bulbs mounted on the wall.").addImage())
                            .addSubStep(new EasterEggStep("Use a Bucket to collect purple water."))
                            .addSubStep(new EasterEggStep("Fill the six melody bulbs using the required amounts in the order 1, 3, 5, 6, 7, and 5."))
                            .addSubStep(new EasterEggStep("Interact with the remaining play bulb after the sequence has been entered correctly.").addImage())
                            .addSubStep(new EasterEggStep("\"Samantha's Lullaby (Magic Mix)\" will begin playing."))
                    )
            ;


    public static final EasterEgg Round50Monster =
            new EasterEgg("Round 50 Monster")

                    .addStep(new EasterEggStep("Find the Distant Monster")
                            .addSubStep(new EasterEggStep("Reach Round 50 or higher while at least one player possesses the Skull of Nan Sapwe."))
                            .addSubStep(new EasterEggStep("At the beginning of a round, go behind Lab B near the green water."))
                            .addSubStep(new EasterEggStep("Look across the water outside the playable area. A massive creature will briefly rise and move in the distance.").addImage())
                    )
            ;


    public static final EasterEgg OneTooMany =
            new EasterEgg("One Too Many")

                    .addStep(new EasterEggStep("Grow a Fruit Plant")
                            .addSubStep(new EasterEggStep("Plant a Seed in any planting location."))
                            .addSubStep(new EasterEggStep("Water the Seed with blue, green, and purple water over three consecutive rounds to grow a Fruit Plant.").addImage())
                            .addSubStep(new EasterEggStep("Other mixed water combinations can also produce a Fruit Plant."))
                    )

                    .addStep(new EasterEggStep("Eat the Fruit with Four Perks")
                            .addSubStep(new EasterEggStep("Purchase or obtain at least four perks without first gaining an additional perk slot from an Empty Perk Bottle."))
                            .addSubStep(new EasterEggStep("Interact with the Fruit Plant and eat its fruit.").addImage())
                            .addSubStep(new EasterEggStep("The character will vomit instead of receiving another perk, unlocking the One Too Many achievement."))
                    )
            ;


    public static final EasterEgg TheMissingCityPoster =
            new EasterEgg("The Missing City Poster")

                    .addStep(new EasterEggStep("Find the Missing City Poster")
                            .addSubStep(new EasterEggStep("Enter the Living Quarters on the lower level of the Bunker."))
                            .addSubStep(new EasterEggStep("Go to the second-floor walkway and locate the rebuildable zombie barrier."))
                            .addSubStep(new EasterEggStep("Look through the barrier to see a Japanese version of The Missing City poster from Shadows of Evil.").addImage())
                    )
            ;


    public static final EasterEgg DoppelgangerJumpscare =
            new EasterEgg("Doppelganger Jumpscare")

                    .addStep(new EasterEggStep("Inspect the Test Subjects")
                            .addSubStep(new EasterEggStep("Turn on the main power and enter the Bunker."))
                            .addSubStep(new EasterEggStep("Obtain a sniper rifle with a scope."))
                            .addSubStep(new EasterEggStep("Enter the laboratory containing the human test subjects suspended inside glass tubes.").addImage())
                            .addSubStep(new EasterEggStep("Stand close to the tubes and inspect the test subjects through the sniper scope."))
                            .addSubStep(new EasterEggStep("Move the scope slowly down each test subject's body and inspect multiple tubes if necessary."))
                    )

                    .addStep(new EasterEggStep("Trigger the Doppelgänger")
                            .addSubStep(new EasterEggStep("Move away from the test-subject tubes after completing the inspection."))
                            .addSubStep(new EasterEggStep("A motionless duplicate of the player's Primis character will appear nearby.").addImage())
                            .addSubStep(new EasterEggStep("Approach the duplicate to make it turn, scream, and temporarily immobilize the player."))
                            .addSubStep(new EasterEggStep("Only the player who activated the Easter egg can see the Doppelgänger."))
                    )
            ;




    public static final List<EasterEgg> ZetsubouNoShima_MainQuests = Arrays.asList(
        SeedsOfDoubt
    );
    public static final List<EasterEgg> ZetsubouNoShima_SideQuests = Arrays.asList(
        DeadFlowers,
        SamanthasLullaby,
        Round50Monster,
        OneTooMany,
        TheMissingCityPoster,
        DoppelgangerJumpscare
    );
}
