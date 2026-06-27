package com.example.the_ultimate_easter_egg_guide.MapData.WAW;

import com.example.the_ultimate_easter_egg_guide.Models.EasterEgg.EasterEgg;
import com.example.the_ultimate_easter_egg_guide.Models.EasterEgg.EasterEggStep;

import java.util.Arrays;
import java.util.List;

public class Verruckt_EasterEggs
{
    public static final EasterEgg MusicRadio = new EasterEgg("Lullaby for a Dead Man Song")
            .addStep(new EasterEggStep("Flush the left toilet in the upstairs bathroom 3 times."))
    ;
    public static final EasterEgg DentistChair = new EasterEgg("Dentist Chair")
            .addStep(new EasterEggStep("In the left spawn room (Juggernog side), use the action button or knife on the wheel attached to the dentist chair to hear a scream."))
    ;

    //==============================================================================================
    public static final List<EasterEgg> Verruckt_sideQuests = Arrays.asList(
            MusicRadio,
            DentistChair
    );
}