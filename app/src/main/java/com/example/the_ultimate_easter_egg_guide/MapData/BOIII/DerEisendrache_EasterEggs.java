package com.example.the_ultimate_easter_egg_guide.MapData.BOIII;

import com.example.the_ultimate_easter_egg_guide.Models.EasterEgg.EasterEgg;

import java.util.Arrays;
import java.util.List;

public class DerEisendrache_EasterEggs
{
    public static final EasterEgg MyBrothersKeeper = new EasterEgg("My Brother's keeper");
    public static final EasterEgg DeadAgain = new EasterEgg("Dead Again - Song");
    public static final EasterEgg Samanthaslullaby = new EasterEgg("Samantha's Lullaby - Song");
    public static final EasterEgg DiesIrae = new EasterEgg("Die Irae - Song");
    public static final EasterEgg ControlRoomDisco = new EasterEgg("Control Room Disco");
    public static final EasterEgg Plunger = new EasterEgg("Toilet Plunger");
    public static final EasterEgg SkeletonZombies = new EasterEgg("Skeleton Zombies");
    public static final EasterEgg Newspaper = new EasterEgg("Newspaper (Plunger)");
    public static final EasterEgg FreeMegaGobbleGum = new EasterEgg("Free Mega GobbleGum");
    public static final EasterEgg RagnarokDG4 = new EasterEgg("Ragnarok DG-4");
    public static final EasterEgg RocketShield = new EasterEgg("Rocket Shield");
    public static final EasterEgg WrathOfTheAncients = new EasterEgg("Wrath of the Ancients");
    public static final EasterEgg StormBow = new EasterEgg("Storm Bow");
    public static final EasterEgg WolfBow = new EasterEgg("Wolf Bow");
    public static final EasterEgg VoidBow = new EasterEgg("Void Bow");
    public static final EasterEgg FireBow = new EasterEgg("Fire Bow");

    public static final List<EasterEgg> DerEisendrache_MainQuests = Arrays.asList(
        MyBrothersKeeper
    );
    public static final List<EasterEgg> DerEisendrache_SideQuests = Arrays.asList(
        DeadAgain,
        Samanthaslullaby,
        DiesIrae,
        ControlRoomDisco,
        Plunger,
        SkeletonZombies,
        Newspaper,
        FreeMegaGobbleGum
    );

    public static final List<EasterEgg> DerEisendrache_Buildables = Arrays.asList(
        RagnarokDG4,
        RocketShield,
        WrathOfTheAncients,
        StormBow,
        WolfBow,
        VoidBow,
        FireBow
    );
}
