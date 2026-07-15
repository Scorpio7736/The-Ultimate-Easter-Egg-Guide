package com.example.the_ultimate_easter_egg_guide.StorylineData.CreaturesData;

import com.example.the_ultimate_easter_egg_guide.Models.Storyline.CreatureGroups;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.IStorylineItem;
import com.example.the_ultimate_easter_egg_guide.Models.Games;
import com.example.the_ultimate_easter_egg_guide.R;

import java.util.Arrays;
import java.util.List;

public enum Enemy_Creatures implements IStorylineItem
{
    Test("Test Creature", R.drawable.app_icon, CreatureGroups.TEST, Arrays.asList(Games.Test), ""),
    Zombie("Zombie", R.drawable.app_icon, CreatureGroups.StandardEnemy, Games.GetAllGamesBetween(Games.World_At_War, Games.Black_Ops_VII), "Zombie"),
    Hellhound("Hellhound", R.drawable.app_icon, CreatureGroups.Special, Games.GetAllGamesBetween(Games.World_At_War, Games.Black_Ops_Cold_War), "Hellhound"),
    Nova6Crawler("Nova 6 Crawler", R.drawable.app_icon, CreatureGroups.Special, Arrays.asList(Games.Black_Ops_I, Games.Black_Ops_III), "Crawler_Zombie"),
    PentagonThief("Pentagon Thief", R.drawable.app_icon, CreatureGroups.Special, Arrays.asList(Games.Black_Ops_I, Games.Black_Ops_III), "Yuri_Zavoyski_(Aether)"),
    GeorgeRomero("George Romero", R.drawable.app_icon, CreatureGroups.Boss, Arrays.asList(Games.Black_Ops_I), "George_A._Romero"),
    NapalmZombie("Napalm Zombie", R.drawable.app_icon, CreatureGroups.StandardEnemy, Arrays.asList(Games.Black_Ops_I, Games.Black_Ops_III), "Napalm_Zombie"),
    ShriekerZombie("Shrieker Zombie", R.drawable.app_icon, CreatureGroups.StandardEnemy, Arrays.asList(Games.Black_Ops_I, Games.Black_Ops_III), "Shrieker_Zombie"),
    ShangriLaMonkeys("Shangri-La Monkeys", R.drawable.app_icon, CreatureGroups.StandardEnemy, Arrays.asList(Games.Black_Ops_I, Games.Black_Ops_III), "Zombie_Monkey"),
    SpaceMonkey("Space Monkeys", R.drawable.app_icon, CreatureGroups.Special, Arrays.asList(Games.Black_Ops_I, Games.Black_Ops_III), "Space_Monkey"),
    MoonAstronaut("Moon Astronaut", R.drawable.app_icon, CreatureGroups.Special, Arrays.asList(Games.Black_Ops_I, Games.Black_Ops_III), "Astronaut_Zombie"),
    Denizens("Denizens", R.drawable.app_icon, CreatureGroups.StandardEnemy, Arrays.asList(Games.Black_Ops_II), "Denizen"),
    Avagadro("Avagadro", R.drawable.app_icon, CreatureGroups.Special, Arrays.asList(Games.Black_Ops_II, Games.Black_Ops_IV), "Cornelius_Pernell"),
    Brutus("Brutus", R.drawable.brutus_pfp, CreatureGroups.Special, Arrays.asList(Games.Black_Ops_II, Games.Black_Ops_IV), "Brutus_(Zombies)"),
    JumpingJacks("Jumping Jacks", R.drawable.app_icon, CreatureGroups.Special, Arrays.asList(Games.Black_Ops_II, Games.Black_Ops_IV), "Crawler_Zombie"),
    Witches("Witches", R.drawable.app_icon, CreatureGroups.Special, Arrays.asList(Games.Black_Ops_II), "Ghost_(Zombies)"),
    PanzerSoldat("Panzer Soldat", R.drawable.app_icon, CreatureGroups.Special, Arrays.asList(Games.Black_Ops_II, Games.Black_Ops_III), "Panzersoldat"),
    TheAncients("The Ancients", R.drawable.app_icon, CreatureGroups.StandardEnemy, Arrays.asList(Games.Black_Ops_II, Games.Black_Ops_III), "The_Ancients"),
    Margwa("Margwa", R.drawable.app_icon, CreatureGroups.Special, Arrays.asList(Games.Black_Ops_III, Games.Black_Ops_IV), "Margwa"),
    Paracite("Parasite", R.drawable.app_icon, CreatureGroups.Special, Arrays.asList(Games.Black_Ops_III), "Parasite"),
    Meatballs("Meatballs", R.drawable.app_icon, CreatureGroups.Special, Arrays.asList(Games.Black_Ops_III), ""),
    Keepers("Keepers", R.drawable.app_icon, CreatureGroups.Special, Arrays.asList(Games.Black_Ops_III), "Keeper"),
    KeeperBoss("Keeper Boss", R.drawable.app_icon, CreatureGroups.Boss, Arrays.asList(Games.Black_Ops_III), "Keeper"),
    SkeletonZombie("Skeleton Zombie", R.drawable.app_icon, CreatureGroups.StandardEnemy, Arrays.asList(Games.Black_Ops_III), "Skeleton"),
    TheShadowMan("The Shadowman", R.drawable.shadowman_pfp, CreatureGroups.Boss, Arrays.asList(Games.Black_Ops_III, Games.Black_Ops_IV), "Shadowman"),
    Thrasher("Thrasher", R.drawable.app_icon, CreatureGroups.Special, Arrays.asList(Games.Black_Ops_III), "Thrasher"),
    Spiders("Spiders", R.drawable.app_icon, CreatureGroups.Special, Arrays.asList(Games.Black_Ops_III), "Spider_(Zombies)"),
    SpiderBoss("Spider Boss", R.drawable.app_icon, CreatureGroups.Boss, Arrays.asList(Games.Black_Ops_III), "Giant_Spider"),
    ThrasherBoss("Thrasher Boss", R.drawable.app_icon, CreatureGroups.Boss, Arrays.asList(Games.Black_Ops_III), "Thrasher"),
    RussianMangler("Russian Mangler", R.drawable.app_icon, CreatureGroups.Special, Arrays.asList(Games.Black_Ops_III, Games.Black_Ops_IV), "Mangler"),
    ValkyrieDrone("Valkyrie Drone", R.drawable.app_icon, CreatureGroups.Special, Arrays.asList(Games.Black_Ops_III), "Valkyrie_Drone"),
    Dragon("Dragon", R.drawable.app_icon, CreatureGroups.Special, Arrays.asList(Games.Black_Ops_III), "Dragon_(Black_Ops_III)"),
    NikoliMech("Nikolai's Mech", R.drawable.app_icon, CreatureGroups.Boss, Arrays.asList(Games.Black_Ops_III), "Nikolai_Belinski_(Ultimis)"),
    Furies("Furies", R.drawable.app_icon, CreatureGroups.Special, Arrays.asList(Games.Black_Ops_III, Games.Black_Ops_IV), "Fury"),
    CorruptedKeeper("Corrupted Keeper", R.drawable.app_icon, CreatureGroups.Special, Arrays.asList(Games.Black_Ops_III), "Keeper"),
    CosmicSilverback("Cosmic Silverback", R.drawable.app_icon, CreatureGroups.Boss, Arrays.asList(Games.Black_Ops_I, Games.Black_Ops_III), "Cosmic_Silverback"),
    ElderGod("Apothicon Elder God", R.drawable.app_icon, CreatureGroups.Boss, Arrays.asList(Games.Black_Ops_III), "Apothicon");

