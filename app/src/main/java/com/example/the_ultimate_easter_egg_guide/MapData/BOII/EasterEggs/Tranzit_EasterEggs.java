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


}
