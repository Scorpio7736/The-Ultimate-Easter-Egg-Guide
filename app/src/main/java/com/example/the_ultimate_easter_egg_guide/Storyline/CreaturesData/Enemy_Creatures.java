package com.example.the_ultimate_easter_egg_guide.Storyline.CreaturesData;

import com.example.the_ultimate_easter_egg_guide.Models.Storyline.CreatureGroups;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.IStorylineItem;
import com.example.the_ultimate_easter_egg_guide.R;

public enum Enemy_Creatures implements IStorylineItem
{
    Test("Test Creature", R.drawable.app_icon, CreatureGroups.TEST),
    Zombie("Zombie", R.drawable.app_icon, CreatureGroups.StandardEnemy),
    Hellhound("Hellhound", R.drawable.app_icon, CreatureGroups.Special),
    Nova6Crawler("Nova 6 Crawler", R.drawable.app_icon, CreatureGroups.Special),
    PentagonThief("Pentagon Thief", R.drawable.app_icon, CreatureGroups.Special),
    GeorgeRomero("George Romero", R.drawable.app_icon, CreatureGroups.Boss),
    NapalmZombie("Napalm Zombie", R.drawable.app_icon, CreatureGroups.Special),
    ShriekerZombie("Shrieker Zombie", R.drawable.app_icon, CreatureGroups.Special),
    ShangriLaMonkeys("Shangri-La Monkeys", R.drawable.app_icon, CreatureGroups.Special),
    AscensionMonkeys("Ascension Monkeys", R.drawable.app_icon, CreatureGroups.Special),
    MoonAstronaut("Moon Astronaut", R.drawable.app_icon, CreatureGroups.Special),
    Denizens("Denizens", R.drawable.app_icon, CreatureGroups.StandardEnemy),
    Avagadro("Avagadro", R.drawable.app_icon, CreatureGroups.Special),
    Brutus("Brutus", R.drawable.brutus_pfp, CreatureGroups.Special),
    JumpingJacks("Jumping Jacks", R.drawable.app_icon, CreatureGroups.Special),
    Witches("Witches", R.drawable.app_icon, CreatureGroups.Special),
    PanzerSoldat("Panzer Soldat", R.drawable.app_icon, CreatureGroups.Special),
    TemplarZombies("Templar Zombies", R.drawable.app_icon, CreatureGroups.StandardEnemy),
    Margwa("Margwa", R.drawable.app_icon, CreatureGroups.Special),
    Paracite("Parasite", R.drawable.app_icon, CreatureGroups.Special),
    Meatballs("Meatballs", R.drawable.app_icon, CreatureGroups.Special),
    Keepers("Keepers", R.drawable.app_icon, CreatureGroups.Special),
    KeeperBoss("Keeper Boss", R.drawable.app_icon, CreatureGroups.Boss),
    SkeletonZombie("Skeleton Zombie", R.drawable.app_icon, CreatureGroups.StandardEnemy),
    TheShadowMan("The Shadowman", R.drawable.shadowman_pfp, CreatureGroups.Boss),
    Thrasher("Thrasher", R.drawable.app_icon, CreatureGroups.Special),
    Spiders("Spiders", R.drawable.app_icon, CreatureGroups.Special),
    SpiderBoss("Spider Boss", R.drawable.app_icon, CreatureGroups.Boss),
    ThrasherBoss("Thrasher Boss", R.drawable.app_icon, CreatureGroups.Boss),
    RussianMangler("Russian Mangler", R.drawable.app_icon, CreatureGroups.Special),
    ValkyrieDrone("Valkyrie Drone", R.drawable.app_icon, CreatureGroups.Special),
    Dragon("Dragon", R.drawable.app_icon, CreatureGroups.Special),
    NikoliMech("Nikolai's Mech", R.drawable.app_icon, CreatureGroups.Boss),
    Furies("Furies", R.drawable.app_icon, CreatureGroups.Special),

    //BO4+
    Stoker("Stoker", R.drawable.app_icon, CreatureGroups.Special),
    BleightFather("Blight Father", R.drawable.app_icon, CreatureGroups.Special),
    CatalystZombie("Catalyst Zombie", R.drawable.app_icon, CreatureGroups.Special),
    GiantEyeball("Giant Eyeball", R.drawable.app_icon, CreatureGroups.Boss), //Voyage Boss Fight
    Tigers("Tigers", R.drawable.app_icon, CreatureGroups.Special),
    Destroyer("Destroyer", R.drawable.app_icon, CreatureGroups.Special),
    Merroter("Marauder", R.drawable.app_icon, CreatureGroups.Special),
    Warewolf("Werewolf", R.drawable.app_icon, CreatureGroups.Special),
    NosForotues("Nosferatu", R.drawable.app_icon, CreatureGroups.Special),
    WarewolfBoss("Werewolf Boss", R.drawable.app_icon, CreatureGroups.Boss),
    Spartwa("Spartoi", R.drawable.app_icon, CreatureGroups.Special),
    Gigganeese("Gegenees", R.drawable.app_icon, CreatureGroups.Special),
    Pegasis("Pegasus", R.drawable.app_icon, CreatureGroups.Boss),
    Percious("Perseus", R.drawable.app_icon, CreatureGroups.Boss),
    Megaton("Megaton", R.drawable.app_icon, CreatureGroups.Special),
    Mimic("Mimic", R.drawable.app_icon, CreatureGroups.Special),
    Orda("Orda", R.drawable.app_icon, CreatureGroups.Boss);

    public final String displayName;
    public final int creatureCover;
    public final CreatureGroups creatureGroup;

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


    Enemy_Creatures(String displayName, int creatureCover, CreatureGroups creatureGroup)
    {
        this.displayName = displayName;
        this.creatureCover = creatureCover;
        this.creatureGroup = creatureGroup;
    }

}
