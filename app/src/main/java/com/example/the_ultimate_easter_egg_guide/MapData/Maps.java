package com.example.the_ultimate_easter_egg_guide.MapData;

import com.example.the_ultimate_easter_egg_guide.MapData.BOI.BOI_EggWarehouse;
import com.example.the_ultimate_easter_egg_guide.MapData.BOII.BOII_EggWarehouse;
import com.example.the_ultimate_easter_egg_guide.MapData.BOIII.BOIII_EggWarehouse;
import com.example.the_ultimate_easter_egg_guide.MapData.BOIV.BOIV_EggWarehouse;
import com.example.the_ultimate_easter_egg_guide.MapData.BOCW.BOCW_EggWarehouse;
import com.example.the_ultimate_easter_egg_guide.MapData.BOVI.BOVI_EggWarehouse;
import com.example.the_ultimate_easter_egg_guide.MapData.BOVII.BOVII_EggWarehouse;
import com.example.the_ultimate_easter_egg_guide.MapData.Test.TEST_EggWarehouse;
import com.example.the_ultimate_easter_egg_guide.MapData.WAW.WAW_EggWarehouse;
import com.example.the_ultimate_easter_egg_guide.Models.EasterEgg.MapEggData;
import com.example.the_ultimate_easter_egg_guide.Models.ImageID;
import com.example.the_ultimate_easter_egg_guide.Models.MapType;
import com.example.the_ultimate_easter_egg_guide.Models.games;
import com.example.the_ultimate_easter_egg_guide.R;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Maps
{
    // --------------------------------- Test MAPS ---------------------------------

    Test_TestingMap4(games.Test, "Testing Map 4", R.string.map_desc_placeholder, R.drawable.cursed_richtofen, MapType.NOT_SET),
    Test_TestingMap1(games.Test, "Testing Map 1", R.string.map_desc_placeholder, R.drawable.cursed_richtofen, MapType.NOT_SET, TEST_EggWarehouse.TestMap1),
    Test_TestingMap2(games.Test, "Testing Map 2", R.string.map_desc_placeholder, R.drawable.cursed_richtofen, MapType.NOT_SET),
    Test_TestingMap3(games.Test, "Testing Map 3", R.string.map_desc_placeholder, R.drawable.cursed_richtofen , MapType.NOT_SET),

    // --------------------------------- WORLD AT WAR MAPS ---------------------------------

    WAW_Nacht_Der_Untoten(games.World_At_War, "Nacht der Untoten", R.string.map_desc_nacht, R.drawable.nacht_waw, MapType.Group_935, WAW_EggWarehouse.Nacht, R.raw.nacht_trailer),
    WAW_Shi_No_Numa(games.World_At_War, "Shi No Numa", R.string.map_desc_shinonuma, R.drawable.shinonuma_waw, MapType.Division_9, WAW_EggWarehouse.ShiNoNuma, R.raw.shinonuma_trailer),
    WAW_Verruckt(games.World_At_War, "Verruckt", R.string.map_desc_verruckt, R.drawable.verruckt_waw, MapType.Group_935, WAW_EggWarehouse.Verruckt, R.raw.verruckt_trailer),
    WAW_Der_Riese(games.World_At_War, "Der Riese", R.string.map_desc_derreise, R.drawable.derreise_waw, MapType.Group_935, WAW_EggWarehouse.DerReise, R.raw.derreise_trailer),

    // --------------------------------- Black Ops I MAPS ---------------------------------

    BOI_Kino_Der_Toten(games.Black_Ops_I, "Kino der Toten", R.string.map_desc_placeholder, R.drawable.kinodertoten_boi, MapType.Group_935, BOI_EggWarehouse.KinoDerToten, R.raw.kinodertoten_trailer),
    BOI_Five(games.Black_Ops_I, "Five", R.string.map_desc_placeholder, R.drawable.five_boi, MapType.US_Government, BOI_EggWarehouse.Five, R.raw.five_trailer),
    BOI_Ascension(games.Black_Ops_I, "Ascension", R.string.map_desc_placeholder, R.drawable.ascension_boi, MapType.Ascension_Group, BOI_EggWarehouse.Ascension, R.raw.ascension_trailer),
    BOI_Call_Of_The_Dead(games.Black_Ops_I, "Call of the Dead", R.string.map_desc_placeholder, R.drawable.cotd_boi, MapType.Group_935_Winter, BOI_EggWarehouse.CallOfTheDead, R.raw.cotd_trailer),
    BOI_Shangri_La(games.Black_Ops_I, "Shangri La", R.string.map_desc_placeholder, R.drawable.shangrila_boi, MapType.Jungle, BOI_EggWarehouse.ShangriLa, R.raw.shangrila_trailer),
    BOI_Moon(games.Black_Ops_I, "Moon", R.string.map_desc_placeholder, R.drawable.moon_boi, MapType.Group_935_Lunar, BOI_EggWarehouse.Moon, R.raw.moon_trailer),

    // --------------------------------- Black Ops II MAPS ---------------------------------

    BOII_Tranzit(games.Black_Ops_II, "Tranzit",  R.string.map_desc_placeholder,R.drawable.tranzit_boii, MapType.Broken_Earth, BOII_EggWarehouse.Tranzit),
    BOII_Town(games.Black_Ops_II, "Town", R.string.map_desc_placeholder, R.drawable.town_boii, MapType.Broken_Earth, BOII_EggWarehouse.Town),
    BOII_Farm(games.Black_Ops_II, "Farm", R.string.map_desc_placeholder, R.drawable.farm_boii, MapType.Broken_Earth, BOII_EggWarehouse.Farm),
    BOII_Bus_Depot(games.Black_Ops_II, "Bus Depot", R.string.map_desc_placeholder, R.drawable.busdepot_boii, MapType.Broken_Earth, BOII_EggWarehouse.BusDepot),
    BOII_Nuketown(games.Black_Ops_II, "Nuketown", R.string.map_desc_placeholder, R.drawable.nuketown_boii, MapType.Broken_Arrow, BOII_EggWarehouse.Nuketown),
    BOII_Die_Rise(games.Black_Ops_II, "Die Rise", R.string.map_desc_placeholder, R.drawable.dierise_boii, MapType.Broken_Earth, BOII_EggWarehouse.DieRise),
    BOII_Mob_Of_The_Dead(games.Black_Ops_II, "Mob of the Dead", R.string.map_desc_placeholder, R.drawable.motd_boii, MapType.Purgatory, BOII_EggWarehouse.MobOfTheDead),
    BOII_Buried(games.Black_Ops_II, "Buried", R.string.map_desc_placeholder, R.drawable.buried_boii, MapType.Broken_Earth, BOII_EggWarehouse.Buried),
    BOII_Origins(games.Black_Ops_II, "Origins", R.string.map_desc_placeholder, R.drawable.origins_boii, MapType.Crazy_Place, BOII_EggWarehouse.Origins),

    // --------------------------------- Black Ops III MAPS ---------------------------------

    BOIII_Shadows_Of_Evil(games.Black_Ops_III, "Shadows of Evil", R.string.map_desc_soe, R.drawable.soe_boiii, MapType.Morge_City, BOIII_EggWarehouse.ShadowsOfEvil, R.raw.soe_trailer),
    BOIII_The_Giant(games.Black_Ops_III, "The Giant", R.string.map_desc_thegiant, R.drawable.thegiant_boiii, MapType.Group_935_Winter, BOIII_EggWarehouse.TheGiant, R.raw.thegiant_trailer),
    BOIII_Der_Eisendrache(games.Black_Ops_III, "Der Eisendrache", R.string.map_desc_de, R.drawable.de_boiii, MapType.Group_935_Winter, BOIII_EggWarehouse.DerEisendrache, R.raw.dereisendrache_trailer),
    BOIII_Zetsubou_No_Shima(games.Black_Ops_III, "Zetsubou No Shima", R.string.map_desc_znsh, R.drawable.zetsubounoshima_boiii, MapType.Division_9, BOIII_EggWarehouse.ZetsubouNoShima),
    BOIII_Gorod_Krovi(games.Black_Ops_III, "Gorod Krovi", R.string.map_desc_gorod, R.drawable.gorodkrovi_boiii, MapType.Stalingrad, BOIII_EggWarehouse.GorodKrovi, R.raw.gorodkrovi_trailer),
    BOIII_Revelations(games.Black_Ops_III, "Revelations", R.string.map_desc_revelations, R.drawable.revelations_boiii, MapType.Agartha, BOIII_EggWarehouse.Revelations, R.raw.revelations_trailer),
    BOIII_Nacht_Der_Untoten(games.Black_Ops_III, "Nacht der Untoten", R.string.map_desc_nacht_boiii, R.drawable.nacht_boiii, MapType.Group_935, BOIII_EggWarehouse.NachtDerUntoten),
    BOIII_Verruckt(games.Black_Ops_III, "Verruckt", R.string.map_desc_verruckt_boiii, R.drawable.verruckt, MapType.Group_935, BOIII_EggWarehouse.Verruckt),
    BOIII_Shi_No_Numa(games.Black_Ops_III, "Shi No Numa", R.string.map_desc_shinonuma_boiii, R.drawable.shinonuma_boiii, MapType.Division_9, BOIII_EggWarehouse.ShiNoNuma),
    BOIII_Kino_Der_Toten(games.Black_Ops_III, "Kino der Toten", R.string.map_desc_kino_boiii, R.drawable.kinodertoten_boiii, MapType.Group_935, BOIII_EggWarehouse.KinoDerToten),
    BOIII_Ascension(games.Black_Ops_III, "Ascension", R.string.map_desc_ascension_boiii, R.drawable.ascension_boiii, MapType.Ascension_Group, BOIII_EggWarehouse.Ascension),
    BOIII_Shangri_La(games.Black_Ops_III, "Shangri La", R.string.map_desc_shangrila_boiii, R.drawable.shangrila_boiii, MapType.Jungle, BOIII_EggWarehouse.ShangriLa),
    BOIII_Moon(games.Black_Ops_III, "Moon", R.string.map_desc_moon_boiii, R.drawable.moon_boiii, MapType.Group_935_Lunar, BOIII_EggWarehouse.Moon),
    BOIII_Origins(games.Black_Ops_III, "Origins", R.string.map_desc_origins_boiii, R.drawable.origins_boii, MapType.Crazy_Place, BOIII_EggWarehouse.Origins),


    // --------------------------------- Black Ops IV MAPS ---------------------------------

    BOIV_Dead_Of_The_Night(games.Black_Ops_IV, "Dead of the Night", R.string.map_desc_placeholder, R.drawable.dotn_boiiii, MapType.Chaos, BOIV_EggWarehouse.DeadOfTheNight),
    BOIV_Ancient_Evil(games.Black_Ops_IV, "Ancient Evil", R.string.map_desc_placeholder, R.drawable.ancientevil_boiiii, MapType.Chaos, BOIV_EggWarehouse.AncientEvil),
    BOIV_Alpha_Omega(games.Black_Ops_IV, "Alpha Omega", R.string.map_desc_placeholder, R.drawable.alphaomega_boiiii, MapType.Broken_Arrow, BOIV_EggWarehouse.AlphaOmega),
    BOIV_Tag_Der_Toten(games.Black_Ops_IV, "Tag der Toten", R.string.map_desc_placeholder, R.drawable.tagdertoten_boiiii, MapType.Group_935_Winter, BOIV_EggWarehouse.TagDerToten),
    BOIV_Blood_Of_The_Dead(games.Black_Ops_IV, "Blood of the Dead", R.string.map_desc_placeholder, R.drawable.botd_boiiii, MapType.Purgatory, BOIV_EggWarehouse.BloodOfTheDead),
    BOIV_Classified(games.Black_Ops_IV, "Classified", R.string.map_desc_placeholder, R.drawable.classified_boiiii, MapType.US_Government, BOIV_EggWarehouse.Classified),
    BOIV_Voyage_Of_Despair(games.Black_Ops_IV, "Voyage of Despair", R.string.map_desc_placeholder, R.drawable.voyageofdespair_boiiii, MapType.Chaos, BOIV_EggWarehouse.VoyageOfDespair),
    BOIV_IX(games.Black_Ops_IV, "IX", R.string.map_desc_placeholder, R.drawable.ix_boiiii, MapType.Chaos, BOIV_EggWarehouse.IX),


    // --------------------------------- Black Ops Cold War MAPS ---------------------------------

    BOCW_Die_Maschine(games.Black_Ops_Cold_War, "Die Maschine", R.string.map_desc_placeholder, R.drawable.diemachine_bocw, MapType.NOT_SET, BOCW_EggWarehouse.DieMaschine),
    BOCW_Firebase_Z(games.Black_Ops_Cold_War, "Firebase Z", R.string.map_desc_placeholder, R.drawable.firebasez_bocw, MapType.NOT_SET, BOCW_EggWarehouse.FirebaseZ),
    BOCW_Mauer_Der_Toten(games.Black_Ops_Cold_War, "Mauer der Toten", R.string.map_desc_placeholder, R.drawable.mauerdertoten_bocw, MapType.NOT_SET, BOCW_EggWarehouse.MauerDerToten),
    BOCW_Forsaken(games.Black_Ops_Cold_War, "Forsaken", R.string.map_desc_placeholder, R.drawable.forsaken_bocw, MapType.NOT_SET, BOCW_EggWarehouse.Forsaken),

    // --------------------------------- Black Ops VI MAPS ---------------------------------

    BOVI_Liberty_Falls(games.Black_Ops_VI, "Liberty Falls", R.string.map_desc_placeholder, R.drawable.app_icon, MapType.NOT_SET, BOVI_EggWarehouse.LibertyFalls),
    BOVI_Terminus(games.Black_Ops_VI, "Terminus", R.string.map_desc_placeholder, R.drawable.app_icon, MapType.NOT_SET, BOVI_EggWarehouse.Terminus),
    BOVI_Citadelle_Des_Morts(games.Black_Ops_VI, "Citadelle des Morts", R.string.map_desc_placeholder, R.drawable.app_icon, MapType.NOT_SET, BOVI_EggWarehouse.CitadelleDesMorts),
    BOVI_Shattered_Veil(games.Black_Ops_VI, "Shattered Veil", R.string.map_desc_placeholder, R.drawable.app_icon, MapType.NOT_SET, BOVI_EggWarehouse.ShatteredVeil),
    BOVI_The_Tomb(games.Black_Ops_VI, "The Tomb", R.string.map_desc_placeholder, R.drawable.app_icon, MapType.NOT_SET, BOVI_EggWarehouse.TheTomb),
    BOVI_Reckoning(games.Black_Ops_VI, "Reckoning", R.string.map_desc_placeholder, R.drawable.app_icon, MapType.NOT_SET, BOVI_EggWarehouse.Reckoning),


    // --------------------------------- Black Ops VII MAPS ---------------------------------

    BOVII_Ashes_Of_The_Damned(games.Black_Ops_VII, "Ashes of the Damned", R.string.map_desc_placeholder, R.drawable.app_icon, MapType.NOT_SET, BOVII_EggWarehouse.AshesOfTheDamned),
    BOVII_Astra_Malorum(games.Black_Ops_VII, "Astra Malorum", R.string.map_desc_placeholder, R.drawable.app_icon, MapType.NOT_SET, BOVII_EggWarehouse.AstraMalorum),
    BOVII_Paradox_Junction(games.Black_Ops_VII, "Paradox Junction", R.string.map_desc_placeholder, R.drawable.app_icon, MapType.NOT_SET, BOVII_EggWarehouse.ParadoxJunction),
    BOVII_Totenreich(games.Black_Ops_VII, "Totenreich", R.string.map_desc_placeholder, R.drawable.app_icon, MapType.NOT_SET, BOVII_EggWarehouse.Totenreich);






    public final games gameName;
    public final String mapName;
    public final int mapCover;
    public final MapType mapType;
    public final int mapDescription;
    public final MapEggData eggData;
    public final int mapTrailer;

    Maps(games game, String mapName, int mapDescription, int mapCover, MapType mapType, MapEggData eggData, int mapTrailer)
    {
        this.gameName = game;
        this.mapName = mapName;
        this.mapDescription = mapDescription;
        this.mapCover = mapCover;
        this.mapType = mapType;
        this.eggData = eggData;
        this.mapTrailer = mapTrailer;
    }

    Maps(games game, String mapName, int mapDescription, int mapCover, MapType mapType, MapEggData eggData)
    {
        this.gameName = game;
        this.mapName = mapName;
        this.mapDescription = mapDescription;
        this.mapCover = mapCover;
        this.mapType = mapType;
        this.eggData = eggData;
        this.mapTrailer = -1;
    }

    Maps(games game, String mapName, int mapDescription, int mapCover, MapType mapType)
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

    /**
     * Efficiently retrieves maps for a specific game using O(1) lookup.
     */
    public static List<Maps> getMapsForGame(games game) {
        if (game == null) return Collections.emptyList();
        switch (game) {
            case World_At_War: return WAW_Maps;
            case Black_Ops_I: return BOI_Maps;
            case Black_Ops_II: return BOII_Maps;
            case Black_Ops_III: return BOIII_Maps;
            case Black_Ops_IV: return BOIV_Maps;
            case Black_Ops_Cold_War: return BOCW_Maps;
            case Black_Ops_VI: return BOVI_Maps;
            case Black_Ops_VII: return BOVII_Maps;
            case Test: return Test_Maps;
            default: return Collections.emptyList();
        }
    }

    public static Maps GetRandomMap()
    {
        int randomIndex = (int) (Math.random() * All_Maps.size());
        return All_Maps.get(randomIndex);
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
            BOII_Tranzit,
            BOII_Town,
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
        .collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));

    // --------------------------------- Game Map Image ID Lists ---------------------------------

    private static List<ImageID> getImages(List<Maps> maps) {
        return maps.stream()
                .map(map -> new ImageID(map.mapCover))
                .collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
    }

    public static final List<ImageID> WAW_Images = getImages(WAW_Maps);
    public static final List<ImageID> BOI_Images = getImages(BOI_Maps);
    public static final List<ImageID> BOII_Images = getImages(BOII_Maps);
    public static final List<ImageID> BOIII_Images = getImages(BOIII_Maps);
    public static final List<ImageID> BOIV_Images = getImages(BOIV_Maps);
    public static final List<ImageID> BOCW_Images = getImages(BOCW_Maps);
    public static final List<ImageID> BOVI_Images = getImages(BOVI_Maps);
    public static final List<ImageID> BOVII_Images = getImages(BOVII_Maps);
    public static final List<ImageID> Test_Images = getImages(Test_Maps);

    public static final List<ImageID> All_Images = getImages(All_Maps);
}
