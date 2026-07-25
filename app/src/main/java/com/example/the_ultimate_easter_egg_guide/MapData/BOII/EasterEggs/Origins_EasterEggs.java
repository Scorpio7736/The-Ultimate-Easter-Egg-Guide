package com.example.the_ultimate_easter_egg_guide.MapData.BOII.EasterEggs;

import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEgg;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEggStep;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.Procedure;

import java.util.Arrays;
import java.util.List;

public class Origins_EasterEggs
{
    public static final EasterEgg LittleLostGirl =
            new EasterEgg(
                    "Little Lost Girl",
                    "Unlocks the Little Lost Girl achievement and allows the players to free Samantha."
            )

                    .addStep(new EasterEggStep("Secure the Keys")
                            .addSubStep(new EasterEggStep(
                                            "Build and upgrade the Staff of Ice, Staff of Lightning, Staff of Fire, and Staff of Wind."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "All six generators must have been active at the same time at least once after the four staffs have been built."
                            ))
                    )

                    .addStep(new EasterEggStep("Ascend from Darkness")
                            .addSubStep(new EasterEggStep(
                                            "Place Ull's Arrow, the upgraded Ice Staff, inside Freya, the Giant Robot that patrols the Church."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "Place Boreas' Fury, the upgraded Wind Staff, inside Odin, the Giant Robot that patrols the Excavation Site."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "Place Kimat's Bite, the upgraded Lightning Staff, inside Thor, the Giant Robot that patrols Generators 2 and 3."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "Place Kagutsuchi's Blood, the upgraded Fire Staff, into the new center pedestal in the Staff Room beneath the Excavation Site."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "After all four staffs have been placed correctly, they will return to their original pedestals in the Staff Room."
                            ))
                    )

                    .addStep(new EasterEggStep("Rain Fire")
                            .addSubStep(new EasterEggStep(
                                    "At least one player must have G-Strike Beacons."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "After the staffs have been placed, all three Giant Robots will begin walking through the map simultaneously."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Enter the Giant Robot with the illuminated foot and press the newly exposed red button inside its head."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "Immediately after the button is pressed, throw a G-Strike Beacon onto the circular stone seal outside the map behind and to the right of Generator 5."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "The Giant Robots will fire an artillery strike and break open the stone seal."
                            ))
                    )

