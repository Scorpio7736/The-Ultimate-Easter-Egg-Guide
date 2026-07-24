package com.example.the_ultimate_easter_egg_guide.MapData;

import com.example.the_ultimate_easter_egg_guide.MapData.BOI.BOI_EggWarehouse;
import com.example.the_ultimate_easter_egg_guide.MapData.BOII.BOII_EggWarehouse;
import com.example.the_ultimate_easter_egg_guide.MapData.BOIII.BOIII_EggWarehouse;
import com.example.the_ultimate_easter_egg_guide.MapData.Test.TEST_MapDataWarehouse;
import com.example.the_ultimate_easter_egg_guide.MapData.WAW.WAW_EggWarehouse;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.MapData;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.MapType;
import com.example.the_ultimate_easter_egg_guide.Models.Games;
import com.example.the_ultimate_easter_egg_guide.R;

public enum Maps
{
    // --------------------------------- Test MAPS ---------------------------------

    Test_TestingMap1(Games.Test, "Testing Map 1", R.string.test_TestingMap1_mapdescription, R.drawable.default_test_image, MapType.NOT_SET, TEST_MapDataWarehouse.TestMap1),
    Test_TestingMap2(Games.Test, "Testing Map 2", R.string.test_TestingMap2_mapdescription, R.drawable.default_test_image, MapType.NOT_SET, TEST_MapDataWarehouse.TestMap2),
    Test_TestingMap3(Games.Test, "Testing Map 3", R.string.test_TestingMap3_mapdescription, R.drawable.default_test_image, MapType.NOT_SET, TEST_MapDataWarehouse.TestMap3),
    Test_TestingMap4(Games.Test, "Testing Map 4", R.string.test_TestingMap4_mapdescription, R.drawable.default_test_image, MapType.NOT_SET, TEST_MapDataWarehouse.TestMap4),

    // --------------------------------- WORLD AT WAR MAPS ---------------------------------

    WAW_Nacht_Der_Untoten(Games.World_At_War, "Nacht der Untoten", R.string.waw_NachtDerUntoten_mapdescription, R.drawable.waw_nachtderuntoten_mapcover, MapType.Group_935, WAW_EggWarehouse.Nacht, R.raw.nacht_trailer),
    WAW_Shi_No_Numa(Games.World_At_War, "Shi No Numa", R.string.waw_ShiNoNuma_mapdescription, R.drawable.waw_shinonuma_mapcover, MapType.Division_9, WAW_EggWarehouse.ShiNoNuma, R.raw.shinonuma_trailer),
    WAW_Verruckt(Games.World_At_War, "Verruckt", R.string.waw_Verruckt_mapdescription, R.drawable.waw_verruckt_mapcover, MapType.Group_935, WAW_EggWarehouse.Verruckt, R.raw.verruckt_trailer),
    WAW_Der_Riese(Games.World_At_War, "Der Riese", R.string.waw_DerRiese_mapdescription, R.drawable.waw_derreise_mapcover, MapType.Group_935, WAW_EggWarehouse.DerReise, R.raw.derreise_trailer),

    // --------------------------------- Black Ops I MAPS ---------------------------------

