package com.example.the_ultimate_easter_egg_guide.MapData.BOI;

import com.example.the_ultimate_easter_egg_guide.Models.EasterEgg.EasterEgg;

import java.util.Arrays;
import java.util.List;

public class Moon_EasterEggs
{
    public static final EasterEgg RichtofensGrandScheme = new EasterEgg("Richtofen's Grand Scheme");
    public static final EasterEgg ComingHome = new EasterEgg("Coming Home - Song");
    public static final EasterEgg ReDamned = new EasterEgg("Re-Damned - Song");
    public static final EasterEgg Nightmare = new EasterEgg("Nightmare - Song");
    public static final EasterEgg ComingHome8Bit = new EasterEgg("Coming Home (8-bit) - Song");
    public static final EasterEgg Pareidolia8Bit = new EasterEgg("Pareidolia (8-bit) - song");

    public static final List<EasterEgg> Moon_MainQuests = Arrays.asList(
        RichtofensGrandScheme
    );
    public static final List<EasterEgg> Moon_SideQuests = Arrays.asList(
        ComingHome,
        ReDamned,
        Nightmare,
        ComingHome8Bit,
        Pareidolia8Bit
    );
}
