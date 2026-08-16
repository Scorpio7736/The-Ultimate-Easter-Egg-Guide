package com.example.the_ultimate_easter_egg_guide.Models.Tools.RecommendedGobbleGums;

public enum GobbleGumSetTypes
{
    Test("Test"),
    CLASSIC_ONLY("Classic Only"),
    NO_MEGA("No Mega"),
    MEGA_ONLY("Mega Only"),
    WHIMSICAL_ONLY("Whimsical Only"),

    ;
    public final String displayName;

    GobbleGumSetTypes(String displayName)
    {
        this.displayName = displayName;
    }
}
