package com.example.the_ultimate_easter_egg_guide.Models.Maps;
import com.example.the_ultimate_easter_egg_guide.Models.Images.ImageID;
import com.example.the_ultimate_easter_egg_guide.R;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;


public class EasterEggStep
{
    public String stepName;
    public List<EasterEggStep> subSteps = new ArrayList<EasterEggStep>();
    public boolean hasImages = false;

    public List<Dictionary<Integer, ImageID>> images = new ArrayList<>();


    public EasterEggStep(String stepName)
    {
        this.stepName = stepName;
    }

    public EasterEggStep(String stepName, List<EasterEggStep> subSteps, boolean hasImages, List<Dictionary<Integer, ImageID>> images)
    {
        this.stepName = stepName;
        this.subSteps = subSteps;
        this.hasImages = hasImages;
        this.images = images;
    }

    public EasterEggStep(String stepName, List<EasterEggStep> subSteps, boolean hasImages)
    {
        this.stepName = stepName;
        this.subSteps = subSteps;
        this.hasImages = hasImages;
    }

    public EasterEggStep addSubStep(EasterEggStep step) {
        this.subSteps.add(step);
        return this;
    }

    public EasterEggStep addImage(int resId) {
        java.util.Hashtable<Integer, ImageID> dict = new java.util.Hashtable<>();
        dict.put(0, new ImageID(resId));
        this.images.add(dict);
        this.hasImages = true;
        return this;
    }

    public EasterEggStep addImage() {
        java.util.Hashtable<Integer, ImageID> dict = new java.util.Hashtable<>();
        dict.put(0, new ImageID(R.drawable.app_icon));
        this.images.add(dict);
        this.hasImages = true;
        return this;
    }

    public int GetImageOnStep(int stepNumber)
    {
        for (int i = 0; i < images.size(); i++)
        {
            if (i == stepNumber)
            {
                return images.get(i).get(0).GetImageID();
            }
        }
        return -1;
    }
}