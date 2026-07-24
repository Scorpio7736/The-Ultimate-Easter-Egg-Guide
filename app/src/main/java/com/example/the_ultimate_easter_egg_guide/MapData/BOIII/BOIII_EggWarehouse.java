package com.example.the_ultimate_easter_egg_guide.MapData.BOIII;

import com.example.the_ultimate_easter_egg_guide.MapData.BOIII.EasterEggs.DerEisendrache_EasterEggs;
import com.example.the_ultimate_easter_egg_guide.MapData.BOIII.EasterEggs.GorodKrovi_EasterEggs;
import com.example.the_ultimate_easter_egg_guide.MapData.BOIII.EasterEggs.Revelations_EasterEggs;
import com.example.the_ultimate_easter_egg_guide.MapData.BOIII.EasterEggs.SOE_EasterEggs;
import com.example.the_ultimate_easter_egg_guide.MapData.BOIII.EasterEggs.TheGiant_EasterEggs;
import com.example.the_ultimate_easter_egg_guide.MapData.BOIII.EasterEggs.ZetsubouNoShima_EasterEggs;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.MapData;

public class BOIII_EggWarehouse
{
    public static final MapData ShadowsOfEvil = new MapData(SOE_EasterEggs.SOE_MainQuests, SOE_EasterEggs.SOE_SideQuests, SOE_EasterEggs.SOE_Buildables);
    public static final MapData TheGiant = new MapData(TheGiant_EasterEggs.TheGiant_MainQuests, TheGiant_EasterEggs.TheGiant_SideQuests, null);
    public static final MapData DerEisendrache = new MapData(DerEisendrache_EasterEggs.DerEisendrache_MainQuests, DerEisendrache_EasterEggs.DerEisendrache_SideQuests, DerEisendrache_EasterEggs.DerEisendrache_Buildables);
    public static final MapData ZetsubouNoShima = new MapData(ZetsubouNoShima_EasterEggs.ZetsubouNoShima_MainQuests, ZetsubouNoShima_EasterEggs.ZetsubouNoShima_SideQuests, ZetsubouNoShima_EasterEggs.ZetsubouNoShima_Buildables);
    public static final MapData GorodKrovi = new MapData(GorodKrovi_EasterEggs.GorodKrovi_MainQuests, GorodKrovi_EasterEggs.GorodKrovi_SideQuests, GorodKrovi_EasterEggs.GorodKrovi_Buildables);
    public static final MapData Revelations = new MapData(Revelations_EasterEggs.Revelations_MainQuests, Revelations_EasterEggs.Revelations_SideQuests, Revelations_EasterEggs.Revelations_Buildables);
    public static final MapData NachtDerUntoten = new MapData(null, null, null);
    public static final MapData Verruckt = new MapData(null, null, null);
    public static final MapData ShiNoNuma = new MapData(null, null, null);
    public static final MapData KinoDerToten = new MapData(null, null, null);
    public static final MapData Ascension = new MapData(null, null, null);
    public static final MapData ShangriLa = new MapData(null, null, null);
    public static final MapData Moon = new MapData(null, null, null);
    public static final MapData Origins = new MapData(null, null, null);
}
