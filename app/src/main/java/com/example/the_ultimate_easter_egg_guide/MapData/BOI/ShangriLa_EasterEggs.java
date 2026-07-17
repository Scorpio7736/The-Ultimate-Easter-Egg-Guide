package com.example.the_ultimate_easter_egg_guide.MapData.BOI;

import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEgg;

import java.util.Arrays;
import java.util.List;

public class ShangriLa_EasterEggs
{
    public static final EasterEgg TimeTravelWillTell = new EasterEgg("Time Travel Will Tell");
    public static final EasterEgg Pareidolia = new EasterEgg("Pareidolia");

    public static final List<EasterEgg> ShangriLa_MainQuests = Arrays.asList(
        TimeTravelWillTell
    );
    public static final List<EasterEgg> ShangriLa_SideQuests = Arrays.asList(
        Pareidolia
    );
}
