package com.example.the_ultimate_easter_egg_guide.MapData.BOII.EasterEggs;

import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEgg;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEggStep;

import java.util.Arrays;
import java.util.List;

public class DieRise_EasterEggs
{
    public static final EasterEgg HighMaintenance_Maxis =
            new EasterEgg("High Maintenance - Dr.Maxis")

                    .addStep(new EasterEggStep("Turn On the Power")
                            .addSubStep(new EasterEggStep(
                                    "This Easter egg requires four players and must be completed on Original difficulty."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Travel to the Power Building and activate the Power Switch."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Building the NAV Table before beginning is recommended because the elevator-symbol step can fail to activate without it."
                            ))
                    )

                    .addStep(new EasterEggStep("Activate the Elevator Symbols")
                            .addSubStep(new EasterEggStep(
                                    "Locate the four elevators with glowing golden symbols on top."
                            ))
                            .addSubStep(new EasterEggStep("Bowie Knife Elevator")
                                    .addSubStep(new EasterEggStep(
                                            "One symbol is on top of the elevator reached from the Power Room that travels toward the Bowie Knife."
                                    ))
                                    .addImage()
                            )
                            .addSubStep(new EasterEggStep("Remington Elevator")
                                    .addSubStep(new EasterEggStep(
                                            "One symbol is on top of the elevator near the Remington 870 MCS and MP5."
                                    ))
                                    .addImage()
                            )
                            .addSubStep(new EasterEggStep("Spawn Elevators")
                                    .addSubStep(new EasterEggStep(
                                            "The final two symbols are on top of the two elevators beside the Trample Steam workbench near Quick Revive."
                                    ))
                                    .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Have all four players stand on one elevator symbol each at the same time."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Be careful when the elevators reach the ceiling because players standing on top can be crushed."
                            ))
                    )

                    .addStep(new EasterEggStep("Activate the Four Floor Symbols")
                            .addSubStep(new EasterEggStep(
                                    "Four additional golden symbols will appear on the floors around the map."
                            ))
                            .addSubStep(new EasterEggStep("Floor Symbol 1")
                                    .addSubStep(new EasterEggStep(
                                            "Find the symbol near the M14 wall-buy in the Spawn Building."
                                    ))
                                    .addImage()
                            )
                            .addSubStep(new EasterEggStep("Floor Symbol 2")
                                    .addSubStep(new EasterEggStep(
                                            "Find the symbol on the level above the AK-74u."
                                    ))
                                    .addImage()
                            )
                            .addSubStep(new EasterEggStep("Floor Symbol 3")
                                    .addSubStep(new EasterEggStep(
                                            "Find the symbol on the Dragon Building rooftop, to the left of the Semtex wall-buy."
                                    ))
                                    .addImage()
                            )
                            .addSubStep(new EasterEggStep("Floor Symbol 4")
                                    .addSubStep(new EasterEggStep(
                                            "Find the symbol past the SVU-AS near the cafeteria."
                                    ))
                                    .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Step on the four symbols in the correct sequential order. The order is randomized each game."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "A correctly selected symbol remains illuminated. If a symbol goes dark, restart the sequence and try a different order."
                            ))
                    )

                    .addStep(new EasterEggStep("Release the Dragon Orbs")
                            .addSubStep(new EasterEggStep(
                                    "Obtain any sniper rifle."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Go to the Dragon Building rooftop and look inside the mouth of each dragon statue."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Shoot the small orb inside each dragon's mouth using the sniper rifle."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "The two orbs will teleport beneath the paws of the lion statues in the Spawn Room near the Olympia."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Do not shoot the orbs with the Sliquifier. Doing so commits the game to Richtofen's path."
                            ))
                    )

                    .addStep(new EasterEggStep("Charge the Buddha Room")
                            .addSubStep(new EasterEggStep(
                                            "Go to the ground floor of the Buddha Room."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Kill 15 zombies consecutively while they are inside the lower Buddha Room."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Kills made on the upper ledges, in the connecting alley, or anywhere outside the Buddha Room do not count."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "If any zombie is killed outside the Buddha Room during this step, the counter resets and all 15 kills must be repeated."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Maxis will say that reincarnation will reveal the way forward when enough zombies have been killed."
                            ))
                    )

                    .addStep(new EasterEggStep("Use the Krauss Refibrillator")
                            .addSubStep(new EasterEggStep(
                                            "Obtain the Ballistic Knife from the Mystery Box."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "Upgrade the Ballistic Knife in the Pack-A-Punch Machine to create the Krauss Refibrillator."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "For the most reliable result, the player carrying the upgraded Ballistic Knife must not have purchased the Bowie Knife or Galvaknuckles and must not have completely bled out earlier in the game."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Return to the Buddha Room and fire the Krauss Refibrillator into the floor or wall inside the room."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "No player needs to be downed or revived for this step."
                            ))
                    )

                    .addStep(new EasterEggStep("Channel the Dragon Orbs")
                            .addSubStep(new EasterEggStep(
                                    "Build four Trample Steams."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Place one Trample Steam on each of the four golden lion symbols, facing in the direction shown by the lion on the symbol."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep("Spawn Room Lion Symbol")
                                    .addSubStep(new EasterEggStep(
                                            "Place one Trample Steam near the foot of the left staircase in the Spawn Room."
                                    ))
                                    .addImage()
                            )
                            .addSubStep(new EasterEggStep("Quick Revive Lion Symbol")
                                    .addSubStep(new EasterEggStep(
                                            "Place one at the bottom of the escalator in the room beside Quick Revive."
                                    ))
                                    .addImage()
                            )
                            .addSubStep(new EasterEggStep("Paired Rooftop Elevators")
                                    .addSubStep(new EasterEggStep(
                                            "Place one beside the two rooftop elevators that descend toward the Power Room."
                                    ))
                                    .addImage()
                            )
                            .addSubStep(new EasterEggStep("Separated Rooftop Elevator")
                                    .addSubStep(new EasterEggStep(
                                            "Place one near the separated elevator reached by traveling up the rooftop ramp and dropping into the eastern corner."
                                    ))
                                    .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Have two players collect the dragon orbs from beneath the lion statues in Spawn. Each player can carry only one orb."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Place each orb onto a correctly positioned Trample Steam."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "The Trample Steams will throw the orbs between opposite symbols. An orange electrical surge through the radio tower confirms completion."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Decode the Mahjong Tiles and Strike the Tower")
                            .addSubStep(new EasterEggStep(
                                            "Obtain the Galvaknuckles."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "Search the map for four colored directional Mahjong tiles and four matching colored numbered tiles."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "The directional tiles represent north, south, east, and west. The numbered tiles indicate when the matching side of the tower must be struck."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Match tiles by color. For example, if the green direction tile represents north and the green numbered tile displays three bamboo marks, north must be struck third."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "The numbered tile representing one uses a bird symbol instead of a single bamboo mark."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "At the radio tower, north faces the Trample Steam room and west faces the sun. South and east are directly opposite them."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Use the Galvaknuckles to melee the four tower posts in the decoded order."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "The tower will glow orange, completing Dr. Maxis' High Maintenance path."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final EasterEgg HighMaintenance_Richtofen =
            new EasterEgg("High Maintenance - Richtofen")

                    .addStep(new EasterEggStep("Turn On the Power")
                            .addSubStep(new EasterEggStep(
                                    "This Easter egg requires four players and must be completed on Original difficulty."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Travel to the Power Building and activate the Power Switch."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Building the NAV Table before beginning is recommended because the elevator-symbol step can fail to activate without it."
                            ))
                    )

                    .addStep(new EasterEggStep("Activate the Elevator Symbols")
                            .addSubStep(new EasterEggStep(
                                    "Have all four players stand simultaneously on the golden symbols found on top of four elevators."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "The elevators are the Bowie Knife elevator, the elevator near the Remington 870 MCS and MP5, and the two elevators beside the Trample Steam workbench near Quick Revive."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Avoid remaining on top of an elevator when it reaches the ceiling because it can crush the player."
                            ))
                    )

                    .addStep(new EasterEggStep("Activate the Four Floor Symbols")
                            .addSubStep(new EasterEggStep(
                                            "Locate the four golden floor symbols near the M14, above the AK-74u, to the left of Semtex on the rooftop, and past the SVU-AS near the cafeteria."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Step on the symbols in the correct randomized sequence."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "A correct symbol remains illuminated. Continue testing combinations until all four symbols remain active."
                            ))
                    )

                    .addStep(new EasterEggStep("Release the Dragon Orbs")
                            .addSubStep(new EasterEggStep(
                                    "Obtain a sniper rifle and go to the Dragon Building rooftop."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Shoot the small orb inside the mouth of each dragon statue."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "The orbs will teleport beneath the paws of the lion statues in the Spawn Room near the Olympia."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Charge the Dragon Orbs with the Sliquifier")
                            .addSubStep(new EasterEggStep(
                                            "Build or obtain the Sliquifier."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Fire approximately 20 direct Sliquifier shots into each orb beneath the lion statues."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Continue until both orbs begin spinning."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Richtofen will request a blood sacrifice when both orbs are properly charged."
                            ))
                    )

                    .addStep(new EasterEggStep("Activate the Four Zombie Symbols")
                            .addSubStep(new EasterEggStep(
                                    "Build four Trample Steams."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Locate the four golden symbols depicting zombies surrounded by circles."
                            ))
                            .addSubStep(new EasterEggStep("Spawn Zombie Symbol")
                                    .addSubStep(new EasterEggStep(
                                            "Find one symbol near the M14 in the Spawn Building."
                                    ))
                                    .addImage()
                            )
                            .addSubStep(new EasterEggStep("Rooftop Zombie Symbols")
                                    .addSubStep(new EasterEggStep(
                                            "Find two symbols near the Claymore wall-buy and NAV Table area on the Dragon Building rooftop."
                                    ))
                                    .addImage()
                            )
                            .addSubStep(new EasterEggStep("Semtex Zombie Symbol")
                                    .addSubStep(new EasterEggStep(
                                            "Find the fourth symbol near the Semtex wall-buy."
                                    ))
                                    .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Place one Trample Steam on each symbol with the launching side facing toward the radio tower."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Activate each Trample Steam by allowing it to launch a zombie or player."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Listen for a Richtofen quote at each symbol. All four quotes must be triggered before continuing."
                            ))
                    )

                    .addStep(new EasterEggStep("Complete the Blood Sacrifice")
                            .addSubStep(new EasterEggStep(
                                    "Allow the correctly positioned Trample Steams to launch and kill zombies."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Continue activating all four Trample Steam locations until Richtofen tells Stuhlinger to obtain the Galvaknuckles."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "The Trample Steams may also be activated by launching players, although using zombies is generally easier."
                            ))
                    )

                    .addStep(new EasterEggStep("Decode the Mahjong Tiles and Strike the Tower")
                            .addSubStep(new EasterEggStep(
                                            "Obtain the Galvaknuckles."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "Locate the four colored directional Mahjong tiles and the four matching colored numbered tiles."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Match each direction with the number sharing its color to determine the order in which the tower posts must be struck."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "The tile representing the number one displays a bird rather than a single bamboo mark."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "North faces the Trample Steam room and west faces the sun. South and east are opposite those positions."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "Melee the four radio-tower posts with the Galvaknuckles in the decoded order."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "The radio tower will glow blue, completing Richtofen's High Maintenance path."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final EasterEgg WeAllFallDown =
            new EasterEgg("We All Fall Down")

                    .addStep(new EasterEggStep("Activate Teddy Bear 1")
                            .addSubStep(new EasterEggStep(
                                    "In the Spawn Building, travel down to the level containing the SVU-AS wall-buy."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Interact with the teddy bear on the shelving to the right of the SVU-AS."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Activate Teddy Bear 2")
                            .addSubStep(new EasterEggStep(
                                    "Enter the Buddha Room in the second skyscraper."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Go to the upper ledge and interact with the teddy bear beside the zombie barrier."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Activate Teddy Bear 3")
                            .addSubStep(new EasterEggStep(
                                    "Enter the Power Room in the third skyscraper."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Interact with the teddy bear sitting on a sewing machine."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "After all three teddy bears have been activated, \"We All Fall Down\" by Kevin Sherwood and Clark S. Nova will begin playing."
                            ))
                    )
            ;


    public static final EasterEgg PhdFlopperTease =
            new EasterEgg("PhD Flopper Tease")

                    .addStep(new EasterEggStep("Find the PhD Flopper Machine")
                            .addSubStep(new EasterEggStep(
                                    "Have every player enter the elevator in the Spawn Room."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Allow the elevator to collapse and fall toward the lower route leading to the Power Building."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "While falling, look through the opening toward the distant hallway."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "The PhD Flopper machine can briefly be seen standing in the inaccessible hallway."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "PhD Flopper cannot be reached or purchased on Die Rise."
                            ))
                    )
            ;


    public static final EasterEgg FreePerk =
            new EasterEgg("Free perk", "A free random perk and a Max Ammo power-up.")

                    .addStep(new EasterEggStep("Complete a Jumping Jack Round with Perfect Accuracy")
                            .addSubStep(new EasterEggStep(
                                    "Wait for a special round containing only Jumping Jacks."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Kill every Jumping Jack without missing an attack or firing a shot that fails to damage one."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Using the Bowie Knife, Galvaknuckles, or a Trample Steam is recommended because these methods make maintaining 100-percent accuracy easier."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "When the final Jumping Jack is killed with perfect accuracy, a Max Ammo and a free random Perk Bottle will appear."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final EasterEgg NavTableAndNavcards =
            new EasterEgg("NAV Table & Navcards")

                    .addStep(new EasterEggStep("Build the Die Rise NAV Table")
                            .addSubStep(new EasterEggStep(
                                            "Collect the Wooden Table, Radio, Element 115 Meteorite, and Power Box from the Dragon Building rooftop."
                                    )
                                            .addImage()
                                            .addImage()
                                            .addImage()
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                            "Place all four parts at the construction point beneath the radio tower and metal dragon walkway."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Collect the Die Rise Navcard")
                            .addSubStep(new EasterEggStep(
                                    "Climb the scaffolding beside one of the dragon statues."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Jump down to the platform containing the Semtex wall-buy."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Travel to the end of the platform and drop onto the area in front of the separated elevator."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Collect the Navcard from the ground where it is leaning against the nearby structure."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Insert the TranZit Navcard")
                            .addSubStep(new EasterEggStep(
                                    "Collect the Navcard located behind the Bus Depot on TranZit."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Load Die Rise and insert the TranZit Navcard into the completed NAV Table."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "The Navcard is saved to the player's profile after being collected, so it does not need to be collected during the same game."
                            ))
                    )

                    .addStep(new EasterEggStep("Use the Die Rise Navcard")
                            .addSubStep(new EasterEggStep(
                                    "The Navcard collected on Die Rise is not accepted by the Die Rise NAV Table."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Take the Die Rise Navcard to Buried and insert it into the completed Buried NAV Table."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "Connecting the TranZit, Die Rise, and Buried tables is required for the Victis endgame Easter egg."
                            ))
                    )
            ;


    public static final EasterEgg TrampleSteam =
            new EasterEgg("Trample Steam")

                    .addStep(new EasterEggStep("Collect the Chicken Wire")
                            .addSubStep(new EasterEggStep(
                                    "Search immediately to the left of the first purchasable Spawn Room door."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "If it is not there, purchase the door and search against the wall on the left side of the next room."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Collect the Motor")
                            .addSubStep(new EasterEggStep(
                                    "Search on top of the lobby desk in the starting room."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "If it is not on the desk, search the corner beside the collapsed stairwell."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Collect the Bellows")
                            .addSubStep(new EasterEggStep(
                                    "Search halfway up the left staircase inside the starting room."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "If it is not on the staircase, purchase the door and look against the wall on the right side of the hallway."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Collect the Flag")
                            .addSubStep(new EasterEggStep(
                                    "Search beside the broken chair at the bottom of the right staircase in Spawn."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "If it is not beside the chair, search near the top of the escalator where the flag may be leaning against the railing."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Build the Trample Steam")
                            .addSubStep(new EasterEggStep(
                                    "Carry each part to the workbench in the room adjacent to the Spawn Room."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Place all four parts onto the workbench and collect the completed Trample Steam."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "The Trample Steam can launch players across gaps and instantly kill zombies or Jumping Jacks that step onto it."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "If the device breaks, return to the workbench to collect a replacement."
                            ))
                    )
            ;


    public static final EasterEgg Sliquifier =
            new EasterEgg("Sliquifier")

                    .addStep(new EasterEggStep("Reach the Sliquifier Workbench")
                            .addSubStep(new EasterEggStep(
                                    "Turn on the power and travel to the lower floor beneath the Power Room."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Locate the Sliquifier workbench near the kitchen and refrigerator."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Collect the Mannequin Foot")
                            .addSubStep(new EasterEggStep(
                                    "Find the mannequin foot near the top of the staircase beside the television."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "This part always appears in the same location and forms the Sliquifier's stock."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Collect the Gas Canister")
                            .addSubStep(new EasterEggStep(
                                    "Search inside the green cage beside the Sliquifier workbench."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "If it is not inside the cage, search the tables surrounding the Power Switch."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Collect the Handbrake")
                            .addSubStep(new EasterEggStep(
                                    "Search the tables beside the elevators in the Power Room."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "If it is not in the Power Room, search beside the refrigerator near the Sliquifier workbench."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Collect the Wires and Discs")
                            .addSubStep(new EasterEggStep(
                                    "Search the barrel beside the debris blocking the staircase."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "If the part is not on the barrel, search the wooden stand in the upstairs laundry and shower room."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Build the Sliquifier")
                            .addSubStep(new EasterEggStep(
                                    "Place all four parts onto the workbench beneath the Power Room."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Only one player can initially collect the built Sliquifier in a cooperative game."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "After the built Sliquifier is lost or traded away, it becomes available through the Mystery Box."
                            ))
                            .addSubStep(new EasterEggStep(
                                    "The Sliquifier creates pools of slippery liquid and can cause damaging chain reactions between nearby zombies."
                            ))
                    )
            ;


    public static final EasterEgg NavTable =
            new EasterEgg("NAV Table")

                    .addStep(new EasterEggStep("Collect the Wooden Table")
                            .addSubStep(new EasterEggStep(
                                    "Go to the Dragon Building rooftop."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Find the Wooden Table underneath the metal walkway beside an air vent."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Collect the Radio")
                            .addSubStep(new EasterEggStep(
                                    "Face the rooftop staircase leading to the floor below."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Find the Radio on the rooftop floor to the right of the staircase."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Collect the Element 115 Meteorite")
                            .addSubStep(new EasterEggStep(
                                    "Search the debris on the rooftop near the Claymore wall-buy."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Collect the purple Element 115 Meteorite from the ground."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Collect the Power Box")
                            .addSubStep(new EasterEggStep(
                                    "Enter the small hidden rooftop area containing the separated perk elevator and a Mystery Box spawn."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Find the Power Box on the floor outside the elevator beside the zombie barrier."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new EasterEggStep("Assemble the NAV Table")
                            .addSubStep(new EasterEggStep(
                                    "Carry the four parts separately to the construction point beneath the radio tower and metal dragon walkway."
                            ))
                            .addSubStep(new EasterEggStep(
                                            "Place all four parts to complete the NAV Table."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new EasterEggStep(
                                    "The completed Die Rise NAV Table accepts the Navcard collected on TranZit."
                            ))
                    )
            ;

    public static final List<EasterEgg> DieRise_MainQuests = Arrays.asList(
            HighMaintenance_Maxis,
            HighMaintenance_Richtofen
    );
    public static final List<EasterEgg> DieRise_SideQuests = Arrays.asList(
            HighMaintenance_Maxis,
            HighMaintenance_Richtofen,
            WeAllFallDown,
            PhdFlopperTease,
            FreePerk,
            NavTableAndNavcards
    );
    public static final List<EasterEgg> DieRise_Buildables = Arrays.asList(
        TrampleSteam,
        Sliquifier,
        NavTable
    );
}
