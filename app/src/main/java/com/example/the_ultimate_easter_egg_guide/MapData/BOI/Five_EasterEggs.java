package com.example.the_ultimate_easter_egg_guide.MapData.BOI;

import com.example.the_ultimate_easter_egg_guide.Models.EasterEgg.EasterEgg;

import java.util.Arrays;
import java.util.List;

public class Five_EasterEggs
{
    public static final EasterEgg WontBackDown = new EasterEgg("Wont Back Down - Song");
    public static final EasterEgg RedPhones = new EasterEgg("The Red Phones");

    public static final List<EasterEgg> Five_SideQuests = Arrays.asList(
        WontBackDown,
        RedPhones
    );
}