    BOI_Kino_Der_Toten(Games.Black_Ops_I, "Kino der Toten", R.string.general_placeholder_mapdescription, R.drawable.boi_kinodertoten_mapcover, MapType.Group_935, BOI_EggWarehouse.KinoDerToten, R.raw.kinodertoten_trailer),
    BOI_Five(Games.Black_Ops_I, "Five", R.string.general_placeholder_mapdescription, R.drawable.boi_five_mapcover, MapType.US_Government, BOI_EggWarehouse.Five, R.raw.five_trailer),
    BOI_Ascension(Games.Black_Ops_I, "Ascension", R.string.general_placeholder_mapdescription, R.drawable.boi_ascension_mapcover, MapType.Ascension_Group, BOI_EggWarehouse.Ascension, R.raw.ascension_trailer),
    BOI_Call_Of_The_Dead(Games.Black_Ops_I, "Call of the Dead", R.string.general_placeholder_mapdescription, R.drawable.boi_callofthedead_mapcover, MapType.Group_935_Winter, BOI_EggWarehouse.CallOfTheDead, R.raw.cotd_trailer),
    BOI_Shangri_La(Games.Black_Ops_I, "Shangri La", R.string.general_placeholder_mapdescription, R.drawable.boi_shangrila_mapcover, MapType.Jungle, BOI_EggWarehouse.ShangriLa, R.raw.shangrila_trailer),
    BOI_Moon(Games.Black_Ops_I, "Moon", R.string.general_placeholder_mapdescription, R.drawable.boi_moon_mapcover, MapType.Group_935_Lunar, BOI_EggWarehouse.Moon, R.raw.moon_trailer),
    //BOI_Nacht_Der_Untoten(games.Black_Ops_I, "Nacht der Untoten", R.string.boi_NachtDerUntoten_mapdescription, R.drawable.boi_nachtderuntoten_mapcover, MapType.Group_935, BOI_EggWarehouse.NachtDerUntoten),
    //BOI_Verruckt(games.Black_Ops_I, "Verruckt", R.string.boi_Verruckt_mapdescription, R.drawable.app_icon, MapType.Group_935, BOI_EggWarehouse.Verruckt),
    //BOI_Shi_No_Numa(games.Black_Ops_I, "Shi No Numa", R.string.boi_ShiNoNuma_mapdescription, R.drawable.app_icon, MapType.Division_9, BOI_EggWarehouse.ShiNoNuma),
    //BOI_Der_Reise(games.Black_Ops_I, "Der Reise", R.string.boi_DerReise_mapdescription, R.drawable.app_icon, MapType.Group_935, BOI_EggWarehouse.DerReise),


    // --------------------------------- Black Ops II MAPS ---------------------------------

    BOII_Tranzit(Games.Black_Ops_II, "Tranzit",  R.string.general_placeholder_mapdescription,R.drawable.boii_tranzit_mapcover, MapType.Broken_Earth, BOII_EggWarehouse.Tranzit, R.raw.tranzit_trailer),
    //BOII_Town(games.Black_Ops_II, "Town", R.string.boii_Town_mapdescription, R.drawable.boii_town_mapcover, MapType.Broken_Earth, BOII_EggWarehouse.Town),
    //BOII_Farm(games.Black_Ops_II, "Farm", R.string.boii_Farm_mapdescription, R.drawable.boii_farm_mapcover, MapType.Broken_Earth, BOII_EggWarehouse.Farm),
    //BOII_Bus_Depot(games.Black_Ops_II, "Bus Depot", R.string.boii_BusDepot_mapdescription, R.drawable.boii_busdepot_mapcover, MapType.Broken_Earth, BOII_EggWarehouse.BusDepot),
    BOII_Nuketown(Games.Black_Ops_II, "Nuketown", R.string.general_placeholder_mapdescription, R.drawable.boii_nuketown_mapcover, MapType.Broken_Arrow, BOII_EggWarehouse.Nuketown),
    BOII_Die_Rise(Games.Black_Ops_II, "Die Rise", R.string.general_placeholder_mapdescription, R.drawable.boii_dierise_mapcover, MapType.Broken_Earth, BOII_EggWarehouse.DieRise, R.raw.dierise_trailer), //FYI: This map is the worst of all maps across all games of all time. I hate Die Rise.
    BOII_Mob_Of_The_Dead(Games.Black_Ops_II, "Mob of the Dead", R.string.general_placeholder_mapdescription, R.drawable.boii_mobofthedead_mapcover, MapType.Purgatory, BOII_EggWarehouse.MobOfTheDead, R.raw.mobofthedead_trailer),
    BOII_Buried(Games.Black_Ops_II, "Buried", R.string.general_placeholder_mapdescription, R.drawable.boii_buried_mapcover, MapType.Broken_Earth, BOII_EggWarehouse.Buried, R.raw.buried_trailer),
    BOII_Origins(Games.Black_Ops_II, "Origins", R.string.general_placeholder_mapdescription, R.drawable.boii_origins_mapcover, MapType.Crazy_Place, BOII_EggWarehouse.Origins, R.raw.origins_trailer),

