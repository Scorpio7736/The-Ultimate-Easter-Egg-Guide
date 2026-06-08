package com.example.the_ultimate_easter_egg_guide;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum MapNames
{
    // --------------------------------- Test MAPS ---------------------------------

     Test_TestingMap1(games.Test, "Testing Map 1"),
    Test_TestingMap2(games.Test, "Testing Map 2"),
    Test_TestingMap3(games.Test, "Testing Map 3"),
    Test_TestingMap4(games.Test, "Testing Map 4"),

    // --------------------------------- WORLD AT WAR MAPS ---------------------------------
    WAW_Nacht_Der_Untoten(games.World_At_War, "Nacht der Untoten"),
    WAW_Shi_No_Numa(games.World_At_War, "Shi No Numa"),
    WAW_Verruckt(games.World_At_War, "Verruckt"),
    WAW_Der_Riese(games.World_At_War, "Der Riese"),

    // --------------------------------- Black Ops I MAPS ---------------------------------

    BOI_Kino_Der_Toten(games.Black_Ops_I, "Kino der Untoten"),
    BOI_Five(games.Black_Ops_I, "Five"),
    BOI_Ascension(games.Black_Ops_I, "Ascension"),
    BOI_Call_Of_The_Dead(games.Black_Ops_I, "Call of the Dead"),
    BOI_Shangri_La(games.Black_Ops_I, "Shangri La"),
    BOI_Moon(games.Black_Ops_I, "Moon"),

    // --------------------------------- Black Ops II MAPS ---------------------------------

    BOII_Farm(games.Black_Ops_II, "Farm"),
    BOII_Bus_Depot(games.Black_Ops_II, "Bus Depot"),
    BOII_Nuketown(games.Black_Ops_II, "Nuketown"),
    BOII_Die_Rise(games.Black_Ops_II, "Die Rise"),
    BOII_Mob_Of_The_Dead(games.Black_Ops_II, "Mob of the Dead"),
    BOII_Buried(games.Black_Ops_II, "Buried"),
    BOII_Origins(games.Black_Ops_II, "Origins"),

    // --------------------------------- Black Ops III MAPS ---------------------------------

    BOIII_Shadows_Of_Evil(games.Black_Ops_III, "Shadows of Evil"),
    BOIII_The_Giant(games.Black_Ops_III, "The Giant"),
    BOIII_Der_Eisendrache(games.Black_Ops_III, "Der Eisendrache"),
    BOIII_Zetsubou_No_Shima(games.Black_Ops_III, "Zetsubou No Shima"),
    BOIII_Gorod_Krovi(games.Black_Ops_III, "Gorod Krovi"),
    BOIII_Revelations(games.Black_Ops_III, "Revelations"),
    BOIII_Nacht_Der_Untoten(games.Black_Ops_III, "Nacht der Untoten"),
    BOIII_Verruckt(games.Black_Ops_III, "Verruckt"),
    BOIII_Shi_No_Numa(games.Black_Ops_III, "Shi No Numa"),
    BOIII_Kino_Der_Toten(games.Black_Ops_III, "Kino der toten"),
    BOIII_Ascension(games.Black_Ops_III, "Ascension"),
    BOIII_Shangri_La(games.Black_Ops_III, "Shangri La"),
    BOIII_Moon(games.Black_Ops_III, "Moon"),
    BOIII_Origins(games.Black_Ops_III, "Origins"),


    // --------------------------------- Black Ops IV MAPS ---------------------------------

    BOIv_Dead_Of_The_Night(games.Black_Ops_IV, "Dead of the Night"),
    BOIV_Ancient_Evil(games.Black_Ops_IV, "Ancient Evil"),
    BOIV_Alpha_Omega(games.Black_Ops_IV, "Alpha Omega"),
    BOIV_Tag_Der_Toten(games.Black_Ops_IV, "Tag der toten"),
    BOIV_Blood_Of_The_Dead(games.Black_Ops_IV, "Blood of the Dead"),
    BOIV_Classified(games.Black_Ops_IV, "Classified"),
    BOIV_Voyage_Of_Dispair(games.Black_Ops_IV, "Voyage of Dispair"),
    BOIV_IX(games.Black_Ops_IV, "IX"),


    // --------------------------------- Black Ops Cold War MAPS ---------------------------------

    BOCW_Die_Maschine(games.Black_Ops_Cold_War, "Die Maschine"),
    BOCW_Firebase_Z(games.Black_Ops_Cold_War, "Firebase Z"),
    BOCW_Mauer_Der_Toten(games.Black_Ops_Cold_War, "Mauer der toten"),
    BOCW_Forsaken(games.Black_Ops_Cold_War, "Forsaken");

    // --------------------------------- Black Ops VI MAPS ---------------------------------
    // --------------------------------- Black Ops VII MAPS ---------------------------------


    public final games gameName;
    public final String mapName;

    MapNames(games game, String mapName)
    {
        this.gameName = game;
        this.mapName = mapName;
    }


    // --------------------------------- Game Map Lists ---------------------------------
    public static final ArrayList<MapNames> Test_Maps = new ArrayList<>(List.of(
            Test_TestingMap1,
            Test_TestingMap2,
            Test_TestingMap3,
            Test_TestingMap4
    ));


    public static final ArrayList<MapNames> WAW_Maps = new ArrayList<>(List.of(
            WAW_Nacht_Der_Untoten,
            WAW_Shi_No_Numa,
            WAW_Verruckt,
            WAW_Der_Riese
    ));

    public static final ArrayList<MapNames> BOI_Maps = new ArrayList<>(List.of(
            BOI_Kino_Der_Toten,
            BOI_Five,
            BOI_Ascension,
            BOI_Call_Of_The_Dead,
            BOI_Shangri_La,
            BOI_Moon
    ));

    public static final ArrayList<MapNames> BOII_Maps = new ArrayList<>(List.of(
            BOII_Farm,
            BOII_Bus_Depot,
            BOII_Nuketown,
            BOII_Die_Rise,
            BOII_Mob_Of_The_Dead,
            BOII_Buried,
            BOII_Origins
    ));

    public static final ArrayList<MapNames> BOIII_Maps = new ArrayList<>(List.of(
            BOIII_Shadows_Of_Evil,
            BOIII_The_Giant,
            BOIII_Der_Eisendrache,
            BOIII_Zetsubou_No_Shima,
            BOIII_Gorod_Krovi,
            BOIII_Revelations,
            BOIII_Nacht_Der_Untoten,
            BOIII_Verruckt,
            BOIII_Shi_No_Numa,
            BOIII_Kino_Der_Toten,
            BOIII_Ascension,
            BOIII_Shangri_La,
            BOIII_Moon,
            BOIII_Origins
    ));

    public static final ArrayList<MapNames> BOIV_Maps = new ArrayList<>(List.of(
            BOIv_Dead_Of_The_Night,
            BOIV_Ancient_Evil,
            BOIV_Alpha_Omega,
            BOIV_Tag_Der_Toten,
            BOIV_Blood_Of_The_Dead,
            BOIV_Classified,
            BOIV_Voyage_Of_Dispair,
            BOIV_IX
    ));

    public static final ArrayList<MapNames> BOCW_Maps = new ArrayList<>(List.of(
            BOCW_Die_Maschine,
            BOCW_Firebase_Z,
            BOCW_Mauer_Der_Toten,
            BOCW_Forsaken
    ));

    // --------------------------------- All MAPS ---------------------------------

    public static final List<MapNames> All_Maps = Stream.of(
                Test_Maps,
                WAW_Maps,
                BOI_Maps,
                BOII_Maps,
                BOIII_Maps,
                BOIV_Maps,
                BOCW_Maps
        )
        .flatMap(List::stream)
        .collect(Collectors.toList()
    );

}
