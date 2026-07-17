package com.example.the_ultimate_easter_egg_guide.MapData.BOI;

import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEgg;

import java.util.Arrays;
import java.util.List;

public class COTD_EasterEggs
{
    public static final EasterEgg StandIn = new EasterEgg("Stand In");
    public static final EasterEgg EnsembleCast = new EasterEgg("Ensemble Cast");
    public static final EasterEgg NotReadyToDie = new EasterEgg("Not Ready to Die - Song");

    public static final List<EasterEgg> COTD_MainQuests = Arrays.asList(
        StandIn,
        EnsembleCast
    );
    public static final List<EasterEgg> COTD_SideQuests = Arrays.asList(
        NotReadyToDie
    );
}
