package com.example.the_ultimate_easter_egg_guide.Storyline.CodZombiesYoutubersData;

import com.example.the_ultimate_easter_egg_guide.Models.Storyline.CharacterGroup;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.YoutuberGroups;
import com.example.the_ultimate_easter_egg_guide.R;

public enum CodZombies_Youtubers
{
    TEST("TestTuber", YoutuberGroups.TEST, R.drawable.app_icon),
    MR_ROFL_WAFFLES("MrRoflWaffles", YoutuberGroups.Storyline, R.drawable.app_icon),
    THE_GAMING_REVOLUTION("TheGamingRevolution", YoutuberGroups.Storyline, R.drawable.app_icon),
    BLACK_OPS_AMAZING("BlackOpsAmazing", YoutuberGroups.Storyline, R.drawable.app_icon),
    ERUPTION_FANG("EruptionFang", YoutuberGroups.Storyline, R.drawable.app_icon),
    CH0PPER("Ch0pper", YoutuberGroups.Storyline, R.drawable.app_icon),
    RIZZO("Rizzo", YoutuberGroups.Storyline, R.drawable.app_icon),
    RAD_AUSTIN_27("RadAustin27", YoutuberGroups.Storyline, R.drawable.app_icon),

    KUNJORA("Kunjora", YoutuberGroups.CustomZombies, R.drawable.app_icon),
    FPS_PSYCHO("FPSpsycho", YoutuberGroups.CustomZombies, R.drawable.app_icon),
    NOAH_J456("NoahJ456", YoutuberGroups.CustomZombies, R.drawable.app_icon),
    TIM_HANSEN("Tim Hansen", YoutuberGroups.CustomZombies, R.drawable.app_icon),
    KRAZY_RABB1T("KrazyRabb1t", YoutuberGroups.CustomZombies, R.drawable.app_icon),
    CHUMPA_223("Chumpa223", YoutuberGroups.CustomZombies, R.drawable.app_icon),
    LEX_LOUNGE("Lex Lounge", YoutuberGroups.CustomZombies, R.drawable.app_icon),

    CODENAME_PIZZA("CodeNamePizza", YoutuberGroups.EasterEggHunter, R.drawable.app_icon),
    MR_DALEK_JD("MrDalekJD", YoutuberGroups.EasterEggHunter, R.drawable.app_icon),
    GLITCHING_QUEEN("Glitching Queen", YoutuberGroups.EasterEggHunter, R.drawable.app_icon),
    SMART_GUY("SmartGuy", YoutuberGroups.EasterEggHunter, R.drawable.app_icon),
    GLITCH("Glitch", YoutuberGroups.EasterEggHunter, R.drawable.app_icon),
    INVALID("Invalid", YoutuberGroups.EasterEggHunter, R.drawable.app_icon),

    THE_SMITH_PLAYS("TheSmithPlays", YoutuberGroups.ZHouse, R.drawable.app_icon),
    MR_T_LEXIFY("MrTLexify", YoutuberGroups.ZHouse, R.drawable.app_icon),
    CHUCKY("Chucky", YoutuberGroups.ZHouse, R.drawable.app_icon),
    MC_SPORTZ_HAWK("McSportzHawk", YoutuberGroups.ZHouse, R.drawable.app_icon),
    LONELY_MAILBOX("LonelyMailbox", YoutuberGroups.ZHouse, R.drawable.app_icon);

    public final String channelName;
    public final YoutuberGroups youtuberGroup;
    public final int characterImage;

    CodZombies_Youtubers(String channelName, YoutuberGroups youtuberGroup, int characterImage)
    {
        this.channelName = channelName;
        this.youtuberGroup = youtuberGroup;
        this.characterImage = characterImage;
    }
}
