package com.example.the_ultimate_easter_egg_guide.ToolsData;

import com.example.the_ultimate_easter_egg_guide.MapData.Maps;
import com.example.the_ultimate_easter_egg_guide.Models.Tools.RecommendedGobbleGums.GobbleGumSet;
import com.example.the_ultimate_easter_egg_guide.Models.Tools.RecommendedGobbleGums.GobbleGumSetTypes;

import java.util.List;

public enum PlayerGumSets
{
    TEST_SET("Test Set", Maps.Test_TestingMap1, GobbleGumSetTypes.Test, new GobbleGumSet(GobbleGums.TEST, GobbleGums.TEST, GobbleGums.TEST, GobbleGums.TEST, GobbleGums.TEST)),
    SHADOWS_OF_EVIL_SET("Shadows of Evil", Maps.BOIII_Shadows_Of_Evil, GobbleGumSetTypes.CLASSIC_ONLY, new GobbleGumSet()),
    THE_GIANT_SET("The Giant", Maps.BOIII_The_Giant, GobbleGumSetTypes.CLASSIC_ONLY, new GobbleGumSet()),
    DER_EISENDRACHE_SET("Der Eisendrache", Maps.BOIII_Der_Eisendrache, GobbleGumSetTypes.CLASSIC_ONLY, new GobbleGumSet()),
    ZETSUBO_NO_SHIMA_SET("Zetsubo noshima", Maps.BOIII_Zetsubou_No_Shima, GobbleGumSetTypes.CLASSIC_ONLY, new GobbleGumSet()),
    GOROD_KROVI_SET("Grod Krovi", Maps.BOIII_Gorod_Krovi, GobbleGumSetTypes.CLASSIC_ONLY, new GobbleGumSet()),
    REVELATIONS_SET("Revelations", Maps.BOIII_Revelations, GobbleGumSetTypes.CLASSIC_ONLY, new GobbleGumSet()),


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
