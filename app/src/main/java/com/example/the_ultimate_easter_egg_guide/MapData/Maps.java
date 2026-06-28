package com.example.the_ultimate_easter_egg_guide.MapData;

import com.example.the_ultimate_easter_egg_guide.MapData.Test.TEST_EggWarehouse;
import com.example.the_ultimate_easter_egg_guide.MapData.WAW.WAW_EggWarehouse;
import com.example.the_ultimate_easter_egg_guide.Models.EasterEgg.MapEggData;
import com.example.the_ultimate_easter_egg_guide.Models.MapType;
import com.example.the_ultimate_easter_egg_guide.Models.games;
import com.example.the_ultimate_easter_egg_guide.R;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Maps
{
    // --------------------------------- Test MAPS ---------------------------------

    Test_TestingMap4(games.Test, "Testing Map 4", "This", R.drawable.app_icon, MapType.NOT_SET),
    Test_TestingMap1(games.Test, "Testing Map 1", "Is", R.drawable.app_icon, MapType.NOT_SET, TEST_EggWarehouse.TestMap1),
    Test_TestingMap2(games.Test, "Testing Map 2", "A", R.drawable.app_icon, MapType.NOT_SET),
    Test_TestingMap3(games.Test, "Testing Map 3", "Test", R.drawable.app_icon , MapType.NOT_SET),

    // --------------------------------- WORLD AT WAR MAPS ---------------------------------

    WAW_Nacht_Der_Untoten(games.World_At_War, "Nacht der Untoten", "An abandoned bunker sits isolated in the fog after a failed mission. With limited weapons, tight rooms, and nowhere to truly run, survivors must hold out against the first waves of the undead.", R.drawable.nacht_waw, MapType.Group_935, WAW_EggWarehouse.Nacht, R.raw.nacht_trailer),
    WAW_Shi_No_Numa(games.World_At_War, "Shi No Numa", "Deep in a swampy Japanese research site, strange experiments have unleashed the undead. Survivors must move through muddy huts, fend off Hellhounds, and uncover the dark secrets hidden in the jungle.", R.drawable.shinonuma_waw, MapType.Division_9, WAW_EggWarehouse.ShiNoNuma),
    WAW_Verruckt(games.World_At_War, "Verruckt", "Inside a ruined German asylum, the undead horror grows more intense. Split starting rooms, deadly corridors, traps, and the first Perk-a-Colas make survival more chaotic and dangerous.", R.drawable.verruckt_waw, MapType.Group_935, WAW_EggWarehouse.Verruckt),
    WAW_Der_Riese(games.World_At_War, "Der Riese", "At a secret Group 935 weapons facility, teleporters, Pack-a-Punch, and dangerous experiments reveal the true scale of the zombie outbreak. This map expands the story and introduces some of the most important mechanics in Zombies history.", R.drawable.derreise_waw, MapType.Group_935, WAW_EggWarehouse.DerReise),

    // --------------------------------- Black Ops I MAPS ---------------------------------

    BOI_Kino_Der_Toten(games.Black_Ops_I, "Kino der Toten", "INSERT HERE", R.drawable.kinodertoten_boi, MapType.Group_935),
    BOI_Five(games.Black_Ops_I, "Five", "INSERT HERE", R.drawable.five_boi, MapType.US_Government),
    BOI_Ascension(games.Black_Ops_I, "Ascension", "INSERT HERE", R.drawable.ascension_boi, MapType.Ascension_Group),
    BOI_Call_Of_The_Dead(games.Black_Ops_I, "Call of the Dead", "INSERT HERE", R.drawable.cotd_boi, MapType.Group_935),
    BOI_Shangri_La(games.Black_Ops_I, "Shangri La", "INSERT HERE", R.drawable.shangrila_boi, MapType.Jungle),
    BOI_Moon(games.Black_Ops_I, "Moon", "INSERT HERE", R.drawable.moon_boi, MapType.Group_935_Lunar),

    // --------------------------------- Black Ops II MAPS ---------------------------------

    BOII_Town(games.Black_Ops_II, "Town", "INSERT HERE", R.drawable.town_boii, MapType.Broken_Earth),
    BOII_Farm(games.Black_Ops_II, "Farm", "INSERT HERE", R.drawable.farm_boii, MapType.Broken_Earth),
    BOII_Bus_Depot(games.Black_Ops_II, "Bus Depot", "INSERT HERE", R.drawable.busdepot_boii, MapType.Broken_Earth),
    BOII_Nuketown(games.Black_Ops_II, "Nuketown", "INSERT HERE", R.drawable.nuketown_boii, MapType.Broken_Arrow),
    BOII_Die_Rise(games.Black_Ops_II, "Die Rise", "INSERT HERE", R.drawable.dierise_boii, MapType.Broken_Earth),
    BOII_Mob_Of_The_Dead(games.Black_Ops_II, "Mob of the Dead", "INSERT HERE", R.drawable.motd_boii, MapType.Purgatory),
    BOII_Buried(games.Black_Ops_II, "Buried", "INSERT HERE", R.drawable.buried_boii, MapType.Broken_Earth),
    BOII_Origins(games.Black_Ops_II, "Origins", "INSERT HERE", R.drawable.origins_boii, MapType.Crazy_Place),

    // --------------------------------- Black Ops III MAPS ---------------------------------

    BOIII_Shadows_Of_Evil(games.Black_Ops_III, "Shadows of Evil", "INSERT HERE", R.drawable.soe_boiii, MapType.Morge_City),
    BOIII_The_Giant(games.Black_Ops_III, "The Giant", "INSERT HERE", R.drawable.thegiant_boiii, MapType.Group_935),
    BOIII_Der_Eisendrache(games.Black_Ops_III, "Der Eisendrache", "INSERT HERE", R.drawable.de_boiii, MapType.Group_935),
    BOIII_Zetsubou_No_Shima(games.Black_Ops_III, "Zetsubou No Shima", "INSERT HERE", R.drawable.zetsubounoshima_boiii, MapType.Division_9),
    BOIII_Gorod_Krovi(games.Black_Ops_III, "Gorod Krovi", "INSERT HERE", R.drawable.gorodkrovi_boiii, MapType.Stalingrad),
    BOIII_Revelations(games.Black_Ops_III, "Revelations", "INSERT HERE", R.drawable.revelations_boiii, MapType.Agartha),
    BOIII_Nacht_Der_Untoten(games.Black_Ops_III, "Nacht der Untoten", "INSERT HERE", R.drawable.nacht_boiii, MapType.Group_935),
    BOIII_Verruckt(games.Black_Ops_III, "Verruckt", "INSERT HERE", R.drawable.verruckt, MapType.Group_935),
    BOIII_Shi_No_Numa(games.Black_Ops_III, "Shi No Numa", "INSERT HERE", R.drawable.shinonuma_boiii, MapType.Division_9),
    BOIII_Kino_Der_Toten(games.Black_Ops_III, "Kino der Toten", "INSERT HERE", R.drawable.kinodertoten_boiii, MapType.Group_935),
    BOIII_Ascension(games.Black_Ops_III, "Ascension", "INSERT HERE", R.drawable.ascension_boiii, MapType.Ascension_Group),
    BOIII_Shangri_La(games.Black_Ops_III, "Shangri La", "INSERT HERE", R.drawable.shangrila_boiii, MapType.Jungle),
    BOIII_Moon(games.Black_Ops_III, "Moon", "INSERT HERE", R.drawable.moon_boiii, MapType.Group_935_Lunar),
    BOIII_Origins(games.Black_Ops_III, "Origins", "INSERT HERE", R.drawable.origins_boii, MapType.Crazy_Place),


    // --------------------------------- Black Ops IV MAPS ---------------------------------

    BOIV_Dead_Of_The_Night(games.Black_Ops_IV, "Dead of the Night", "INSERT HERE", R.drawable.dotn_boiiii, MapType.Chaos),
    BOIV_Ancient_Evil(games.Black_Ops_IV, "Ancient Evil", "INSERT HERE", R.drawable.ancientevil_boiiii, MapType.Chaos),
    BOIV_Alpha_Omega(games.Black_Ops_IV, "Alpha Omega", "INSERT HERE", R.drawable.alphaomega_boiiii, MapType.Broken_Arrow),
    BOIV_Tag_Der_Toten(games.Black_Ops_IV, "Tag der Toten", "INSERT HERE", R.drawable.tagdertoten_boiiii, MapType.Group_935),
    BOIV_Blood_Of_The_Dead(games.Black_Ops_IV, "Blood of the Dead", "INSERT HERE", R.drawable.botd_boiiii, MapType.Purgatory),
    BOIV_Classified(games.Black_Ops_IV, "Classified", "INSERT HERE", R.drawable.classified_boiiii, MapType.US_Government),
    BOIV_Voyage_Of_Despair(games.Black_Ops_IV, "Voyage of Despair", "INSERT HERE", R.drawable.voyageofdespair_boiiii, MapType.Chaos),
    BOIV_IX(games.Black_Ops_IV, "IX", "INSERT HERE", R.drawable.ix_boiiii, MapType.Chaos),


    // --------------------------------- Black Ops Cold War MAPS ---------------------------------

    BOCW_Die_Maschine(games.Black_Ops_Cold_War, "Die Maschine", "INSERT HERE", R.drawable.diemachine_bocw, MapType.NOT_SET),
    BOCW_Firebase_Z(games.Black_Ops_Cold_War, "Firebase Z", "INSERT HERE", R.drawable.firebasez_bocw, MapType.NOT_SET),
    BOCW_Mauer_Der_Toten(games.Black_Ops_Cold_War, "Mauer der Toten", "INSERT HERE", R.drawable.mauerdertoten_bocw, MapType.NOT_SET),
    BOCW_Forsaken(games.Black_Ops_Cold_War, "Forsaken", "INSERT HERE", R.drawable.forsaken_bocw, MapType.NOT_SET),

    // --------------------------------- Black Ops VI MAPS ---------------------------------

    BOVI_Liberty_Falls(games.Black_Ops_VI, "Liberty Falls", "INSERT HERE", R.drawable.app_icon, MapType.NOT_SET),
    BOVI_Terminus(games.Black_Ops_VI, "Terminus", "INSERT HERE", R.drawable.app_icon, MapType.NOT_SET),
    BOVI_Citadelle_Des_Morts(games.Black_Ops_VI, "Citadelle des Morts", "INSERT HERE", R.drawable.app_icon, MapType.NOT_SET),
    BOVI_Shattered_Veil(games.Black_Ops_VI, "Shattered Veil", "INSERT HERE", R.drawable.app_icon, MapType.NOT_SET),
    BOVI_The_Tomb(games.Black_Ops_VI, "The Tomb", "INSERT HERE", R.drawable.app_icon, MapType.NOT_SET),
    BOVI_Reckoning(games.Black_Ops_VI, "Reckoning", "INSERT HERE", R.drawable.app_icon, MapType.NOT_SET),


    // --------------------------------- Black Ops VII MAPS ---------------------------------

    BOVII_Ashes_Of_The_Damned(games.Black_Ops_VII, "Ashes of the Damned", "INSERT HERE", R.drawable.app_icon, MapType.NOT_SET),
    BOVII_Astra_Malorum(games.Black_Ops_VII, "Astra Malorum", "INSERT HERE", R.drawable.app_icon, MapType.NOT_SET),
    BOVII_Paradox_Junction(games.Black_Ops_VII, "Paradox Junction", "INSERT HERE", R.drawable.app_icon, MapType.NOT_SET),
    BOVII_Totenreich(games.Black_Ops_VII, "Totenreich", "INSERT HERE", R.drawable.app_icon, MapType.NOT_SET);






    public final games gameName;
    public final String mapName;
    public final int mapCover;
    public final MapType mapType;
    public final String mapDescription;
    public final MapEggData eggData;
    public final int mapTrailer;

    Maps(games game, String mapName, String mapDescription, int mapCover, MapType mapType, MapEggData eggData, int mapTrailer)
    {
        this.gameName = game;
        this.mapName = mapName;
        this.mapDescription = mapDescription;
        this.mapCover = mapCover;
        this.mapType = mapType;
        this.eggData = eggData;
        this.mapTrailer = mapTrailer;
    }

    Maps(games game, String mapName, String mapDescription, int mapCover, MapType mapType, MapEggData eggData)
    {
        this.gameName = game;
        this.mapName = mapName;
        this.mapDescription = mapDescription;
        this.mapCover = mapCover;
        this.mapType = mapType;
        this.eggData = eggData;
        this.mapTrailer = -1;
    }

    Maps(games game, String mapName, String mapDescription, int mapCover, MapType mapType)
    {
        //NOTE: THIS IS A TEMP CONSTRUCTOR AS ALL MAPS REQUIRE EGGS
        this.gameName = game;
        this.mapName = mapName;
        this.mapDescription = mapDescription;
        this.mapCover = mapCover;
        this.mapType = mapType;
        this.eggData = null;
        this.mapTrailer = -1;
    }

    public static List<Maps> getMapsForGame(games game) {
        List<Maps> maps = new ArrayList<>();
        for (Maps map : Maps.values()) {
            if (map.gameName == game) {
                maps.add(map);
            }
        }
        return maps;
    }

    public static Maps GetRandomMap()
    {
        int randomIndex = (int) (Math.random() * Maps.All_Maps.size());
        return Maps.All_Maps.get(randomIndex);
    }


    // --------------------------------- Game Map Lists ---------------------------------
    public static final List<Maps> Test_Maps = List.of(
        Test_TestingMap1,
        Test_TestingMap2,
        Test_TestingMap3,
        Test_TestingMap4
    );


    public static final List<Maps> WAW_Maps = List.of(
            WAW_Nacht_Der_Untoten,
            WAW_Shi_No_Numa,
            WAW_Verruckt,
            WAW_Der_Riese
    );

    public static final List<Maps> BOI_Maps = List.of(
            BOI_Kino_Der_Toten,
            BOI_Five,
            BOI_Ascension,
            BOI_Call_Of_The_Dead,
            BOI_Shangri_La,
            BOI_Moon
    );

    public static final List<Maps> BOII_Maps = List.of(
            BOII_Farm,
            BOII_Bus_Depot,
            BOII_Nuketown,
            BOII_Die_Rise,
            BOII_Mob_Of_The_Dead,
            BOII_Buried,
            BOII_Origins
    );

    public static final List<Maps> BOIII_Maps = List.of(
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
    );

    public static final List<Maps> BOIV_Maps = List.of(
            BOIV_Dead_Of_The_Night,
            BOIV_Ancient_Evil,
            BOIV_Alpha_Omega,
            BOIV_Tag_Der_Toten,
            BOIV_Blood_Of_The_Dead,
            BOIV_Classified,
            BOIV_Voyage_Of_Despair,
            BOIV_IX
    );

    public static final List<Maps> BOCW_Maps = List.of(
            BOCW_Die_Maschine,
            BOCW_Firebase_Z,
            BOCW_Mauer_Der_Toten,
            BOCW_Forsaken
    );

    public static final List<Maps> BOVI_Maps = List.of(
            BOVI_Liberty_Falls,
            BOVI_Terminus,
            BOVI_Citadelle_Des_Morts,
            BOVI_Shattered_Veil,
            BOVI_The_Tomb,
            BOVI_Reckoning
    );

    public static final List<Maps> BOVII_Maps = List.of(
            BOVII_Ashes_Of_The_Damned,
            BOVII_Astra_Malorum,
            BOVII_Paradox_Junction,
            BOVII_Totenreich
    );

    // --------------------------------- All MAPS ---------------------------------

    public static final List<Maps> All_Maps = Stream.of(
                //Test_Maps,
                WAW_Maps,
                BOI_Maps,
                BOII_Maps,
                BOIII_Maps,
                BOIV_Maps,
                BOCW_Maps,
                BOVI_Maps,
                BOVII_Maps
        )
        .flatMap(List::stream)
        .collect(Collectors.toList()
    );

}
