package com.example.the_ultimate_easter_egg_guide.MapData.BOII;

import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEgg;

import java.util.Arrays;
import java.util.List;

public class Tranzit_EasterEggs
{
    public static final EasterEgg TowerOfBabble_Maxis = new EasterEgg("Tower of Babble - Dr.Maxis");
    public static final EasterEgg TowerOfBabble_Richtofen = new EasterEgg("Tower of Babble - Richtofen");
    public static final EasterEgg Carrion = new EasterEgg("Carrion - Song");
    public static final EasterEgg NachtDerUntoten = new EasterEgg("Hidden Nacht");
    public static final EasterEgg FarmCottageTV = new EasterEgg("Farm Cottage TV");
    public static final EasterEgg SniperScopeReflection = new EasterEgg("Sniper Scope Reflection");
    public static final EasterEgg NAVTableAndNavcards = new EasterEgg("NAV Table & Navcards");
    public static final EasterEgg TownTrafficLightCode = new EasterEgg("Town Traffic Light Code");
    public static final EasterEgg Turbine = new EasterEgg("Turbine");
    public static final EasterEgg PowerSwitch = new EasterEgg("PowerSwitch");
    public static final EasterEgg ZombieShield = new EasterEgg("Zombie Shield");
    public static final EasterEgg PackAPunch = new EasterEgg("Pack-A-Punch");
    public static final EasterEgg Turret = new EasterEgg("Turret");
    public static final EasterEgg ElectricTrap = new EasterEgg("Electric Trap");
    public static final EasterEgg JetGun = new EasterEgg("Jet-Gun");
    public static final EasterEgg NavTable = new EasterEgg("NAV Table");

    public static final List<EasterEgg> Tranzit_SideQuests = Arrays.asList(
        Carrion,
            NachtDerUntoten,
            FarmCottageTV,
            SniperScopeReflection,
            NAVTableAndNavcards,
            TownTrafficLightCode
    );
    public static final List<EasterEgg> Tranzit_MainQuests = Arrays.asList(
        TowerOfBabble_Maxis,
        TowerOfBabble_Richtofen
    );

    public static final List<EasterEgg> Tranzit_Buildables = Arrays.asList(
        ZombieShield,
        Turbine,
        JetGun,
        PackAPunch,
        PowerSwitch,
        Turret,
        ElectricTrap,
        NavTable
    );
}
