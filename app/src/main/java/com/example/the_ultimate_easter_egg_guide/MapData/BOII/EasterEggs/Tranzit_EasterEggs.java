package com.example.the_ultimate_easter_egg_guide.MapData.BOII.EasterEggs;

import com.example.the_ultimate_easter_egg_guide.Models.Maps.Buildable;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.BuildableStep;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEgg;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEggStep;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.Procedure;

import java.util.Arrays;
import java.util.List;

public class Tranzit_EasterEggs
{
    public static final EasterEgg TowerOfBabble_Maxis =
            new EasterEgg(
                    "Tower of Babble - Dr.Maxis",
                    "Unlocks the Tower of Babble achievement and completes the Maxis path for TranZit."
            )

                    .addStep(new EasterEggStep("Enter the Power Station")
                            .addSubStep(new EasterEggStep(
                                    "Travel to the Power Station, located between the Farm and Town."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Open the door to the small outhouse and jump through the opening into the underground Power Lab."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Build and Activate the Power Switch")
                            .addSubStep(new EasterEggStep(
                                            "Locate the severed arm, power lever, and electrical panel inside the Power Lab."
                                    )
                                            .addImage()
                                            .addImage()
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Place all three parts onto the workbench and assemble the Power Switch."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Activate the completed switch and wait for Maxis to finish speaking."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Build Two Turbines")
                            .addSubStep(new EasterEggStep(
                                    "At least two players must build and carry a Turbine."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "The mannequin, fan, and model-plane tail required for the Turbine are located inside the Bus Depot starting room."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Turn Off the Power")
                            .addSubStep(new EasterEggStep(
                                    "Return to the completed Power Switch after Maxis requests that the power be disabled."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Interact with the switch to turn off the power. The power must remain off while completing Maxis' path."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Obtain EMP Grenades")
                            .addSubStep(new EasterEggStep(
                                            "Obtain EMP Grenades from the Mystery Box."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Only one player needs EMP Grenades for the Avogadro step, but additional players carrying them can make the setup easier."
                            ))
                    )

                    .addStep(new EasterEggStep("Charge the Pylon with the Avogadro")
                            .addSubStep(new EasterEggStep(
                                            "Locate the electrical Pylon in the cornfield between the Farm and Power Station."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "Place two working Turbines underneath the Pylon."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Wait until lightning is visible above the map, then finish the round to give the Avogadro a chance to spawn."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Lure the Avogadro directly underneath the Pylon while both Turbines remain active."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Throw an EMP Grenade at the Avogadro while it is beneath the Pylon."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Maxis will confirm that the Pylon has received the required living electrical energy."
                            ))
                    )

                    .addStep(new EasterEggStep("Power Two Streetlights")
                            .addSubStep(new EasterEggStep(
                                    "Have two players retrieve their Turbines and travel to two different green streetlights."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "The Bus Depot and Diner streetlights are convenient choices, although any two different streetlights can work."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Place one active Turbine beneath each streetlight at the same time."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "The streetlights will send orange electrical energy toward the Pylon, completing Maxis' Tower of Babble path."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final EasterEgg TowerOfBabble_Richtofen =
            new EasterEgg(
                    "Tower of Babble - Richtofen",
                    "Unlocks the Tower of Babble achievement and completes the Richtofen path for TranZit."
            )

                    .addStep(new EasterEggStep("Build and Activate the Power Switch")
                            .addSubStep(new EasterEggStep(
                                    "Enter the underground Power Lab at the Power Station."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Collect the severed arm, power lever, and electrical panel."
                                    )
                                            .addImage()
                                            .addImage()
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "Assemble the Power Switch and turn on the power."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Leave the power turned on for the remainder of Richtofen's path."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Samuel Stuhlinger must be present because he is the only character who can hear Richtofen's instructions."
                            ))
                    )

                    .addStep(new EasterEggStep("Build the Jet Gun")
                            .addSubStep(new EasterEggStep(
                                            "Collect the Jet Engine from the tunnel between the Bus Depot and Diner."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "Collect the Wires from the lower Power Station area near Tombstone Soda."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "Collect the Handbrake from the hidden Nacht der Untoten building in the cornfield."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "Collect the Pressure Gauge from the Hunter's Cabin between the Power Station and Town."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "Take all four parts to the workbench on the ground floor of the Town Bar and assemble the Jet Gun."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Overload the Pylon")
                            .addSubStep(new EasterEggStep(
                                            "Take the Jet Gun to the electrical Pylon in the cornfield between the Farm and Power Station."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Stand directly underneath the Pylon and continuously fire the Jet Gun."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Continue firing until the Jet Gun overheats and breaks apart."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Richtofen will speak to Stuhlinger and the green streetlights around the map will begin flickering."
                            ))
                    )

                    .addStep(new EasterEggStep("Kill Zombies Under the Pylon")
                            .addSubStep(new EasterEggStep(
                                    "Gather a group of zombies directly underneath the Pylon."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Kill approximately 25 zombies beneath the Pylon using explosive damage."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Recommended weapons include the RPG, Ray Gun, Ray Gun Mark II, grenades, or other explosive weapons."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Continue until Richtofen tells Stuhlinger that the Pylon is receiving too much power."
                            ))
                    )

                    .addStep(new EasterEggStep("Obtain EMP Grenades")
                            .addSubStep(new EasterEggStep(
                                            "Obtain EMP Grenades from the Mystery Box."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "For the standard cooperative method, four different electrically charged streetlights must be disabled nearly simultaneously."
                            ))
                    )

                    .addStep(new EasterEggStep("Disable Four Streetlights")
                            .addSubStep(new EasterEggStep(
                                            "Assign players to four different green streetlights that are emitting electrical energy."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Throw an EMP Grenade at each of the four streetlights within the required time window."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "With fewer than four players, use Denizen-created teleporters beneath the streetlights to travel quickly between locations."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "When all four streetlights have been disabled, they will send blue electrical energy toward the Pylon and Richtofen will congratulate Stuhlinger."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final EasterEgg Carrion =
            new EasterEgg("Carrion - Song")

                    .addStep(new EasterEggStep("Activate Teddy Bear 1")
                            .addSubStep(new EasterEggStep(
                                            "Leave the Bus Depot starting room and locate the teddy bear on a wooden bench near the pool of lava."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Activate Teddy Bear 2")
                            .addSubStep(new EasterEggStep(
                                    "Enter the Farmhouse and go upstairs."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Interact with the teddy bear resting on a mattress on the floor."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Activate Teddy Bear 3")
                            .addSubStep(new EasterEggStep(
                                    "Enter the Bar in Town and remain on the lower floor."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Interact with the teddy bear sitting near the billiards table."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "After all three teddy bears have been activated, \"Carrion\" will begin playing."
                            ))
                    )
            ;


    public static final EasterEgg NachtDerUntoten =
            new EasterEgg("Hidden Nacht")

                    .addStep(new EasterEggStep("Find Nacht der Untoten")
                            .addSubStep(new EasterEggStep(
                                    "Travel along the road between the Farm and Power Station."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Enter the cornfield on the opposite side of the road from the electrical Pylon."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "Follow the paths through the corn until you reach the remains of Nacht der Untoten."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "The building contains the Jet Gun Handbrake and can also contain the NAV Table Radio."
                            ))
                    )
            ;


    public static final EasterEgg FarmCottageTV =
            new EasterEgg("Farm Cottage TV")

                    .addStep(new EasterEggStep("Activate the Farm Television")
                            .addSubStep(new EasterEggStep(
                                    "Visit the Farm before turning on the map's power."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Enter the Farm building containing the old television set."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Interact with the television to hear recorded messages from survivors following the global outbreak."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Interact with the television repeatedly to hear the available messages."
                            ))
                    )
            ;


    public static final EasterEgg SniperScopeReflection =
            new EasterEgg("Sniper Scope Reflection")

                    .addStep(new EasterEggStep("Inspect a Sniper Scope")
                            .addSubStep(new EasterEggStep(
                                            "Obtain a sniper rifle with a reflective scope, such as the DSR 50."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Inspect the reflection visible on the exterior lens of the scope."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "The reflection shows the surrounding environment as it appeared before Earth was damaged during the events of Moon."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final EasterEgg NAVTableAndNavcards =
            new EasterEgg("NAV Table & Navcards")

                    .addStep(new EasterEggStep("Build the TranZit NAV Table")
                            .addSubStep(new EasterEggStep(
                                            "Collect the Meteorite, Radio, Electrical Box, and Wooden Table."
                                    )
                                            .addImage()
                                            .addImage()
                                            .addImage()
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "Take the four parts to the construction point beneath the electrical Pylon in the cornfield."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "The NAV Table only needs to be built once for each player's profile."
                            ))
                    )

                    .addStep(new EasterEggStep("Collect the TranZit Navcard")
                            .addSubStep(new EasterEggStep(
                                    "Leave the Bus Depot through the purchasable door."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Walk around the outside of the building and locate the Navcard on the ground behind the Bus Depot."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "The Navcard is stored on the player's profile after it has been collected."
                            ))
                    )

                    .addStep(new EasterEggStep("Use the TranZit Navcard")
                            .addSubStep(new EasterEggStep(
                                    "The Navcard collected on TranZit cannot be inserted into the TranZit NAV Table."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "The TranZit Navcard is designed to be inserted into the NAV Table on Die Rise."
                            ))
                    )

                    .addStep(new EasterEggStep("Insert the Buried Navcard")
                            .addSubStep(new EasterEggStep(
                                    "Collect the Navcard from the Mansion on Buried."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Return to TranZit and insert the Buried Navcard into the completed NAV Table beneath the Pylon."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Linking the three Victis NAV Tables is required for the endgame Easter egg on Buried."
                            ))
                    )
            ;


    public static final EasterEgg TownTrafficLightCode =
            new EasterEgg("Town Traffic Light Code")

                    .addStep(new EasterEggStep("Decode the Town Traffic Light")
                            .addSubStep(new EasterEggStep(
                                            "Go to Town and observe the flashing traffic light."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "The light flashes a Morse-code message."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "The decoded phrases include: \"Help me so I can help you,\" \"The future is ours to destroy,\" \"Power is knowledge,\" \"Go to the light,\" \"Stay close to me,\" and \"Energy can only be transformed.\""
                            ))
                    )
            ;


    public static final Buildable Turbine =
            new Buildable("Turbine")

                    .addStep(new BuildableStep("Collect the Mannequin")
                            .addSubStep(new BuildableStep(
                                            "Find the mannequin torso inside the Bus Depot starting room."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Fan")
                            .addSubStep(new BuildableStep(
                                            "Find the fan inside the Bus Depot starting room."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Model-Plane Tail")
                            .addSubStep(new BuildableStep(
                                            "Find the model-plane tail inside the Bus Depot starting room."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Build the Turbine")
                            .addSubStep(new BuildableStep(
                                    "Place all three parts onto the workbench inside the Bus Depot."
                            ))
                            .addSubStep(new BuildableStep(
                                            "The Turbine can temporarily power doors, perk machines, Denizen teleporters, the Turret, the Electric Trap, and the Pack-A-Punch access door."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final Buildable PowerSwitch =
            new Buildable("PowerSwitch")

                    .addStep(new BuildableStep("Enter the Power Lab")
                            .addSubStep(new BuildableStep(
                                            "Stop at the Power Station, open the outhouse door, and jump into the underground facility."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Severed Arm")
                            .addSubStep(new BuildableStep(
                                            "Search the upper stairways and boxes inside the Power Lab for the severed arm."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Power Lever")
                            .addSubStep(new BuildableStep(
                                            "Search the computer desks, workbench area, and boxes inside the Power Lab for the lever."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Electrical Panel")
                            .addSubStep(new BuildableStep(
                                            "Search near the entrance barrier, stairways, desks, and workbench for the electrical panel."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Build and Activate the Power Switch")
                            .addSubStep(new BuildableStep(
                                    "Place all three parts onto the Power Lab workbench."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Interact with the completed switch to activate the map's power and release the Avogadro."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final Buildable ZombieShield =
            new Buildable("Zombie Shield")

                    .addStep(new BuildableStep("Collect the Car Door")
                            .addSubStep(new BuildableStep(
                                    "Search the Diner garage for the car door."
                            ))
                            .addSubStep(new BuildableStep(
                                            "It can appear on the damaged car, on a nearby table, or inside the small rear room."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Hand Truck")
                            .addSubStep(new BuildableStep(
                                    "Search inside the Diner for the hand truck or dolly."
                            ))
                            .addSubStep(new BuildableStep(
                                            "It can appear behind the counter or near the booths."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Build the Zombie Shield")
                            .addSubStep(new BuildableStep(
                                    "Take both parts to the workbench inside the Diner garage."
                            ))
                            .addSubStep(new BuildableStep(
                                            "The Zombie Shield blocks attacks from behind while carried and can be held in front of the player as a melee weapon."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final Buildable PackAPunch =
            new Buildable("Pack-A-Punch")

                    .addStep(new BuildableStep("Turn On the Power")
                            .addSubStep(new BuildableStep(
                                            "Build and activate the Power Switch at the Power Station."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Power the Pack-A-Punch Door")
                            .addSubStep(new BuildableStep(
                                    "Carry a Turbine into the underground Power Lab."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Immediately after dropping into the facility, turn around and place the Turbine beside the metal door marked with a lightning symbol."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                    "The Turbine must remain active long enough to open the corresponding door beneath the Bank."
                            ))
                    )

                    .addStep(new BuildableStep("Open the Bank Vault")
                            .addSubStep(new BuildableStep(
                                    "Travel to Town and enter the Bank."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Throw an explosive at the first metal vault door."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                            "Enter the vault hallway and use another explosive to open the second metal door."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Enter the Underground Room")
                            .addSubStep(new BuildableStep(
                                            "If the Power Station Turbine is still active, the hidden metal barrier will be open and a staircase will lead underground."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                    "If the barrier is closed, return to the Power Station and place another Turbine beside the lightning door."
                            ))
                    )

                    .addStep(new BuildableStep("Build Pack-A-Punch")
                            .addSubStep(new BuildableStep(
                                            "Search the underground corridors for the Pack-A-Punch battery, base, and upper machine component."
                                    )
                                            .addImage()
                                            .addImage()
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                    "Place all three parts onto the workbench at the end of the underground room."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Use the completed Pack-A-Punch Machine to upgrade a weapon for 5,000 points."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final Buildable Turret =
            new Buildable("Turret")

                    .addStep(new BuildableStep("Collect the RPD")
                            .addSubStep(new BuildableStep(
                                    "Search the Farmhouse and Barn for the mounted RPD."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Possible locations include the upstairs couch, barrels near Double Tap Root Beer, or the Farmhouse balcony."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Lawn Mower")
                            .addSubStep(new BuildableStep(
                                            "Search outside the Farmhouse and on the lower floor of the Barn for the lawn mower."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Ammunition Pouch")
                            .addSubStep(new BuildableStep(
                                            "Search the ground floor of the Farmhouse for the ammunition pouch."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Build and Power the Turret")
                            .addSubStep(new BuildableStep(
                                    "Place all three parts onto the workbench on the ground floor of the Farmhouse."
                            ))
                            .addSubStep(new BuildableStep(
                                    "Place an active Turbine behind the completed Turret to power it."
                            ))
                            .addSubStep(new BuildableStep(
                                            "The Turret automatically fires at zombies in front of it, but its gunfire can also injure players."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final Buildable ElectricTrap =
            new Buildable("Electric Trap")

                    .addStep(new BuildableStep("Collect the Battery")
                            .addSubStep(new BuildableStep(
                                    "Search the Power Station area near Tombstone Soda for the battery."
                            ))
                            .addSubStep(new BuildableStep(
                                            "The battery can appear on nearby barrels."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Metal Rod")
                            .addSubStep(new BuildableStep(
                                            "Search the upper area near the windows and stairs for the metal rod."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Tesla Base")
                            .addSubStep(new BuildableStep(
                                            "Search near the Tombstone Soda machine for the Tesla-coil base."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Build and Power the Electric Trap")
                            .addSubStep(new BuildableStep(
                                    "Place all three parts onto the workbench in the Tombstone area of the Power Station."
                            ))
                            .addSubStep(new BuildableStep(
                                    "Place an active Turbine behind the Electric Trap to power it."
                            ))
                            .addSubStep(new BuildableStep(
                                            "The trap produces a damaging electrical field that kills zombies but can also down nearby players."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final Buildable JetGun =
            new Buildable("Jet-Gun")

                    .addStep(new BuildableStep("Collect the Jet Engine")
                            .addSubStep(new BuildableStep(
                                    "Search the tunnel between the Bus Depot and Diner."
                            ))
                            .addSubStep(new BuildableStep(
                                            "The Jet Engine can appear near the zombie barriers, wrecked vehicles, M16 wall-buy, or roadside railing."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Wires")
                            .addSubStep(new BuildableStep(
                                    "Turn on the power and enter the lower Power Station area near Tombstone Soda."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Search the collapsed catwalk, wooden bridge, electrical equipment, and lower rooms for the Wires."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Handbrake")
                            .addSubStep(new BuildableStep(
                                    "Enter the hidden Nacht der Untoten building in the cornfield."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Search near the lamp, cabinets, debris, and damaged staircase for the Handbrake."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Pressure Gauge")
                            .addSubStep(new BuildableStep(
                                    "Enter the Hunter's Cabin in the fog between the Power Station and Town."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Search near the fireplace, bed, bed frame, and shelf for the Pressure Gauge."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Build and Use the Jet Gun")
                            .addSubStep(new BuildableStep(
                                    "Take all four parts to the workbench on the ground floor of the Town Bar."
                            ))
                            .addSubStep(new BuildableStep(
                                    "Only one player can carry the Jet Gun at a time, and it does not occupy a normal weapon slot."
                            ))
                            .addSubStep(new BuildableStep(
                                    "Watch the pressure gauge while firing. Allow the weapon to cool before the gauge reaches its limit."
                            ))
                            .addSubStep(new BuildableStep(
                                            "If the Jet Gun overheats, it breaks into its four parts and must be rebuilt."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final Buildable NavTable =
            new Buildable("NAV Table")

                    .addStep(new BuildableStep("Locate the Construction Point")
                            .addSubStep(new BuildableStep(
                                    "Find the electrical Pylon in the cornfield between the Farm and Power Station."
                            ))
                            .addSubStep(new BuildableStep(
                                            "The NAV Table is assembled at the construction point underneath the Pylon."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Meteorite")
                            .addSubStep(new BuildableStep(
                                    "Open the Bus Depot exit door and inspect the damaged exterior wall beside the original Mystery Box location."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Crouch beside the opening and collect the purple Meteorite."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Radio")
                            .addSubStep(new BuildableStep(
                                    "Search the Diner garage on top of the tall metal cabinet."
                            ))
                            .addSubStep(new BuildableStep(
                                            "If it is not in the garage, search the cabinets and shelving inside the hidden Nacht der Untoten building."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Electrical Box")
                            .addSubStep(new BuildableStep(
                                    "Search the Farmhouse wall beside the weapon-storage refrigerator."
                            ))
                            .addSubStep(new BuildableStep(
                                            "If it is not at the Farm, search beside the dumpster near the Town Mystery Box location."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Wooden Table")
                            .addSubStep(new BuildableStep(
                                    "Search the tunnel between the Bus Depot and Diner near the M16 wall-buy and zombie barriers."
                            ))
                            .addSubStep(new BuildableStep(
                                            "If it is not in the tunnel, search the lower Power Station platform beneath the Tombstone area."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Assemble the NAV Table")
                            .addSubStep(new BuildableStep(
                                    "Carry each part separately to the construction point underneath the Pylon."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Place all four parts to complete the NAV Table."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                    "Once the table is built, its completion is normally stored on the participating players' profiles."
                            ))
                            .addSubStep(new BuildableStep(
                                    "The Buried Navcard can be inserted into the completed TranZit NAV Table."
                            ))
                    )
            ;

    public static final List<EasterEgg> Tranzit_SideQuests = Arrays.asList(
        Carrion,
        NachtDerUntoten,
        FarmCottageTV,
        SniperScopeReflection,
        NAVTableAndNavcards,
        TownTrafficLightCode
    );
    public static final List<EasterEgg> Tranzit_MainQuests = Arrays.asList(
        TowerOfBabble_Maxis,
        TowerOfBabble_Richtofen
    );

    public static final List<Procedure> Tranzit_Buildables = Arrays.asList(
        ZombieShield,
        Turbine,
        JetGun,
        PackAPunch,
        PowerSwitch,
        Turret,
        ElectricTrap,
        NavTable
    );
}
