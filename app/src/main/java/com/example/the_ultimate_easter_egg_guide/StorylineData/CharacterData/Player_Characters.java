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
    TestCharacter(
            "Test Player Character",
            Player_CharacterGroups.TEST,
            R.drawable.default_test_image,
            Collections.singletonList(Games.Test),
            null
    ),

    // Primis
    EdwardRichtofen_Primis(
            "Dr. Edward Richtofen",
            Player_CharacterGroups.Primis,
            R.drawable.richtofen_primis_pfp,
            Games.GetAllGamesBetween(Games.Black_Ops_II, Games.Black_Ops_IV),
            "Edward_Richtofen_(Primis)"
    ),

    TankDempsey_Primis(
            "Tank Dempsey",
            Player_CharacterGroups.Primis,
            R.drawable.dempsey_primis_pfp,
            Games.GetAllGamesBetween(Games.Black_Ops_II, Games.Black_Ops_IV),
            "%22Tank%22_Dempsey_(Primis)"
    ),

    NikolaiBelinski_Primis(
            "Nikolai Belinski",
            Player_CharacterGroups.Primis,
            R.drawable.nikoli_primis_pfp,
            Games.GetAllGamesBetween(Games.Black_Ops_II, Games.Black_Ops_IV),
            "Nikolai_Belinski_(Primis)"
    ),

    TakeoMasaki_Primis(
            "Takeo Masaki",
            Player_CharacterGroups.Primis,
            R.drawable.takeo_primis_pfp,
            Games.GetAllGamesBetween(Games.Black_Ops_II, Games.Black_Ops_IV),
            "Takeo_Masaki_(Primis)"
    ),

    // Ultimis
    EdwardRichtofen_Ultimis(
            "Edward Richtofen",
            Player_CharacterGroups.Ultimis,
            R.drawable.richtofen_ultimis_pfp,
            Arrays.asList(
                    Games.World_At_War,
                    Games.Black_Ops_I,
                    Games.Black_Ops_III,
                    Games.Black_Ops_IV
            ),
            "Edward_Richtofen_(Ultimis)"
    ),

    TankDempsey_Ultimis(
            "Tank Dempsey",
            Player_CharacterGroups.Ultimis,
            R.drawable.dempsey_ultimis_pfp,
            Arrays.asList(
                    Games.World_At_War,
                    Games.Black_Ops_I,
                    Games.Black_Ops_III,
                    Games.Black_Ops_IV
            ),
            "%22Tank%22_Dempsey_(Ultimis)"
    ),

    NikolaiBelinski_Ultimis(
            "Nikolai Belinski",
            Player_CharacterGroups.Ultimis,
            R.drawable.nikoli_ultimis_pfp,
            Arrays.asList(
                    Games.World_At_War,
                    Games.Black_Ops_I,
                    Games.Black_Ops_III,
                    Games.Black_Ops_IV
            ),
            "Nikolai_Belinski_(Ultimis)"
    ),

    TakeoMasaki_Ultimis(
            "Takeo Masaki",
            Player_CharacterGroups.Ultimis,
            R.drawable.takeo_ultimis_pfp,
            Arrays.asList(
                    Games.World_At_War,
                    Games.Black_Ops_I,
                    Games.Black_Ops_III,
                    Games.Black_Ops_IV
            ),
            "Takeo_Masaki_(Ultimis)"
    ),

    // Victis
    AbigailBriarton(
            "Abigail 'Misty' Briarton",
            Player_CharacterGroups.Victis,
            R.drawable.misty_pfp,
            Arrays.asList(Games.Black_Ops_II, Games.Black_Ops_IV),
            "Abigail_%22Misty%22_Briarton"
    ),

    MarltonJohnson(
            "Marlton Johnson",
            Player_CharacterGroups.Victis,
            R.drawable.marlton_pfp,
            Arrays.asList(Games.Black_Ops_II, Games.Black_Ops_IV),
            "Marlton_Johnson"
    ),

    SamuelStuhlinger(
            "Samuel J. Stuhlinger",
            Player_CharacterGroups.Victis,
            R.drawable.stuhlinger_pfp,
            Arrays.asList(Games.Black_Ops_II, Games.Black_Ops_IV),
            "Samuel_J._Stuhlinger"
    ),

    Russman(
            "Russman",
            Player_CharacterGroups.Victis,
            R.drawable.russman_pfp,
            Arrays.asList(Games.Black_Ops_II, Games.Black_Ops_IV),
            "Russman"
    ),

    // Five
    JFK(
            "John F. Kennedy",
            Player_CharacterGroups.FIVE,
            R.drawable.jfk_pfp,
            Collections.singletonList(Games.Black_Ops_I),
            "John_F._Kennedy/Zombies"
    ),

    RichardNixon(
            "Richard Nixon",
            Player_CharacterGroups.FIVE,
            R.drawable.richardnixon_pfp,
            Collections.singletonList(Games.Black_Ops_I),
            "Richard_Nixon/Zombies"
    ),

    RobertMcNamara(
            "Robert McNamara",
            Player_CharacterGroups.FIVE,
            R.drawable.robertmcnamara_pfp,
            Collections.singletonList(Games.Black_Ops_I),
            "Robert_McNamara/Zombies"
    ),

    FidelCastro(
            "Fidel Castro",
            Player_CharacterGroups.FIVE,
            R.drawable.fidelcastro_pfp,
            Collections.singletonList(Games.Black_Ops_I),
            "Fidel_Castro/Zombies"
    ),

    // Mob of the Dead
    AlbertArlington(
            "Albert 'Weasel' Arlington",
            Player_CharacterGroups.MobOfTheDead,
            R.drawable.weasel_pfp,
            Collections.singletonList(Games.Black_Ops_II),
            "Albert_%22Weasel%22_Arlington"
    ),

    MichaelOLeary(
            "Michael 'Finn' O'Leary",
            Player_CharacterGroups.MobOfTheDead,
            R.drawable.finn_pfp,
            Collections.singletonList(Games.Black_Ops_II),
            "Michael_%22Finn%22_O%27Leary"
    ),

    SalvatoreDeLuca(
            "Salvatore 'Sal' DeLuca",
            Player_CharacterGroups.MobOfTheDead,
            R.drawable.sal_pfp,
            Collections.singletonList(Games.Black_Ops_II),
            "Salvatore_%22Sal%22_DeLuca"
    ),

    BillyHandsome(
            "Billy Handsome",
            Player_CharacterGroups.MobOfTheDead,
            R.drawable.billy_pfp,
            Collections.singletonList(Games.Black_Ops_II),
            "Billy_Handsome"
    ),

    // Call of the Dead
    SarahMichelleGellar(
            "Sarah Michelle Gellar",
            Player_CharacterGroups.CallOfTheDead,
            R.drawable.sarahmichellegellar_pfp,
            Collections.singletonList(Games.Black_Ops_I),
            "Sarah_Michelle_Gellar"
    ),

    RobertEngland(
            "Robert Englund",
            Player_CharacterGroups.CallOfTheDead,
            R.drawable.robertengland_pfp,
            Collections.singletonList(Games.Black_Ops_I),
            "Robert_Englund"
    ),

    DannyTrejo(
            "Danny Trejo",
            Player_CharacterGroups.CallOfTheDead,
            R.drawable.dannytrejo_pfp,
            Collections.singletonList(Games.Black_Ops_I),
            "Danny_Trejo"
    ),

    MichaelRooker(
            "Michael Rooker",
            Player_CharacterGroups.CallOfTheDead,
            R.drawable.michaelrooker_pfp,
            Collections.singletonList(Games.Black_Ops_I),
            "Michael_Rooker"
    ),

    // Nacht der Untoten
    UnknownMarine1(
            "Unknown Marine 1",
            Player_CharacterGroups.WAW_Nacht,
            R.drawable.blank_pfp,
            Collections.singletonList(Games.World_At_War),
            "United_States_Marine_Corps/Zombies"
    ),

    UnknownMarine2(
            "Unknown Marine 2",
            Player_CharacterGroups.WAW_Nacht,
            R.drawable.blank_pfp,
            Collections.singletonList(Games.World_At_War),
            "United_States_Marine_Corps/Zombies"
    ),

    UnknownMarine3(
            "Unknown Marine 3",
            Player_CharacterGroups.WAW_Nacht,
            R.drawable.blank_pfp,
            Collections.singletonList(Games.World_At_War),
            "United_States_Marine_Corps/Zombies"
    ),

    UnknownMarine4(
            "Unknown Marine 4",
            Player_CharacterGroups.WAW_Nacht,
            R.drawable.blank_pfp,
            Collections.singletonList(Games.World_At_War),
            "United_States_Marine_Corps/Zombies"
    ),

    // Verrückt
    TankDempsey(
            "Tank Dempsey",
            Player_CharacterGroups.WAW_Verruckt,
            R.drawable.tankdempsey_verruckt_pfp,
            Collections.singletonList(Games.World_At_War),
            "%22Tank%22_Dempsey_(Ultimis)"
    ),

    JohnBanana(
            "John Banana",
            Player_CharacterGroups.WAW_Verruckt,
            R.drawable.johnbanana_pfp,
            Collections.singletonList(Games.World_At_War),
            "John_%22Banana%22"
    ),

    Smokey(
            "Smokey",
            Player_CharacterGroups.WAW_Verruckt,
            R.drawable.smokey_pfp,
            Collections.singletonList(Games.World_At_War),
            "%22Smokey%22"
    ),

    PaxtonRidge(
            "Paxton 'Gunner' Ridge",
            Player_CharacterGroups.WAW_Verruckt,
            R.drawable.paxtonridge_pfp,
            Collections.singletonList(Games.World_At_War),
            "Paxton_%22Gunner%22_Ridge"
    ),

    // Shadows of Evil
    NeroBlackstone(
            "Nero Blackstone",
            Player_CharacterGroups.ShadowsOfEvil,
            R.drawable.neroblackstone_pfp,
            Collections.singletonList(Games.Black_Ops_III),
            "Nero_Blackstone"
    ),

    JessicaRose(
            "Jessica Rose",
            Player_CharacterGroups.ShadowsOfEvil,
            R.drawable.jessicarose_pfp,
            Collections.singletonList(Games.Black_Ops_III),
            "Jessica_Rose"
    ),

    JackVincent(
            "Jack Vincent",
            Player_CharacterGroups.ShadowsOfEvil,
            R.drawable.jackvincent_pfp,
            Collections.singletonList(Games.Black_Ops_III),
            "Jack_Vincent"
    ),

    FloydCampbell(
            "Floyd Campbell",
            Player_CharacterGroups.ShadowsOfEvil,
            R.drawable.floydcampbell_pfp,
            Collections.singletonList(Games.Black_Ops_III),
            "Floyd_Campbell"
    );


    public final String characterName;
    public final Player_CharacterGroups playerCharacterGroup;
    public final int characterImage;
    public final List<Games> gamesList;
    public final String fandomLink;


    Player_Characters(
            String characterName,
            Player_CharacterGroups playerCharacterGroup,
            int characterImage,
            List<Games> gamesList,
            String fandomPath
    )
    {
        this.characterName = characterName;
        this.playerCharacterGroup = playerCharacterGroup;
        this.characterImage = characterImage;
        this.gamesList = gamesList;

        this.fandomLink = fandomPath == null
                ? null
                : "https://callofduty.fandom.com/wiki/" + fandomPath;
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


    public String GetFandomLink()
    {
        return fandomLink;
    }
}