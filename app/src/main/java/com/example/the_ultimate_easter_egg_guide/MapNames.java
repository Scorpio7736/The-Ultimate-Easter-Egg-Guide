package com.example.the_ultimate_easter_egg_guide;

public enum MapNames
{
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
}