    // --------------------------------- Black Ops III MAPS ---------------------------------

    BOIII_Shadows_Of_Evil(Games.Black_Ops_III, "Shadows of Evil", R.string.general_placeholder_mapdescription, R.drawable.boiii_shadowsofevil_mapcover, MapType.Morge_City, BOIII_EggWarehouse.ShadowsOfEvil, R.raw.soe_trailer),
    BOIII_The_Giant(Games.Black_Ops_III, "The Giant", R.string.general_placeholder_mapdescription, R.drawable.boiii_thegiant_mapcover, MapType.Group_935_Winter, BOIII_EggWarehouse.TheGiant, R.raw.thegiant_trailer),
    BOIII_Der_Eisendrache(Games.Black_Ops_III, "Der Eisendrache", R.string.general_placeholder_mapdescription, R.drawable.boiii_dereisendrache_mapcover, MapType.Group_935_Winter, BOIII_EggWarehouse.DerEisendrache, R.raw.dereisendrache_trailer),
    BOIII_Zetsubou_No_Shima(Games.Black_Ops_III, "Zetsubou No Shima", R.string.general_placeholder_mapdescription, R.drawable.boiii_zetsubounoshima_mapcover, MapType.Division_9, BOIII_EggWarehouse.ZetsubouNoShima, R.raw.zetsubounoshima_trailer),
    BOIII_Gorod_Krovi(Games.Black_Ops_III, "Gorod Krovi", R.string.general_placeholder_mapdescription, R.drawable.boiii_gorodkrovi_mapcover, MapType.Stalingrad, BOIII_EggWarehouse.GorodKrovi, R.raw.gorodkrovi_trailer),
    BOIII_Revelations(Games.Black_Ops_III, "Revelations", R.string.general_placeholder_mapdescription, R.drawable.boiii_revelations_mapcover, MapType.Agartha, BOIII_EggWarehouse.Revelations, R.raw.revelations_trailer),
    //BOIII_Nacht_Der_Untoten(games.Black_Ops_III, "Nacht der Untoten", R.string.boiii_NachtDerUntoten_mapdescription, R.drawable.boiii_nachtderuntoten_mapcover, MapType.Group_935, BOIII_EggWarehouse.NachtDerUntoten),
    //BOIII_Verruckt(games.Black_Ops_III, "Verruckt", R.string.boiii_Verruckt_mapdescription, R.drawable.verruckt, MapType.Group_935, BOIII_EggWarehouse.Verruckt),
    //BOIII_Shi_No_Numa(games.Black_Ops_III, "Shi No Numa", R.string.boiii_ShiNoNuma_mapdescription, R.drawable.boiii_shinonuma_mapcover, MapType.Division_9, BOIII_EggWarehouse.ShiNoNuma),
    //BOIII_Kino_Der_Toten(games.Black_Ops_III, "Kino der Toten", R.string.boiii_KinoDerToten_mapdescription, R.drawable.boiii_kinodertoten_mapcover, MapType.Group_935, BOIII_EggWarehouse.KinoDerToten),
    //BOIII_Ascension(games.Black_Ops_III, "Ascension", R.string.boiii_Ascension_mapdescription, R.drawable.boiii_ascension_mapcover, MapType.Ascension_Group, BOIII_EggWarehouse.Ascension),
    //BOIII_Shangri_La(games.Black_Ops_III, "Shangri La", R.string.boiii_ShangriLa_mapdescription, R.drawable.boiii_shangrila_mapcover, MapType.Jungle, BOIII_EggWarehouse.ShangriLa),
    //BOIII_Moon(games.Black_Ops_III, "Moon", R.string.boiii_Moon_mapdescription, R.drawable.boiii_moon_mapcover, MapType.Group_935_Lunar, BOIII_EggWarehouse.Moon),
    //BOIII_Origins(games.Black_Ops_III, "Origins", R.string.boiii_Origins_mapdescription, R.drawable.boii_origins_mapcover, MapType.Crazy_Place, BOIII_EggWarehouse.Origins),