    //BO4
    //Stoker("Stoker", R.drawable.app_icon, CreatureGroups.Special, Arrays.asList(games.Black_Ops_IV)),
    //JoltingJack("Jolting Jack", R.drawable.app_icon, CreatureGroups.StandardEnemy, Arrays.asList(games.Black_Ops_IV), "Jolting_Jack"),
    //Nova6Bomber("Nova 6 Bomber", R.drawable.app_icon, CreatureGroups.StandardEnemy, Arrays.asList(games.Black_Ops_IV),"Nova_6_Bomber"),
    //BleightFather("Blight Father", R.drawable.app_icon, CreatureGroups.Special, Arrays.asList(games.Black_Ops_IV)),
    //CatalystZombie("Catalyst Zombie", R.drawable.app_icon, CreatureGroups.Special, Arrays.asList(games.Black_Ops_IV)),
    //GiantEyeball("Giant Eyeball", R.drawable.app_icon, CreatureGroups.Boss, Arrays.asList(games.Black_Ops_IV)),
    //Tigers("Tigers", R.drawable.app_icon, CreatureGroups.Special, Arrays.asList(games.Black_Ops_IV)),
    //Destroyer("Destroyer", R.drawable.app_icon, CreatureGroups.Special, Arrays.asList(games.Black_Ops_IV)),
    //Merroter("Marauder", R.drawable.app_icon, CreatureGroups.Special, Arrays.asList(games.Black_Ops_IV)),
    //Warewolf("Werewolf", R.drawable.app_icon, CreatureGroups.Special, Arrays.asList(games.Black_Ops_IV)),
    //NosForotues("Nosferatu", R.drawable.app_icon, CreatureGroups.Special, Arrays.asList(games.Black_Ops_IV)),
    //WarewolfBoss("Werewolf Boss", R.drawable.app_icon, CreatureGroups.Boss, Arrays.asList(games.Black_Ops_IV)),
    //Spartwa("Spartoi", R.drawable.app_icon, CreatureGroups.Special, Arrays.asList(games.Black_Ops_IV)),
    //Gigganeese("Gegenees", R.drawable.app_icon, CreatureGroups.Special, Arrays.asList(games.Black_Ops_IV)),
    //Pegasis("Pegasus", R.drawable.app_icon, CreatureGroups.Boss, Arrays.asList(games.Black_Ops_IV)),
    //Percious("Perseus", R.drawable.app_icon, CreatureGroups.Boss, Arrays.asList(games.Black_Ops_IV)),
    //Megaton("Megaton", R.drawable.app_icon, CreatureGroups.Special, Arrays.asList(games.Black_Ops_Cold_War)),
    //Mimic("Mimic", R.drawable.app_icon, CreatureGroups.Special, Arrays.asList(games.Black_Ops_Cold_War)),
    //Orda("Orda", R.drawable.app_icon, CreatureGroups.Boss, Arrays.asList(games.Black_Ops_Cold_War));

    public final String displayName;
    public final int creatureCover;
    public final CreatureGroups creatureGroup;
    public final List<Games> gamesList;
    public final String fandomLink;

    @Override
    public int getCharacterImage() {
        return creatureCover;
    }

    @Override
    public String getCharacterName() {
        return displayName;
    }

    @Override
    public Object getCharacterGroup() {
        return creatureGroup;
    }


    Enemy_Creatures(String displayName, int creatureCover, CreatureGroups creatureGroup, List<Games> gamesList, String fandomPath)
    {
        this.displayName = displayName;
        this.creatureCover = creatureCover;
        this.creatureGroup = creatureGroup;
        this.gamesList = gamesList;
        this.fandomLink = "https://callofduty.fandom.com/wiki/" + fandomPath;
    }

}
