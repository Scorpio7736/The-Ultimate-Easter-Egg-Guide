package com.example.the_ultimate_easter_egg_guide.MapData.BOII;

import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEgg;

import java.util.Arrays;
import java.util.List;

public class DieRise_EasterEggs
{
    public static final EasterEgg HighMaintenance_Maxis = new EasterEgg("High Maintenance - Dr.Maxis");
    public static final EasterEgg HighMaintenance_Richtofen = new EasterEgg("High Maintenance - Richtofen");
    public static final EasterEgg WeAllFallDown = new EasterEgg("We All Fall Down");
    public static final EasterEgg PhdFlopperTease = new EasterEgg("PhD Flopper Tease");
    public static final EasterEgg FreePerk = new EasterEgg("Free perk");
    public static final EasterEgg NavTableAndNavcards = new EasterEgg("NAV Table & Navcards");
    public static final EasterEgg TrampleSteam = new EasterEgg("Trample Steam");
    public static final EasterEgg Sliquifier = new EasterEgg("Sliquifier");
    public static final EasterEgg NavTable = new EasterEgg("NAV Table");

    public static final List<EasterEgg> DieRise_MainQuests = Arrays.asList(
            HighMaintenance_Maxis,
            HighMaintenance_Richtofen
    );
    public static final List<EasterEgg> DieRise_SideQuests = Arrays.asList(
            HighMaintenance_Maxis,
            HighMaintenance_Richtofen,
            WeAllFallDown,
            PhdFlopperTease,
            FreePerk,
            NavTableAndNavcards
    );
    public static final List<EasterEgg> DieRise_Buildables = Arrays.asList(
        TrampleSteam,
        Sliquifier,
        NavTable
    );
}
