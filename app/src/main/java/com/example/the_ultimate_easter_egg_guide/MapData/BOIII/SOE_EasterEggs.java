package com.example.the_ultimate_easter_egg_guide.MapData.BOIII;

import com.example.the_ultimate_easter_egg_guide.Models.EasterEgg.EasterEgg;

import java.util.Arrays;
import java.util.List;

public class SOE_EasterEggs
{
    public static final EasterEgg RocketShield = new EasterEgg("Rocket Shield");
    public static final EasterEgg ApothiconServant = new EasterEgg("Apothicon Servant");
    public static final EasterEgg ApocalypseAverted = new EasterEgg("Apocalypse Averted", "The Beginning of the End (after Ascending the Apocalypse). Apocalypse Averted: Dark Ops Calling Card, Summoning Key icon on map select, 1000 XP + 6000 XP first-time. Reborn Keeper Swords returned; Civil Protector upgraded for the rest of the match.");
    public static final EasterEgg SnakeskinBoots = new EasterEgg("Snakeskin Boots");
    public static final EasterEgg ColdHardCash = new EasterEgg("Cold Hard Cash");
    public static final EasterEgg GoddardApparatus = new EasterEgg("Goddard Apparatus");
    public static final EasterEgg FreeMegaGobbleGum = new EasterEgg("Free Mega GobbleGum");
    public static final EasterEgg TripMineUpgrade = new EasterEgg("Trip Mine Upgrade");
    public static final EasterEgg DocksJumpscare = new EasterEgg("Docks Jumpscare");
    public static final EasterEgg NoirMode = new EasterEgg("Noir Mode");
    public static final EasterEgg PictureCipher = new EasterEgg("Picture Cipher");
    public static final EasterEgg SalDeLucaReference = new EasterEgg("Sal DeLuca Reference");
    public static final EasterEgg ShadowManRoundSkip = new EasterEgg("ShadowMan Round Skip");


    public static final List<EasterEgg> SOE_MainQuests = Arrays.asList(
        ApocalypseAverted
    );

    public static final List<EasterEgg> SOE_SideQuests = Arrays.asList(
        SnakeskinBoots,
        ColdHardCash,
        GoddardApparatus,
        FreeMegaGobbleGum,
        TripMineUpgrade,
        DocksJumpscare,
        NoirMode,
        PictureCipher,
        SalDeLucaReference,
        ShadowManRoundSkip
    );

    public static final List<EasterEgg> SOE_Buildables = Arrays.asList(
        RocketShield,
        ApothiconServant
    );
}
