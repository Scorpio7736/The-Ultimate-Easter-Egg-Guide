package com.example.the_ultimate_easter_egg_guide.MapData.BOIII.Buildables;

import com.example.the_ultimate_easter_egg_guide.Models.Maps.Buildable;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.Buildable;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.BuildableStep;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.Procedure;

import java.util.Arrays;
import java.util.List;

public class GorodKrovi_Buildables
{
    public static final Buildable GuardOfFafnir =
            new Buildable("Guard of Fafnir")

                    .addStep(new BuildableStep("Collect the Department Store Shield Part")
                            .addSubStep(new BuildableStep("Search the route between the Department Store, Jugger-Nog, and the Operations Bunker."))
                            .addSubStep(new BuildableStep("The part can appear on the chair beside Jugger-Nog, on the truck door below Jugger-Nog, or on the beds near the Operations Bunker entrance.").addImage())
                    )

                    .addStep(new BuildableStep("Collect the Infirmary and Armory Shield Parts")
                            .addSubStep(new BuildableStep("Search the Infirmary route above the Operations Bunker for the second shield part."))
                            .addSubStep(new BuildableStep("Possible locations include the ground beside the staircase, the nearby beds, or the wall beside Stamin-Up.").addImage())
                            .addSubStep(new BuildableStep("Search the Armory for the final shield part."))
                            .addSubStep(new BuildableStep("Possible locations include the wall beside a Wunderfizz location, beside the crashed subway entrance, or on the upper Armory wall.").addImage())
                    )

                    .addStep(new BuildableStep("Build the Guard of Fafnir")
                            .addSubStep(new BuildableStep("Take all three shield parts to the crafting table in the underground Operations Bunker."))
                            .addSubStep(new BuildableStep("Build and collect the Guard of Fafnir.").addImage())
                            .addSubStep(new BuildableStep("The shield blocks Dragon fire, protects the player's back, performs melee attacks, and fires green fireballs."))
                    )
            ;


    public static final Buildable GauntletOfSiegfried =
            new Buildable("Gauntlet of Siegfried")

                    .addStep(new BuildableStep("Collect and Heat the Dragon Egg")
                            .addSubStep(new BuildableStep("Ride a Dragon to the Hatchery and enter its basement."))
                            .addSubStep(new BuildableStep("Shoot the green Dragon Egg from the rafters beside the sewer exit and collect it.").addImage())
                            .addSubStep(new BuildableStep("Place the Egg inside a Dragon nest near the Infirmary, Armory, Dragon Command, or Belinski Square.").addImage())
                            .addSubStep(new BuildableStep("Allow a Dragon to breathe fire over the area or call a Dragon Strike onto the nest."))
                            .addSubStep(new BuildableStep("Wait for the Egg to cool during the remainder of the current round and the following full round, then collect it."))
                    )

                    .addStep(new BuildableStep("Complete the Dragon Egg Challenges")
                            .addSubStep(new BuildableStep("Place the cooled Dragon Egg into your challenge grave in Belinski Square."))
                            .addSubStep(new BuildableStep("Complete the three displayed challenges: kill Napalm Zombies, obtain penetrating multikills, and obtain melee kills.").addImage())
                            .addSubStep(new BuildableStep("Return to the challenge grave after completing all three requirements and retrieve the Egg."))
                    )

                    .addStep(new BuildableStep("Incubate the Dragon Egg")
                            .addSubStep(new BuildableStep("Return to the Hatchery basement and place the Egg inside the central incubator.").addImage())
                            .addSubStep(new BuildableStep("Survive the lockdown while killing zombies near the incubator to charge the Egg."))
                            .addSubStep(new BuildableStep("Finish the current round and one additional full round after S.O.P.H.I.A. announces that incubation is complete."))
                            .addSubStep(new BuildableStep("Collect the fully incubated Dragon Egg."))
                    )

