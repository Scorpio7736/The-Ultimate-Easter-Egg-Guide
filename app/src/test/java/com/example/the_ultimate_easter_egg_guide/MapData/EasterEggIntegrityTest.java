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
            // Column widths: MAP(30), TYPE(12), EGG(40), STATUS(10)
            int mapW = 30, typeW = 12, eggW = 40, statusW = 10;
            String header = String.format("%-" + mapW + "s | %-" + typeW + "s | %-" + eggW + "s | %s\n", 
                    "MAP", "TYPE", "EASTER EGG", "STATUS");
            String separator = new String(new char[mapW + typeW + eggW + statusW + 9]).replace("\0", "-") + "\n";
            
            System.err.println(yellow + "DATA INTEGRITY WARNING (Incomplete Easter Eggs found):" + reset);
            System.err.println(header + separator + errorMessage);
        }
    }

    private void checkEggList(String mapName, String type, List<EasterEgg> eggs, StringBuilder errors) {
        String purple = "\u001B[35m";
        String blue = "\u001B[34m";
        String yellow = "\u001B[33m";
        String reset = "\u001B[0m";
        int mapW = 30, typeW = 12, eggW = 40;

        if (eggs == null) return;
        for (EasterEgg egg : eggs) {
            if (egg.easterEggSteps == null || egg.easterEggSteps.isEmpty()) {
                String paddedMap = String.format("%-" + mapW + "s", mapName);
                String paddedType = String.format("%-" + typeW + "s", type);
                String paddedEgg = String.format("%-" + eggW + "s", egg.easterEggName);
                
                errors.append(String.format("%s%s%s | %s%s%s | %s%s%s | %sNO STEPS%s\n", 
                        purple, paddedMap, reset, 
                        blue, paddedType, reset,
                        yellow, paddedEgg, reset,
                        yellow, reset));
            }
        }
    }
}
