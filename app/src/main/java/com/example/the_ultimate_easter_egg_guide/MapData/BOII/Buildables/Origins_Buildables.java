package com.example.the_ultimate_easter_egg_guide.MapData.BOII.Buildables;

import com.example.the_ultimate_easter_egg_guide.Models.Maps.Buildable;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.Buildable;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.BuildableStep;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.Procedure;

import java.util.Arrays;
import java.util.List;

public class Origins_Buildables
{

    public static final Buildable ZombieShield =
            new Buildable("Zombie Shield")

                    .addStep(new BuildableStep("Find the Face Screen")
                            .addSubStep(new BuildableStep(
                                            "The Face Screen can appear on the table to the right of the Fire tunnel gateway."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                            "It can appear in the trench room to the right of the Fire tunnel."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                            "It can appear in the trench near Speed Cola, behind the crate along the route toward the Workshop."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Find the Handles")
                            .addSubStep(new BuildableStep(
                                            "The Handles can appear in the trench room along the first route from Spawn toward Generator 2."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                            "They can appear at the far end of the trenches beyond Generator 2 and the Workshop."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                            "They can appear on top of the Tank Station near Generator 2 beside the damaged piping."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Find the Shield Frame")
                            .addSubStep(new BuildableStep(
                                            "The Shield Frame can appear near Generator 4 to the left of the MP40 wall-buy."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                            "It can appear in the mud outside Generator 4 along the route toward the Church."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                            "It can appear inside a Giant Robot footprint near the Excavation Site."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Build the Zombie Shield")
                            .addSubStep(new BuildableStep(
                                    "Take the three parts to a crafting table in the Workshop, Wind tunnel, Lightning tunnel, or lower Church."
                            ))
                            .addSubStep(new BuildableStep(
                                            "The Zombie Shield protects the player from attacks from behind and can be used as a melee weapon when held."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final Buildable MaxisDrone =
            new Buildable("Maxis Drone")

                    .addStep(new BuildableStep("Find Maxis' Brain")
                            .addSubStep(new BuildableStep(
                                            "Find the brain in a jar on the table on the lower floor of the starting room, beside the stairs leading toward Generator 1."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Find the Frame in the Ice Tunnel")
                            .addSubStep(new BuildableStep(
                                            "The frame can appear near the bottom of the Ice tunnel in front of the Crazy Place portal."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Find the Frame on the Tank Path")
                            .addSubStep(new BuildableStep(
                                            "The frame can appear beside the crossbones sign on the Tank's muddy path toward Generator 4."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                            "It can also appear beside the crossbones sign on the muddy Tank path toward Generator 5."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Find the Rotor near Pack-A-Punch")
                            .addSubStep(new BuildableStep(
                                            "The rotor can appear on top of the Excavation Site near Pack-A-Punch."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Find the Rotor inside the Excavation Site")
                            .addSubStep(new BuildableStep(
                                            "The rotor can appear beside the Gramophone table inside the Excavation Site."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                            "It can also appear on a box at the bottom of the Excavation Site scaffolding beside one of the ring-control levers."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Build the Maxis Drone")
                            .addSubStep(new BuildableStep(
                                    "Take the brain, frame, and rotor to a crafting table."
                            ))
                            .addSubStep(new BuildableStep(
                                            "The Maxis Drone can be built in the lower Church, Wind tunnel, Lightning tunnel, or Workshop."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Deploy the Maxis Drone")
                            .addSubStep(new BuildableStep(
                                    "Deploy the Maxis Drone to have it follow the player and fire at nearby zombies."
                            ))
                            .addSubStep(new BuildableStep(
                                            "The drone is also required for several steps of the Little Lost Girl main quest."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final Buildable StaffOfIce =
            new Buildable("Ice Staff")

                    .addStep(new BuildableStep("Find the Blue Record")
                            .addSubStep(new BuildableStep(
                                    "Search the Tank Station near Generator 2 for the blue record."
                            ))
                            .addSubStep(new BuildableStep(
                                            "It can appear on the shelves inside the Tank Station or on the table near its entrances."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Find the First Ice Staff Part")
                            .addSubStep(new BuildableStep(
                                    "During a snow round, use a Shovel on dig sites between Spawn, Generator 2, and Generator 3."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Continue digging until the first Ice Staff part is found."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Find the Second Ice Staff Part")
                            .addSubStep(new BuildableStep(
                                    "During a snow round, dig in the middle section of the map around Generators 4 and 5 and the Excavation Site."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Continue digging until the second part is found."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Find the Third Ice Staff Part")
                            .addSubStep(new BuildableStep(
                                    "During a snow round, use dig sites around Generator 6 and the Church."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Continue digging until the third Ice Staff part is found."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Crystal and Build the Staff")
                            .addSubStep(new BuildableStep(
                                    "Place the Gramophone inside the Ice tunnel near Generator 6 and the Church while carrying the blue record."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Enter the Crazy Place and collect the blue Ice crystal from its pedestal."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                            "Open the Staff Room using the Gramophone and build the Ice Staff on the blue pedestal."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final Buildable StaffOfIce_Upgrade =
            new Buildable("Ice Staff Upgrade")

                    .addStep(new BuildableStep("Solve the Ice Puzzle")
                            .addSubStep(new BuildableStep(
                                    "Take the Ice Staff into the Ice section of the Crazy Place."
                            ))
                            .addSubStep(new BuildableStep(
                                    "Read the dot pattern displayed on the blue wall panel."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Use the Ice Staff to shoot the floating stone symbol that corresponds to the displayed pattern."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                    "Repeat until all six floating stones have been turned."
                            ))
                    )

                    .addStep(new BuildableStep("Freeze and Destroy the Tombstones")
                            .addSubStep(new BuildableStep(
                                            "Freeze the tombstone beside the MP40 near Generator 4 using the Ice Staff, then destroy it using a bullet weapon."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                            "Freeze and destroy the tombstone between the Excavation Site and the nearby Giant Robot footprint."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                            "Freeze and destroy the tombstone on the hill behind the Tank Station near Generator 2."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Align the Excavation Rings")
                            .addSubStep(new BuildableStep(
                                            "Use the four levers beneath the Excavation Site to turn every ring until all ring lights are blue."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                    "Shoot the blue orb beneath the aligned rings with the Ice Staff."
                            ))
                    )

                    .addStep(new BuildableStep("Charge the Ice Staff")
                            .addSubStep(new BuildableStep(
                                    "Place the Ice Staff into the blue pedestal in the Crazy Place."
                            ))
                            .addSubStep(new BuildableStep(
                                    "Kill approximately 20 zombies near the pedestal to charge the staff."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Collect Ull's Arrow from the pedestal after the upgrade is complete."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final Buildable StaffOfLightning =
            new Buildable("Lightning Staff")

                    .addStep(new BuildableStep("Find the Purple Record")
                            .addSubStep(new BuildableStep(
                                    "Search near Generator 4 for the purple record."
                            ))
                            .addSubStep(new BuildableStep(
                                            "It can appear inside the Wind tunnel, on the wagon beside the tunnel, or on the table near Der Wunderfizz."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Three Lightning Staff Parts")
                            .addSubStep(new BuildableStep(
                                            "Ride the Tank from the Church toward Generator 2 and jump onto the wooden platform on the right before the Generator 2 trench."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                            "Ride the Tank from Generator 2 toward the Church and jump onto the scaffolding connected to the Excavation Site."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                            "On the same return trip, jump onto the raised dirt path leading to the upper level of the Church."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Lightning Crystal")
                            .addSubStep(new BuildableStep(
                                    "Place the Gramophone in the Lightning tunnel near Generator 5 while carrying the purple record."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Enter the Crazy Place and collect the purple Lightning crystal."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Build the Lightning Staff")
                            .addSubStep(new BuildableStep(
                                    "Open the lower Staff Room using the Gramophone."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Place the three parts and crystal onto the purple pedestal to build the Lightning Staff."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final Buildable StaffOfLightning_Upgrade =
            new Buildable("Lightning Staff Upgrade")

                    .addStep(new BuildableStep("Play the Lightning Chords")
                            .addSubStep(new BuildableStep(
                                    "Enter the Lightning section of the Crazy Place."
                            ))
                            .addSubStep(new BuildableStep(
                                    "Number the seven lower purple keyboard symbols from left to right."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Shoot the symbols in the combinations 1-3-6, 3-5-7, and 2-4-6."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Set the Electrical Panels")
                            .addSubStep(new BuildableStep(
                                    "Turn the Generator 5 panel until its dial points down."
                            ))
                            .addSubStep(new BuildableStep(
                                    "Turn the lower Church panel beside torch 3 until it points right."
                            ))
                            .addSubStep(new BuildableStep(
                                    "Turn the upper Church panel until it points up."
                            ))
                            .addSubStep(new BuildableStep(
                                    "Turn the panel beside the Wind tunnel until it points up."
                            ))
                            .addSubStep(new BuildableStep(
                                    "Turn the Spawn panel until it points left."
                            ))
                            .addSubStep(new BuildableStep(
                                    "Turn the Tank Station panel until it points down."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Turn the panel behind the Excavation Site until it points up."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Align the Excavation Rings")
                            .addSubStep(new BuildableStep(
                                    "Turn the Excavation Site rings until all four lights are purple."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Shoot the purple orb beneath the rings with the Lightning Staff."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Charge the Lightning Staff")
                            .addSubStep(new BuildableStep(
                                    "Place the Lightning Staff into the purple Crazy Place pedestal."
                            ))
                            .addSubStep(new BuildableStep(
                                    "Kill approximately 20 to 25 zombies near the pedestal."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Collect Kimat's Bite after the staff has finished charging."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final Buildable StaffOfFire =
            new Buildable("Fire Staff")

                    .addStep(new BuildableStep("Collect the Three Fire Staff Parts")
                            .addSubStep(new BuildableStep(
                                            "Activate Generator 6 and collect the Fire Staff part from the nearby Rituals of the Ancients reward chest."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                            "After opening the Church route, shoot down the glowing orange airplane and collect the part that falls near the Excavation Site."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                            "Kill the first Panzer Soldat, normally appearing on Round 8, and collect the Fire Staff part it drops."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Find the Red Record")
                            .addSubStep(new BuildableStep(
                                            "Search around Generator 3 and the Fire tunnel for the red record."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Fire Crystal")
                            .addSubStep(new BuildableStep(
                                    "Place the Gramophone inside the Fire tunnel between Spawn and Generator 3 while carrying the red record."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Enter the Crazy Place and collect the red Fire crystal."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Build the Fire Staff")
                            .addSubStep(new BuildableStep(
                                    "Open the Staff Room beneath the Excavation Site using the Gramophone."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Build the Fire Staff on the red pedestal."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final Buildable StaffOfFire_Upgrade =
            new Buildable("Fire Staff Upgrade")

                    .addStep(new BuildableStep("Fill the Fire Cauldrons")
                            .addSubStep(new BuildableStep(
                                    "Take the Fire Staff to the Fire section of the Crazy Place."
                            ))
                            .addSubStep(new BuildableStep(
                                    "Kill approximately 30 zombies while standing on or near the metal fire grates."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Continue until all four nearby cauldrons are burning."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Solve the Church Torch Puzzle")
                            .addSubStep(new BuildableStep(
                                            "Inspect the four illuminated ternary symbols on the upper floor of the Church."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                    "Convert the symbols into numbers and use the Fire Staff to ignite the matching numbered torches in the Church basement."
                            ))
                            .addSubStep(new BuildableStep(
                                    "The bloodstain represents the number 4."
                            ))
                    )

                    .addStep(new BuildableStep("Align the Excavation Rings")
                            .addSubStep(new BuildableStep(
                                    "Turn the Excavation Site rings until all four lights are red."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Shoot the red orb beneath the rings with the Fire Staff."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Charge the Fire Staff")
                            .addSubStep(new BuildableStep(
                                    "Place the Fire Staff into the red pedestal in the Crazy Place."
                            ))
                            .addSubStep(new BuildableStep(
                                    "Kill approximately 20 zombies near the pedestal."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Collect Kagutsuchi's Blood after the upgrade is complete."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final Buildable StaffOfWind =
            new Buildable("Wind Staff")

                    .addStep(new BuildableStep("Collect the Three Wind Staff Parts")
                            .addSubStep(new BuildableStep(
                                            "Shoot the illuminated foot of Thor, the robot that patrols Generators 2 and 3, and enter its head to collect one part."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                            "Enter Odin, the robot that patrols the Excavation Site, and collect its Wind Staff part."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                            "Enter Freya, the robot that patrols the Church, and collect the final Wind Staff part."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Find the Yellow Record")
                            .addSubStep(new BuildableStep(
                                    "Search near Generator 5 and Stamin-Up for the yellow record."
                            ))
                            .addSubStep(new BuildableStep(
                                            "It can appear on the damaged wall, on boxes near the Lightning tunnel, or on the table inside the tunnel entrance."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Wind Crystal")
                            .addSubStep(new BuildableStep(
                                    "Place the Gramophone inside the Wind tunnel near Generator 4 while carrying the yellow record."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Enter the Crazy Place and collect the yellow Wind crystal."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Build the Wind Staff")
                            .addSubStep(new BuildableStep(
                                    "Open the lower Staff Room using the Gramophone."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Build the Wind Staff on the yellow pedestal."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final Buildable StaffOfWind_Upgrade =
            new Buildable("Wind Staff Upgrade")

                    .addStep(new BuildableStep("Solve the Wind Puzzle")
                            .addSubStep(new BuildableStep(
                                    "Enter the Wind section of the Crazy Place."
                            ))
                            .addSubStep(new BuildableStep(
                                    "Shoot the four rotating symbol rings above the portal with the Wind Staff."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Align the symbols on the rings with the matching symbols displayed on the nearby pillars."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Redirect the Smoke")
                            .addSubStep(new BuildableStep(
                                            "Shoot the smoking stone near Generator 4 so its smoke points toward the Excavation Site."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                            "Shoot the smoking stone along the Church Tank path so its smoke points toward the Excavation Site."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                            "Shoot the smoking stone near Generator 5 and Stamin-Up so its smoke points toward the Excavation Site."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Align the Excavation Rings")
                            .addSubStep(new BuildableStep(
                                    "Turn the rings beneath the Excavation Site until all four lights are yellow."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Shoot the yellow orb beneath the rings with the Wind Staff."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Charge the Wind Staff")
                            .addSubStep(new BuildableStep(
                                    "Place the Wind Staff into the yellow pedestal in the Crazy Place."
                            ))
                            .addSubStep(new BuildableStep(
                                    "Kill approximately 20 zombies near the pedestal."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Collect Boreas' Fury after the staff has finished charging."
                                    )
                                            .addImage()
                            )
                    )
            ;

    public static final List<Buildable> Origins_Buildables = Arrays.asList(
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
