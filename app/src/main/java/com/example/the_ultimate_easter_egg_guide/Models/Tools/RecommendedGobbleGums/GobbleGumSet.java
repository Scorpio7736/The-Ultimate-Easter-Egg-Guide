package com.example.the_ultimate_easter_egg_guide.Models.Tools.RecommendedGobbleGums;

import com.example.the_ultimate_easter_egg_guide.ToolsData.GobbleGums;

public class GobbleGumSet
{
    public final GobbleGums gum1;
    public final GobbleGums gum2;
    public final GobbleGums gum3;
    public final GobbleGums gum4;
    public final GobbleGums gum5;

    public GobbleGumSet(GobbleGums gum1, GobbleGums gum2, GobbleGums gum3, GobbleGums gum4, GobbleGums gum5)
    {
        this.gum1 = gum1;
        this.gum2 = gum2;
        this.gum3 = gum3;
        this.gum4 = gum4;
        this.gum5 = gum5;
    }

    public GobbleGumSet()
    {
        this.gum1 = GobbleGums.ALWAYS_DONE_SWIFTLY;
        this.gum2 = GobbleGums.ARMS_GRACE;
        this.gum3 = GobbleGums.COAGULANT;
        this.gum4 = GobbleGums.IN_PLAIN_SIGHT;
        this.gum5 = GobbleGums.STOCK_OPTION;
    }

}
