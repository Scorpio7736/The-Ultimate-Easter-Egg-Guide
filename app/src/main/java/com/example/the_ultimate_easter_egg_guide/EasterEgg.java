package com.example.the_ultimate_easter_egg_guide;

import java.util.ArrayList;
import java.util.List;

public class EasterEgg
{
    public String easterEggName;
    public List<EasterEggStep> easterEggSteps = new ArrayList<>();


    public EasterEgg(String easterEggName)
    {
        this.easterEggName = easterEggName;
    }

    public EasterEgg(String easterEggName, List<EasterEggStep> easterEggSteps)
    {
        this.easterEggName = easterEggName;
        this.easterEggSteps = easterEggSteps;
    }

    public EasterEgg addStep(EasterEggStep step) {
        this.easterEggSteps.add(step);
        return this;
    }
}
