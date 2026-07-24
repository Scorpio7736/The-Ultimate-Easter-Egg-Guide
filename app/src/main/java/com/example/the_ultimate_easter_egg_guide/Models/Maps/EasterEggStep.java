package com.example.the_ultimate_easter_egg_guide.Models.Maps;

import com.example.the_ultimate_easter_egg_guide.Models.Images.ImageID;

import java.util.Dictionary;
import java.util.List;

public class EasterEggStep extends ProcedureStep {

    public EasterEggStep(String stepName) {
        super(stepName);
    }

    public EasterEggStep(String stepName, List<ProcedureStep> subSteps, boolean hasImages, List<Dictionary<Integer, ImageID>> images) {
        super(stepName, subSteps, hasImages, images);
    }

    public EasterEggStep(String stepName, List<ProcedureStep> subSteps, boolean hasImages) {
        super(stepName, subSteps, hasImages);
    }
}
