package com.example.the_ultimate_easter_egg_guide.ToolsData;

import com.example.the_ultimate_easter_egg_guide.MapData.Maps;
import com.example.the_ultimate_easter_egg_guide.Models.Tools.RecommendedGobbleGums.GobbleGumSet;
import com.example.the_ultimate_easter_egg_guide.Models.Tools.RecommendedGobbleGums.GobbleGumSetTypes;

import java.util.List;

public enum PlayerGumSets
{
    TEST_SET("Test Set", Maps.Test_TestingMap1, GobbleGumSetTypes.Test, new GobbleGumSet(GobbleGums.TEST, GobbleGums.TEST, GobbleGums.TEST, GobbleGums.TEST, GobbleGums.TEST)),
    NACHT_SET("Nacht der Untoten", Maps.WAW_Nacht_Der_Untoten, GobbleGumSetTypes.CLASSIC_ONLY, new GobbleGumSet()),


    ;

    public final String setName;
    public final Maps map;
    public final GobbleGumSetTypes setType;
    public final GobbleGumSet gums;

    PlayerGumSets(String setName, Maps map, GobbleGumSetTypes setType, GobbleGumSet gums)
    {
        this.setName = setName;
        this.map = map;
        this.setType = setType;
        this.gums = gums;
    }

}
