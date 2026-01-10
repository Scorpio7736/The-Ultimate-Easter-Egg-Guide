package com.example.the_ultimate_easter_egg_guide;

import java.util.List;

public class zm_Quest
{
    String questName;
    List<StepImagePair> questSteps;


    public zm_Quest(String questName, List<StepImagePair> questSteps)
    {
        this.questName = questName;
        this.questSteps = questSteps;
    }

}
