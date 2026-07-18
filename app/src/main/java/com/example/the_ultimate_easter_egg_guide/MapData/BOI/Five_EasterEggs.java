package com.example.the_ultimate_easter_egg_guide.MapData.BOI;

import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEgg;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEggStep;

import java.util.Arrays;
import java.util.List;

public class Five_EasterEggs
{
    public static final EasterEgg WontBackDown = new EasterEgg("Wont Back Down - Song")
            .addStep(new EasterEggStep("Activate Red Phone 1")
                    .addSubStep(new EasterEggStep(
                                    "In the starting Conference Room, locate the red telephone on the table to the left of the Quick Revive machine and hold interact."
                            )
                                    .addImage()
                    )
            )
            .addStep(new EasterEggStep("Activate Red Phone 2")
                    .addSubStep(new EasterEggStep(
                            "Travel to the Labs and enter the room containing the power switch."
                    ))
                    .addSubStep(new EasterEggStep(
                                    "Locate the red telephone on the desk directly across from the power switch and hold interact."
                            )
                                    .addImage()
                    )
            )
            .addStep(new EasterEggStep("Activate Red Phone 3")
                    .addSubStep(new EasterEggStep(
                            "Turn on the power and activate all four DEFCON switches located on the upper and lower levels of the War Room."
                    ))
                    .addSubStep(new EasterEggStep(
                            "After reaching DEFCON 5, enter the teleporter in the center of the War Room to reach the Panic Room containing Pack-A-Punch."
                    ))
                    .addSubStep(new EasterEggStep(
                                    "Locate the red telephone on the small table to the left after entering the Panic Room and hold interact."
                            )
                                    .addImage()
                    )
                    .addSubStep(new EasterEggStep(
                            "After all three red telephones have been activated, \"Won't Back Down\" by Eminem featuring P!nk will begin playing."
                    ))
            )
            ;

    public static final EasterEgg RedPhones = new EasterEgg("The Red Phones");

    public static final EasterEgg Traps = new EasterEgg("Traps");
    public static final List<EasterEgg> Five_Buildables = Arrays.asList(
        Traps
    );
    public static final List<EasterEgg> Five_SideQuests = Arrays.asList(
        WontBackDown,
        RedPhones
    );
}
