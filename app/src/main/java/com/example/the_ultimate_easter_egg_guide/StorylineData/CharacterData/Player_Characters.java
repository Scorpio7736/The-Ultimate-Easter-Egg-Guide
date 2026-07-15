package com.example.the_ultimate_easter_egg_guide.StorylineData.CharacterData;

import com.example.the_ultimate_easter_egg_guide.Models.Games;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.IStorylineItems;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.Player_CharacterGroups;
import com.example.the_ultimate_easter_egg_guide.R;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum Player_Characters implements IStorylineItems
{
    TestCharacter("Test Player Character", Player_CharacterGroups.TEST, R.drawable.default_test_image, Collections.singletonList(Games.Test)),

    EdwardRichtofen_Primis("Dr. Edward Richtofen", Player_CharacterGroups.Primis, R.drawable.richtofen_primis_pfp, Games.GetAllGamesBetween(Games.Black_Ops_II, Games.Black_Ops_IV)),
    EdwardRichtofen_Ultimis("Edward Richtofen", Player_CharacterGroups.Ultimis, R.drawable.richtofen_ultimis_pfp, Arrays.asList(Games.World_At_War, Games.Black_Ops_I, Games.Black_Ops_III, Games.Black_Ops_IV)),

    TankDempsey_Primis("Tank Dempsey", Player_CharacterGroups.Primis, R.drawable.dempsey_primis_pfp, Games.GetAllGamesBetween(Games.Black_Ops_II, Games.Black_Ops_IV)),
    TankDempsey_Ultimis("Tank Dempsey", Player_CharacterGroups.Ultimis, R.drawable.dempsey_ultimis_pfp, Arrays.asList(Games.World_At_War, Games.Black_Ops_I, Games.Black_Ops_III, Games.Black_Ops_IV)),

    NikolaiBelinski_Primis("Nikolai Belinski", Player_CharacterGroups.Primis, R.drawable.nikoli_primis_pfp, Games.GetAllGamesBetween(Games.Black_Ops_II, Games.Black_Ops_IV)),
    NikolaiBelinski_Ultimis("Nikolai Belinski", Player_CharacterGroups.Ultimis, R.drawable.nikoli_ultimis_pfp, Arrays.asList(Games.World_At_War, Games.Black_Ops_I, Games.Black_Ops_III, Games.Black_Ops_IV)),

    TakeoMasaki_Primis("Takeo Masaki", Player_CharacterGroups.Primis, R.drawable.takeo_primis_pfp, Games.GetAllGamesBetween(Games.Black_Ops_II, Games.Black_Ops_IV)),
    TakeoMasaki_Ultimis("Takeo Masaki", Player_CharacterGroups.Ultimis, R.drawable.takeo_ultimis_pfp, Arrays.asList(Games.World_At_War, Games.Black_Ops_I, Games.Black_Ops_III, Games.Black_Ops_IV)),

    AbigailBriarton("Abigail 'Misty' Briarton", Player_CharacterGroups.Victis, R.drawable.misty_pfp, Arrays.asList(Games.Black_Ops_II, Games.Black_Ops_IV)),
    MarltonJohnson("Marlton Johnson", Player_CharacterGroups.Victis, R.drawable.marlton_pfp, Arrays.asList(Games.Black_Ops_II, Games.Black_Ops_IV)),
    SamuelStuhlinger("Samuel Stuhlinger", Player_CharacterGroups.Victis, R.drawable.stuhlinger_pfp, Arrays.asList(Games.Black_Ops_II, Games.Black_Ops_IV)),
    Russman("Russman", Player_CharacterGroups.Victis, R.drawable.russman_pfp, Arrays.asList(Games.Black_Ops_II, Games.Black_Ops_IV)),

    JFK("JFK", Player_CharacterGroups.FIVE, R.drawable.jfk_pfp, Collections.singletonList(Games.Black_Ops_I)),
    RichardNixon("Richard Nixon", Player_CharacterGroups.FIVE, R.drawable.richardnixon_pfp, Collections.singletonList(Games.Black_Ops_I)),
    RobertMcNamara("Robert McNamara", Player_CharacterGroups.FIVE, R.drawable.robertmcnamara_pfp, Collections.singletonList(Games.Black_Ops_I)),
    FidelCastro("Fidel Castro", Player_CharacterGroups.FIVE, R.drawable.fidelcastro_pfp, Collections.singletonList(Games.Black_Ops_I)),

    AlbertArlington("The Weasel", Player_CharacterGroups.MobOfTheDead, R.drawable.weasel_pfp, Collections.singletonList(Games.Black_Ops_II)),
    MichaelOLeary("Finn O'Leary", Player_CharacterGroups.MobOfTheDead, R.drawable.finn_pfp, Collections.singletonList(Games.Black_Ops_II)),
    SalvatoreDeLuca("Sal DeLuca", Player_CharacterGroups.MobOfTheDead, R.drawable.sal_pfp, Collections.singletonList(Games.Black_Ops_II)),
    BillyHandsome("Billy Handsome", Player_CharacterGroups.MobOfTheDead, R.drawable.billy_pfp, Collections.singletonList(Games.Black_Ops_II)),

    SarahMichelleGellar("Sarah Michelle Gellar", Player_CharacterGroups.CallOfTheDead, R.drawable.sarahmichellegellar_pfp, Collections.singletonList(Games.Black_Ops_I)),
    RobertEngland("Robert England", Player_CharacterGroups.CallOfTheDead, R.drawable.robertengland_pfp, Collections.singletonList(Games.Black_Ops_I)),
    DannyTrejo("Danny Trejo", Player_CharacterGroups.CallOfTheDead, R.drawable.dannytrejo_pfp, Collections.singletonList(Games.Black_Ops_I)),
    MichaelRooker("Michael Rooker", Player_CharacterGroups.CallOfTheDead, R.drawable.michaelrooker_pfp, Collections.singletonList(Games.Black_Ops_I)),

    UnknownMarine1("Unknown Marine 1", Player_CharacterGroups.WAW_Nacht, R.drawable.blank_pfp, Collections.singletonList(Games.World_At_War)),
    UnknownMarine2("Unknown Marine 2", Player_CharacterGroups.WAW_Nacht, R.drawable.blank_pfp, Collections.singletonList(Games.World_At_War)),
    UnknownMarine3("Unknown Marine 3", Player_CharacterGroups.WAW_Nacht, R.drawable.blank_pfp, Collections.singletonList(Games.World_At_War)),
    UnknownMarine4("Unknown Marine 4", Player_CharacterGroups.WAW_Nacht, R.drawable.blank_pfp, Collections.singletonList(Games.World_At_War)),

    TankDempsey("Tank Dempsey", Player_CharacterGroups.WAW_Verruckt, R.drawable.tankdempsey_verruckt_pfp, Collections.singletonList(Games.World_At_War)),
    JohnBanana("John Banana", Player_CharacterGroups.WAW_Verruckt, R.drawable.johnbanana_pfp, Collections.singletonList(Games.World_At_War)),
    Smokey("Smokey", Player_CharacterGroups.WAW_Verruckt, R.drawable.smokey_pfp, Collections.singletonList(Games.World_At_War)),
    PaxtonRidge("Paxton Ridge", Player_CharacterGroups.WAW_Verruckt, R.drawable.paxtonridge_pfp, Collections.singletonList(Games.World_At_War)),

    NeroBlackstone("Nero Blackstone", Player_CharacterGroups.ShadowsOfEvil, R.drawable.neroblackstone_pfp, Collections.singletonList(Games.Black_Ops_III)),
    JessicaRose("Jessica Rose", Player_CharacterGroups.ShadowsOfEvil, R.drawable.jessicarose_pfp, Collections.singletonList(Games.Black_Ops_III)),
    JackVincent("Jack Vincent", Player_CharacterGroups.ShadowsOfEvil, R.drawable.jackvincent_pfp, Collections.singletonList(Games.Black_Ops_III)),
    FloydCampbell("Floyd Campbell", Player_CharacterGroups.ShadowsOfEvil, R.drawable.floydcampbell_pfp, Collections.singletonList(Games.Black_Ops_III));

    public final String characterName;
    public final Player_CharacterGroups playerCharacterGroup;
    public final int characterImage;
    public final List<Games> gamesList;

    Player_Characters(String characterName, Player_CharacterGroups playerCharacterGroup, int characterImage, List<Games> gamesList)
    {
        this.characterName = characterName;
        this.playerCharacterGroup = playerCharacterGroup;
        this.characterImage = characterImage;
        this.gamesList = gamesList;
    }

    @Override
    public int GetImage()
    {
        return characterImage;
    }

    @Override
    public String GetDisplayName()
    {
        return characterName;
    }

    @Override
    public Object GetGroup()
    {
        return playerCharacterGroup;
    }
}