package com.example.the_ultimate_easter_egg_guide.StorylineData.ItemsData;

import android.content.ClipData;

import com.example.the_ultimate_easter_egg_guide.Models.Games;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.IStorylineItems;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.ItemGroups;
import com.example.the_ultimate_easter_egg_guide.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum Items implements IStorylineItems
{
    TEST("Test Item", R.drawable.app_icon, ItemGroups.TEST, Collections.singletonList(Games.Test), "Category:Organizations"),
    //PERKS
    JUGGERNOG("Jugger-Nog", R.drawable.juggernog_pfp, ItemGroups.Consumables, Games.GetAllGamesBetween(Games.World_At_War, Games.Black_Ops_III), "Juggernog"),
    QUICK_REVIVE("Quick Revive", R.drawable.quickrevive_pfp, ItemGroups.Consumables, Games.GetAllGamesBetween(Games.World_At_War, Games.Black_Ops_III), "Quick_Revive"),
    SPEED_COLA("Speed Cola", R.drawable.speedcola_pfp, ItemGroups.Consumables, Games.GetAllGamesBetween(Games.World_At_War, Games.Black_Ops_III), "Speed_Cola"),
    DOUBLE_TAP_ROOT_BEER("Double Tap Root Beer", R.drawable.doubletap_pfp, ItemGroups.Consumables, Games.GetAllGamesBetween(Games.World_At_War, Games.Black_Ops_III), "Double_Tap_Root_Beer"),
    STAMIN_UP("Stamin-Up", R.drawable.staminup_pfp, ItemGroups.Consumables, Games.GetAllGamesBetween(Games.Black_Ops_I, Games.Black_Ops_III), "Stamin-Up"),
    PHD_FLOPPER("PhD Flopper", R.drawable.phdflopper_pfp, ItemGroups.Consumables, Games.GetAllGamesBetween(Games.Black_Ops_I, Games.Black_Ops_II), "PhD_Flopper"),
    DEADSHOT_DAIQUIRI("Deadshot Daiquiri", R.drawable.deadshotdaiquiri_pfp, ItemGroups.Consumables, Games.GetAllGamesBetween(Games.Black_Ops_I, Games.Black_Ops_III), "Deadshot_Daiquiri"),
    MULE_KICK("Mule Kick", R.drawable.mulekick_pfp, ItemGroups.Consumables, Games.GetAllGamesBetween(Games.Black_Ops_I, Games.Black_Ops_III), "Mule_Kick"),
    TOMBSTONE_SODA("Tombstone Soda", R.drawable.tombstone_pfp, ItemGroups.Consumables, Collections.singletonList(Games.Black_Ops_II), "Tombstone_Soda"),
    WHOS_WHO("Who's Who", R.drawable.whoswho_pfp, ItemGroups.Consumables, Collections.singletonList(Games.Black_Ops_II), "Who%27s_Who"),
    ELECTRIC_CHERRY("Electric Cherry", R.drawable.electriccherry_pfp, ItemGroups.Consumables, Games.GetAllGamesBetween(Games.Black_Ops_II, Games.Black_Ops_III), "Electric_Cherry"),
    VULTURE_AID("Vulture Aid Elixir", R.drawable.vultureaid_pfp, ItemGroups.Consumables, Collections.singletonList(Games.Black_Ops_II), "Vulture_Aid"),
    WIDOWS_WINE("Widow's Wine", R.drawable.widowswine_pfp, ItemGroups.Consumables, Collections.singletonList(Games.Black_Ops_III), "Widow%27s_Wine"),

    //WONDER WEAPONS
    RAY_GUN("Ray Gun", R.drawable.raygun_pfp, ItemGroups.WonderWeapon, Games.GetAllGamesBetween(Games.World_At_War, Games.Black_Ops_III), "Ray_Gun"),
    WUNDERWAFFE_DG_2("Wunderwaffe DG-2", R.drawable.wunderwaffedg2_pfp, ItemGroups.WonderWeapon, Arrays.asList(Games.World_At_War, Games.Black_Ops_I, Games.Black_Ops_III), "Wunderwaffe_DG-2"),
    MONKEY_BOMB("Monkey Bomb", R.drawable.monkeybomb_pfp, ItemGroups.WonderWeapon, Games.GetAllGamesBetween(Games.World_At_War, Games.Black_Ops_III), "Monkey_Bomb"),
    THUNDERGUN("Thundergun", R.drawable.thundergun_pfp, ItemGroups.WonderWeapon, Arrays.asList(Games.Black_Ops_I, Games.Black_Ops_III), "Thundergun"),
    WINTERS_HOWL("Winter's Howl", R.drawable.wintershowl_pfp, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_I), "Winter%27s_Howl"),
    GERSH_DEVICE("Gersh Device", R.drawable.gerschdevice_pfp, ItemGroups.WonderWeapon, Arrays.asList(Games.Black_Ops_I, Games.Black_Ops_III), "Gersh_Device"),
    MATRYOSHKA_DOLLS("Matryoshka Dolls", R.drawable.matryoshkadoll_pfp, ItemGroups.WonderWeapon, Arrays.asList(Games.Black_Ops_I, Games.Black_Ops_III), "Matryoshka_Dolls"),
    V_R11("V-R11", R.drawable.vr11_pfp, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_I), "V-R11"),
    SCAVENGER("Scavenger", R.drawable.scavenger_pfp, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_I), "Scavenger"),
    JGB_215("31-79 JGb215 - Baby Gun", R.drawable.jgb215_pfp, ItemGroups.WonderWeapon, Arrays.asList(Games.Black_Ops_I, Games.Black_Ops_III), "31-79_JGb215"),
    WAVE_GUN("Wave Gun", R.drawable.wavegun_pfp, ItemGroups.WonderWeapon, Arrays.asList(Games.Black_Ops_I, Games.Black_Ops_III), "Wave_Gun"),
    QUANTUM_ENTANGLEMENT_DEVICE("Quantum Entanglement Device - Q.E.D", R.drawable.qed_pfp, ItemGroups.WonderWeapon, Arrays.asList(Games.Black_Ops_I, Games.Black_Ops_III), "Quantum_Entanglement_Device"),
    JET_GUN("Thrustodyne Aeronautics Model 23", R.drawable.jetgun_pfp, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_II), "Thrustodyne_Aeronautics_Model_23"),
    SLIQUIFIER("Sliquifier", R.drawable.sliquifier_pfp, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_II), "Sliquifier"),
    BLUNDERGAT("Blundergat", R.drawable.blundergat_pfp, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_II), "Blundergat"),
    ACID_GAT("Acid Gat", R.drawable.acidgat_pfp, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_II), "Blundergat#Acid_Gat"),
    HELLS_RETRIEVER("Hell's Retriever", R.drawable.hellsretriever_pfp, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_II), "Hell%27s_Retriever"),
    HELLS_REDEEMER("Hell's Redeemer", R.drawable.hellsredeemer_pfp, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_II), "Hell%27s_Retriever#Hell%27s_Redeemer"),
    GOLDEN_SPORK("Golden Spork", R.drawable.goldenspork_pfp, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_II), "Golden_Spork"),
    RAY_GUN_MARK_II("Ray Gun Mark II", R.drawable.raygunmkii_pfp, ItemGroups.WonderWeapon, Games.GetAllGamesBetween(Games.Black_Ops_II, Games.Black_Ops_III), "Ray_Gun_Mark_II"),
    PARALYZER("Paralyzer", R.drawable.paralyzer_pfp, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_II), "Paralyzer"),
    TIME_BOMB("Time Bomb", R.drawable.timebomb_pfp, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_II), "Time_Bomb"),
    STAFF_OF_ICE("Staff of Ice", R.drawable.staffofice_pfp, ItemGroups.WonderWeapon, Games.GetAllGamesBetween(Games.Black_Ops_II, Games.Black_Ops_III), "Staff_of_Ice"),
    STAFF_OF_FIRE("Staff of Fire", R.drawable.staffoffire_pfp, ItemGroups.WonderWeapon, Games.GetAllGamesBetween(Games.Black_Ops_II, Games.Black_Ops_III), "Staff_of_Fire"),
    STAFF_OF_WIND("Staff of Wind", R.drawable.staffofwind_pfp, ItemGroups.WonderWeapon, Games.GetAllGamesBetween(Games.Black_Ops_II, Games.Black_Ops_III), "Staff_of_Wind"),
    STAFF_OF_LIGHTNING("Staff of Lightning", R.drawable.staffoflightning_pfp, ItemGroups.WonderWeapon, Games.GetAllGamesBetween(Games.Black_Ops_II, Games.Black_Ops_III), "Staff_of_Lightning"),
    G_STRIKE("G-Strike", R.drawable.gstrike_pfp, ItemGroups.WonderWeapon, Games.GetAllGamesBetween(Games.Black_Ops_II, Games.Black_Ops_III), "G-Strike"),
    ONE_INCH_PUNCH("One Inch Punch", R.drawable.oneinchpunch_pfp, ItemGroups.WonderWeapon, Games.GetAllGamesBetween(Games.Black_Ops_II, Games.Black_Ops_III), "One_Inch_Punch"),
    APOTHICON_SERVANT("Apothicon Servant", R.drawable.apothiconservant_pfp, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_III), "Apothicon_Servant"),
    LIL_ARNIE("Li'l Arnie", R.drawable.lilarnie_pfp, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_III), "Li%27l_Arnie"),
    APOTHICON_SWORD("Apothicon Sword", R.drawable.apothiconsword_pfp, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_III), "Apothicon_Sword"),
    WRATH_OF_THE_ANCIENTS("Wrath of the Ancients", R.drawable.wrathoftheancients_pfp, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_III), "Wrath_of_the_Ancients"),
    STORM_BOW("Kreema'ahm la Ahmahm", R.drawable.stormbow_pfp, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_III), "Wrath_of_the_Ancients/Kreema%27ahm_la_Ahmahm"),
    FIRE_BOW("Kreeaho'ahm nal Ahmhogaroc", R.drawable.firebow_pfp, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_III), "Wrath_of_the_Ancients/Kreeaho%27ahm_nal_Ahmhogaroc"),
    VOID_BOW("Kreegakaleet lu Gosata'ahm", R.drawable.voidbow_pfp, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_III), "Wrath_of_the_Ancients/Kreegakaleet_lu_Gosata%27ahm"),
    WOLF_BOW("Kreeholo lu Kreemasaleet", R.drawable.wolfbow_pfp, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_III), "Wrath_of_the_Ancients/Kreeholo_lu_Kreemasaleet"),
    RAGNAROK_DG_4("Ragnarok DG-4", R.drawable.ragnarokdg4_pfp, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_III), "Ragnarok_DG-4"),
    SKULL_OF_NAN_SAPWE("Skull of Nan Sapwe", R.drawable.skullofnansapwe_pfp, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_III), "Skull_of_Nan_Sapwe"),
    KT_4("KT-4", R.drawable.kt4_pfp, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_III), "KT-4"),
    SPIDER_BAIT("Spider Bait", R.drawable.spiderbait_pfp, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_III), "Spider_Bait"),
    GKZ_45_MK3("GKZ-45 Mk3", R.drawable.gkz45mk3_pfp, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_III), "GKZ-45_Mk3"),
    GAUNTLET_OF_SIEGFRIED("Gauntlet of Siegfried", R.drawable.gauntletofsiegfried_pfp, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_III), "Gauntlet_of_Siegfried"),
    DRAGON_STRIKE("Dragon Strike", R.drawable.dragonstrike_pfp, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_III), "Dragon_Strike"),
    PATH_OF_SORROWS("Path of Sorrows", R.drawable.pathofsorrows_pfp, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_III), "Path_of_Sorrows"),
    //STORYLINEITEMS
    ELEMENT_115("Element 115", R.drawable.element115_pfp, ItemGroups.StorylineItem, Games.GetAllGamesBetween(Games.World_At_War, Games.Black_Ops_III), "Element_115"),
    LIQUID_DIVINIUM("Liquid Divinium", R.drawable.liquiddivinium_pfp, ItemGroups.StorylineItem, Games.GetAllGamesBetween(Games.Black_Ops_II, Games.Black_Ops_III), "Liquid_Divinium"),
    Pack_A_Punch("Pack-A-Punch", R.drawable.packapunch_pfp, ItemGroups.StorylineItem, Games.GetAllGamesBetween(Games.World_At_War, Games.Black_Ops_VII), "Pack-a-Punch_Machine/Treyarch"),
    AGARTHAN_DEVICE("Agarthan Device", R.drawable.agarthandevice_pfp, ItemGroups.StorylineItem, Games.GetAllGamesBetween(Games.Black_Ops_III, Games.Black_Ops_IV), "Agarthan_Device"),
    GOLDEN_ROD("Golden Rod - Vril Device", R.drawable.goldenrod_pfp, ItemGroups.StorylineItem, Games.GetAllGamesBetween(Games.Black_Ops_I, Games.Black_Ops_III), "Vril_Device"),
    FOCUSING_STONE("Focusing Stone", R.drawable.focusingstone_pfp, ItemGroups.StorylineItem, Games.GetAllGamesBetween(Games.Black_Ops_I, Games.Black_Ops_III), "Focusing_Stone"),
    MPD("Moon Pyramid Device", R.drawable.mpd_pfp, ItemGroups.StorylineItem, Games.GetAllGamesBetween(Games.Black_Ops_I, Games.Black_Ops_III), "MPD"),
    NAVCARD("Navcard", R.drawable.navcard_pfp, ItemGroups.StorylineItem, Collections.singletonList(Games.Black_Ops_II), "Navcard"),
    NAVCARD_READER("Navcard Reader", R.drawable.navcardreader_pfp, ItemGroups.StorylineItem, Collections.singletonList(Games.Black_Ops_II), "Navcard#Overview"),
    BLOOD_VIALS("Blood Vials", R.drawable.bloodvials_pfp, ItemGroups.StorylineItem, Games.GetAllGamesBetween(Games.Black_Ops_II, Games.Black_Ops_III), "Blood_Vials"),
    MAXIS_DRONE("Maxis Drone", R.drawable.maxisdrone_pfp, ItemGroups.StorylineItem, Games.GetAllGamesBetween(Games.Black_Ops_II, Games.Black_Ops_III), "Maxis_Drone"),
    GRAMOPHONE("Gramophone", R.drawable.gramophone_pfp, ItemGroups.StorylineItem, Games.GetAllGamesBetween(Games.Black_Ops_II, Games.Black_Ops_III), "Gramophone"),
    SUMMONING_KEY("Summoning Key", R.drawable.summoningkey_pfp, ItemGroups.StorylineItem, Collections.singletonList(Games.Black_Ops_III), "Summoning_Key"),
    KRONORIUM("Kronorium", R.drawable.kronorium_pfp, ItemGroups.StorylineItem, Collections.singletonList(Games.Black_Ops_III), "Kronorium"),
    GATEWORM("Gateworm", R.drawable.gateworm_pfp, ItemGroups.StorylineItem, Collections.singletonList(Games.Black_Ops_III), "Gateworm"),
    GOBBLEGUMS("Gobble Gums", R.drawable.gobblegums_pfp, ItemGroups.Consumables, Games.GetAllGamesBetween(Games.Black_Ops_III, Games.Black_Ops_IV), "GobbleGum"),

    ;
    public final String displayName;
    public final int itemImage;
    public final ItemGroups itemGroup;
    public final List<Games> gamesList;
    public final String fandomLink;

    Items(String displayName, int itemImage, ItemGroups itemGroup, List<Games> gamesList, String fandomPath)
    {
        this.displayName = displayName;
        this.itemImage = itemImage;
        this.itemGroup = itemGroup;
        this.gamesList = gamesList;
        this.fandomLink = "https://callofduty.fandom.com/wiki/" + fandomPath;
    }

    @Override
    public int GetImage() {
        return itemImage;
    }

    @Override
    public String GetDisplayName() {
        return displayName;
    }

    @Override
    public Object GetGroup() {
        return itemGroup;
    }
}
