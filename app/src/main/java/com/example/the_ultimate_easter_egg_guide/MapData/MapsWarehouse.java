package com.example.the_ultimate_easter_egg_guide.MapData;

import com.example.the_ultimate_easter_egg_guide.Models.Images.ImageID;
import com.example.the_ultimate_easter_egg_guide.Models.Games;
import com.example.the_ultimate_easter_egg_guide.R;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapsWarehouse 
{
    private static List<Maps> getMapsListForGame(Games game) {
        return Stream.of(Maps.values())
                .filter(map -> map.gameName == game)
                .collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
    }

    public static final List<Maps> WAW_Maps = getMapsListForGame(Games.World_At_War);

    public static final List<Maps> Test_Maps = getMapsListForGame(Games.Test);

    public static final List<Maps> BOI_Maps = getMapsListForGame(Games.Black_Ops_I);

    public static final List<Maps> BOII_Maps = getMapsListForGame(Games.Black_Ops_II);

    public static final List<Maps> BOIII_Maps = getMapsListForGame(Games.Black_Ops_III);

    public static final List<Maps> BOIV_Maps = getMapsListForGame(Games.Black_Ops_IV);

    public static final List<Maps> BOCW_Maps = getMapsListForGame(Games.Black_Ops_Cold_War);

    public static final List<Maps> BOVI_Maps = getMapsListForGame(Games.Black_Ops_VI);

    public static final List<Maps> BOVII_Maps = getMapsListForGame(Games.Black_Ops_VII);

    // --------------------------------- All MAPS ---------------------------------

    public static final List<Maps> All_Maps = List.of(Maps.values());

    // --------------------------------- Game Map Image ID Lists ---------------------------------

    private static List<ImageID> getImages(List<Maps> maps) {
        return maps.stream()
                .filter(map -> map.gameName != Games.Test && map.mapCover != R.drawable.app_icon)
                .map(map -> new ImageID(map.mapCover))
                .collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
    }
    public static final List<ImageID> All_Images = getImages(All_Maps);

    /**
     * Efficiently retrieves maps for a specific game using O(1) lookup.
     */
    public static List<Maps> getMapsForGame(Games game) {
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
}
