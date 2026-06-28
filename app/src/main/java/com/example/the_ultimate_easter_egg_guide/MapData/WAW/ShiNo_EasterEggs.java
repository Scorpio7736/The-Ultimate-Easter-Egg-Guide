package com.example.the_ultimate_easter_egg_guide.MapData.WAW;

import com.example.the_ultimate_easter_egg_guide.Models.EasterEgg.EasterEgg;
import com.example.the_ultimate_easter_egg_guide.Models.EasterEgg.EasterEggStep;
import com.example.the_ultimate_easter_egg_guide.R;

import java.util.Arrays;
import java.util.List;

public class ShiNo_EasterEggs
{

    public static final EasterEgg MusicRadio = new EasterEgg("The One Song")
        .addStep(new EasterEggStep("Interact with the telephone in the Comm Room 3 times")
                .addImage(R.drawable.waw_music)
        )
    ;
    public static final EasterEgg Radios = new EasterEgg("Radios")
        .addStep((new EasterEggStep("Radio in Spawn Room"))
                .addSubStep(new EasterEggStep("Turn on the three radios hold interact to hear each of the automated coordinates and he Cornelius Pernell transmission")
                        .addImage(R.drawable.waw_snn_radio1)
                        .addImage(R.drawable.waw_snn_radio2)
                        .addImage(R.drawable.waw_snn_radio3)
                )
        )
        .addStep((new EasterEggStep("Radio in Doctor's Quarters"))
                .addSubStep(new EasterEggStep("In the radio room, hold to interact with the radio to hear \"Find Dr.Richtofen\"")
                        .addImage(R.drawable.waw_snn_docradio)
                )
        )
        .addStep((new EasterEggStep("Radio in the Storage Hut"))
                .addSubStep(new EasterEggStep("Turn on the radio next to the Mystery Box to hear the Verruckt trailer audio.")
                        .addImage(R.drawable.waw_snn_storageradio)
                )
        )
    ;
    public static final EasterEgg RichtofensDiary = new EasterEgg("Dr.Richtofen's Diary")
        .addStep(new EasterEggStep("Go to the Doctor's Quarters")
                .addSubStep(new EasterEggStep("Interact with the bookshelf to hear the voices of corruption")
                        .addImage(R.drawable.waw_snn_diary)
                )
        )
    ;

    public static final EasterEgg PeterMcCain = new EasterEgg("Hanging Man")
            .addStep(new EasterEggStep("In the spawn room find Peter McCain's hanging body.")
                    .addImage(R.drawable.waw_snn_hanging)
            )
            .addStep(new EasterEggStep("Throw granades under him until he gets caught on the wall next to him.")
                    .addImage(R.drawable.waw_snn_caught)
            )
            .addStep(new EasterEggStep("After he gets caught, wait for his body to fall to the ground")
                    .addImage(R.drawable.waw_snn_ground)
            )
            .addStep(new EasterEggStep("Prone into his body and your game will restart"))
    ;

    //==============================================================================================

    public static final List<EasterEgg> ShiNo_sideQuests = Arrays.asList(
        MusicRadio,
        Radios,
        RichtofensDiary,
        PeterMcCain
    );


}
