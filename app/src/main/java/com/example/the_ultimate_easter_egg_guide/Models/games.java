package com.example.the_ultimate_easter_egg_guide.Models;

import java.util.Arrays;
import java.util.List;

public enum games {
    Test("Test"),
    World_At_War("World at War"),
    Black_Ops_I("Black Ops 1"),
    Black_Ops_II("Black Ops 2"),
    Black_Ops_III("Black Ops 3"),
    Black_Ops_IV("Black Ops 4"),
    Black_Ops_Cold_War("Black Ops Cold War"),
    Black_Ops_VI("Black Ops 6"),
    Black_Ops_VII("Black Ops 7");

    public final String gameName;

    public static final List<games> gamesList = Arrays.asList(games.values());

    games(String gameName)
    {
        this.gameName = gameName;
    }
}