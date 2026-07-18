package com.example.the_ultimate_easter_egg_guide.Models;

import java.util.Arrays;
import java.util.List;

public enum Games {
    Test("Test", "TST"),
    World_At_War("World at War", "waw"),
    Black_Ops_I("Black Ops 1", "boi"),
    Black_Ops_II("Black Ops 2", "boii"),
    Black_Ops_III("Black Ops 3", "boiii"),
    Black_Ops_IV("Black Ops 4", "boiv"),
    Black_Ops_Cold_War("Black Ops Cold War", "bocw"),
    Black_Ops_VI("Black Ops 6", "bovi"),
    Black_Ops_VII("Black Ops 7", "bovii");

    public final String gameName;
    public final String gameCode;

    public static final List<Games> gamesList = Arrays.asList(Games.values());

    Games(String gameName, String gameCode)
    {
        this.gameName = gameName;
        this.gameCode = gameCode;
    }

    public static List<Games> GetAllGamesBetween(Games start, Games end)
    {
        return gamesList.subList(gamesList.indexOf(start), gamesList.indexOf(end));
    }

    public static List<Games> getVisibleGames(boolean enableTesting) {
        if (enableTesting) {
            return List.of(Games.Test);
        } else {
            return gamesList.stream()
                    .filter(g -> g != Games.Test &&
                                    g != Games.Black_Ops_IV &&
                                    g != Games.Black_Ops_Cold_War &&
                                    g != Games.Black_Ops_VI &&
                                    g != Games.Black_Ops_VII
                    )
                    .collect(java.util.stream.Collectors.toList());
        }
    }
}