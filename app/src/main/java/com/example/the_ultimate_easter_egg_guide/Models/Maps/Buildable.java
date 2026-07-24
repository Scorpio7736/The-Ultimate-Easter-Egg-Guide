package com.example.the_ultimate_easter_egg_guide.Models.Maps;

public class Buildable extends Procedure {

    public Buildable(String name) {
        super(name);
    }

    public Buildable(String name, String outcomeDescription) {
        super(name, new BuildableOutcome(outcomeDescription));
    }

    public Buildable(String name, BuildableOutcome outcome) {
        super(name, outcome);
    }

    @Override
    public Buildable addStep(ProcedureStep step) {
        super.addStep(step);
        return this;
    }
}
