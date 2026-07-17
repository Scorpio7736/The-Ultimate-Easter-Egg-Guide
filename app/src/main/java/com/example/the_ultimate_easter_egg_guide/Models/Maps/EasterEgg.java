package com.example.the_ultimate_easter_egg_guide.Models.Maps;

import java.util.ArrayList;
import java.util.List;

public class EasterEgg
{
    public String easterEggName;
    public List<EasterEggStep> easterEggSteps = new ArrayList<>();
    public EasterEggReward easterEggReward;

    public EasterEgg(String easterEggName)
    {
        this.easterEggName = easterEggName;
        this.easterEggReward = null;
    }

    public EasterEgg(String easterEggName, String easterEggReward)
    {
        this.easterEggName = easterEggName;
        this.easterEggReward = new EasterEggReward(easterEggReward);
    }

    public EasterEgg addStep(EasterEggStep step) {
        this.easterEggSteps.add(step);
        return this;
    }
}
