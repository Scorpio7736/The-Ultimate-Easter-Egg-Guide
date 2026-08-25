package com.example.the_ultimate_easter_egg_guide.Models.Tools.RecommendedGobbleGums;

public enum GobbleGumSetTypes
{
    Test("Test"),
    CLASSIC_ONLY("Classic Only"),
    MEGA("Mega and Below"),
    WHIMSICAL("Whimsical and Fun"),

    ;
    public final String displayName;

    GobbleGumSetTypes(String displayName)
    {
        this.displayName = displayName;
    }
}
