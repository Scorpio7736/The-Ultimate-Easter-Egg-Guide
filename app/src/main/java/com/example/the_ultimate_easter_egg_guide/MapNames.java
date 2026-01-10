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
    BOII_Origins(games.Black_Ops_II, "Origins");

    // --------------------------------- Black Ops III MAPS ---------------------------------
    // --------------------------------- Black Ops IV MAPS ---------------------------------
    // --------------------------------- Black Ops Cold War MAPS ---------------------------------
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
