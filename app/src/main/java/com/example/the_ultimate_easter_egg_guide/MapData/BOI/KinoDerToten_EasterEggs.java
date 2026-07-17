package com.example.the_ultimate_easter_egg_guide.MapData.BOI;

import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEgg;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEggStep;

import java.util.Arrays;
import java.util.List;

public class KinoDerToten_EasterEggs
{
    public static final EasterEgg Song_115 = new EasterEgg("115 - Song")
            .addStep(new EasterEggStep("In spawn, under the staircase, by  the barrier is a sample of Element 115 on a stand. Hold interact until you hear the sound.")
                    .addImage()
            )
            .addStep(new EasterEggStep("The next sample is in the dressing room near behind the two mannequins near the barrier. Hold interact until you hear the sound.")
                    .addImage()
            )
            .addStep(new EasterEggStep("The last sample is in the storage room on a shelf on the far left side of the room. Hold interact until you hear the sound.")
                    .addImage()
            )
            .addStep(new EasterEggStep("When completed, the song 115 will start to play."))
    ;
    public static final EasterEgg Film_Reels = new EasterEgg("The Film Reels")
            .addStep(new EasterEggStep("Link Pack-A-Punch Teleporter and teleport to the projector room.")
                    .addImage()
            )
            .addStep(new EasterEggStep("When returning to spawn, you will be teleported to one of four locations where you will find one of the film reels. (3 spawn per game in total)")
                    .addSubStep(new EasterEggStep("Samantha's Bedroom (Normal)")
                            .addImage()
                            .addImage()
                            .addImage()
                            .addImage()
                    )
                    .addSubStep(new EasterEggStep("Samantha's Bedroom (Destroyed)")
                            .addImage()
                            .addImage()
                            .addImage()
                            .addImage()
                    )
                    .addSubStep(new EasterEggStep("Dentist's Office")
                            .addImage()
                            .addImage()
                            .addImage()
                            .addImage()
                    )
                    .addSubStep(new EasterEggStep("Conference Room")
                            .addImage()
                            .addImage()
                            .addImage()
                            .addImage()
                    )
            )
            .addStep(new EasterEggStep("Put reel in projector")
                    .addImage()
            )
    ;
    public static final EasterEgg KnockingChest = new EasterEgg("Knocking Chest");
    public static final EasterEgg Radios = new EasterEgg("Radios")

    ;

    public static final List<EasterEgg> KinoDerToten_sideQuests = Arrays.asList(
            Song_115,
            Film_Reels,
            Radios
    );
}