                    .addStep(new EasterEggStep("Unleash the Horde")
                            .addSubStep(new EasterEggStep(
                                            "Deploy the Maxis Drone beside the newly opened hole near Generator 5."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "The Maxis Drone will enter the hole and a group of Panzer Soldats will emerge."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Kill all ten Panzer Soldats to complete the step. Upgraded staffs, G-Strikes, and the Ray Gun Mark II are recommended."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Skewer the Winged Beast")
                            .addSubStep(new EasterEggStep(
                                    "Obtain a Zombie Blood power-up."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "While Zombie Blood is active, locate the glowing yellow airplane flying above the Excavation Site and shoot it down."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "An invisible zombie pilot will begin running clockwise around the Excavation Site. The pilot can only be seen while Zombie Blood is active."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Run counterclockwise around the Excavation Site, locate the pilot, and kill him before Zombie Blood expires."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Collect the upgraded Maxis Drone dropped by the zombie pilot."
                            ))
                    )

                    .addStep(new EasterEggStep("Wield a Fist of Iron")
                            .addSubStep(new EasterEggStep(
                                            "Every player must obtain the One Inch Punch by filling all four Rituals of the Ancients soul chests."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Go to the lower levels of the Excavation Site and melee Crusader Zombies whose arms are glowing white."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Each player must hit approximately 20 glowing-arm Crusader Zombies using the One Inch Punch."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "After enough zombies have been struck, a glowing stone tablet will drop for that player."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Collect the tablet to receive the upgraded Iron Fist. Every player must complete this step."
                            ))
                    )

                    .addStep(new EasterEggStep("Raise Hell")
                            .addSubStep(new EasterEggStep(
                                    "Take all four upgraded staffs into the Crazy Place."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Place each staff onto its corresponding elemental pedestal."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Kill approximately 100 Templar Zombies inside the Crazy Place."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "The zombie souls will travel into the center of the Crazy Place and open a large vortex in the ceiling."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Completing this step unlocks the Little Lost Girl achievement."
                            ))
                    )

                    .addStep(new EasterEggStep("Freedom")
                            .addSubStep(new EasterEggStep(
                                            "Deploy the Maxis Drone in the center of the Crazy Place beneath the open vortex."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "The Maxis Drone will fly into the portal to reach Samantha."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Interact with the blue stone in the center of the Crazy Place to access the teleporter."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Using the teleporter ends the game and plays the Origins ending cutscene."
                            ))
                    )
            ;


    public static final EasterEgg Archangel =
            new EasterEgg("Archangel - Song")

                    .addStep(new EasterEggStep("Activate Element 115 Fragment 1")
                            .addSubStep(new EasterEggStep(
                                    "In the starting room, locate the green Element 115 fragment in the corner to the right of the Rituals of the Ancients reward chest."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Hold interact on the fragment."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Activate Element 115 Fragment 2")
                            .addSubStep(new EasterEggStep(
                                    "Enter the Workshop bunker between the starting area and No Man's Land."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Find the green Element 115 fragment underneath the bunk bed opposite the entrance to No Man's Land."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Activate Element 115 Fragment 3")
                            .addSubStep(new EasterEggStep(
                                    "Go to the wooden walkway near the main entrance to the Excavation Site."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Find the fragment behind the boxes on the walkway and hold interact."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "After all three fragments have been activated, \"Archangel\" will begin playing."
                            ))
                    )
            ;


    public static final EasterEgg ShepherdOfFire =
            new EasterEgg("Shepherd of Fire - Song")

                    .addStep(new EasterEggStep("Activate Red Radio 1")
                            .addSubStep(new EasterEggStep(
                                    "Open the lower Excavation Site and locate the red radio on a wooden scaffolding above the possible Maxis Drone rotor location."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Hold interact on the radio for several seconds."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Activate Red Radio 2")
                            .addSubStep(new EasterEggStep(
                                    "Enter Freya, the Giant Robot that patrols the Church."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Activate the red radio positioned opposite the audio recording inside the robot's head."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Activate Red Radio 3")
                            .addSubStep(new EasterEggStep(
                                    "Enter the Crazy Place and travel to the area between the Fire and Lightning sections."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Activate the red radio near the edge of the Fire section."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "After all three radios have been activated, \"Shepherd of Fire\" by Avenged Sevenfold will begin playing."
                            ))
                    )
            ;


    public static final EasterEgg Aether =
            new EasterEgg("Aether - Song")

                    .addStep(new EasterEggStep("Activate the Generator 1 Panels")
                            .addSubStep(new EasterEggStep(
                                    "Go prone beside the two floor panels marked with the number 1 near Generator 1."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "While prone, hold interact on both number 1 panels."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Activate the Generator 5 Panel")
                            .addSubStep(new EasterEggStep(
                                    "Go prone beside the floor panel marked with the number 5 near Generator 5."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Hold interact on the number 5 panel. After all three panels have been activated, \"Aether\" will begin playing."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final EasterEgg RememberForever =
            new EasterEgg("Remember Forever - Song")

                    .addStep(new EasterEggStep("Activate the Staff Symbols")
                            .addSubStep(new EasterEggStep(
                                    "This Easter egg is available in the Black Ops III Zombies Chronicles version of Origins."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Build all four Elemental Staffs."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "In the Excavation Site, look above the Staff Room toward the circular stone structure containing four square symbols."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Shoot each square with its corresponding Elemental Staff until all four symbols have been activated."
                            ))
                    )

                    .addStep(new EasterEggStep("Release Samantha's Dolls")
                            .addSubStep(new EasterEggStep(
                                            "Enter the Crazy Place and locate the Samantha doll on the inner blue Element 115 circle."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Interact with the doll to make several additional Samantha dolls appear."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Shoot the dolls using a normal bullet weapon."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Do not shoot the final doll that begins floating upward into Agartha."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "After the final doll disappears into the portal, a Max Ammo will appear and \"Remember Forever\" will begin playing."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final EasterEgg ChurchJumpscare =
            new EasterEgg("Church Jumpscare")

                    .addStep(new EasterEggStep("Activate the Church Jumpscare")
                            .addSubStep(new EasterEggStep(
                                    "Obtain a scoped sniper rifle."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Climb to the top of the Excavation Site."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Aim through the sniper scope at the burning upper window or flame near the top of the Church tower."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Hold the scope on the burning window until a scream is heard and the jumpscare appears inside the scope."
                            ))
                    )
            ;


    public static final EasterEgg CiphersAndScrapPaper =
            new EasterEgg("Ciphers & Scrap Paper")

                    .addStep(new EasterEggStep("Cipher 1")
                            .addSubStep(new EasterEggStep(
                                    "Go to the bottom floor of the Workshop bunker between the starting area and No Man's Land."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Shoot the map hanging on the wall beside the workbench."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "The map will fall and reveal the first cipher inside the opening behind it. Use a scoped weapon to read it."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Cipher 2")
                            .addSubStep(new EasterEggStep(
                                    "Enter Thor, the Giant Robot that patrols Generators 2 and 3."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Locate the cipher inside the robot's head and use a scoped weapon to inspect it."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Cipher 3")
                            .addSubStep(new EasterEggStep(
                                    "Ride the Tank and jump onto the inaccessible platform near the Church."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Use a scoped weapon to inspect the cipher positioned in the Tank-only area."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Cipher 4")
                            .addSubStep(new EasterEggStep(
                                    "Open the lower Excavation Site and enter the catacombs above the Staff Room."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Locate the fourth cipher on the wall and use a scoped weapon to read it."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Cipher 5")
                            .addSubStep(new EasterEggStep(
                                    "Upgrade the Elemental Staffs and begin the Ascend from Darkness step of Little Lost Girl."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Place the upgraded Fire Staff into the fifth pedestal in the center of the Staff Room."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Observe the colored panels above the Staff Room. Their white, red, and occasional green lights transmit a Morse-code cipher."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Scrap Paper")
                            .addSubStep(new EasterEggStep(
                                    "Locate the pieces of scrap paper hidden around Origins."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "When the pieces are viewed together, they form an illustration of Primis during the Great War."
                                    )
                                            .addImage()
                            )
                    )
            ;





    public static final EasterEgg GStrikes = new EasterEgg("G-Strikes");

    public static final List<EasterEgg> Origins_MainQuests = Arrays.asList(
        LittleLostGirl
    );
    public static final List<EasterEgg> Origins_SideQuests = Arrays.asList(
        Archangel,
        ShepherdOfFire,
        Aether,
        RememberForever,
        ChurchJumpscare,
        CiphersAndScrapPaper,
        GStrikes
    );


}
