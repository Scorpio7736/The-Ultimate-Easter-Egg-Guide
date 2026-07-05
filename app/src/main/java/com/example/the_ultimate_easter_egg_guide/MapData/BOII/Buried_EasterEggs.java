package com.example.the_ultimate_easter_egg_guide.MapData.BOII;

import com.example.the_ultimate_easter_egg_guide.Models.EasterEgg.EasterEgg;

import java.util.Arrays;
import java.util.List;

public class Buried_EasterEggs
{
    public static final EasterEgg MinedGames_Maxis = new EasterEgg("Mined Games - Dr.Maxis");
    public static final EasterEgg MinedGames_Richtofen = new EasterEgg("Mined Games - Richtofen");
    public static final EasterEgg AlwaysRunning = new EasterEgg("Always Running");
    public static final EasterEgg NavTableAndNavcards = new EasterEgg("NAV Table & Navcards");
    public static final EasterEgg DartBoardAndGhostPiano = new EasterEgg("Dart Board & Ghost Piano");
    public static final EasterEgg EasterEggTrackerAndEndgameSongs = new EasterEgg("Easter Egg Tracker & Endgame Songs");
    public static final EasterEgg MansionGhostPerk = new EasterEgg("Mansion Ghost Perk");
    public static final EasterEgg TimeBombPerkTrick = new EasterEgg("Time Bomb Perk Trick");
    public static final EasterEgg ChalkWeaponPlacement = new EasterEgg("Chalk Weapon Placement");
    public static final EasterEgg CraftingTables = new EasterEgg("Crafting Tables");
    public static final EasterEgg Turbine = new EasterEgg("Turbine");
    public static final EasterEgg NavTable = new EasterEgg("NAV Table");
    public static final EasterEgg TrampleSteam = new EasterEgg("Trample Steam");
    public static final EasterEgg SubsurfaceResonator = new EasterEgg("Subsurface Resonator");
    public static final EasterEgg HeadChopper = new EasterEgg("Head Chopper");

    public static final List<EasterEgg> Buried_MainQuests = Arrays.asList(
        MinedGames_Maxis,
        MinedGames_Richtofen
    );
    public static final List<EasterEgg> Buried_SideQuests = Arrays.asList(
        MinedGames_Maxis,
        MinedGames_Richtofen,
        AlwaysRunning,
        NavTableAndNavcards,
        DartBoardAndGhostPiano,
        EasterEggTrackerAndEndgameSongs,
        MansionGhostPerk,
        TimeBombPerkTrick,
        ChalkWeaponPlacement
    );
    public static final List<EasterEgg> Buried_Buildables = Arrays.asList(
        CraftingTables,
        Turbine,
        NavTable,
        TrampleSteam,
        SubsurfaceResonator,
        HeadChopper
    );
}
