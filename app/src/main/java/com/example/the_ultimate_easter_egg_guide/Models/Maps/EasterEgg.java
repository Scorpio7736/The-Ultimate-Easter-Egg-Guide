package com.example.the_ultimate_easter_egg_guide.Models.Maps;

public class EasterEgg extends Procedure {

    public EasterEgg(String easterEggName) {
        super(easterEggName);
    }

    public EasterEgg(String easterEggName, String easterEggReward) {
        super(easterEggName, new EasterEggReward(easterEggReward));
    }

    @Override
    public EasterEgg addStep(ProcedureStep step) {
        super.addStep(step);
        return this;
    }
}
