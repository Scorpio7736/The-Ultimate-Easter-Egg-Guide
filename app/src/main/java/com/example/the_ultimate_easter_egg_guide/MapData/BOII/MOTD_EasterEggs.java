package com.example.the_ultimate_easter_egg_guide.MapData.BOII;

import com.example.the_ultimate_easter_egg_guide.Models.EasterEgg.EasterEgg;

import java.util.Arrays;
import java.util.List;

public class MOTD_EasterEggs {
    public static final EasterEgg PopGoesTheWeasel = new EasterEgg("Pop Goes the Weasel");
    public static final EasterEgg RustCage = new EasterEgg("Rusty Cage - Song");
    public static final EasterEgg WhereAreWeGoing = new EasterEgg("Where Are We Going - Song");
    public static final EasterEgg SecretEnding = new EasterEgg("Secret Ending");
    public static final EasterEgg JumpScare = new EasterEgg("Jump Scare");
    public static final EasterEgg AudioLogs = new EasterEgg("Audio Logs");
    public static final EasterEgg GoldenSpork = new EasterEgg("Golden Spork");
    public static final EasterEgg Brutus115 = new EasterEgg("Brutus 115");
    public static final EasterEgg CiphersAndScrapPaper = new EasterEgg("Ciphers and Scrap Paper");
    public static final EasterEgg FreeBlundergat = new EasterEgg("Free Blundergat");
    public static final EasterEgg HellsRetriever = new EasterEgg("Hell's Retriever");
    public static final EasterEgg HellsRedeemer = new EasterEgg("Hell's Redeemer");
    public static final EasterEgg AcidGatKit = new EasterEgg("Acid Gat Kit");
    public static final EasterEgg ZombieShield = new EasterEgg("Zombie Shield");
    public static final EasterEgg PackAPunch = new EasterEgg("Pack A Punch");


    public static final List<EasterEgg> MOTD_MainQuests = Arrays.asList(
        PopGoesTheWeasel
    );
    public static final List<EasterEgg> MOTD_SideQuests = Arrays.asList(
        RustCage,
        WhereAreWeGoing,
        SecretEnding,
        JumpScare,
        AudioLogs,
        GoldenSpork,
        Brutus115,
        CiphersAndScrapPaper
    );
    public static final List<EasterEgg> MOTD_Buildables = Arrays.asList(
        FreeBlundergat,
        HellsRetriever,
        HellsRedeemer,
        AcidGatKit,
        ZombieShield,
        PackAPunch
    );
}
