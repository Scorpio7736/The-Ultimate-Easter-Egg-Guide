package com.example.the_ultimate_easter_egg_guide.MapData.WAW;

import com.example.the_ultimate_easter_egg_guide.Models.EasterEgg.EasterEgg;
import com.example.the_ultimate_easter_egg_guide.Models.EasterEgg.EasterEggStep;

import java.util.Arrays;
import java.util.List;

public class DerReise_EasterEggs
{
    public static final EasterEgg FlyTrap = new EasterEgg("Fly Trap")
            .addStep(new EasterEggStep("Turn on Fly Trap")
                    .addSubStep(new EasterEggStep("Purchase the door from spawn to Teleporter A")
                        .addImage()
                    )
                    .addSubStep(new EasterEggStep("Walk to the left of the door where you find a barrier.")
                        .addImage()
                    )
                    .addSubStep(new EasterEggStep("With a Pack-A-Punched weapon, aim and shoot through the metal fence at the control pannel seen in the image below.")
                        .addImage()
                    )
                    .addSubStep(new EasterEggStep("The fly trap is activated when you see glowing power ups flying in the air, as well as Samantha saying \"I want to play a game, Let's play Hide & Seek!\"")
                        .addImage()
                    )
            )
            .addStep(new EasterEggStep("Bowie Knife Teddy Bear")
                    .addSubStep(new EasterEggStep("Go to spawn and Shoot the Teddy Bear found in the picture below with a Pack-A-Punched weapon.")
                        .addImage()
                    )
                    .addSubStep(new EasterEggStep("Step is completed when you hear Samantha say \"Yay, you found one\""))
            )
            .addStep(new EasterEggStep("1911 & Juggernog Teddy Bear")
                    .addSubStep(new EasterEggStep("Near the Trench Gun wall buy in the Animal Testing Lab, look to the right by the animal cages.")
                            .addImage()
                    )
                    .addSubStep(new EasterEggStep("Inside one of the cages you will find the Teddy Bear. Shoot it with a Pack-A-Punched weapon.")
                            .addImage()
                    )
                    .addSubStep(new EasterEggStep("Step is completed when you hear Samantha say \"Wow, you found another one\""))
            )
            .addStep(new EasterEggStep("Granade & Molotov Monkey Bomb")
                    .addSubStep(new EasterEggStep("Go to the Thompson wall buy near Teleporter B, and look into the furnace off to the left.")
                            .addImage()
                    )
                    .addSubStep(new EasterEggStep("Inside the furnace you should see the Monkey Bomb. Shoot it with a Pack-A-Punched weapon.")
                            .addImage()
                    )
                    .addSubStep(new EasterEggStep("Step is completed when you hear Samantha say \"You win, Game Over\""))
            )
    ;

    public static final EasterEgg BeautyOfAnnihilation = new EasterEgg("Beauty of Annihilation")
            .addStep(new EasterEggStep("Locate Spinal Cord Jar 1")
                    .addSubStep(new EasterEggStep("Go to the Animal Testing Lab to the left of the stairs, on a bookshelf, and hold interact on the 1st jar.")
                            .addImage()
                    )
            )
            .addStep(new EasterEggStep("Locate Spinal Cord Jar 2")
                    .addSubStep(new EasterEggStep("While in the Animal Testing Lab, on the desk near stairs  hold interact on the 2nd jar.")
                            .addImage()
                    )
            )
            .addStep(new EasterEggStep("Locate Spinal Cord Jar 3")
                    .addSubStep(new EasterEggStep("Go to Teleporter B, and to the right you will see a room with the 3rd jar on a desk. Hold to interact with the 3rd jar and the song Beauty of Annihilation should start playing.")
                            .addImage()
                    )
            )
    ;

    public static final List<EasterEgg> DerReise_MainQuests = Arrays.asList(
        FlyTrap
    );

    public static final List<EasterEgg> DerReise_sideQuests = Arrays.asList(
        BeautyOfAnnihilation
    );
}
