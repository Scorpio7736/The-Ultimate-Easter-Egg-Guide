package com.example.the_ultimate_easter_egg_guide.MapData.BOII;

import com.example.the_ultimate_easter_egg_guide.Models.EasterEgg.EasterEgg;

import java.util.Arrays;
import java.util.List;

public class Nuketown_EasterEggs
{
    public static final EasterEgg SamanthasLullaby = new EasterEgg("Samanta's Lullaby");
    public static final EasterEgg ComingHome8Bit = new EasterEgg("Coming Home (8-bit) - Song");
    public static final EasterEgg Pareidolia = new EasterEgg("Pareidolia - Song");
    public static final EasterEgg ReDammed8Bit = new EasterEgg("ReDammed (8-bit) - Song");
    public static final EasterEgg RichtofenTV = new EasterEgg("Richtofen TV Transmission");
    public static final EasterEgg MarltonBunker = new EasterEgg("Marlton Bunker");
    public static final EasterEgg TranzitBusHorn = new EasterEgg("Tranzit Bus Horn");
    public static final EasterEgg ZombieEyes = new EasterEgg("Zombie Eyes");


    public static final List<EasterEgg> Nuketown_SideQuests = Arrays.asList(

            SamanthasLullaby,
            ComingHome8Bit,
            Pareidolia,
            ReDammed8Bit,
            RichtofenTV,
            MarltonBunker,
            TranzitBusHorn
    );
    public static final List<EasterEgg> Nuketown_MainQuests = Arrays.asList(
            ZombieEyes
    );
}
