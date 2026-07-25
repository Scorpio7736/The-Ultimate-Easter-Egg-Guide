package com.example.the_ultimate_easter_egg_guide.MapData.BOIII.Buildables;

import com.example.the_ultimate_easter_egg_guide.Models.Maps.Buildable;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.BuildableStep;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEgg;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.BuildableStep;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.Procedure;

import java.util.Arrays;
import java.util.List;

public class ZetsubouNoShima_Buildables
{
    public static final Buildable KT4 =
            new Buildable("KT-4")

                    .addStep(new BuildableStep("Collect the Spider Venom")
                            .addSubStep(new BuildableStep("Restore temporary power to Lab A and wait for a Spider round."))
                            .addSubStep(new BuildableStep("Use the control panel inside Lab A to lower the Spider cage into the swamp.").addImage())
                            .addSubStep(new BuildableStep("Lure a Spider into the lowered cage."))
                            .addSubStep(new BuildableStep("Raise the cage and allow the extraction machine to collect the Spider's venom."))
                            .addSubStep(new BuildableStep("Collect the purple Spider Venom vial from the extraction machine.").addImage())
                    )

                    .addStep(new BuildableStep("Collect the Green Test Tube")
                            .addSubStep(new BuildableStep("Turn on the main power and begin rounds near Lab B."))
                            .addSubStep(new BuildableStep("Locate the zombie emitting a bright green glow, which commonly begins appearing around Round 8.").addImage())
                            .addSubStep(new BuildableStep("Kill the glowing zombie and collect the green test tube it drops."))
                    )

                    .addStep(new BuildableStep("Collect the Underwater Plant and Build the KT-4")
                            .addSubStep(new BuildableStep("Enter the flooded tunnel to the right of Mule Kick in the Bunker."))
                            .addSubStep(new BuildableStep("Swim through the tunnel into the deep blue Divinium section."))
                            .addSubStep(new BuildableStep("Shoot the underwater spores to restore air while descending."))
                            .addSubStep(new BuildableStep("Collect the plant from the bottom of the deepest section.").addImage())
                            .addSubStep(new BuildableStep("Take all three ingredients to the KT-4 workbench inside the Bunker laboratory."))
                            .addSubStep(new BuildableStep("Build and collect the KT-4.").addImage())
                    )
            ;


    public static final Buildable Masamune =
            new Buildable("Masamune")

                    .addStep(new BuildableStep("Collect the Giant Spider Fang")
                            .addSubStep(new BuildableStep("Build the KT-4 and travel to the blue water area behind Lab A."))
                            .addSubStep(new BuildableStep("Use the KT-4 to dissolve the large webs covering the entrance to the Spider cave.").addImage())
                            .addSubStep(new BuildableStep("Enter the cave and defeat the Giant Spider by shooting its mouth while it is open and glowing."))
                            .addSubStep(new BuildableStep("Approach the dead Giant Spider and collect the fang from its mouth.").addImage())
                    )

                    .addStep(new BuildableStep("Collect the Liquid Divinium Vial")
                            .addSubStep(new BuildableStep("Complete every player's three Trials of the Ancients and build a Zombie Shield."))
                            .addSubStep(new BuildableStep("Stand at the Trials altar with the shield equipped until lightning electrifies it."))
                            .addSubStep(new BuildableStep("Go to Lab B and melee the cage control panel using the electrified shield.").addImage())
                            .addSubStep(new BuildableStep("Enter the cage and activate the panel to lower it into the hidden underground chamber."))
                            .addSubStep(new BuildableStep("Collect the Liquid Divinium vial from the skeleton's rib cage.").addImage())
                            .addSubStep(new BuildableStep("In cooperative games, another player must use the control panel to raise the cage."))
                    )