    // --------------------------------- Black Ops IV MAPS ---------------------------------

    //BOIV_Dead_Of_The_Night(Games.Black_Ops_IV, "Dead of the Night", R.string.boiv_DeadOfTheNight_mapdescription, R.drawable.boiv_deadofthenight_mapcover, MapType.Chaos, BOIV_EggWarehouse.DeadOfTheNight),
    //BOIV_Ancient_Evil(Games.Black_Ops_IV, "Ancient Evil", R.string.boiv_AncientEvil_mapdescription, R.drawable.boiv_ancientevil_mapcover, MapType.Chaos, BOIV_EggWarehouse.AncientEvil),
    //BOIV_Alpha_Omega(Games.Black_Ops_IV, "Alpha Omega", R.string.boiv_AlphaOmega_mapdescription, R.drawable.boiv_alphaomega_mapcover, MapType.Broken_Arrow, BOIV_EggWarehouse.AlphaOmega),
    //BOIV_Tag_Der_Toten(Games.Black_Ops_IV, "Tag der Toten", R.string.boiv_TagDerToten_mapdescription, R.drawable.boiv_tagdertoten_mapcover, MapType.Group_935_Winter, BOIV_EggWarehouse.TagDerToten),
    //BOIV_Blood_Of_The_Dead(Games.Black_Ops_IV, "Blood of the Dead", R.string.boiv_BloodOfTheDead_mapdescription, R.drawable.boiv_bloodofthedead_mapcover, MapType.Purgatory, BOIV_EggWarehouse.BloodOfTheDead),
    //BOIV_Classified(Games.Black_Ops_IV, "Classified", R.string.boiv_Classified_mapdescription, R.drawable.boiv_classified_mapcover, MapType.US_Government, BOIV_EggWarehouse.Classified),
    //BOIV_Voyage_Of_Despair(Games.Black_Ops_IV, "Voyage of Despair", R.string.boiv_VoyageOfDespair_mapdescription, R.drawable.boiv_voyageofdispair_mapcover, MapType.Chaos, BOIV_EggWarehouse.VoyageOfDespair),
    //BOIV_IX(Games.Black_Ops_IV, "IX", R.string.boiv_IX_mapdescription, R.drawable.boiv_ix_mapcover, MapType.Chaos, BOIV_EggWarehouse.IX),


    // --------------------------------- Black Ops Cold War MAPS ---------------------------------

    //BOCW_Die_Maschine(Games.Black_Ops_Cold_War, "Die Maschine", R.string.bocw_DieMaschine_mapdescription, R.drawable.bocw_diemachine_mapcover, MapType.NOT_SET, BOCW_EggWarehouse.DieMaschine),
    //BOCW_Firebase_Z(Games.Black_Ops_Cold_War, "Firebase Z", R.string.bocw_FirebaseZ_mapdescription, R.drawable.bocw_firebasez_mapcover, MapType.NOT_SET, BOCW_EggWarehouse.FirebaseZ),
    //BOCW_Mauer_Der_Toten(Games.Black_Ops_Cold_War, "Mauer der Toten", R.string.bocw_MauerDerToten_mapdescription, R.drawable.bocw_mauerdertoten_mapcover, MapType.NOT_SET, BOCW_EggWarehouse.MauerDerToten),
    //BOCW_Forsaken(Games.Black_Ops_Cold_War, "Forsaken", R.string.bocw_Forsaken_mapdescription, R.drawable.bocw_forsaken_mapcover, MapType.NOT_SET, BOCW_EggWarehouse.Forsaken),

