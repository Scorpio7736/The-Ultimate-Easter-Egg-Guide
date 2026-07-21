package com.example.the_ultimate_easter_egg_guide.Models.Tools.RecommendedGobbleGums;

public enum GobbleGumColors
{
    BLUE("Round-Limited"),
    ORANGE("Immediate Activation / Conditional Activation"),
    GREEN("Time-Limited"),
    PURPLE("Player Activated"),
    ;
    public final String colorMeaning;
    GobbleGumColors(String colorMeaning)
    {
        this.colorMeaning = colorMeaning;
    }
}