                    .addStep(new BuildableStep("Grow the Iridescent Plant and Upgrade the KT-4")
                            .addSubStep(new BuildableStep("Obtain the Skull of Nan Sapwe and Mesmerize the torn blueprint near the purple water."))
                            .addSubStep(new BuildableStep("Use Mesmerize on the wall beside the underwater KT-4 plant location to reveal a hidden planting spot.").addImage())
                            .addSubStep(new BuildableStep("Use the Bunker sewer-pipe fast travel and interact with the blue Divinium meteorite inside the pipe to collect iridescent water."))
                            .addSubStep(new BuildableStep("Plant a Seed in the hidden underwater planting spot."))
                            .addSubStep(new BuildableStep("Water the Seed with iridescent water once per round for three consecutive rounds."))
                            .addSubStep(new BuildableStep("Collect the completed iridescent plant.").addImage())
                            .addSubStep(new BuildableStep("Take the fang, Divinium vial, and plant to the Masamune workbench beside the KT-4 workbench."))
                            .addSubStep(new BuildableStep("Hold the KT-4 while interacting with the workbench to upgrade it into the Masamune.").addImage())
                    )
            ;


    public static final Buildable ZombieShield =
            new Buildable("Zombie Shield")

                    .addStep(new BuildableStep("Collect the Bunker Shield Part")
                            .addSubStep(new BuildableStep("Enter the Bunker and purchase the right-side doorway immediately beyond the main entrance."))
                            .addSubStep(new BuildableStep("Search the walls, shelving, and debris inside this room for the first shield part.").addImage())
                    )

                    .addStep(new BuildableStep("Collect the Lab B Shield Part")
                            .addSubStep(new BuildableStep("Search the route outside Lab B that leads back toward Spawn."))
                            .addSubStep(new BuildableStep("The part can appear attached to a tree or hidden among the cut bushes near the Lab B staircase.").addImage())
                    )

                    .addStep(new BuildableStep("Collect the Lab A Shield Part and Build the Shield")
                            .addSubStep(new BuildableStep("Search underneath Lab A near the Kuda wall-buy."))
                            .addSubStep(new BuildableStep("The part can appear beside the Kuda or on the wall near the nearby zombie barrier.").addImage())
                            .addSubStep(new BuildableStep("Take all three parts to a crafting table inside Lab A, Lab B, or the Bunker."))
                            .addSubStep(new BuildableStep("Build and collect the Zombie Shield.").addImage())
                    )
            ;


    public static final Buildable GasMask =
            new Buildable("Gas Mask")

                    .addStep(new BuildableStep("Collect the Lab B Gas Mask Part")
                            .addSubStep(new BuildableStep("Search behind Lab B near the green water and the entrance to the sewer-pipe transport."))
                            .addSubStep(new BuildableStep("The part can also appear near the ICR-1 wall-buy at the top of the nearby stairs.").addImage())
                    )

                    .addStep(new BuildableStep("Collect the Airplane Gas Mask Part")
                            .addSubStep(new BuildableStep("Search the crashed-airplane area containing the propeller trap and Mystery Box location."))
                            .addSubStep(new BuildableStep("Inspect the ground and debris around the airplane for the second part.").addImage())
                    )

                    .addStep(new BuildableStep("Collect the Docks Gas Mask Part and Build the Mask")
                            .addSubStep(new BuildableStep("Search the Docks beneath the Bunker near the Zipline and Trials altar."))
                            .addSubStep(new BuildableStep("Collect the final Gas Mask part from the surrounding crates, walls, or debris.").addImage())
                            .addSubStep(new BuildableStep("Take all three parts to a crafting table inside Lab A, Lab B, or the Bunker."))
                            .addSubStep(new BuildableStep("Build and collect the Gas Mask.").addImage())
                            .addSubStep(new BuildableStep("The Gas Mask prevents spore gas from disabling the player's weapons and increases underwater breathing time."))
                    )
            ;


    public static final Buildable SkullOfNanSapwe =
            new Buildable("Skull of Nan Sapwe")

                    .addStep(new BuildableStep("Match the Four Skulls to Their Altars")
                            .addSubStep(new BuildableStep("Go to the Trials of the Ancients area near Spawn and inspect the four skulls on the central stone altar.").addImage())
                            .addSubStep(new BuildableStep("Each skull displays a unique symbol that corresponds to one ritual altar around the map."))
                            .addSubStep(new BuildableStep("The four ritual altars are located near Spawn, beside the crashed airplane, at the Docks, and in the lower Bunker near Mule Kick.").addImage())
                    )

