package com.example.the_ultimate_easter_egg_guide.Models.Maps;

import com.example.the_ultimate_easter_egg_guide.Models.Images.ImageID;
import com.example.the_ultimate_easter_egg_guide.R;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;

public abstract class ProcedureStep {
    public String name;
    public List<ProcedureStep> subSteps = new ArrayList<>();
    public boolean hasImages = false;
    public List<Dictionary<Integer, ImageID>> images = new ArrayList<>();

    public ProcedureStep(String name) {
        this.name = name;
    }

    public ProcedureStep(String name, List<ProcedureStep> subSteps, boolean hasImages, List<Dictionary<Integer, ImageID>> images) {
        this.name = name;
        this.subSteps = subSteps;
        this.hasImages = hasImages;
        this.images = images;
    }

    public ProcedureStep(String name, List<ProcedureStep> subSteps, boolean hasImages) {
        this.name = name;
        this.subSteps = subSteps;
        this.hasImages = hasImages;
    }

    public ProcedureStep addSubStep(ProcedureStep step) {
        this.subSteps.add(step);
        return this;
    }

    public ProcedureStep addImage(int resId) {
        java.util.Hashtable<Integer, ImageID> dict = new java.util.Hashtable<>();
        dict.put(0, new ImageID(resId));
        this.images.add(dict);
        this.hasImages = true;
        return this;
    }

    public ProcedureStep addImage() {
        java.util.Hashtable<Integer, ImageID> dict = new java.util.Hashtable<>();
        dict.put(0, new ImageID(R.drawable.app_icon));
        this.images.add(dict);
        this.hasImages = true;
        return this;
    }

    public int GetImageOnStep(int stepNumber) {
        for (int i = 0; i < images.size(); i++) {
            if (i == stepNumber) {
                return images.get(i).get(0).GetImageID();
            }
        }
        return -1;
    }
}
