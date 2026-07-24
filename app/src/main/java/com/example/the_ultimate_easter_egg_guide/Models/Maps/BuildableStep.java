package com.example.the_ultimate_easter_egg_guide.Models.Maps;

import com.example.the_ultimate_easter_egg_guide.Models.Images.ImageID;

import java.util.Dictionary;
import java.util.List;

public class BuildableStep extends ProcedureStep {

    public BuildableStep(String name) {
        super(name);
    }

    public BuildableStep(String name, List<ProcedureStep> subSteps, boolean hasImages, List<Dictionary<Integer, ImageID>> images) {
        super(name, subSteps, hasImages, images);
    }

    public BuildableStep(String name, List<ProcedureStep> subSteps, boolean hasImages) {
        super(name, subSteps, hasImages);
    }
}
