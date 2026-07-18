package com.example.the_ultimate_easter_egg_guide.MapData;

import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEgg;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEggStep;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.MapEggData;
import com.example.the_ultimate_easter_egg_guide.R;

import org.junit.Test;

import java.util.Dictionary;
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
            
            System.err.println(yellow + "INCOMPLETE DATA WARNING (Incomplete Easter Eggs found):" + reset);
            System.err.println(header + separator + errorMessage);
        }
    }

    @Test
    public void verifyAllStepsHaveImages() {
        StringBuilder errors = new StringBuilder();

        for (Maps map : Maps.values()) {
            MapEggData data = map.eggData;
            if (data == null) continue;

            checkStepImages(map.name(), data.mainQuests, errors);
            checkStepImages(map.name(), data.sideQuests, errors);
            checkStepImages(map.name(), data.Buildables, errors);
        }

        String errorMessage = errors.toString();
        if (!errorMessage.isEmpty()) {
            String yellow = "\u001B[33m";
            String reset = "\u001B[0m";
            // Column widths: MAP(30), EGG(40), STEP(50), STATUS(12)
            int mapW = 30, eggW = 40, stepW = 50, statusW = 12;
            String header = String.format("%-" + mapW + "s | %-" + eggW + "s | %-" + stepW + "s | %s\n", 
                    "MAP", "EASTER EGG", "STEP", "STATUS");
            String separator = new String(new char[mapW + eggW + stepW + statusW + 9]).replace("\0", "-") + "\n";
            
            System.err.println(yellow + "MISSING IMAGES WARNING (Placeholders detected):" + reset);
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

    private void checkStepImages(String mapName, List<EasterEgg> eggs, StringBuilder errors) {
        if (eggs == null) return;
        for (EasterEgg egg : eggs) {
            scanStepsForImages(mapName, egg.easterEggName, egg.easterEggSteps, errors);
        }
    }

    private void scanStepsForImages(String mapName, String eggName, List<EasterEggStep> steps, StringBuilder errors) {
        String purple = "\u001B[35m";
        String blue = "\u001B[34m";
        String yellow = "\u001B[33m";
        String reset = "\u001B[0m";
        int mapW = 30, eggW = 40, stepW = 50;

        if (steps == null) return;
        for (EasterEggStep step : steps) {
            if (step.hasImages) {
                boolean missingRealImage = isMissingRealImage(step);

                if (missingRealImage) {
                    String paddedMap = String.format("%-" + mapW + "s", mapName);
                    String paddedEgg = String.format("%-" + eggW + "s", eggName);
                    String displayStepName = step.stepName.length() > stepW ? step.stepName.substring(0, stepW - 3) + "..." : step.stepName;
                    String paddedStep = String.format("%-" + stepW + "s", displayStepName);
                    
                    errors.append(String.format("%s%s%s | %s%s%s | %s%s%s | %sMISSING IMG%s\n", 
                            purple, paddedMap, reset, 
                            blue, paddedEgg, reset,
                            yellow, paddedStep, reset,
                            yellow, reset));
                }
            }
            // Recurse into sub-steps
            scanStepsForImages(mapName, eggName, step.subSteps, errors);
        }
    }

    private boolean isMissingRealImage(EasterEggStep step) {
        if (step.images == null || step.images.isEmpty()) {
            return true;
        }
        for (Dictionary<?, ?> dict : step.images) {
            Object imgId = dict.get(0);
            if (imgId instanceof com.example.the_ultimate_easter_egg_guide.Models.Images.ImageID) {
                if (((com.example.the_ultimate_easter_egg_guide.Models.Images.ImageID) imgId).GetImageID() == R.drawable.app_icon) {
                    return true;
                }
            }
        }
        return false;
    }
}
