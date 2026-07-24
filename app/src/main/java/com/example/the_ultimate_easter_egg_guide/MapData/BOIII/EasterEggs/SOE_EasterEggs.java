package com.example.the_ultimate_easter_egg_guide.MapData.BOIII.EasterEggs;

import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEgg;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEggStep;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.Procedure;

import java.util.Arrays;
import java.util.List;

public class SOE_EasterEggs
{
    public static final EasterEgg RocketShield =
            new EasterEgg("Rocket Shield")

                    .addStep(new EasterEggStep("Collect the Footlight Shield Window")
                            .addSubStep(new EasterEggStep(
                                    "Open the Beast Mode staircase near the front of the Footlight District."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Search the upper Footlight area for the shield window. It can appear on the bench across from the perk machine."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "It can appear leaning against the fence to the left of the perk machine."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "It can also appear on the chair inside the staircase room near the Mystery Box location."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Collect the Canals Shield Base")
                            .addSubStep(new EasterEggStep(
                                    "Open the Beast Mode staircase near the front of the Canals District."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Search the room containing the four lion statues. The part can appear against the wall beside the Harvest Pod."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "It can appear on the elevated walkway leading toward the perk-machine room."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "It can also appear leaning against the window inside the perk-machine room."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Collect the Waterfront Rocket Canisters")
                            .addSubStep(new EasterEggStep(
                                    "Open the Beast Mode staircase near the front of the Waterfront District."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Search immediately at the top of the powered staircase."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "The canisters can appear beneath the window across from the Beast Mode chalice in the perk-machine room."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "They can also appear inside the damaged building, leaning against an overturned table near the train-station gate."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "Take all three parts to a crafting table in the Footlight, Canals, or Waterfront District and assemble the Rocket Shield."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final EasterEgg ApothiconServant =
            new EasterEgg("Apothicon Servant")

                    .addStep(new EasterEggStep("Collect the Margwa Heart")
                            .addSubStep(new EasterEggStep(
                                    "Kill a Margwa and collect the Margwa Heart that it drops."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "The first defeated Margwa will normally drop the Heart. Later Margwas can drop it if it was not collected."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Collect the Xenomatter")
                            .addSubStep(new EasterEggStep(
                                    "Beginning around Round 13, kill Parasites and Insanity Elementals until one drops the glowing Xenomatter."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Collect the Xenomatter before it disappears."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Collect the Margwa Tentacle")
                            .addSubStep(new EasterEggStep(
                                    "Obtain a Fumigator and use it to open Harvest Pods."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Allow Harvest Pods to mature until they are purple, then open them until a Margwa Tentacle appears."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Take the Margwa Heart, Xenomatter, and Margwa Tentacle to a crafting table in the Footlight, Canals, or Waterfront District."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Assemble and collect the Apothicon Servant."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final EasterEgg ApocalypseAverted =
            new EasterEgg(
                    "Apocalypse Averted",
                    "The Beginning of the End (after Ascending the Apocalypse). Apocalypse Averted: Dark Ops Calling Card, Summoning Key icon on map select, 1000 XP + 6000 XP first-time. Reborn Keeper Swords returned; Civil Protector upgraded for the rest of the match."
            )

                    .addStep(new EasterEggStep("Complete the Four Character Rituals")
                            .addSubStep(new EasterEggStep(
                                    "The complete Apocalypse Averted quest requires four players. Each player will eventually need an upgraded Apothicon Sword."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Enter Beast Mode in the starting area and break the crate containing the Summoning Key."
                                    )
                                            .addImage()
                            )

                            .addSubStep(new EasterEggStep("Nero's Ritual")
                                    .addSubStep(new EasterEggStep(
                                            "Use Beast Mode to shock the crane control outside Easy Street, causing the crate containing the Lawyer's Pen to fall."
                                    ))
                                    .addSubStep(new EasterEggStep(
                                            "Collect the Lawyer's Pen and open the Beast Mode staircase leading to Nero's Workshop."
                                    ))
                                    .addSubStep(new EasterEggStep(
                                            "Place the Pen and Summoning Key on the ritual table and survive until the ritual is complete."
                                    ))
                                    .addImage()
                            )

                            .addSubStep(new EasterEggStep("Floyd's Ritual")
                                    .addSubStep(new EasterEggStep(
                                            "In Beast Mode, grapple onto the Waterfront walkway and knock down the crate containing the Championship Belt."
                                    ))
                                    .addSubStep(new EasterEggStep(
                                            "Collect the Belt, open the Anvil Boxing Gym, and place the Belt and Summoning Key on the ritual table."
                                    ))
                                    .addSubStep(new EasterEggStep(
                                            "Survive until the Boxing Gym ritual is complete."
                                    ))
                                    .addImage()
                            )

                            .addSubStep(new EasterEggStep("Jack's Ritual")
                                    .addSubStep(new EasterEggStep(
                                            "In Beast Mode, break the crate behind the locked grate in the Canals and shock the concealed electrical panel."
                                    ))
                                    .addSubStep(new EasterEggStep(
                                            "Collect the Detective's Badge and open the route into the Ruby Rabbit."
                                    ))
                                    .addSubStep(new EasterEggStep(
                                            "Place the Badge and Summoning Key on the Ruby Rabbit ritual table and complete the ritual."
                                    ))
                                    .addImage()
                            )

                            .addSubStep(new EasterEggStep("Jessica's Ritual")
                                    .addSubStep(new EasterEggStep(
                                            "In Beast Mode, cross the Footlight rooftop and knock down the crate containing the Producer's Toupee."
                                    ))
                                    .addSubStep(new EasterEggStep(
                                            "Collect the Toupee and open the Black Lace Burlesque."
                                    ))
                                    .addSubStep(new EasterEggStep(
                                            "Place the Toupee and Summoning Key on the ritual table and complete the ritual."
                                    ))
                                    .addImage()
                            )

                            .addSubStep(new EasterEggStep(
                                    "Collect the Gateworm that appears after each completed ritual."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "A Margwa will spawn after the second and fourth rituals."
                            ))
                    )

                    .addStep(new EasterEggStep("Ascend the Apocalypse and Unlock Pack-A-Punch")
                            .addSubStep(new EasterEggStep(
                                    "Open and activate the three Rift portals located in the Footlight, Canals, and Waterfront Districts."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Enter the Sacred Place beneath the Rift and place the four Gateworms onto their pedestals."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Placing the first Gateworms will raise wall-running surfaces that allow the remaining pedestals to be reached."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "After placing all four Gateworms, activate the final ritual and survive until it is complete."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "The Shadowman will reveal his true form, the sky will turn red, and the Pack-A-Punch portal will become available."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Obtain the Apothicon Swords")
                            .addSubStep(new EasterEggStep(
                                    "Ride the train and record the three glowing Apothicon symbols visible through red-lit windows."
                            ))
                            .addSubStep(new EasterEggStep("Waterfront Symbol")
                                    .addSubStep(new EasterEggStep(
                                            "When leaving Waterfront, look through the right side of the train shortly after passing the small shack."
                                    ))
                                    .addImage()
                            )
                            .addSubStep(new EasterEggStep("Footlight Symbol")
                                    .addSubStep(new EasterEggStep(
                                            "When leaving Footlight, look through the left side after passing the Peep Show and surrounding storefronts."
                                    ))
                                    .addImage()
                            )
                            .addSubStep(new EasterEggStep("Canals Symbol")
                                    .addSubStep(new EasterEggStep(
                                            "When leaving Canals, look through the left side after passing the Devil-O-Donuts and hotel signs."
                                    ))
                                    .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "In the underground Rift, enter Beast Mode and shock the three matching symbols on the wall beside the GobbleGum machine."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Collect an Apothicon Egg from the revealed sword chamber."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "In Beast Mode, break open the wooden crates containing Apothicon statues in the Underground, Footlight, Canals, and Waterfront areas."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Place the Egg on each statue and kill approximately 12 zombies nearby to charge it."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "After charging the Egg at all four statues, return it to the underground sword chamber and collect the Apothicon Sword."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Every player must complete the Egg process and obtain their own Sword."
                            ))
                    )

                    .addStep(new EasterEggStep("Upgrade the Apothicon Swords")
                            .addSubStep(new EasterEggStep(
                                    "Return to the ritual room associated with your character and interact with the Keeper above the ritual table."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Collect the Arch-Ovum from the Keeper."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "Place the Arch-Ovum on the red ritual circle outside Easy Street and defeat the spawned Margwas."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "Repeat the process at the red circle outside the Black Lace Burlesque."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "Repeat the process at the red circle between the Canals crafting table and the Ruby Rabbit."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "Repeat the process at the red circle in front of the Anvil Boxing Gym."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Only one Arch-Ovum ritual can be completed by each player per round."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "After completing all four circles, return the Sword to your character's Keeper and collect the Reborn Keeper Sword."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Every player must upgrade their own Sword."
                            ))
                    )

                    .addStep(new EasterEggStep("Defend the Apothicon Flag")
                            .addSubStep(new EasterEggStep(
                                            "After every player has an upgraded Sword, interact with the open book on the floor of Nero's Workshop."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "Collect the Apothicon Flag that falls near Widow's Wine in the underground Rift."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Carry the Flag to a glowing purple lightning location and defend it from Insanity Elementals and Parasites."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Shoot the Shadowman whenever he appears near the Flag. If ignored, he will summon additional Parasites."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "After approximately 30 seconds, the Flag will pulse and can be moved to the next location."
                            ))

                            .addSubStep(new EasterEggStep("Junction Defense Locations")
                                    .addSubStep(new EasterEggStep(
                                            "Defend the Flag near the entrance to the Footlight District."
                                    ))
                                    .addSubStep(new EasterEggStep(
                                            "Defend it near the Junction GobbleGum machine and Easy Street entrance."
                                    ))
                                    .addImage()
                            )

                            .addSubStep(new EasterEggStep("Footlight Defense Locations")
                                    .addSubStep(new EasterEggStep(
                                            "Defend the Flag near the Vesper wall-buy at the front of the district."
                                    ))
                                    .addSubStep(new EasterEggStep(
                                            "Defend it near the KN-44 wall-buy in front of the Black Lace Burlesque."
                                    ))
                                    .addImage()
                            )

                            .addSubStep(new EasterEggStep("Waterfront Defense Locations")
                                    .addSubStep(new EasterEggStep(
                                            "Defend the Flag at the entrance to the Waterfront District."
                                    ))
                                    .addSubStep(new EasterEggStep(
                                            "Defend it near the bottom of the stairs leading from the train station."
                                    ))
                                    .addImage()
                            )

                            .addSubStep(new EasterEggStep("Canals Defense Locations")
                                    .addSubStep(new EasterEggStep(
                                            "Defend the Flag at the entrance to the Canals District."
                                    ))
                                    .addSubStep(new EasterEggStep(
                                            "Defend it across the canal from the Ruby Rabbit."
                                    ))
                                    .addImage()
                            )

                            .addSubStep(new EasterEggStep(
                                    "After defending both locations in a district, carry the Flag to that district's ritual table."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "The Keeper spirit will become solid and move to the Pack-A-Punch room."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Only one district can be permanently completed per round. Repeat until all four Keepers have been moved underground."
                            ))
                    )

                    .addStep(new EasterEggStep("Capture the Shadowman")
                            .addSubStep(new EasterEggStep(
                                            "In the Pack-A-Punch room, have every player interact with one of the four Keeper pedestals."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Each player will temporarily surrender their Reborn Keeper Sword."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "The Keepers will fire energy into the Shadowman and remove his shield."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Focus fire on the Shadowman while his shield is disabled, forcing him to teleport toward the ritual table."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "When the Shadowman is floating directly above the ritual table, interact with the table to capture him inside the Summoning Key."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "The Shadowman must be moved and captured quickly. If he recovers, reactivate all four Keepers and repeat the attack."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "In a game with fewer than four players, the quest ends after this step and the final Apocalypse Averted sequence does not begin."
                            ))
                    )

                    .addStep(new EasterEggStep("Avert the Apocalypse")
                            .addSubStep(new EasterEggStep(
                                            "After the Shadowman is captured in a four-player game, a giant Gateworm will appear in the Junction."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "Players will periodically become corrupted. Walk through a glowing white orb before the corruption timer expires."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Kill purple-headed Margwas to reactivate Beast Mode pedestals around the map."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Three players must enter Beast Mode at the Footlight, Canals, and Waterfront train stations."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "The fourth player must remain human and call the train."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "As the train begins moving, shock the electrical box mounted near the ceiling of each train station to electrify all three tracks."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "The train will strike and temporarily remove the giant Gateworm from the Junction."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "While the Gateworm is absent and the tracks are electrified, a player in Beast Mode must shock all three Keepers in the center of the Junction."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "The Keepers will fire a combined beam into the giant Apothicon above Morg City, completing Apocalypse Averted."
                            ))
                    )
            ;


    public static final EasterEgg SnakeskinBoots =
            new EasterEgg("Snakeskin Boots")

                    .addStep(new EasterEggStep("Activate the Ruby Rabbit Radio")
                            .addSubStep(new EasterEggStep(
                                    "Enter the Ruby Rabbit in the Canals District."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Interact with the small wooden radio on the table to the left of the entrance."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Activate the Boxing Gym Radio")
                            .addSubStep(new EasterEggStep(
                                    "Enter the Anvil Boxing Gym in the Waterfront District."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Go upstairs and interact with the wooden radio on the desk."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Activate the Footlight Radio")
                            .addSubStep(new EasterEggStep(
                                    "Go to the Footlight train station."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Interact with the wooden radio on the bench beside the GobbleGum machine."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "After all three radios have been activated, Snakeskin Boots")
                            .addSubStep(new EasterEggStep(
                                    "After all three radios have been activated, Snakeskin Boots will begin playing."
                            )
                    )))
            ;


    public static final EasterEgg ColdHardCash =
            new EasterEgg("Cold Hard Cash")

                    .addStep(new EasterEggStep("Collect the Microphone Stand")
                            .addSubStep(new EasterEggStep(
                                    "Enter Nero's Workshop above Easy Street."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Collect the microphone stand positioned between the large saw and the knife-throwing board."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Collect the Microphone Cable")
                            .addSubStep(new EasterEggStep(
                                    "Go to the Canals District and descend the metal staircase toward the canal."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Collect the cable near the concealed Beast Mode wall used during the Pack-A-Punch ritual process."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Collect the Microphone")
                            .addSubStep(new EasterEggStep(
                                    "Enter the underground Rift and go to the upper walkway near the Waterfront portal."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Collect the microphone positioned between the bench and nearby container."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Activate the Burlesque Microphone")
                            .addSubStep(new EasterEggStep(
                                    "After all three pieces are collected, go to the stage inside the Black Lace Burlesque."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Interact with the completed microphone stand in front of the ritual table."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Cold Hard Cash will begin playing."
                            ))
                    )
            ;


    public static final EasterEgg GoddardApparatus =
            new EasterEgg("Goddard Apparatus")

                    .addStep(new EasterEggStep("Upgrade the Rocket Shield")
                            .addSubStep(new EasterEggStep(
                                    "Build and collect the Rocket Shield."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Gather a group of at least ten zombies."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Use the Rocket Shield boost attack to kill at least ten zombies in a single charge."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "A bowling-strike sound confirms that the charge counted."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Repeat the successful ten-zombie charge 12 times consecutively."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Charging through fewer than ten zombies resets the consecutive-charge counter."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "After the twelfth successful charge, a cheering sound will play and the shield will become the Goddard Apparatus."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "The upgraded shield has increased durability and four rocket charges instead of three."
                            ))
                    )
            ;


    public static final EasterEgg FreeMegaGobbleGum =
            new EasterEgg("Free Mega GobbleGum")

                    .addStep(new EasterEggStep("Obtain Widow's Wine")
                            .addSubStep(new EasterEggStep(
                                            "Open the Pack-A-Punch area and purchase Widow's Wine from the underground perk machine."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Collect the Plain GobbleGum")
                            .addSubStep(new EasterEggStep(
                                    "Open the Beast Mode staircase near the front of the Canals District."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Enter the room containing four lion-head statues."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Throw one Widow's Wine grenade directly into the mouth of each lion."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "After all four lions have been activated, collect the plain white GobbleGum from one of their mouths."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Grow the Mega GobbleGum")
                            .addSubStep(new EasterEggStep(
                                    "Go to the candy or ice-cream shop in the Junction, between Stamin-Up and the Footlight entrance."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Interact with the plate in the shop window to place the plain GobbleGum."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Complete one full round."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Return to the plate and collect the enlarged GobbleGum to receive a free random Mega GobbleGum."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final EasterEgg TripMineUpgrade =
            new EasterEgg("Trip Mine Upgrade")

                    .addStep(new EasterEggStep("Choose a Trip Mine Upgrade Path")
                            .addSubStep(new EasterEggStep(
                                            "Purchase Trip Mines from the wall-buy outside the Anvil Boxing Gym."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Choose either the Holly's Cream Cakes path or the Devil-O-Donuts path. Activating a cart from both groups prevents the upgrade from being completed."
                            ))

                            .addSubStep(new EasterEggStep("Devil-O-Donuts Upgrade Path")
                                    .addSubStep(new EasterEggStep(
                                            "Trigger a Trip Mine explosion beside the Holly's Cream Cakes cart near Stamin-Up in the Junction."
                                    ))
                                    .addSubStep(new EasterEggStep(
                                            "Trigger one beside the Holly's Cream Cakes cart near the Peep Show in the Canals District."
                                    ))
                                    .addSubStep(new EasterEggStep(
                                            "Trigger one beside the Holly's Cream Cakes cart near the upper Footlight perk-machine location."
                                    ))
                                    .addSubStep(new EasterEggStep(
                                            "An evil laugh confirms each successful cart. The upgraded Trip Mines will appear as Devil-O-Donuts."
                                    ))
                                    .addImage()
                            )

                            .addSubStep(new EasterEggStep("Holly's Cream Cakes Upgrade Path")
                                    .addSubStep(new EasterEggStep(
                                            "Trigger a Trip Mine explosion beside the Devil-O-Donuts cart near the Junction GobbleGum machine."
                                    ))
                                    .addSubStep(new EasterEggStep(
                                            "Trigger one beside the Devil-O-Donuts cart near the Canals GobbleGum machine."
                                    ))
                                    .addSubStep(new EasterEggStep(
                                            "Trigger one beside the Devil-O-Donuts cart above the Footlight perk-machine area."
                                    ))
                                    .addSubStep(new EasterEggStep(
                                            "Trigger one beside the Devil-O-Donuts cart near the Waterfront Championship Belt location."
                                    ))
                                    .addSubStep(new EasterEggStep(
                                            "Choir music confirms each successful cart. The upgraded Trip Mines will appear as Holly's Cream Cakes."
                                    ))
                                    .addImage()
                            )

                            .addSubStep(new EasterEggStep(
                                    "The upgraded Trip Mines deal more damage over a larger area."
                            ))
                    )
            ;


    public static final EasterEgg DocksJumpscare =
            new EasterEgg("Docks Jumpscare")

                    .addStep(new EasterEggStep("Activate the Docks Jumpscare")
                            .addSubStep(new EasterEggStep(
                                    "Complete the four rituals and unlock Pack-A-Punch."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Obtain a scoped sniper rifle from the Mystery Box."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Go to the Waterfront District near the Anvil Boxing Gym."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Aim through the sniper scope at the illuminated window on the large ship in the harbor."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Hold the scope on the window until the zombie Richtofen jumpscare appears."
                            ))
                    )
            ;


    public static final EasterEgg NoirMode =
            new EasterEgg("Noir Mode")

                    .addStep(new EasterEggStep("Activate the Noir Filter")
                            .addSubStep(new EasterEggStep(
                                    "Enter the Anvil Boxing Gym and go to the upper floor."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Find the row of framed pictures above the window overlooking the boxing ring."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Crouch beside the front-right corner of the nearby desk."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Hold the reload or interact button while looking at the floor."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "While continuing to hold the button, slowly move the crosshair upward in a straight line toward the framed picture immediately left of the cipher picture."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "The screen will change to a permanent black-and-white noir filter when activated correctly."
                            ))
                    )
            ;


    public static final EasterEgg PictureCipher =
            new EasterEgg("Picture Cipher")

                    .addStep(new EasterEggStep("Reveal the Boxing Gym Cipher")
                            .addSubStep(new EasterEggStep(
                                    "Enter the Anvil Boxing Gym and go to the upper floor."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Locate the line of framed pictures above the window overlooking the boxing ring."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Shoot down the framed picture associated with the cipher."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "The hidden cipher behind the picture decodes to: Although they have discovered the way, Primis will fail."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final EasterEgg SalDeLucaReference =
            new EasterEgg("Sal DeLuca Reference")

                    .addStep(new EasterEggStep("Collect Sal's Laundry Ticket")
                            .addSubStep(new EasterEggStep(
                                    "Purchase the first door leading out of the starting area."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Look through the window of Chang's Laundry and locate the ticket attached to the hanging clothing."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Cook a grenade and throw it through the window so that it explodes beside the ticket."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "If the explosion is positioned correctly, the ticket will land on the box outside the laundry."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Collect the ticket to receive 500 points."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "The ticket belongs to Sal DeLuca from Mob of the Dead."
                            ))
                    )
            ;


    public static final EasterEgg ShadowManRoundSkip =
            new EasterEgg("ShadowMan Round Skip")

                    .addStep(new EasterEggStep("Shoot the Shadowman")
                            .addSubStep(new EasterEggStep(
                                            "At the beginning of Round 1, locate the Shadowman standing on the fire escape above the door leading from Spawn into the Junction."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Immediately begin shooting the Shadowman and do not stop for more than approximately five seconds."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Continue shooting until the game advances to Round 5. Every player will receive 1,000 points."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Continue shooting to advance to Round 10 and receive an additional 3,000 points."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Continue shooting again to advance to Round 15 and receive an additional 7,000 points."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "The maximum total reward is 11,000 points per player."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "If the Shadowman disappears before enough damage is dealt, the round-skip Easter egg cannot be attempted again during that match."
                            ))
                    )
            ;


    public static final List<EasterEgg> SOE_MainQuests = Arrays.asList(
        ApocalypseAverted
    );

    public static final List<EasterEgg> SOE_SideQuests = Arrays.asList(
        SnakeskinBoots,
        ColdHardCash,
        GoddardApparatus,
        FreeMegaGobbleGum,
        TripMineUpgrade,
        DocksJumpscare,
        NoirMode,
        PictureCipher,
        SalDeLucaReference,
        ShadowManRoundSkip
    );

    public static final List<Procedure> SOE_Buildables = Arrays.asList(
        RocketShield,
        ApothiconServant
    );
}
