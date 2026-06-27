package com.example.the_ultimate_easter_egg_guide.MapData.WAW;

import com.example.the_ultimate_easter_egg_guide.Models.EasterEgg.EasterEgg;
import com.example.the_ultimate_easter_egg_guide.Models.EasterEgg.EasterEggStep;

import java.util.Arrays;
import java.util.List;

public class ShiNo_EasterEggs
{

    public static final EasterEgg MusicRadio = new EasterEgg("The One Song")
        .addStep(new EasterEggStep("Interact with the telephone in the Comm Room 3 times"))
    ;
    public static final EasterEgg Radios = new EasterEgg("Radios")
        .addStep((new EasterEggStep("Radio in Spawn Room"))
                .addSubStep(new EasterEggStep("Turn on the three radios hold interact to hear each of the automated coordinates and he Cornelius Pernell transmission"))
        )
        .addStep((new EasterEggStep("Radio in Doctor's Quarters"))
                .addSubStep(new EasterEggStep("In the radio room, hold to interact with the radio to hear \"Find Dr.Richtofen\""))
        )
        .addStep((new EasterEggStep("Radio in the Storage Hut"))
                .addSubStep(new EasterEggStep("Turn on the radio next to the Mystery Box to hear the Verruckt trailer audio."))
        )
    ;
    public static final EasterEgg RichtofensDiary = new EasterEgg("Dr.Richtofen's Diary")
        .addStep(new EasterEggStep("Go to the Doctor's Quarters")
                .addSubStep(new EasterEggStep("Interact with the bookshelf to hear the voices of corruption"))
        )
    ;

    //==============================================================================================

    public static final List<EasterEgg> ShiNo_sideQuests = Arrays.asList(
        MusicRadio,
        Radios,
        RichtofensDiary
    );


}