                    .addStep(new BuildableStep("Collect the Gauntlet of Siegfried")
                            .addSubStep(new BuildableStep("Return the incubated Dragon Egg to your challenge grave in Belinski Square."))
                            .addSubStep(new BuildableStep("Interact with the completed challenge marker and collect the Gauntlet of Siegfried.").addImage())
                            .addSubStep(new BuildableStep("The Gauntlet provides the 115 Punch, a flamethrower attack, and the ability to deploy a Dragon Whelp."))
                    )
            ;


    public static final Buildable DragonStrike =
            new Buildable("Dragon Strike")

                    .addStep(new BuildableStep("Begin the Hatchery Lockdown")
                            .addSubStep(new BuildableStep("Build the Dragon Network Controller and ride a Dragon to the Hatchery."))
                            .addSubStep(new BuildableStep("Go to the upper Pack-A-Punch floor and interact with the crystal console in the center of the room.").addImage())
                            .addSubStep(new BuildableStep("Every player in the Hatchery must interact with the console to begin the lockdown."))
                    )

                    .addStep(new BuildableStep("Survive and Collect the Dragon Strike")
                            .addSubStep(new BuildableStep("Survive four waves of zombies and Russian Manglers."))
                            .addSubStep(new BuildableStep("Use the mounted MG42s and Pack-A-Punch area for additional firepower."))
                            .addSubStep(new BuildableStep("After completing the final wave, return to the opened console and collect the Dragon Strike Controller.").addImage())
                            .addSubStep(new BuildableStep("The Dragon Strike marks an area for a Dragon bombardment and attracts nearby zombies before the strike lands."))
                    )
            ;


    public static final Buildable DragonNetworkController =
            new Buildable("Dragon Network Controller")

                    .addStep(new BuildableStep("Activate S.O.P.H.I.A.")
                            .addSubStep(new BuildableStep("Turn on the power inside Dragon Command.").addImage())
                            .addSubStep(new BuildableStep("Interact with the button beneath S.O.P.H.I.A.'s central console."))
                            .addSubStep(new BuildableStep("Zombies can now begin dropping colored Code Cylinders."))
                    )

                    .addStep(new BuildableStep("Complete the Dragon Command Groph Module")
                            .addSubStep(new BuildableStep("Collect the Dragon Command Code Cylinder from a defeated zombie."))
                            .addSubStep(new BuildableStep("Insert it into the matching console inside Dragon Command.").addImage())
                            .addSubStep(new BuildableStep("Follow the green beam to the fallen Groph Pod and defend it until it opens."))
                            .addSubStep(new BuildableStep("Collect the Dragon Network Controller component from the pod."))
                    )

                    .addStep(new BuildableStep("Complete the Supply Depot Groph Module")
                            .addSubStep(new BuildableStep("Collect the Supply Depot Code Cylinder and insert it into the Supply Depot console.").addImage())
                            .addSubStep(new BuildableStep("Follow the green beam and defend the Groph Pod until it opens."))
                            .addSubStep(new BuildableStep("Collect the second Dragon Network Controller component."))
                    )

                    .addStep(new BuildableStep("Complete the Tank Factory Groph Module")
                            .addSubStep(new BuildableStep("Collect the Tank Factory Code Cylinder and insert it into the Tank Factory console.").addImage())
                            .addSubStep(new BuildableStep("Follow the green beam and defend the Groph Pod until it opens."))
                            .addSubStep(new BuildableStep("Collect the final Dragon Network Controller component."))
                    )

                    .addStep(new BuildableStep("Assemble and Use the Controller")
                            .addSubStep(new BuildableStep("Take the three components to the Dragon Network console inside the Operations Bunker.").addImage())
                            .addSubStep(new BuildableStep("Install all three components to activate the Dragon transportation network."))
                            .addSubStep(new BuildableStep("Use a controller at Dragon Command, the Supply Depot, or the Tank Factory to summon a Dragon."))
                            .addSubStep(new BuildableStep("Ride the Dragon to the Hatchery and Pack-A-Punch area.").addImage())
                    )
            ;

    public static final List<Buildable> GorodKrovi_Buildables = Arrays.asList(
            GuardOfFafnir,
            GauntletOfSiegfried,
            DragonStrike,
            DragonNetworkController
    );
}
