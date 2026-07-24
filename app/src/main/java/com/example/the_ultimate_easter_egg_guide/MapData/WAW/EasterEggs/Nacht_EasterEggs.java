package com.example.the_ultimate_easter_egg_guide.MapData.WAW.EasterEggs;

import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEgg;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEggStep;
import com.example.the_ultimate_easter_egg_guide.R;

import java.util.Arrays;
import java.util.List;

public class Nacht_EasterEggs
{
    public static final EasterEgg musicRadio = new EasterEgg("Music Radio")
            .addStep(new EasterEggStep("Go to the \"HELP!\" room / Mystery Box room"))
            .addStep(new EasterEggStep("Find the radio on the wall to the right of the Mystery Box, left of the stairs.")
                    .addImage(R.drawable.waw_nacht_radio)
            )
            .addStep(new EasterEggStep("Knife or shoot the radio to play music."))
    ;

    //==============================================================================================
    public static final List<EasterEgg> Nacht_sideQuests = Arrays.asList(
            musicRadio
    );
}

