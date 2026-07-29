package com.example.the_ultimate_easter_egg_guide.Models.Tools.RecommendedGobbleGums;

public enum GobbleGumSetTypes
{
    Test("Test"),
    STANDARD("Standard"),
    NO_MEGA("No Mega"),
    CLASSIC_ONLY("Classic Only"),
    MEGA_ONLY("Mega Only"),
    WHIMSICAL_ONLY("Whimsical Only"),

    ;
    public final String displayName;

    GobbleGumSetTypes(String displayName)
    {
        this.displayName = displayName;
    }
}