                    .addStep(new BuildableStep("Complete the Four Skull Rituals")
                            .addSubStep(new BuildableStep("Carry one skull to the altar displaying its matching symbol."))
                            .addSubStep(new BuildableStep("Place the skull on the altar and defend it from the spawning zombies, Spiders, and Thrashers.").addImage())
                            .addSubStep(new BuildableStep("Return the purified skull to its original location at the Trials altar."))
                            .addSubStep(new BuildableStep("Repeat the process for all four skulls."))
                    )

                    .addStep(new BuildableStep("Complete the Keeper Ritual")
                            .addSubStep(new BuildableStep("After returning all four purified skulls, enter the hidden staircase revealed beside the Trials altar.").addImage())
                            .addSubStep(new BuildableStep("Descend into the ritual chamber and interact with the Skull of Nan Sapwe."))
                            .addSubStep(new BuildableStep("Kill the spawning Keepers close enough for their souls to enter the Skull."))
                            .addSubStep(new BuildableStep("Continue until the ritual finishes and the chamber opens."))
                            .addSubStep(new BuildableStep("Collect the Skull of Nan Sapwe from the center pedestal.").addImage())
                    )
            ;


    public static final Buildable SpiderBait =
            new Buildable("Spider Bait")

                    .addStep(new BuildableStep("Prepare the Spider Bait Quest")
                            .addSubStep(new BuildableStep("Obtain the Skull of Nan Sapwe."))
                            .addSubStep(new BuildableStep("Complete every player's Trials of the Ancients."))
                            .addSubStep(new BuildableStep("Build and electrify a Zombie Shield at the Trials altar."))
                            .addSubStep(new BuildableStep("Use the Lab A Spider cage to obtain the KT-4 Spider Venom and lower the empty cage back into the swamp."))
                    )

                    .addStep(new BuildableStep("Identify and Feed the Red-Mist Spider")
                            .addSubStep(new BuildableStep("Wait for at least the second Spider round of the match."))
                            .addSubStep(new BuildableStep("Use the Skull of Nan Sapwe's Mesmerize ability to identify the Spider emitting red mist.").addImage())
                            .addSubStep(new BuildableStep("Keep the red-mist Spider alive and eliminate the other Spiders if possible."))
                            .addSubStep(new BuildableStep("Lead the Spider to the blue water behind Lab A and allow it to drink."))
                            .addSubStep(new BuildableStep("Lead the Spider to the green water behind Lab B and allow it to drink."))
                            .addSubStep(new BuildableStep("Lead the Spider to the purple water inside the Bunker Living Quarters and allow it to drink.").addImage())
                            .addSubStep(new BuildableStep("Avoid active spore clouds because they can instantly kill the special Spider."))
                    )

                    .addStep(new BuildableStep("Supercharge the Spider Cage")
                            .addSubStep(new BuildableStep("Lead the red-mist Spider into the lowered cage beneath Lab A.").addImage())
                            .addSubStep(new BuildableStep("Raise the cage into Lab A."))
                            .addSubStep(new BuildableStep("Melee the control panel with an electrified Zombie Shield."))
                            .addSubStep(new BuildableStep("Lower the supercharged cage completely underground."))
                    )

                    .addStep(new BuildableStep("Complete the Red Spider Round")
                            .addSubStep(new BuildableStep("Wait until the next Spider round begins."))
                            .addSubStep(new BuildableStep("Every Spider during this round will emit red mist and behave more aggressively."))
                            .addSubStep(new BuildableStep("Kill every Spider and complete the round."))
                    )

                    .addStep(new BuildableStep("Collect the Spider Bait")
                            .addSubStep(new BuildableStep("Return to Lab A after completing the red Spider round."))
                            .addSubStep(new BuildableStep("Raise the underground cage. The captured Spider will have transformed into a cocoon.").addImage())
                            .addSubStep(new BuildableStep("Activate the extraction machine and wait for it to process the cocoon."))
                            .addSubStep(new BuildableStep("Collect the Spider Bait from the extraction machine.").addImage())
                            .addSubStep(new BuildableStep("Spider Bait replaces Trip Mines and allows the player to control a Spider once per round."))
                    )
            ;


    public static final List<Buildable> ZetsubouNoShima_Buildables = Arrays.asList(
            KT4,
            Masamune,
            ZombieShield,
            GasMask,
            SkullOfNanSapwe,
            SpiderBait
    );
}
