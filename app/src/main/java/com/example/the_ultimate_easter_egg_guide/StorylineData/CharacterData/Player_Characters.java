package com.example.the_ultimate_easter_egg_guide.StorylineData.CharacterData;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.CharacterVersion;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.IStorylineItem;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.Player_CharacterGroup;

import com.example.the_ultimate_easter_egg_guide.Models.Games;
import com.example.the_ultimate_easter_egg_guide.R;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public enum Player_Characters implements IStorylineItem
{

    TestCharacter(
            "Test Character",
            "Test_First",
            "Test_Middle",
            "Test_Last",
            new Date(2000,1,1),
            CharacterVersion.Single,
            Player_CharacterGroup.TEST,
            Arrays.asList("Test_Nickname_1", "Test_Nickname_2"),
            R.drawable.default_test_image,
            Games.Test,
            Games.Test
    ),
    EdwardRichtofen_Primis(
            "Dr. Edward Richtofen",
            "Edward",
            "",
            "Richtofen",
            new Date(),
            CharacterVersion.Primis,
            Player_CharacterGroup.Primis,
            Arrays.asList(" ", " ", " "),
            R.drawable.richtofen_primis_pfp,
            Games.World_At_War,
            Games.Black_Ops_IV
    ),
    EdwardRichtofen_Ultimis(
            "Edward Richtofen",
            "Edward",
            "",
            "Richtofen",
            new Date(),
            CharacterVersion.Ultimis,
            Player_CharacterGroup.Ultimis,
            Arrays.asList(" ", " ", " "),
            R.drawable.richtofen_ultimis_pfp,
            Games.World_At_War,
            Games.Black_Ops_IV
    ),
    TankDempsey_Primis(
            "Tank Dempsey",
            "Tank",
            "",
            "Dempsey",
            new Date(),
            CharacterVersion.Primis,
            Player_CharacterGroup.Primis,
            Arrays.asList(" ", " ", " "),
            R.drawable.dempsey_primis_pfp,
            Games.Black_Ops_II,
            Games.Black_Ops_IV
    ),
    TankDempsey_Ultimis(
            "Tank Dempsey",
            "Tank",
            "",
            "Dempsey",
            new Date(),
            CharacterVersion.Ultimis,
            Player_CharacterGroup.Ultimis,
            Arrays.asList(" ", " ", " "),
            R.drawable.dempsey_ultimis_pfp,
            Games.World_At_War,
            Games.Black_Ops_IV
    ),
    NikolaiBelinski_Primis(
            "Nikolai Belinski",
            "Nikolai",
            "",
            "Belinski",
            new Date(),
            CharacterVersion.Primis,
            Player_CharacterGroup.Primis,
            Arrays.asList(" ", " ", " "),
            R.drawable.nikoli_primis_pfp,
            Games.Black_Ops_II,
            Games.Black_Ops_IV
    ),
    NikolaiBelinski_Ultimis(
            "Nikolai Belinski",
            "Nikolai",
            "",
            "Belinski",
            new Date(),
            CharacterVersion.Ultimis,
            Player_CharacterGroup.Ultimis,
            Arrays.asList(" ", " ", " "),
            R.drawable.nikoli_ultimis_pfp,
            Games.World_At_War,
            Games.Black_Ops_IV
    ),
    TakeoMasaki_Primis(
            "Takeo Masaki",
            "Takeo",
            "",
            "Masaki",
            new Date(),
            CharacterVersion.Primis,
            Player_CharacterGroup.Primis,
            Arrays.asList(" ", " ", " "),
            R.drawable.takeo_primis_pfp,
            Games.Black_Ops_II,
            Games.Black_Ops_IV
    ),
    TakeoMasaki_Ultimis(
            "Takeo Masaki",
            "Takeo",
            "",
            "Masaki",
            new Date(),
            CharacterVersion.Ultimis,
            Player_CharacterGroup.Ultimis,
            Arrays.asList(" ", " ", " "),
            R.drawable.takeo_ultimis_pfp,
            Games.World_At_War,
            Games.Black_Ops_IV
    ),
    AbigailBriarton(
            "Abigail 'Misty' Briarton",
            "Abigail",
            "",
            "Briarton",
            new Date(),
            CharacterVersion.Single,
            Player_CharacterGroup.Victis,
            Arrays.asList("Misty", "Lady"),
            R.drawable.misty_pfp,
            Games.Black_Ops_II,
            Games.Black_Ops_IV
    ),
    MarltonJohnson(
            "Marlton Johnson",
            "Marlton",
            "",
            "Johnson",
            new Date(),
            CharacterVersion.Single,
            Player_CharacterGroup.Victis,
            Arrays.asList("Marly", "Darlington", "Brain-Box"),
            R.drawable.marlton_pfp,
            Games.Black_Ops_II,
            Games.Black_Ops_IV
    ),
    SamuelStuhlinger(
            "Samuel Stuhlinger",
            "Samuel",
            "J",
            "Stuhlinger",
            new Date(),
            CharacterVersion.Single,
            Player_CharacterGroup.Victis,
            Arrays.asList("Stu", "Stupid-ger", "Stewie", "Sammy", "Stuhlicker"),
            R.drawable.stuhlinger_pfp,
            Games.Black_Ops_II,
            Games.Black_Ops_IV
    ),
    Russman(
        "Russman",
            "Russman",
            "",
            "",
            new Date(),
            CharacterVersion.Single,
            Player_CharacterGroup.Victis,
            Arrays.asList("Russ", "Old Man"),
            R.drawable.russman_pfp,
            Games.Black_Ops_II,
            Games.Black_Ops_IV
    ),
    JFK(
            "JFK",
            "John",
            "Fitzgerald",
            "Kennedy",
            new Date(),
            CharacterVersion.Single,
            Player_CharacterGroup.FIVE,
            Arrays.asList("Jack", "JFK", "Lancer"),
            R.drawable.jfk_pfp,
            Games.Black_Ops_I,
            Games.Black_Ops_III
    ),
    RichardNixon(
            "Richard Nixon",
            "Richard",
            "Milhous",
            "Nixon",
            new Date(),
            CharacterVersion.Single,
            Player_CharacterGroup.FIVE,
            Arrays.asList("Dick", "Dickie", "Dickie Nix", "Tricky Dick"),
            R.drawable.richardnixon_pfp,
            Games.Black_Ops_I,
            Games.Black_Ops_III
    ),
    RobertMcNamara(
            "Robert McNamara",
            "Robert",
            "",
            "McNamara",
            new Date(),
            CharacterVersion.Single,
            Player_CharacterGroup.FIVE,
            Arrays.asList("Bob"),
            R.drawable.robertmcnamara_pfp,
            Games.Black_Ops_I,
            Games.Black_Ops_III
    ),
    FidelCastro(
            "Fidel Castro",
            "Fidel",
            "Alejandro",
            "Castro Ruz",
            new Date(),
            CharacterVersion.Single,
            Player_CharacterGroup.FIVE,
            Arrays.asList(),
            R.drawable.fidelcastro_pfp,
            Games.Black_Ops_I,
            Games.Black_Ops_III
    ),
    AlbertArlington(
            "The Weasel",
            "Albert",
            "",
            "Arlington",
            new Date(),
            CharacterVersion.Single,
            Player_CharacterGroup.MobOfTheDead,
            Arrays.asList("The Weasel"),
            R.drawable.weasel_pfp,
            Games.Black_Ops_II,
            Games.Black_Ops_IV
    ),
    MichaelOLeary(
            "Finn O'Leary",
            "Michael",
            "",
            "O'Leary",
            new Date(),
            CharacterVersion.Single,
            Player_CharacterGroup.MobOfTheDead,
            Arrays.asList("Finn"),
            R.drawable.finn_pfp,
            Games.Black_Ops_II,
            Games.Black_Ops_IV
    ),
    SalvatoreDeLuca(
            "Sal DeLuca",
            "Salvatore",
            "",
            "DeLuca",
            new Date(),
            CharacterVersion.Single,
            Player_CharacterGroup.MobOfTheDead,
            Arrays.asList("Sal", "Mr.DeLuca"),
            R.drawable.sal_pfp,
            Games.Black_Ops_II,
            Games.Black_Ops_IV
    ),
    BillyHandsome(
            "Billy Handsome",
            "Billy",
            "",
            "Handsome",
            new Date(),
            CharacterVersion.Single,
            Player_CharacterGroup.MobOfTheDead,
            Arrays.asList(),
            R.drawable.billy_pfp,
            Games.Black_Ops_II,
            Games.Black_Ops_IV
    ),
    SarahMichelleGellar(
            "Sarah Michelle Gellar",
            "Sarah",
            "Michelle",
            "Gellar",
            new Date(),
            CharacterVersion.Single,
            Player_CharacterGroup.CallOfTheDead,
            Arrays.asList(),
            R.drawable.sarahmichellegellar_pfp,
            Games.Black_Ops_I,
            Games.Black_Ops_I
    ),
    RobertEngland(
            "Robert England",
            "Robert",
            "",
            "England",
            new Date(),
            CharacterVersion.Single,
            Player_CharacterGroup.CallOfTheDead,
            Arrays.asList(),
            R.drawable.robertengland_pfp,
            Games.Black_Ops_I,
            Games.Black_Ops_I
    ),
    DannyTrejo(
            "Danny Trejo",
            "Danny",
            "",
            "Trejo",
            new Date(),
            CharacterVersion.Single,
            Player_CharacterGroup.CallOfTheDead,
            Arrays.asList(),
            R.drawable.dannytrejo_pfp,
            Games.Black_Ops_I,
            Games.Black_Ops_I
    ),
    MichaelRooker(
            "Michael Rooker",
            "Michael",
            "",
            "Rooker",
            new Date(),
            CharacterVersion.Single,
            Player_CharacterGroup.CallOfTheDead,
            Arrays.asList(),
            R.drawable.michaelrooker_pfp,
            Games.Black_Ops_I,
            Games.Black_Ops_I
    ),
    UnknownMarine1(
            "Unknown Marine 1",
            "",
            "",
            "",
            new Date(),
            CharacterVersion.Single,
            Player_CharacterGroup.WAW_Nacht,
            Arrays.asList(),
            R.drawable.blank_pfp,
            Games.World_At_War,
            Games.World_At_War
    ),
    UnknownMarine2(
            "Unknown Marine 2",
            "",
            "",
            "",
            new Date(),
            CharacterVersion.Single,
            Player_CharacterGroup.WAW_Nacht,
            Arrays.asList(),
            R.drawable.blank_pfp,
            Games.World_At_War,
            Games.World_At_War
    ),
    UnknownMarine3(
            "Unknown Marine 3",
            "",
            "",
            "",
            new Date(),
            CharacterVersion.Single,
            Player_CharacterGroup.WAW_Nacht,
            Arrays.asList(),
            R.drawable.blank_pfp,
            Games.World_At_War,
            Games.World_At_War
    ),
    UnknownMarine4(
            "Unknown Marine 4",
            "",
            "",
            "",
            new Date(),
            CharacterVersion.Single,
            Player_CharacterGroup.WAW_Nacht,
            Arrays.asList(),
            R.drawable.blank_pfp,
            Games.World_At_War,
            Games.World_At_War
    ),
    TankDempsey(
            "Tank Dempsey",
            "",
            "",
            "Dempsey",
            new Date(),
            CharacterVersion.Single,
            Player_CharacterGroup.WAW_Verruckt,
            Arrays.asList("Tank"),
            R.drawable.tankdempsey_verruckt_pfp,
            Games.World_At_War,
            Games.Black_Ops_IV
    ),
    JohnBanana(
            "John Banana",
            "John",
            "",
            "Banana",
            new Date(),
            CharacterVersion.Single,
            Player_CharacterGroup.WAW_Verruckt,
            Arrays.asList(),
            R.drawable.johnbanana_pfp,
            Games.World_At_War,
            Games.World_At_War
    ),
    Smokey(
            "Smokey",
            "David",
            "",
            "",
            new Date(),
            CharacterVersion.Single,
            Player_CharacterGroup.WAW_Verruckt,
            Arrays.asList("Smokey"),
            R.drawable.smokey_pfp,
            Games.World_At_War,
            Games.World_At_War
    ),
    PaxtonRidge(
            "Paxton Ridge",
            "Paxton",
            "",
            "Ridge",
            new Date(),
            CharacterVersion.Single,
            Player_CharacterGroup.WAW_Verruckt,
            Arrays.asList(),
            R.drawable.paxtonridge_pfp,
            Games.World_At_War,
            Games.World_At_War
    ),
    NeroBlackstone(
            "Nero Blackstone",
            "Nero",
            "",
            "Blackstone",
            new Date(),
            CharacterVersion.Single,
            Player_CharacterGroup.ShadowsOfEvil,
            Arrays.asList("The Magician", "The Amazing Nero"),
            R.drawable.neroblackstone_pfp,
            Games.Black_Ops_III,
            Games.Black_Ops_III
    ),
    JessicaRose(
            "Jessica Rose",
            "Jessica",
            "",
            "Rose",
            new Date(),
            CharacterVersion.Single,
            Player_CharacterGroup.ShadowsOfEvil,
            Arrays.asList("The Femme Fatale"),
            R.drawable.jessicarose_pfp,
            Games.Black_Ops_III,
            Games.Black_Ops_III
    ),
    JackVincent(
            "Jack Vincent",
            "Jack",
            "",
            "Vincent",
            new Date(),
            CharacterVersion.Single,
            Player_CharacterGroup.ShadowsOfEvil,
            Arrays.asList("The Detective", "Jackie", "Jackie V"),
            R.drawable.jackvincent_pfp,
            Games.Black_Ops_III,
            Games.Black_Ops_III
    ),
    FloydCampbell(
            "Floyd Campbell",
            "Floyd",
            "",
            "Campbell",
            new Date(),
            CharacterVersion.Single,
            Player_CharacterGroup.ShadowsOfEvil,
            Arrays.asList("The Boxer"),
            R.drawable.floydcampbell_pfp,
            Games.Black_Ops_III,
            Games.Black_Ops_III
    );






    //Template(
    //      "Template",
    //      "Template",
    //      "",
    //      "",
    //      new Date(),
    //      CharacterVersion.Single,
    //      Player_CharacterGroup.Victis,
    //      Arrays.asList("Template", "Template"),
    //      R.drawable.blank_pfp,
    //      games.Black_Ops_II,
    //      games.Black_Ops_IV
    //),

    

    public final String characterName;
    public final String characterFirstName;
    public final String characterMiddleName;
    public final String characterLastName;
    public final Date characterBirthday;
    public final CharacterVersion characterVersion;
    public final Player_CharacterGroup playerCharacterGroup;
    public final List<String> characterNicknames;
    public final int characterImage;
    public final Games firstappearance;
    public final Games finalappearance;


    @Override
    public int getCharacterImage() {
        return characterImage;
    }

    @Override
    public String getCharacterName() {
        return characterName;
    }

    @Override
    public Object getCharacterGroup() {
        return playerCharacterGroup;
    }


    Player_Characters(String characterName, String characterFirstName, String characterMiddleName, String characterLastName, Date characterBirthday, CharacterVersion characterVersion, Player_CharacterGroup playerCharacterGroup, List<String> characterNicknames, int characterImage, Games firstappearance, Games finalappearance)
    {
        this.characterName = characterName;
        this.characterFirstName = characterFirstName;
        this.characterMiddleName = characterMiddleName;
        this.characterLastName = characterLastName;
        this.characterBirthday = characterBirthday;
        this.characterVersion = characterVersion;
        this.playerCharacterGroup = playerCharacterGroup;
        this.characterNicknames = characterNicknames;
        this.characterImage = characterImage;
        this.firstappearance = firstappearance;
        this.finalappearance = finalappearance;
    }

}
