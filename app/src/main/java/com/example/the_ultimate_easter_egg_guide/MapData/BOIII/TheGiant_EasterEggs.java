package com.example.the_ultimate_easter_egg_guide.MapData.BOIII;

import com.example.the_ultimate_easter_egg_guide.Models.EasterEgg.EasterEgg;
import com.example.the_ultimate_easter_egg_guide.Models.EasterEgg.EasterEggStep;
import com.example.the_ultimate_easter_egg_guide.R;

import java.util.Arrays;
import java.util.List;

public class TheGiant_EasterEggs
{
    public static final EasterEgg FlyTrap = new EasterEgg("Fly Trap")
            .addStep(new EasterEggStep("Turn on Fly Trap")
                    .addSubStep(new EasterEggStep("Purchase the door from spawn to Teleporter A")
                            .addImage()
                    )
                    .addSubStep(new EasterEggStep("Walk to the left of the door where you find a barrier.")
                            .addImage(R.drawable.boiii_barrier)
                    )
                    .addSubStep(new EasterEggStep("With a Pack-A-Punched weapon, aim and shoot through the metal fence at the control panel seen in the image below.")
                            .addImage(R.drawable.boiii_target)
                    )
                    .addSubStep(new EasterEggStep("The fly trap is activated when you see glowing power ups flying in the air, as well as Dr.Maxis saying \"Let's play a game, Let's play Hide & Seek!\"")
                            .addImage(R.drawable.boiii_active)
                    )
            )
            .addStep(new EasterEggStep("Monkey Bomb")
                    .addSubStep(new EasterEggStep("Go to Teleporter A and find the Monkey hidden in the right hand furnace near the right hand stairs and shoot it.")
                            .addImage()
                            .addImage(R.drawable.boiii_teleamonkey)
                    )
                    .addSubStep(new EasterEggStep("Step is completed when you hear Dr.Maxis say \"You found one, wow...\""))
            )
            .addStep(new EasterEggStep("Teddy Bear 1")
                    .addSubStep(new EasterEggStep("Go to the power switch and look off to the right and shoot the bear found in the image below.")
                            .addImage(R.drawable.boiii_jugbear)
                    )
                    .addSubStep(new EasterEggStep("Step is completed when you hear Dr.Maxis say \"Wow, you found another one.\""))
            )
            .addStep(new EasterEggStep("Teddy Bear 2")
                    .addSubStep(new EasterEggStep("")
                            .addImage(R.drawable.boiii_telebbear)
                    )
                    .addSubStep(new EasterEggStep(""))
            )
            .addStep(new EasterEggStep("Get gun")
                    .addSubStep(new EasterEggStep("Go to furnace and get gun")
                            .addImage(R.drawable.boiii_reward)
                    )
            )
    ;
    public static final EasterEgg HiddenPerk = new EasterEgg("Hidden Perk")
            .addStep(new EasterEggStep("Activate all teleporters")
                    .addImage(R.drawable.boiii_telemap)
            )
            .addStep(new EasterEggStep("Get monkeys from box")
                    .addImage()
            )
            .addStep(new EasterEggStep("for each teleporter throw a monkey at your feet as you teleport")
                    .addImage()
                    .addSubStep(new EasterEggStep("check to make sure it worked and the light on the control panel turned on.")
                            .addImage(R.drawable.boiii_0_tp)
                            .addImage(R.drawable.boiii_1_tp)
                            .addImage(R.drawable.boiii_2_tp)
                            .addImage(R.drawable.boiii_3_tp)
                    )
            )
            .addStep(new EasterEggStep("After all lights are on, collect the hidden perk (Dead-Shot Daiquiri or Stamin-Up")
                    .addImage(R.drawable.boiii_roboray)
                    .addImage(R.drawable.boiii_hidden_staminup)
                    .addImage()
            )
    ;
    public static final EasterEgg BeautyOfAnnihilation = new EasterEgg("Beauty of Annihilation")
        .addStep(new EasterEggStep("Locate Spinal Cord Jar 1 & 2")
            .addSubStep(new EasterEggStep("Go to the Animal Testing Lab to the left of the stairs, on a bookshelf, and hold interact on the 1st jar. Behind and to the right of the jar sits the 2nd jar. Hold interact on the 2nd jar.")
                    .addImage(R.drawable.boiii_jar1)
                    .addImage(R.drawable.boiii_jar2)
            )
        )
        .addStep(new EasterEggStep("Locate Spinal Cord Jar 3")
            .addSubStep(new EasterEggStep("Go to Teleporter B, and to the right you will see a room with the 3rd jar on a desk. Hold to interact with the 3rd jar and the song Beauty of Annihilation should start playing.")
                    .addImage(R.drawable.boiii_jar3)
            )
        )
    ;
    public static final EasterEgg Icarus = new EasterEgg("MOTD Plane - Icarus")
        .addStep(new EasterEggStep("On top of the Teleporter C building, you can see the final resting place of Icarus, the plane built in Mob of the Dead.")
            .addImage(R.drawable.boiii_icarus)
        )
    ;
    public static final EasterEgg Radios = new EasterEgg("Radios")
        .addStep(new EasterEggStep("radio in animal testing inside the cabinet to the right of the door to Teleporter A")
            .addImage(R.drawable.boiii_radio_1)
        )
        .addStep(new EasterEggStep("radio on the ground off the edge of the left side of the pap teleporter")
            .addImage(R.drawable.boiii_telebradio)
        )
        .addStep(new EasterEggStep("radio in teleporter B, to the left of the entrance of the room, inside a barrel.")
            .addImage(R.drawable.boiii_telebradio)
        )
        .addStep(new EasterEggStep("radio across the bridge twards animal testing under the pile of garbage.")
            .addImage(R.drawable.boiii_bridgeradio)
        )
        .addStep(new EasterEggStep("radio in the close left corner of the quick revive room")
            .addImage(R.drawable.boiii_qrradio)
        )
        .addStep(new EasterEggStep("radio under the left hand stairs of teleporter A")
            .addImage(R.drawable.boiii_telearadio)
        )
        .addStep(new EasterEggStep("radio on the left corner of the furnace between the two white pipes.")
            .addImage(R.drawable.boiii_furnaceradio)
        )
        .addStep(new EasterEggStep("radio on the catwalk by barrier")
            .addImage(R.drawable.boiii_catwalkradio)
        )
    ;

    public static final List<EasterEgg> DerReise_MainQuests = Arrays.asList(
            FlyTrap
    );

    public static final List<EasterEgg> DerReise_sideQuests = Arrays.asList(
            BeautyOfAnnihilation,
            HiddenPerk,
            Icarus,
            Radios
    );
}
