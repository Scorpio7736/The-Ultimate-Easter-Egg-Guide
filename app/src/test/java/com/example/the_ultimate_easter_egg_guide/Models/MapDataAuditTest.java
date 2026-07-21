package com.example.the_ultimate_easter_egg_guide.Models;

import com.example.the_ultimate_easter_egg_guide.MapData.Maps;
import com.example.the_ultimate_easter_egg_guide.MapData.MapsWarehouse;
import com.example.the_ultimate_easter_egg_guide.R;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.util.ArrayList;
import java.util.List;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = 33)
public class MapDataAuditTest {

    @Test
    public void auditAllMapData() {
        List<MapAuditResult> failures = new ArrayList<>();

        for (Games game : Games.values()) {
            if (game == Games.Test) continue;

            List<Maps> maps = MapsWarehouse.getMapsForGame(game);
            for (Maps map : maps) {
                List<String> issues = new ArrayList<>();

                if (map.mapCover <= 0 || map.mapCover == R.drawable.app_icon) {
                    issues.add("Missing Cover");
                }
                if (map.mapDescription <= 0) {
                    issues.add("Missing Desc");
                }
                if (map.mapTrailer == -1) {
                    issues.add("Missing Trailer");
                }
                if (map.eggData == null) {
                    issues.add("Missing EggData");
                }

                if (!issues.isEmpty()) {
                    failures.add(new MapAuditResult(map.name(), game.gameName, String.join(", ", issues)));
                }
            }
        }

        if (!failures.isEmpty()) {
            // ANSI Color Codes
            String PURPLE = "\u001B[35m";
            String BLUE = "\u001B[34m";
            String YELLOW = "\u001B[33m";
            String RESET = "\u001B[0m";

            System.out.println("\n### " + YELLOW + "MAP DATA AUDIT" + RESET + " ###\n");

            // Calculate max column widths
            int maxMap = "Map Name".length();
            int maxGame = "Game".length();
            int maxIssue = "Issues".length();
            for (MapAuditResult res : failures) {
                maxMap = Math.max(maxMap, res.mapName.length());
                maxGame = Math.max(maxGame, res.gameName.length());
                maxIssue = Math.max(maxIssue, res.issues.length());
            }

            String format = "| %-" + maxMap + "s | %-" + maxGame + "s | %-" + maxIssue + "s |%n";
            
            // Print Header
            System.out.format(format, "Map Name", "Game", "Issues");
            System.out.println("| " + "-".repeat(maxMap) + " | " + "-".repeat(maxGame) + " | " + "-".repeat(maxIssue) + " |");

            // Print Rows
            for (MapAuditResult res : failures) {
                String mapStr = PURPLE + res.mapName + RESET + " ".repeat(Math.max(0, maxMap - res.mapName.length()));
                String gameStr = BLUE + res.gameName + RESET + " ".repeat(Math.max(0, maxGame - res.gameName.length()));
                String issueStr = YELLOW + res.issues + RESET;
                
                System.out.println("| " + mapStr + " | " + gameStr + " | " + issueStr + " |");
            }
            System.out.println();
        } else {
            System.out.println("\nAll map data is complete.\n");
        }
    }

    private static class MapAuditResult {
        final String mapName;
        final String gameName;
        final String issues;

        MapAuditResult(String mapName, String gameName, String issues) {
            this.mapName = mapName;
            this.gameName = gameName;
            this.issues = issues;
        }
    }
}
