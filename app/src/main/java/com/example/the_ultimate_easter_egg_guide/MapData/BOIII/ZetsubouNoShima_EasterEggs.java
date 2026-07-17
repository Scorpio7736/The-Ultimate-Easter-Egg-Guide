package com.example.the_ultimate_easter_egg_guide.MapData.BOIII;

import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEgg;

import java.util.Arrays;
import java.util.List;

public class ZetsubouNoShima_EasterEggs
{
    public static final EasterEgg SeedsOfDoubt = new EasterEgg("Seeds of Doubt");
    public static final EasterEgg DeadFlowers = new EasterEgg("Dead Flowers - Song");
    public static final EasterEgg SamanthasLullaby = new EasterEgg("Samantha's Lullaby - Song");
    public static final EasterEgg Round50Monster = new EasterEgg("Round 50 Monster");
    public static final EasterEgg OneTooMany = new EasterEgg("One Too Many");
    public static final EasterEgg TheMissingCityPoster = new EasterEgg("The Missing City Poster");
    public static final EasterEgg DoppelgangerJumpscare = new EasterEgg("Doppelganger Jumpscare");
    public static final EasterEgg KT4 = new EasterEgg("KT-4");
    public static final EasterEgg Masamune = new EasterEgg("Masamune");
    public static final EasterEgg ZombieShield = new EasterEgg("Zombie Shield");
    public static final EasterEgg GasMask = new EasterEgg("Gas Mask");
    public static final EasterEgg SkullOfNanSapwe = new EasterEgg("Skull of Nan Sapwe");
    public static final EasterEgg SpiderBait = new EasterEgg("Spider Bait");

    public static final List<EasterEgg> ZetsubouNoShima_MainQuests = Arrays.asList(
        SeedsOfDoubt
    );
    public static final List<EasterEgg> ZetsubouNoShima_SideQuests = Arrays.asList(
        DeadFlowers,
        SamanthasLullaby,
        Round50Monster,
        OneTooMany,
        TheMissingCityPoster,
        DoppelgangerJumpscare
    );

    public static final List<EasterEgg> ZetsubouNoShima_Buildables = Arrays.asList(
        KT4,
        Masamune,
        ZombieShield,
        GasMask,
        SkullOfNanSapwe,
        SpiderBait
    );
}
