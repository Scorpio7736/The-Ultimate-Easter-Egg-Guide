package com.example.the_ultimate_easter_egg_guide.MapData.BOI;

import com.example.the_ultimate_easter_egg_guide.Models.EasterEgg.EasterEgg;

import java.util.Arrays;
import java.util.List;

public class Ascension_EasterEggs
{
    public static final EasterEgg CasimirMechanism = new EasterEgg("Casimir Mechanism");
    public static final EasterEgg Abracadavre= new EasterEgg("Abracadavre - Song");
    public static final EasterEgg MatryoshkaDolls= new EasterEgg("Matryoshka Dolls");
    public static final EasterEgg RedPhones = new EasterEgg("The Red Phones");
    public static final EasterEgg Sparky = new EasterEgg("Sparky");
    public static final EasterEgg RocketDestruction = new EasterEgg("Rocket Destruction");


    public static final List<EasterEgg> Ascension_MainQuests = Arrays.asList(
        CasimirMechanism
    );
    public static final List<EasterEgg> Ascension_SideQuests = Arrays.asList(
        Abracadavre,
        MatryoshkaDolls,
        RedPhones,
        Sparky,
        RocketDestruction
    );
}
