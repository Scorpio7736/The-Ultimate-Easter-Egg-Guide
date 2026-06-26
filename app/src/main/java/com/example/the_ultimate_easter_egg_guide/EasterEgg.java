package com.example.the_ultimate_easter_egg_guide;

import java.util.ArrayList;
import java.util.List;

public class EasterEgg
{
    public String easterEggName;
    public List<EasterEggStep> easterEggSteps = new ArrayList<EasterEggStep>();


    public EasterEgg(String easterEggName, List<EasterEggStep> easterEggSteps)
    {
        this.easterEggName = easterEggName;
        this.easterEggSteps = easterEggSteps;
    }
}
