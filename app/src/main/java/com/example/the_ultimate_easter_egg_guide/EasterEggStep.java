package com.example.the_ultimate_easter_egg_guide;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class EasterEggStep
{
    public String stepName;
    public List<EasterEggStep> subSteps = new ArrayList<EasterEggStep>();
    public boolean hasImages = false;

    public List<Map<Integer, ImageID>> images = new ArrayList<Map<Integer, ImageID>>();


    public EasterEggStep(String stepName, List<EasterEggStep> subSteps, boolean hasImages, List<Map<Integer, ImageID>> images)
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