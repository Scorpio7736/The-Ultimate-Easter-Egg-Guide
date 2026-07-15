package com.example.the_ultimate_easter_egg_guide.StorylineData.ItemsData;

import com.example.the_ultimate_easter_egg_guide.Models.Games;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.IStorylineItems;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.ItemGroups;
import com.example.the_ultimate_easter_egg_guide.R;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum Items implements IStorylineItems
{
    TEST("TEST", R.drawable.app_icon, ItemGroups.TEST, Arrays.asList(Games.Test), "Category:Organizations"),
    //PERKS
    JUGGERNOG("Jugger-Nog", R.drawable.app_icon, ItemGroups.PerkaCola, Games.GetAllGamesBetween(Games.World_At_War, Games.Black_Ops_III), "Juggernog"),
    QUICK_REVIVE("Quick Revive", R.drawable.app_icon, ItemGroups.PerkaCola, Games.GetAllGamesBetween(Games.World_At_War, Games.Black_Ops_III), "Quick_Revive"),
    SPEED_COLA("Speed Cola", R.drawable.app_icon, ItemGroups.PerkaCola, Games.GetAllGamesBetween(Games.World_At_War, Games.Black_Ops_III), "Speed_Cola"),
    DOUBLE_TAP_ROOT_BEER("Double Tap Root Beer", R.drawable.app_icon, ItemGroups.PerkaCola, Games.GetAllGamesBetween(Games.World_At_War, Games.Black_Ops_III), "Double_Tap_Root_Beer"),
    STAMIN_UP("Stamin-Up", R.drawable.app_icon, ItemGroups.PerkaCola, Games.GetAllGamesBetween(Games.Black_Ops_I, Games.Black_Ops_III), "Stamin-Up"),
    PHD_FLOPPER("PhD Flopper", R.drawable.app_icon, ItemGroups.PerkaCola, Games.GetAllGamesBetween(Games.Black_Ops_I, Games.Black_Ops_II), "PhD_Flopper"),
    DEADSHOT_DAIQUIRI("Deadshot Daiquiri", R.drawable.app_icon, ItemGroups.PerkaCola, Games.GetAllGamesBetween(Games.Black_Ops_I, Games.Black_Ops_III), "Deadshot_Daiquiri"),
    MULE_KICK("Mule Kick", R.drawable.app_icon, ItemGroups.PerkaCola, Games.GetAllGamesBetween(Games.Black_Ops_I, Games.Black_Ops_III), "Mule_Kick"),
    TOMBSTONE_SODA("Tombstone Soda", R.drawable.app_icon, ItemGroups.PerkaCola, Collections.singletonList(Games.Black_Ops_II), "Tombstone_Soda"),
    WHOS_WHO("Who's Who", R.drawable.app_icon, ItemGroups.PerkaCola, Collections.singletonList(Games.Black_Ops_II), "Who%27s_Who"),
    ELECTRIC_CHERRY("Electric Cherry", R.drawable.app_icon, ItemGroups.PerkaCola, Games.GetAllGamesBetween(Games.Black_Ops_II, Games.Black_Ops_III), "Electric_Cherry"),
    VULTURE_AID("Vulture Aid Elixir", R.drawable.app_icon, ItemGroups.PerkaCola, Collections.singletonList(Games.Black_Ops_II), "Vulture_Aid"),
    WIDOWS_WINE("Widow's Wine", R.drawable.app_icon, ItemGroups.PerkaCola, Collections.singletonList(Games.Black_Ops_III), "Widow%27s_Wine"),
    //WONDER WEAPONS
    RAY_GUN("Ray Gun", R.drawable.app_icon, ItemGroups.WonderWeapon, Games.GetAllGamesBetween(Games.World_At_War, Games.Black_Ops_III), "Ray_Gun"),
    WUNDERWAFFE_DG_2("Wunderwaffe DG-2", R.drawable.app_icon, ItemGroups.WonderWeapon, Arrays.asList(Games.World_At_War, Games.Black_Ops_I, Games.Black_Ops_III), "Wunderwaffe_DG-2"),
    MONKEY_BOMB("Monkey Bomb", R.drawable.app_icon, ItemGroups.WonderWeapon, Games.GetAllGamesBetween(Games.World_At_War, Games.Black_Ops_III), "Monkey_Bomb"),
    THUNDERGUN("Thundergun", R.drawable.app_icon, ItemGroups.WonderWeapon, Arrays.asList(Games.Black_Ops_I, Games.Black_Ops_III), "Thundergun"),
    WINTERS_HOWL("Winter's Howl", R.drawable.app_icon, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_I), "Winter%27s_Howl"),
    GERSH_DEVICE("Gersh Device", R.drawable.app_icon, ItemGroups.WonderWeapon, Arrays.asList(Games.Black_Ops_I, Games.Black_Ops_III), "Gersh_Device"),
    MATRYOSHKA_DOLLS("Matryoshka Dolls", R.drawable.app_icon, ItemGroups.WonderWeapon, Arrays.asList(Games.Black_Ops_I, Games.Black_Ops_III), "Matryoshka_Dolls"),
    V_R11("V-R11", R.drawable.app_icon, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_I), "V-R11"),
    SCAVENGER("Scavenger", R.drawable.app_icon, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_I), "Scavenger"),
    JGB_215("31-79 JGb215 - Baby Gun", R.drawable.app_icon, ItemGroups.WonderWeapon, Arrays.asList(Games.Black_Ops_I, Games.Black_Ops_III), "31-79_JGb215"),
    WAVE_GUN("Wave Gun", R.drawable.app_icon, ItemGroups.WonderWeapon, Arrays.asList(Games.Black_Ops_I, Games.Black_Ops_III), "Wave_Gun"),
    QUANTUM_ENTANGLEMENT_DEVICE("Quantum Entanglement Device - Q.E.D", R.drawable.app_icon, ItemGroups.WonderWeapon, Arrays.asList(Games.Black_Ops_I, Games.Black_Ops_III), "Quantum_Entanglement_Device"),
    JET_GUN("Thrustodyne Aeronautics Model 23", R.drawable.app_icon, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_II), "Thrustodyne_Aeronautics_Model_23"),
    SLIQUIFIER("Sliquifier", R.drawable.app_icon, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_II), "Sliquifier"),
    BLUNDERGAT("Blundergat", R.drawable.app_icon, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_II), "Blundergat"),
    ACID_GAT("Acid Gat", R.drawable.app_icon, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_II), "Blundergat#Acid_Gat"),
    HELLS_RETRIEVER("Hell's Retriever", R.drawable.app_icon, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_II), "Hell%27s_Retriever"),
    HELLS_REDEEMER("Hell's Redeemer", R.drawable.app_icon, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_II), "Hell%27s_Retriever#Hell%27s_Redeemer"),
    GOLDEN_SPORK("Golden Spork", R.drawable.app_icon, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_II), "Golden_Spork"),
    RAY_GUN_MARK_II("Ray Gun Mark II", R.drawable.app_icon, ItemGroups.WonderWeapon, Games.GetAllGamesBetween(Games.Black_Ops_II, Games.Black_Ops_III), "Ray_Gun_Mark_II"),
    PARALYZER("Paralyzer", R.drawable.app_icon, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_II), "Paralyzer"),
    TIME_BOMB("Time Bomb", R.drawable.app_icon, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_II), "Time_Bomb"),
    STAFF_OF_ICE("Staff of Ice", R.drawable.app_icon, ItemGroups.WonderWeapon, Games.GetAllGamesBetween(Games.Black_Ops_II, Games.Black_Ops_III), "Staff_of_Ice"),
    STAFF_OF_FIRE("Staff of Fire", R.drawable.app_icon, ItemGroups.WonderWeapon, Games.GetAllGamesBetween(Games.Black_Ops_II, Games.Black_Ops_III), "Staff_of_Fire"),
    STAFF_OF_WIND("Staff of Wind", R.drawable.app_icon, ItemGroups.WonderWeapon, Games.GetAllGamesBetween(Games.Black_Ops_II, Games.Black_Ops_III), "Staff_of_Wind"),
    STAFF_OF_LIGHTNING("Staff of Lightning", R.drawable.app_icon, ItemGroups.WonderWeapon, Games.GetAllGamesBetween(Games.Black_Ops_II, Games.Black_Ops_III), "Staff_of_Lightning"),
    G_STRIKE("G-Strike", R.drawable.app_icon, ItemGroups.WonderWeapon, Games.GetAllGamesBetween(Games.Black_Ops_II, Games.Black_Ops_III), "G-Strike"),
    ONE_INCH_PUNCH("One Inch Punch", R.drawable.app_icon, ItemGroups.WonderWeapon, Games.GetAllGamesBetween(Games.Black_Ops_II, Games.Black_Ops_III), "One_Inch_Punch"),
    SEKHMETS_VIGOR("Sekhmet's Vigor", R.drawable.app_icon, ItemGroups.WonderWeapon, Games.GetAllGamesBetween(Games.Black_Ops_II, Games.Black_Ops_III), "Sekhmet%27s_Vigor"),
    APOTHICON_SERVANT("Apothicon Servant", R.drawable.app_icon, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_III), "Apothicon_Servant"),
    LIL_ARNIE("Li'l Arnie", R.drawable.app_icon, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_III), "Li%27l_Arnie"),
    APOTHICON_SWORD("Apothicon Sword", R.drawable.app_icon, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_III), "Apothicon_Sword"),
    WRATH_OF_THE_ANCIENTS("Wrath of the Ancients", R.drawable.app_icon, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_III), "Wrath_of_the_Ancients"),
    STORM_BOW("Kreema'ahm la Ahmahm", R.drawable.app_icon, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_III), "Wrath_of_the_Ancients/Kreema%27ahm_la_Ahmahm"),
    FIRE_BOW("Kreeaho'ahm nal Ahmhogaroc", R.drawable.app_icon, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_III), "Wrath_of_the_Ancients/Kreeaho%27ahm_nal_Ahmhogaroc"),
    VOID_BOW("Kreegakaleet lu Gosata'ahm", R.drawable.app_icon, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_III), "Wrath_of_the_Ancients/Kreegakaleet_lu_Gosata%27ahm"),
    WOLF_BOW("Kreeholo lu Kreemasaleet", R.drawable.app_icon, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_III), "Wrath_of_the_Ancients/Kreeholo_lu_Kreemasaleet"),
    RAGNAROK_DG_4("Ragnarok DG-4", R.drawable.app_icon, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_III), "Ragnarok_DG-4"),
    SKULL_OF_NAN_SAPWE("Skull of Nan Sapwe", R.drawable.app_icon, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_III), "Skull_of_Nan_Sapwe"),
    KT_4("KT-4", R.drawable.app_icon, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_III), "KT-4"),
    SPIDER_BAIT("Spider Bait", R.drawable.app_icon, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_III), "Spider_Bait"),
    GKZ_45_MK3("GKZ-45 Mk3", R.drawable.app_icon, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_III), "GKZ-45_Mk3"),
    GAUNTLET_OF_SIEGFRIED("Gauntlet of Siegfried", R.drawable.app_icon, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_III), "Gauntlet_of_Siegfried"),
    DRAGON_STRIKE("Dragon Strike", R.drawable.app_icon, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_III), "Dragon_Strike"),
    PATH_OF_SORROWS("Path of Sorrows", R.drawable.app_icon, ItemGroups.WonderWeapon, Collections.singletonList(Games.Black_Ops_III), "Path_of_Sorrows"),
    //STORYLINEITEMS
    ELEMENT_115("Element 115", R.drawable.app_icon, ItemGroups.StorylineItem, Games.GetAllGamesBetween(Games.World_At_War, Games.Black_Ops_III), "Element_115"),
    LIQUID_DIVINIUM("Liquid Divinium", R.drawable.app_icon, ItemGroups.StorylineItem, Games.GetAllGamesBetween(Games.Black_Ops_II, Games.Black_Ops_III), "Liquid_Divinium"),
    GOLDEN_ROD("Golden Rod", R.drawable.app_icon, ItemGroups.StorylineItem, Games.GetAllGamesBetween(Games.Black_Ops_I, Games.Black_Ops_III), "Vril_Device"),
    FOCUSING_STONE("Focusing Stone", R.drawable.app_icon, ItemGroups.StorylineItem, Games.GetAllGamesBetween(Games.Black_Ops_I, Games.Black_Ops_III), "Focusing_Stone"),
    MPD("Moon Pyramid Device", R.drawable.app_icon, ItemGroups.StorylineItem, Games.GetAllGamesBetween(Games.Black_Ops_I, Games.Black_Ops_III), "MPD"),
    NAVCARD("Navcard", R.drawable.app_icon, ItemGroups.StorylineItem, Collections.singletonList(Games.Black_Ops_II), "Navcard"),
    NAVCARD_READER("Navcard Reader", R.drawable.app_icon, ItemGroups.StorylineItem, Collections.singletonList(Games.Black_Ops_II), "Navcard#Overview"),
    BLOOD_VIALS("Blood Vials", R.drawable.app_icon, ItemGroups.StorylineItem, Games.GetAllGamesBetween(Games.Black_Ops_II, Games.Black_Ops_III), "Blood_Vials"),
    MAXIS_DRONE("Maxis Drone", R.drawable.app_icon, ItemGroups.StorylineItem, Games.GetAllGamesBetween(Games.Black_Ops_II, Games.Black_Ops_III), "Maxis_Drone"),
    GRAMOPHONE("Gramophone", R.drawable.app_icon, ItemGroups.StorylineItem, Games.GetAllGamesBetween(Games.Black_Ops_II, Games.Black_Ops_III), "Gramophone"),
    SUMMONING_KEY("Summoning Key", R.drawable.app_icon, ItemGroups.StorylineItem, Collections.singletonList(Games.Black_Ops_III), "Summoning_Key"),
    KRONORIUM("Kronorium", R.drawable.app_icon, ItemGroups.StorylineItem, Collections.singletonList(Games.Black_Ops_III), "Kronorium"),
    GATEWORM("Gateworm", R.drawable.app_icon, ItemGroups.StorylineItem, Collections.singletonList(Games.Black_Ops_III), "Gateworm"),
    KEEPER_TABLET("Keeper Tablet", R.drawable.app_icon, ItemGroups.StorylineItem, Collections.singletonList(Games.Black_Ops_III), "Keeper_Tablet"),
    APOTHICON_BLOOD("Apothicon Blood", R.drawable.app_icon, ItemGroups.StorylineItem, Collections.singletonList(Games.Black_Ops_III), "Apothicon_Blood"),
    RUNES_OF_CREATION("Runes of Creation", R.drawable.app_icon, ItemGroups.StorylineItem, Collections.singletonList(Games.Black_Ops_III), "Runes_of_Creation");



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
