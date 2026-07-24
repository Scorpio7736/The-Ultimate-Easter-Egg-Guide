package com.example.the_ultimate_easter_egg_guide.Models.Maps;

import java.util.ArrayList;
import java.util.List;

public abstract class Procedure {
    public String name;
    public List<ProcedureStep> steps = new ArrayList<>();
    public ProcedureOutcome outcome;

    public Procedure(String name) {
        this.name = name;
        this.outcome = null;
    }

    public Procedure(String name, ProcedureOutcome outcome) {
        this.name = name;
        this.outcome = outcome;
    }

    public Procedure addStep(ProcedureStep step) {
        this.steps.add(step);
        return this;
    }
}
