package com.example.the_ultimate_easter_egg_guide.MapData.BOI;

import static com.example.the_ultimate_easter_egg_guide.MapData.BOI.EasterEggs.KinoDerToten_EasterEggs.KinoDerToten_sideQuests;

import com.example.the_ultimate_easter_egg_guide.MapData.BOI.EasterEggs.Ascension_EasterEggs;
import com.example.the_ultimate_easter_egg_guide.MapData.BOI.EasterEggs.COTD_EasterEggs;
import com.example.the_ultimate_easter_egg_guide.MapData.BOI.EasterEggs.DerReise_EasterEggs;
import com.example.the_ultimate_easter_egg_guide.MapData.BOI.EasterEggs.Five_EasterEggs;
import com.example.the_ultimate_easter_egg_guide.MapData.BOI.EasterEggs.Moon_EasterEggs;
import com.example.the_ultimate_easter_egg_guide.MapData.BOI.EasterEggs.NachtDerUntoten_EasterEggs;
import com.example.the_ultimate_easter_egg_guide.MapData.BOI.EasterEggs.ShangriLa_EasterEggs;
import com.example.the_ultimate_easter_egg_guide.MapData.BOI.EasterEggs.ShiNoNuma_EasterEggs;
import com.example.the_ultimate_easter_egg_guide.MapData.BOI.EasterEggs.Verruckt_EasterEggs;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.MapData;

public class BOI_EggWarehouse
{
    public static final MapData KinoDerToten = new MapData(null, KinoDerToten_sideQuests, null);
    public static final MapData Five = new MapData(null, Five_EasterEggs.Five_SideQuests, Five_EasterEggs.Five_Buildables);
    public static final MapData Ascension = new MapData(Ascension_EasterEggs.Ascension_MainQuests, Ascension_EasterEggs.Ascension_SideQuests, null);
    public static final MapData CallOfTheDead = new MapData(COTD_EasterEggs.COTD_MainQuests, COTD_EasterEggs.COTD_SideQuests, null);
    public static final MapData ShangriLa = new MapData(ShangriLa_EasterEggs.ShangriLa_MainQuests, ShangriLa_EasterEggs.ShangriLa_SideQuests, null);
    public static final MapData Moon = new MapData(Moon_EasterEggs.Moon_MainQuests, Moon_EasterEggs.Moon_SideQuests, null);
    public static final MapData NachtDerUntoten = new MapData(NachtDerUntoten_EasterEggs.NachtDerUntoten_MainQuests, NachtDerUntoten_EasterEggs.NachtDerUntoten_SideQuests, null);
    public static final MapData Verruckt = new MapData(Verruckt_EasterEggs.Verruckt_MainQuests, Verruckt_EasterEggs.Verruckt_SideQuests, null);
    public static final MapData ShiNoNuma = new MapData(ShiNoNuma_EasterEggs.ShiNoNuma_MainQuests, ShiNoNuma_EasterEggs.ShiNoNuma_SideQuests, null);
    public static final MapData DerReise = new MapData(DerReise_EasterEggs.DerReise_MainQuests, DerReise_EasterEggs.DerReise_SideQuests, null);

}