    // --------------------------------- Black Ops VI MAPS ---------------------------------

    //BOVI_Liberty_Falls(Games.Black_Ops_VI, "Liberty Falls", R.string.bovi_LibertyFalls_mapdescription, R.drawable.app_icon, MapType.NOT_SET, BOVI_EggWarehouse.LibertyFalls),
    //BOVI_Terminus(Games.Black_Ops_VI, "Terminus", R.string.bovi_Terminus_mapdescription, R.drawable.app_icon, MapType.NOT_SET, BOVI_EggWarehouse.Terminus),
    //BOVI_Citadelle_Des_Morts(Games.Black_Ops_VI, "Citadelle des Morts", R.string.bovi_CitadelleDesMorts_mapdescription, R.drawable.app_icon, MapType.NOT_SET, BOVI_EggWarehouse.CitadelleDesMorts),
    //BOVI_Shattered_Veil(Games.Black_Ops_VI, "Shattered Veil", R.string.bovi_ShatteredVeil_mapdescription, R.drawable.app_icon, MapType.NOT_SET, BOVI_EggWarehouse.ShatteredVeil),
    //BOVI_The_Tomb(Games.Black_Ops_VI, "The Tomb", R.string.bovi_TheTomb_mapdescription, R.drawable.app_icon, MapType.NOT_SET, BOVI_EggWarehouse.TheTomb),
    //BOVI_Reckoning(Games.Black_Ops_VI, "Reckoning", R.string.bovi_Reckoning_mapdescription, R.drawable.app_icon, MapType.NOT_SET, BOVI_EggWarehouse.Reckoning),


    // --------------------------------- Black Ops VII MAPS ---------------------------------

    //BOVII_Ashes_Of_The_Damned(Games.Black_Ops_VII, "Ashes of the Damned", R.string.bovii_AshesOfTheDamned_mapdescription, R.drawable.app_icon, MapType.NOT_SET, BOVII_EggWarehouse.AshesOfTheDamned),
    //BOVII_Astra_Malorum(Games.Black_Ops_VII, "Astra Malorum", R.string.bovii_AstraMalorum_mapdescription, R.drawable.app_icon, MapType.NOT_SET, BOVII_EggWarehouse.AstraMalorum),
    //BOVII_Paradox_Junction(Games.Black_Ops_VII, "Paradox Junction", R.string.bovii_ParadoxJunction_mapdescription, R.drawable.app_icon, MapType.NOT_SET, BOVII_EggWarehouse.ParadoxJunction),
    //BOVII_Totenreich(Games.Black_Ops_VII, "Totenreich", R.string.bovii_Totenreich_mapdescription, R.drawable.app_icon, MapType.NOT_SET, BOVII_EggWarehouse.Totenreich),

    ;
    public final Games gameName;
    public final String mapName;
    public final int mapCover;
    public final MapType mapType;
    public final int mapDescription;
    public final MapData eggData;
    public final int mapTrailer;

    Maps(Games game, String mapName, int mapDescription, int mapCover, MapType mapType, MapData eggData, int mapTrailer)
    {
        this.gameName = game;
        this.mapName = mapName;
        this.mapDescription = mapDescription;
        this.mapCover = mapCover;
        this.mapType = mapType;
        this.eggData = eggData;
        this.mapTrailer = mapTrailer;
    }

    Maps(Games game, String mapName, int mapDescription, int mapCover, MapType mapType, MapData eggData)
    {
        this.gameName = game;
        this.mapName = mapName;
        this.mapDescription = mapDescription;
        this.mapCover = mapCover;
        this.mapType = mapType;
        this.eggData = eggData;
        this.mapTrailer = -1;
    }
}
