package com.example.the_ultimate_easter_egg_guide.Storyline.CharacterData;

import com.example.the_ultimate_easter_egg_guide.Models.Storyline.CharacterVersion;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.CharacterGroup;
import com.example.the_ultimate_easter_egg_guide.Models.games;
import com.example.the_ultimate_easter_egg_guide.R;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public enum NonPlayer_Characters
{

    Template(
            "Template",
            "Template",
            "",
            "",
            new Date(),
            CharacterVersion.Single,
            CharacterGroup.Victis,
            Arrays.asList("Template", "Template"),
            R.drawable.app_icon,
            games.Black_Ops_II,
            games.Black_Ops_IV
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


    NonPlayer_Characters(String characterName, String characterFirstName, String characterMiddleName, String characterLastName, Date characterBirthday, CharacterVersion characterVersion, CharacterGroup characterGroup, List<String> characterNicknames, int characterImage, games firstappearance, games finalappearance)
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
