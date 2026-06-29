package com.example.the_ultimate_easter_egg_guide.MapData.BOIII;

import com.example.the_ultimate_easter_egg_guide.Models.EasterEgg.EasterEgg;
import com.example.the_ultimate_easter_egg_guide.Models.EasterEgg.EasterEggStep;
import com.example.the_ultimate_easter_egg_guide.R;

public class TheGiant_EasterEggs
{
    public static final EasterEgg FlyTrap = new EasterEgg("Fly Trap");
    public static final EasterEgg HiddenPerk = new EasterEgg("Hidden Perk")
            .addStep(new EasterEggStep("Activate all teleporters")
                    .addImage()
            )
            .addStep(new EasterEggStep("Get monkeys from box")
                    .addImage()
            )
            .addStep(new EasterEggStep("for each teleporter throw a monkey at your feet as you teleport")
                    .addImage()
                    .addSubStep(new EasterEggStep("check to make sure it worked and the light on the control panel turned on.")
                            .addImage()
                    )
            )
            .addStep(new EasterEggStep("After all lights are on, collect the hidden perk")
                    .addImage()
            )
    ;
    public static final EasterEgg BeautyOfAnnihilation = new EasterEgg("Beauty of Annihilation")
        .addStep(new EasterEggStep("Locate Spinal Cord Jar 1 & 2")
            .addSubStep(new EasterEggStep("Go to the Animal Testing Lab to the left of the stairs, on a bookshelf, and hold interact on the 1st jar. Behind and to the right of the jar sits the 2nd jar. Hold interact on the 2nd jar.")
                    .addImage()
            )
        )
        .addStep(new EasterEggStep("Locate Spinal Cord Jar 3")
            .addSubStep(new EasterEggStep("Go to Teleporter B, and to the right you will see a room with the 3rd jar on a desk. Hold to interact with the 3rd jar and the song Beauty of Annihilation should start playing.")
                    .addImage()
            )
        )
    ;
    public static final EasterEgg Icarus = new EasterEgg("MOTD Plane - Icarus")
        .addStep(new EasterEggStep("On top of the Teleporter C building, you can see the final resting place of Icarus, the plane built in Mob of the Dead.")
            .addImage()
        )
    ;
    public static final EasterEgg Radios = new EasterEgg("Radios")
        .addStep(new EasterEggStep("radio in animal testing inside the cabinet to the right of the door to Teleporter A")
            .addImage()
        )
        .addStep(new EasterEggStep("radio on the ground off the edge of the left side of the pap teleporter")
            .addImage()
        )
        .addStep(new EasterEggStep("radio in teleporter B, to the left of the entrance of the room, inside a barrel.")
            .addImage()
        )
        .addStep(new EasterEggStep("radio across the bridge twards animal testing under the pile of garbage.")
            .addImage()
        )
        .addStep(new EasterEggStep("radio in the close left corner of the quick revive room")
            .addImage()
        )
        .addStep(new EasterEggStep("radio under the left hand stairs of teleporter A")
            .addImage()
        )
        .addStep(new EasterEggStep("radio on the left corner of the furnace between the two white pipes.")
            .addImage()
        )
        .addStep(new EasterEggStep("radio on the catwalk by barrier")
            .addImage()
        )
    ;
}
