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


    public static final EasterEgg ZombieShield =
            new EasterEgg("Zombie Shield")

                    .addStep(new EasterEggStep("Find the Face Screen")
                            .addSubStep(new EasterEggStep(
                                            "The Face Screen can appear on the table to the right of the Fire tunnel gateway."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "It can appear in the trench room to the right of the Fire tunnel."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "It can appear in the trench near Speed Cola, behind the crate along the route toward the Workshop."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Find the Handles")
                            .addSubStep(new EasterEggStep(
                                            "The Handles can appear in the trench room along the first route from Spawn toward Generator 2."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "They can appear at the far end of the trenches beyond Generator 2 and the Workshop."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "They can appear on top of the Tank Station near Generator 2 beside the damaged piping."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Find the Shield Frame")
                            .addSubStep(new EasterEggStep(
                                            "The Shield Frame can appear near Generator 4 to the left of the MP40 wall-buy."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "It can appear in the mud outside Generator 4 along the route toward the Church."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "It can appear inside a Giant Robot footprint near the Excavation Site."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Build the Zombie Shield")
                            .addSubStep(new EasterEggStep(
                                    "Take the three parts to a crafting table in the Workshop, Wind tunnel, Lightning tunnel, or lower Church."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "The Zombie Shield protects the player from attacks from behind and can be used as a melee weapon when held."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final EasterEgg MaxisDrone =
            new EasterEgg("Maxis Drone")

                    .addStep(new EasterEggStep("Find Maxis' Brain")
                            .addSubStep(new EasterEggStep(
                                            "Find the brain in a jar on the table on the lower floor of the starting room, beside the stairs leading toward Generator 1."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Find the Frame in the Ice Tunnel")
                            .addSubStep(new EasterEggStep(
                                            "The frame can appear near the bottom of the Ice tunnel in front of the Crazy Place portal."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Find the Frame on the Tank Path")
                            .addSubStep(new EasterEggStep(
                                            "The frame can appear beside the crossbones sign on the Tank's muddy path toward Generator 4."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "It can also appear beside the crossbones sign on the muddy Tank path toward Generator 5."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Find the Rotor near Pack-A-Punch")
                            .addSubStep(new EasterEggStep(
                                            "The rotor can appear on top of the Excavation Site near Pack-A-Punch."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Find the Rotor inside the Excavation Site")
                            .addSubStep(new EasterEggStep(
                                            "The rotor can appear beside the Gramophone table inside the Excavation Site."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "It can also appear on a box at the bottom of the Excavation Site scaffolding beside one of the ring-control levers."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Build the Maxis Drone")
                            .addSubStep(new EasterEggStep(
                                    "Take the brain, frame, and rotor to a crafting table."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "The Maxis Drone can be built in the lower Church, Wind tunnel, Lightning tunnel, or Workshop."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Deploy the Maxis Drone")
                            .addSubStep(new EasterEggStep(
                                    "Deploy the Maxis Drone to have it follow the player and fire at nearby zombies."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "The drone is also required for several steps of the Little Lost Girl main quest."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final EasterEgg StaffOfIce =
            new EasterEgg("Ice Staff")

                    .addStep(new EasterEggStep("Find the Blue Record")
                            .addSubStep(new EasterEggStep(
                                    "Search the Tank Station near Generator 2 for the blue record."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "It can appear on the shelves inside the Tank Station or on the table near its entrances."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Find the First Ice Staff Part")
                            .addSubStep(new EasterEggStep(
                                    "During a snow round, use a Shovel on dig sites between Spawn, Generator 2, and Generator 3."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Continue digging until the first Ice Staff part is found."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Find the Second Ice Staff Part")
                            .addSubStep(new EasterEggStep(
                                    "During a snow round, dig in the middle section of the map around Generators 4 and 5 and the Excavation Site."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Continue digging until the second part is found."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Find the Third Ice Staff Part")
                            .addSubStep(new EasterEggStep(
                                    "During a snow round, use dig sites around Generator 6 and the Church."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Continue digging until the third Ice Staff part is found."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Collect the Crystal and Build the Staff")
                            .addSubStep(new EasterEggStep(
                                    "Place the Gramophone inside the Ice tunnel near Generator 6 and the Church while carrying the blue record."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Enter the Crazy Place and collect the blue Ice crystal from its pedestal."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "Open the Staff Room using the Gramophone and build the Ice Staff on the blue pedestal."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final EasterEgg StaffOfIce_Upgrade =
            new EasterEgg("Ice Staff Upgrade")

                    .addStep(new EasterEggStep("Solve the Ice Puzzle")
                            .addSubStep(new EasterEggStep(
                                    "Take the Ice Staff into the Ice section of the Crazy Place."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Read the dot pattern displayed on the blue wall panel."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Use the Ice Staff to shoot the floating stone symbol that corresponds to the displayed pattern."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Repeat until all six floating stones have been turned."
                            ))
                    )

                    .addStep(new EasterEggStep("Freeze and Destroy the Tombstones")
                            .addSubStep(new EasterEggStep(
                                            "Freeze the tombstone beside the MP40 near Generator 4 using the Ice Staff, then destroy it using a bullet weapon."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "Freeze and destroy the tombstone between the Excavation Site and the nearby Giant Robot footprint."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "Freeze and destroy the tombstone on the hill behind the Tank Station near Generator 2."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Align the Excavation Rings")
                            .addSubStep(new EasterEggStep(
                                            "Use the four levers beneath the Excavation Site to turn every ring until all ring lights are blue."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Shoot the blue orb beneath the aligned rings with the Ice Staff."
                            ))
                    )

                    .addStep(new EasterEggStep("Charge the Ice Staff")
                            .addSubStep(new EasterEggStep(
                                    "Place the Ice Staff into the blue pedestal in the Crazy Place."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Kill approximately 20 zombies near the pedestal to charge the staff."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Collect Ull's Arrow from the pedestal after the upgrade is complete."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final EasterEgg StaffOfLightning =
            new EasterEgg("Lightning Staff")

                    .addStep(new EasterEggStep("Find the Purple Record")
                            .addSubStep(new EasterEggStep(
                                    "Search near Generator 4 for the purple record."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "It can appear inside the Wind tunnel, on the wagon beside the tunnel, or on the table near Der Wunderfizz."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Collect the Three Lightning Staff Parts")
                            .addSubStep(new EasterEggStep(
                                            "Ride the Tank from the Church toward Generator 2 and jump onto the wooden platform on the right before the Generator 2 trench."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "Ride the Tank from Generator 2 toward the Church and jump onto the scaffolding connected to the Excavation Site."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "On the same return trip, jump onto the raised dirt path leading to the upper level of the Church."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Collect the Lightning Crystal")
                            .addSubStep(new EasterEggStep(
                                    "Place the Gramophone in the Lightning tunnel near Generator 5 while carrying the purple record."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Enter the Crazy Place and collect the purple Lightning crystal."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Build the Lightning Staff")
                            .addSubStep(new EasterEggStep(
                                    "Open the lower Staff Room using the Gramophone."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Place the three parts and crystal onto the purple pedestal to build the Lightning Staff."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final EasterEgg StaffOfLightning_Upgrade =
            new EasterEgg("Lightning Staff Upgrade")

                    .addStep(new EasterEggStep("Play the Lightning Chords")
                            .addSubStep(new EasterEggStep(
                                    "Enter the Lightning section of the Crazy Place."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Number the seven lower purple keyboard symbols from left to right."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Shoot the symbols in the combinations 1-3-6, 3-5-7, and 2-4-6."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Set the Electrical Panels")
                            .addSubStep(new EasterEggStep(
                                    "Turn the Generator 5 panel until its dial points down."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Turn the lower Church panel beside torch 3 until it points right."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Turn the upper Church panel until it points up."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Turn the panel beside the Wind tunnel until it points up."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Turn the Spawn panel until it points left."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Turn the Tank Station panel until it points down."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Turn the panel behind the Excavation Site until it points up."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Align the Excavation Rings")
                            .addSubStep(new EasterEggStep(
                                    "Turn the Excavation Site rings until all four lights are purple."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Shoot the purple orb beneath the rings with the Lightning Staff."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Charge the Lightning Staff")
                            .addSubStep(new EasterEggStep(
                                    "Place the Lightning Staff into the purple Crazy Place pedestal."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Kill approximately 20 to 25 zombies near the pedestal."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Collect Kimat's Bite after the staff has finished charging."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final EasterEgg StaffOfFire =
            new EasterEgg("Fire Staff")

                    .addStep(new EasterEggStep("Collect the Three Fire Staff Parts")
                            .addSubStep(new EasterEggStep(
                                            "Activate Generator 6 and collect the Fire Staff part from the nearby Rituals of the Ancients reward chest."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "After opening the Church route, shoot down the glowing orange airplane and collect the part that falls near the Excavation Site."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "Kill the first Panzer Soldat, normally appearing on Round 8, and collect the Fire Staff part it drops."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Find the Red Record")
                            .addSubStep(new EasterEggStep(
                                            "Search around Generator 3 and the Fire tunnel for the red record."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Collect the Fire Crystal")
                            .addSubStep(new EasterEggStep(
                                    "Place the Gramophone inside the Fire tunnel between Spawn and Generator 3 while carrying the red record."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Enter the Crazy Place and collect the red Fire crystal."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Build the Fire Staff")
                            .addSubStep(new EasterEggStep(
                                    "Open the Staff Room beneath the Excavation Site using the Gramophone."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Build the Fire Staff on the red pedestal."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final EasterEgg StaffOfFire_Upgrade =
            new EasterEgg("Fire Staff Upgrade")

                    .addStep(new EasterEggStep("Fill the Fire Cauldrons")
                            .addSubStep(new EasterEggStep(
                                    "Take the Fire Staff to the Fire section of the Crazy Place."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Kill approximately 30 zombies while standing on or near the metal fire grates."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Continue until all four nearby cauldrons are burning."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Solve the Church Torch Puzzle")
                            .addSubStep(new EasterEggStep(
                                            "Inspect the four illuminated ternary symbols on the upper floor of the Church."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Convert the symbols into numbers and use the Fire Staff to ignite the matching numbered torches in the Church basement."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "The bloodstain represents the number 4."
                            ))
                    )

                    .addStep(new EasterEggStep("Align the Excavation Rings")
                            .addSubStep(new EasterEggStep(
                                    "Turn the Excavation Site rings until all four lights are red."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Shoot the red orb beneath the rings with the Fire Staff."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Charge the Fire Staff")
                            .addSubStep(new EasterEggStep(
                                    "Place the Fire Staff into the red pedestal in the Crazy Place."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Kill approximately 20 zombies near the pedestal."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Collect Kagutsuchi's Blood after the upgrade is complete."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final EasterEgg StaffOfWind =
            new EasterEgg("Wind Staff")

                    .addStep(new EasterEggStep("Collect the Three Wind Staff Parts")
                            .addSubStep(new EasterEggStep(
                                            "Shoot the illuminated foot of Thor, the robot that patrols Generators 2 and 3, and enter its head to collect one part."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "Enter Odin, the robot that patrols the Excavation Site, and collect its Wind Staff part."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "Enter Freya, the robot that patrols the Church, and collect the final Wind Staff part."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Find the Yellow Record")
                            .addSubStep(new EasterEggStep(
                                    "Search near Generator 5 and Stamin-Up for the yellow record."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "It can appear on the damaged wall, on boxes near the Lightning tunnel, or on the table inside the tunnel entrance."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Collect the Wind Crystal")
                            .addSubStep(new EasterEggStep(
                                    "Place the Gramophone inside the Wind tunnel near Generator 4 while carrying the yellow record."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Enter the Crazy Place and collect the yellow Wind crystal."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Build the Wind Staff")
                            .addSubStep(new EasterEggStep(
                                    "Open the lower Staff Room using the Gramophone."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Build the Wind Staff on the yellow pedestal."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final EasterEgg StaffOfWind_Upgrade =
            new EasterEgg("Wind Staff Upgrade")

                    .addStep(new EasterEggStep("Solve the Wind Puzzle")
                            .addSubStep(new EasterEggStep(
                                    "Enter the Wind section of the Crazy Place."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Shoot the four rotating symbol rings above the portal with the Wind Staff."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Align the symbols on the rings with the matching symbols displayed on the nearby pillars."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Redirect the Smoke")
                            .addSubStep(new EasterEggStep(
                                            "Shoot the smoking stone near Generator 4 so its smoke points toward the Excavation Site."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "Shoot the smoking stone along the Church Tank path so its smoke points toward the Excavation Site."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "Shoot the smoking stone near Generator 5 and Stamin-Up so its smoke points toward the Excavation Site."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Align the Excavation Rings")
                            .addSubStep(new EasterEggStep(
                                    "Turn the rings beneath the Excavation Site until all four lights are yellow."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Shoot the yellow orb beneath the rings with the Wind Staff."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Charge the Wind Staff")
                            .addSubStep(new EasterEggStep(
                                    "Place the Wind Staff into the yellow pedestal in the Crazy Place."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Kill approximately 20 zombies near the pedestal."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Collect Boreas' Fury after the staff has finished charging."
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

    public static final List<Procedure> Origins_Buildables = Arrays.asList(
        ZombieShield,
        MaxisDrone,
        StaffOfIce,
        StaffOfIce_Upgrade,
        StaffOfLightning,
        StaffOfLightning_Upgrade,
        StaffOfFire,
        StaffOfFire_Upgrade,
        StaffOfWind,
        StaffOfWind_Upgrade
    );
}
