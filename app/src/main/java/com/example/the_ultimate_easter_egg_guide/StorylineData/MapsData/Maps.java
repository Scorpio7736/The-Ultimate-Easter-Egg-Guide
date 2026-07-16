package com.example.the_ultimate_easter_egg_guide.StorylineData.MapsData;

import com.example.the_ultimate_easter_egg_guide.Models.Games;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.IStorylineItems;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.OrganizationGroups;
import com.example.the_ultimate_easter_egg_guide.R;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum Maps implements IStorylineItems
{
    // --------------------------------- WORLD AT WAR MAPS ---------------------------------
    NACHT_DER_UNTOTEN("Nacht der Untoten", R.drawable.waw_nachtderuntoten_mapcover, OrganizationGroups.German, Arrays.asList(Games.World_At_War, Games.Black_Ops_I, Games.Black_Ops_III), "Nacht_der_Untoten"),
    VERRUCKT("Verrückt", R.drawable.waw_verruckt_mapcover, OrganizationGroups.German, Arrays.asList(Games.World_At_War, Games.Black_Ops_I, Games.Black_Ops_III), "Verr%C3%BCckt_(map)"),
    SHI_NO_NUMA("Shi No Numa", R.drawable.waw_shinonuma_mapcover, OrganizationGroups.Japanese, Arrays.asList(Games.World_At_War, Games.Black_Ops_I, Games.Black_Ops_III), "Shi_No_Numa"),
    DER_RIESE("Der Riese", R.drawable.waw_derreise_mapcover, OrganizationGroups.German, Arrays.asList(Games.World_At_War, Games.Black_Ops_I, Games.Black_Ops_III), "Der_Riese"),

    // --------------------------------- Black Ops I MAPS ---------------------------------
    KINO_DER_TOTEN("Kino der Toten", R.drawable.boi_kinodertoten_mapcover, OrganizationGroups.German, Arrays.asList(Games.Black_Ops_I, Games.Black_Ops_III), "Kino_der_Toten"),
    FIVE("Five", R.drawable.boi_five_mapcover, OrganizationGroups.American, Arrays.asList(Games.Black_Ops_I, Games.Black_Ops_IV), "Five"),
    ASCENSION("Ascension", R.drawable.boi_ascension_mapcover, OrganizationGroups.Soviet, Arrays.asList(Games.Black_Ops_I, Games.Black_Ops_III), "Ascension_(map)"),
    CALL_OF_THE_DEAD("Call of the Dead", R.drawable.boi_callofthedead_mapcover, OrganizationGroups.German, Collections.singletonList(Games.Black_Ops_I), "Call_of_the_Dead"),
    SHANGRI_LA("Shangri-La", R.drawable.boi_shangrila_mapcover, OrganizationGroups.German, Arrays.asList(Games.Black_Ops_I, Games.Black_Ops_III), "Shangri-La_(map)"),
    MOON("Moon", R.drawable.boi_moon_mapcover, OrganizationGroups.German, Arrays.asList(Games.Black_Ops_I, Games.Black_Ops_III), "Moon_(map)"),

    // --------------------------------- Black Ops II MAPS ---------------------------------
    TRANZIT("TranZit", R.drawable.boii_tranzit_mapcover, OrganizationGroups.American, Collections.singletonList(Games.Black_Ops_II), "TranZit"),
    NUKETOWN("Nuketown Zombies", R.drawable.boii_nuketown_mapcover, OrganizationGroups.American, Arrays.asList(Games.Black_Ops_II, Games.Black_Ops_IV), "Nuketown_Zombies"),
    DIE_RISE("Die Rise", R.drawable.boii_dierise_mapcover, OrganizationGroups.American, Collections.singletonList(Games.Black_Ops_II), "Die_Rise"),
    MOB_OF_THE_DEAD("Mob of the Dead", R.drawable.boii_mobofthedead_mapcover, OrganizationGroups.Extraterrestrial, Arrays.asList(Games.Black_Ops_II, Games.Black_Ops_IV), "Mob_of_the_Dead"),
    BURIED("Buried", R.drawable.boii_buried_mapcover, OrganizationGroups.American, Collections.singletonList(Games.Black_Ops_II), "Buried"),
    ORIGINS("Origins", R.drawable.boii_origins_mapcover, OrganizationGroups.German, Arrays.asList(Games.Black_Ops_II, Games.Black_Ops_III), "Origins_(map)"),

    // --------------------------------- Black Ops III MAPS ---------------------------------
    SHADOWS_OF_EVIL("Shadows of Evil", R.drawable.boiii_shadowsofevil_mapcover, OrganizationGroups.Extraterrestrial, Collections.singletonList(Games.Black_Ops_III), "Shadows_of_Evil"),
    THE_GIANT("The Giant", R.drawable.boiii_thegiant_mapcover, OrganizationGroups.German, Collections.singletonList(Games.Black_Ops_III), "The_Giant_(map)"),
    DER_EISENDRACHE("Der Eisendrache", R.drawable.boiii_dereisendrache_mapcover, OrganizationGroups.German, Collections.singletonList(Games.Black_Ops_III), "Der_Eisendrache"),
    ZETSUBOU_NO_SHIMA("Zetsubou No Shima", R.drawable.boiii_zetsubounoshima_mapcover, OrganizationGroups.Japanese, Collections.singletonList(Games.Black_Ops_III), "Zetsubou_No_Shima"),
    GOROD_KROVI("Gorod Krovi", R.drawable.boiii_gorodkrovi_mapcover, OrganizationGroups.Soviet, Collections.singletonList(Games.Black_Ops_III), "Gorod_Krovi"),
    REVELATIONS("Revelations", R.drawable.boiii_revelations_mapcover, OrganizationGroups.Extraterrestrial, Collections.singletonList(Games.Black_Ops_III), "Revelations_(map)"),

    // --------------------------------- Black Ops IV MAPS ---------------------------------
    VOYAGE_OF_DESPAIR("Voyage of Despair", R.drawable.boiv_voyageofdispair_mapcover, OrganizationGroups.Extraterrestrial, Collections.singletonList(Games.Black_Ops_IV), "Voyage_of_Despair"),
    IX("IX", R.drawable.boiv_ix_mapcover, OrganizationGroups.Extraterrestrial, Collections.singletonList(Games.Black_Ops_IV), "IX_(map)"),
    BLOOD_OF_THE_DEAD("Blood of the Dead", R.drawable.boiv_bloodofthedead_mapcover, OrganizationGroups.Extraterrestrial, Collections.singletonList(Games.Black_Ops_IV), "Blood_of_the_Dead"),
    CLASSIFIED("Classified", R.drawable.boiv_classified_mapcover, OrganizationGroups.American, Collections.singletonList(Games.Black_Ops_IV), "Classified"),
    DEAD_OF_THE_NIGHT("Dead of the Night", R.drawable.boiv_deadofthenight_mapcover, OrganizationGroups.Extraterrestrial, Collections.singletonList(Games.Black_Ops_IV), "Dead_of_the_Night"),
    ANCIENT_EVIL("Ancient Evil", R.drawable.boiv_ancientevil_mapcover, OrganizationGroups.Extraterrestrial, Collections.singletonList(Games.Black_Ops_IV), "Ancient_Evil"),
    ALPHA_OMEGA("Alpha Omega", R.drawable.boiv_alphaomega_mapcover, OrganizationGroups.American, Collections.singletonList(Games.Black_Ops_IV), "Alpha_Omega"),
    TAG_DER_TOTEN("Tag der Toten", R.drawable.boiv_tagdertoten_mapcover, OrganizationGroups.German, Collections.singletonList(Games.Black_Ops_IV), "Tag_der_Toten"),

    // --------------------------------- Black Ops Cold War MAPS ---------------------------------
    DIE_MASCHINE("Die Maschine", R.drawable.bocw_diemachine_mapcover, OrganizationGroups.American, Collections.singletonList(Games.Black_Ops_Cold_War), "Die_Maschine"),
    FIREBASE_Z("Firebase Z", R.drawable.bocw_firebasez_mapcover, OrganizationGroups.American, Collections.singletonList(Games.Black_Ops_Cold_War), "Firebase_Z"),
    MAUER_DER_TOTEN("Mauer der Toten", R.drawable.bocw_mauerdertoten_mapcover, OrganizationGroups.American, Collections.singletonList(Games.Black_Ops_Cold_War), "Mauer_der_Toten"),
    FORSAKEN("Forsaken", R.drawable.bocw_forsaken_mapcover, OrganizationGroups.American, Collections.singletonList(Games.Black_Ops_Cold_War), "Forsaken_(map)")
;

    public final String displayName;
    public final int mapCover;
    public final OrganizationGroups organization;
    public final List<Games> gamesList;
    public final String fandomLink;

    Maps(String displayName, int mapCover, OrganizationGroups organization, List<Games> gamesList, String fandomPath)
    {
        this.displayName = displayName;
        this.mapCover = mapCover;
        this.organization = organization;
        this.gamesList = gamesList;
        this.fandomLink = "https://callofduty.fandom.com/wiki/" + fandomPath;
    }

    @Override
    public int GetImage() {
        return mapCover;
    }

    @Override
    public String GetDisplayName() {
        return displayName;
    }

    @Override
    public Object GetGroup() {
        return "Organization";
    }
    }
