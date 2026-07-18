package com.example.the_ultimate_easter_egg_guide.MapData;

import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEgg;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.MapEggData;

import org.junit.Test;
import java.util.List;

public class EasterEggIntegrityTest {

    @Test
    public void verifyAllEasterEggsHaveSteps() {
        StringBuilder errors = new StringBuilder();

        for (Maps map : Maps.values()) {
            MapEggData data = map.eggData;
            if (data == null) continue;

            checkEggList(map.name(), "Main Quest", data.mainQuests, errors);
            checkEggList(map.name(), "Side Quest", data.sideQuests, errors);
            checkEggList(map.name(), "Buildable", data.Buildables, errors);
        }

        String errorMessage = errors.toString();
        if (!errorMessage.isEmpty()) {
            String yellow = "\u001B[33m";
            String reset = "\u001B[0m";
            String header = String.format("%-20s | %-30s | %-12s | %-40s | %s\n", "VIEW", "MAP", "TYPE", "EASTER EGG", "STATUS");
            String separator = "------------------------------------------------------------------------------------------------------------------------------\n";
            System.err.println(yellow + "DATA INTEGRITY WARNING (Incomplete Easter Eggs found):" + reset);
            System.err.println(header + separator + errorMessage);
        }
    }

    private void checkEggList(String mapName, String type, List<EasterEgg> eggs, StringBuilder errors) {
        String purple = "\u001B[35m";
        String blue = "\u001B[34m";
        String yellow = "\u001B[33m";
        String reset = "\u001B[0m";

        if (eggs == null) return;
        for (EasterEgg egg : eggs) {
            if (egg.easterEggSteps == null || egg.easterEggSteps.isEmpty()) {
                // Clickable link format for Android Studio console
                String viewLink = "(Maps.java:1)"; 
                
                // Formatting with padding for alignment
                String paddedView = String.format("%-20s", viewLink);
                String paddedMap = String.format("%-30s", mapName);
                String paddedType = String.format("%-12s", type);
                String paddedEgg = String.format("%-40s", egg.easterEggName);
                
                errors.append(String.format("%s | %s%s%s | %s%s%s | %s%s%s | %sNO STEPS%s\n", 
                        paddedView,
                        purple, paddedMap, reset, 
                        blue, paddedType, reset,
                        yellow, paddedEgg, reset,
                        yellow, reset));
            }
        }
    }
}
