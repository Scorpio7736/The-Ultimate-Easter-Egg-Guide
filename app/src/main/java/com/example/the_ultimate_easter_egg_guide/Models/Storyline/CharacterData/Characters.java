package com.example.the_ultimate_easter_egg_guide.Models.Storyline.CharacterData;
import com.example.the_ultimate_easter_egg_guide.Models.CharacterVersion;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.CharacterGroup;
import com.example.the_ultimate_easter_egg_guide.Models.games;
import com.example.the_ultimate_easter_egg_guide.R;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public enum Characters
{

    EdwardRichtofen_Primis(
            "Dr. Edward Richtofen",
            "Edward",
            "",
            "Richtofen",
            new Date(),
            CharacterVersion.Primis,
            CharacterGroup.Primis,
            Arrays.asList(" ", " ", " "),
            R.drawable.richtofen_primis_pfp,
            games.World_At_War,
            games.Black_Ops_IV
    ),
    EdwardRichtofen_Ultimis(
            "Edward Richtofen",
            "Edward",
            "",
            "Richtofen",
            new Date(),
            CharacterVersion.Ultimis,
            CharacterGroup.Ultimis,
            Arrays.asList(" ", " ", " "),
            R.drawable.richtofen_ultimis_pfp,
            games.World_At_War,
            games.Black_Ops_IV
    ),
    TankDempsey_Primis(
            "Tank Dempsey",
            "Tank",
            "",
            "Dempsey",
            new Date(),
            CharacterVersion.Primis,
            CharacterGroup.Primis,
            Arrays.asList(" ", " ", " "),
            R.drawable.dempsey_primis_pfp,
            games.Black_Ops_II,
            games.Black_Ops_IV
    ),
    TankDempsey_Ultimis(
            "Tank Dempsey",
            "Tank",
            "",
            "Dempsey",
            new Date(),
            CharacterVersion.Ultimis,
            CharacterGroup.Ultimis,
            Arrays.asList(" ", " ", " "),
            R.drawable.dempsey_ultimis_pfp,
            games.World_At_War,
            games.Black_Ops_IV
    ),
    NikolaiBelinski_Primis(
            "Nikolai Belinski",
            "Nikolai",
            "",
            "Belinski",
            new Date(),
            CharacterVersion.Primis,
            CharacterGroup.Primis,
            Arrays.asList(" ", " ", " "),
            R.drawable.nikoli_primis_pfp,
            games.Black_Ops_II,
            games.Black_Ops_IV
    ),
    NikolaiBelinski_Ultimis(
            "Nikolai Belinski",
            "Nikolai",
            "",
            "Belinski",
            new Date(),
            CharacterVersion.Ultimis,
            CharacterGroup.Ultimis,
            Arrays.asList(" ", " ", " "),
            R.drawable.nikoli_ultimis_pfp,
            games.World_At_War,
            games.Black_Ops_IV
    ),
    TakeoMasaki_Primis(
            "Takeo Masaki",
            "Takeo",
            "",
            "Masaki",
            new Date(),
            CharacterVersion.Primis,
            CharacterGroup.Primis,
            Arrays.asList(" ", " ", " "),
            R.drawable.takeo_primis_pfp,
            games.Black_Ops_II,
            games.Black_Ops_IV
    ),
    TakeoMasaki_Ultimis(
            "Takeo Masaki",
            "Takeo",
            "",
            "Masaki",
            new Date(),
            CharacterVersion.Ultimis,
            CharacterGroup.Ultimis,
            Arrays.asList(" ", " ", " "),
            R.drawable.takeo_ultimis_pfp,
            games.World_At_War,
            games.Black_Ops_IV
    ),
    AbigailBriarton(
            "Abigail 'Misty' Briarton",
            "Abigail",
            "",
            "Briarton",
            new Date(),
            CharacterVersion.Single,
            CharacterGroup.Victis,
            Arrays.asList("Misty", "Lady"),
            R.drawable.misty_pfp,
            games.Black_Ops_II,
            games.Black_Ops_IV
    ),
    MarltonJohnson(
            "Marlton Johnson",
            "Marlton",
            "",
            "Johnson",
            new Date(),
            CharacterVersion.Single,
            CharacterGroup.Victis,
            Arrays.asList("Marly", "Darlington", "Brain-Box"),
            R.drawable.marlton_pfp,
            games.Black_Ops_II,
            games.Black_Ops_IV
    ),
    SamuelStuhlinger(
            "Samuel Stuhlinger",
            "Samuel",
            "J",
            "Stuhlinger",
            new Date(),
            CharacterVersion.Single,
            CharacterGroup.Victis,
            Arrays.asList("Stu", "Stupid-ger", "Stewie", "Sammy", "Stuhlicker"),
            R.drawable.stuhlinger_pfp,
            games.Black_Ops_II,
            games.Black_Ops_IV
    ),
    Russman(
        "Russman",
            "Russman",
            "",
            "",
            new Date(),
            CharacterVersion.Single,
            CharacterGroup.Victis,
            Arrays.asList("Russ", "Old Man"),
            R.drawable.russman_pfp,
            games.Black_Ops_II,
            games.Black_Ops_IV
    ),
    AlbertArlington(
            "The Weasel",
            "Albert",
            "",
            "Arlington",
            new Date(),
            CharacterVersion.Single,
            CharacterGroup.MobOfTheDead,
            Arrays.asList("The Weasel"),
            R.drawable.weasel_pfp,
            games.Black_Ops_II,
            games.Black_Ops_IV
    ),
    MichaelOLeary(
            "Finn O'Leary",
            "Michael",
            "",
            "O'Leary",
            new Date(),
            CharacterVersion.Single,
            CharacterGroup.MobOfTheDead,
            Arrays.asList("Finn"),
            R.drawable.finn_pfp,
            games.Black_Ops_II,
            games.Black_Ops_IV
    ),
    SalvatoreDeLuca(
            "Sal DeLuca",
            "Salvatore",
            "",
            "DeLuca",
            new Date(),
            CharacterVersion.Single,
            CharacterGroup.MobOfTheDead,
            Arrays.asList("Sal", "Mr.DeLuca"),
            R.drawable.sal_pfp,
            games.Black_Ops_II,
            games.Black_Ops_IV
    ),
    BillyHandsome(
            "Billy Handsome",
            "Billy",
            "",
            "Handsome",
            new Date(),
            CharacterVersion.Single,
            CharacterGroup.MobOfTheDead,
            Arrays.asList(),
            R.drawable.billy_pfp,
            games.Black_Ops_II,
            games.Black_Ops_IV
    ),
    SarahMichelleGellar(
            "Sarah Michelle Gellar",
            "Sarah",
            "Michelle",
            "Gellar",
            new Date(),
            CharacterVersion.Single,
            CharacterGroup.CallOfTheDead,
            Arrays.asList(),
            R.drawable.sarah_pfp,
            games.Black_Ops_I,
            games.Black_Ops_I
    ),
    RobertEngland(
            "Robert England",
            "Robert",
            "",
            "England",
            new Date(),
            CharacterVersion.Single,
            CharacterGroup.CallOfTheDead,
            Arrays.asList(),
            R.drawable.app_icon,
            games.Black_Ops_I,
            games.Black_Ops_I
    ),
    DannyTrejo(
            "Danny Trejo",
            "Danny",
            "",
            "Trejo",
            new Date(),
            CharacterVersion.Single,
            CharacterGroup.CallOfTheDead,
            Arrays.asList(),
            R.drawable.app_icon,
            games.Black_Ops_I,
            games.Black_Ops_I
    ),
    MichaelRooker(
            "Michael Rooker",
            "Michael",
            "",
            "Rooker",
            new Date(),
            CharacterVersion.Single,
            CharacterGroup.CallOfTheDead,
            Arrays.asList(),
            R.drawable.app_icon,
            games.Black_Ops_I,
            games.Black_Ops_I
    ),
    UnknownMarine1(
            "Unknown Marine 1",
            "",
            "",
            "",
            new Date(),
            CharacterVersion.Single,
            CharacterGroup.WAW_Nacht,
            Arrays.asList(),
            R.drawable.app_icon,
            games.World_At_War,
            games.World_At_War
    ),
    UnknownMarine2(
            "Unknown Marine 2",
            "",
            "",
            "",
            new Date(),
            CharacterVersion.Single,
            CharacterGroup.WAW_Nacht,
            Arrays.asList(),
            R.drawable.app_icon,
            games.World_At_War,
            games.World_At_War
    ),
    UnknownMarine3(
            "Unknown Marine 3",
            "",
            "",
            "",
            new Date(),
            CharacterVersion.Single,
            CharacterGroup.WAW_Nacht,
            Arrays.asList(),
            R.drawable.app_icon,
            games.World_At_War,
            games.World_At_War
    ),
    UnknownMarine4(
            "Unknown Marine 4",
            "",
            "",
            "",
            new Date(),
            CharacterVersion.Single,
            CharacterGroup.WAW_Nacht,
            Arrays.asList(),
            R.drawable.app_icon,
            games.World_At_War,
            games.World_At_War
    ),
    TankDempsey(
            "Tank Dempsey",
            "",
            "",
            "Dempsey",
            new Date(),
            CharacterVersion.Single,
            CharacterGroup.WAW_Verruckt,
            Arrays.asList("Tank"),
            R.drawable.app_icon,
            games.World_At_War,
            games.Black_Ops_IV
    ),
    JohnBanana(
            "John Banana",
            "John",
            "",
            "Banana",
            new Date(),
            CharacterVersion.Single,
            CharacterGroup.WAW_Verruckt,
            Arrays.asList(),
            R.drawable.app_icon,
            games.World_At_War,
            games.World_At_War
    ),
    Smokey(
            "Smokey",
            "",
            "",
            "",
            new Date(),
            CharacterVersion.Single,
            CharacterGroup.WAW_Verruckt,
            Arrays.asList("Smokey"),
            R.drawable.app_icon,
            games.World_At_War,
            games.World_At_War
    ),
    PaxtonRidge(
            "Paxton Ridge",
            "Paxton",
            "",
            "Ridge",
            new Date(),
            CharacterVersion.Single,
            CharacterGroup.WAW_Verruckt,
            Arrays.asList(),
            R.drawable.app_icon,
            games.World_At_War,
            games.World_At_War
    );






    //Template(
    //      "Template",
    //      "Template",
    //      "",
    //      "",
    //      new Date(),
    //      CharacterVersion.Single,
    //      CharacterGroup.Victis,
    //      Arrays.asList("Template", "Template"),
    //      R.drawable.app_icon,
    //      games.Black_Ops_II,
    //      games.Black_Ops_IV
    //),

    

    public final String characterName;
    public final String characterFirstName;
    public final String characterMiddleName;
    public final String characterLastName;
    public final Date characterBirthday;
    public final CharacterVersion characterVersion;
    public final CharacterGroup characterGroup;
    public final List<String> characterNicknames;
    public final int characterImage;
    public final games firstappearance;
    public final games finalappearance;


    Characters(String characterName, String characterFirstName, String characterMiddleName, String characterLastName, Date characterBirthday, CharacterVersion characterVersion, CharacterGroup characterGroup, List<String> characterNicknames, int characterImage, games firstappearance, games finalappearance)
    {
        this.characterName = characterName;
        this.characterFirstName = characterFirstName;
        this.characterMiddleName = characterMiddleName;
        this.characterLastName = characterLastName;
        this.characterBirthday = characterBirthday;
        this.characterVersion = characterVersion;
        this.characterGroup = characterGroup;
        this.characterNicknames = characterNicknames;
        this.characterImage = characterImage;
        this.firstappearance = firstappearance;
        this.finalappearance = finalappearance;
    }
}
