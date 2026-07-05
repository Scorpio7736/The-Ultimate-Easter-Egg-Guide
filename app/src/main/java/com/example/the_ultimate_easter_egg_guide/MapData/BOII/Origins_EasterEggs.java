package com.example.the_ultimate_easter_egg_guide.MapData.BOII;

import com.example.the_ultimate_easter_egg_guide.Models.EasterEgg.EasterEgg;

import java.util.Arrays;
import java.util.List;

public class Origins_EasterEggs
{
    public static final EasterEgg LittleLostGirl = new EasterEgg("Little Lost Girl");
    public static final EasterEgg Archangel = new EasterEgg("Archangel - Song");
    public static final EasterEgg ShepherdOfFire = new EasterEgg("Shepherd of Fire - Song");
    public static final EasterEgg Aether = new EasterEgg("Aether - Song");
    public static final EasterEgg RememberForever = new EasterEgg("Remember Forever - Song");
    public static final EasterEgg ChurchJumpscare = new EasterEgg("Church Jumpscare");
    public static final EasterEgg CiphersAndScrapPaper = new EasterEgg("Ciphers & Scrap Paper");
    public static final EasterEgg ZombieShield = new EasterEgg("Zombie Shield");
    public static final EasterEgg MaxisDrone = new EasterEgg("Maxis Drone");
    public static final EasterEgg StaffOfIce = new EasterEgg("Ice Staff");
    public static final EasterEgg StaffOfIce_Upgrade = new EasterEgg("Ice Staff Upgrade");
    public static final EasterEgg StaffOfLightning = new EasterEgg("Lightning Staff");
    public static final EasterEgg StaffOfLightning_Upgrade = new EasterEgg("Lightning Staff Upgrade");
    public static final EasterEgg StaffOfFire = new EasterEgg("Fire Staff");
    public static final EasterEgg StaffOfFire_Upgrade = new EasterEgg("Fire Staff Upgrade");
    public static final EasterEgg StaffOfWind = new EasterEgg("Wind Staff");
    public static final EasterEgg StaffOfWind_Upgrade = new EasterEgg("Wind Staff Upgrade");
    public static final EasterEgg GStrikes = new EasterEgg("G-Strikes");

    public static final List<EasterEgg> Origins_MainQuests = Arrays.asList(
        LittleLostGirl
    );
    public static final List<EasterEgg> Origins_SideQuests = Arrays.asList(
        Archangel,
        ShepherdOfFire,
        Aether,
        RememberForever,
        ChurchJumpscare,
        CiphersAndScrapPaper,
        GStrikes
    );

    public static final List<EasterEgg> Origins_Buildables = Arrays.asList(
        ZombieShield,
        MaxisDrone,
        StaffOfIce,
        StaffOfIce_Upgrade,
        StaffOfLightning,
        StaffOfLightning_Upgrade,
        StaffOfFire,
        StaffOfFire_Upgrade,
        StaffOfWind,
        StaffOfWind_Upgrade
    );
}
