package com.example.the_ultimate_easter_egg_guide.Storyline.CodZombiesYoutubersData;

import com.example.the_ultimate_easter_egg_guide.Models.Storyline.CharacterGroup;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.YoutuberGroups;
import com.example.the_ultimate_easter_egg_guide.R;

public enum CodZombies_Youtubers
{
    TEST("TestTuber", YoutuberGroups.TEST, R.drawable.app_icon),
    BLACK_OPS_AMAZING("BlackOpsAmazing", YoutuberGroups.Storyline, R.drawable.blackopsamazing_pfp),
    MR_ROFL_WAFFLES("MrRoflWaffles", YoutuberGroups.Storyline, R.drawable.mrroflwaffles_pfp),
    THE_GAMING_REVOLUTION("TheGamingRevolution", YoutuberGroups.Storyline, R.drawable.thegamingrevolution_pfp),
    CH0PPER("Ch0pper", YoutuberGroups.Storyline, R.drawable.chopper_pfp),

    KUNJORA("Kunjora", YoutuberGroups.CustomZombies, R.drawable.kunjora_pfp),
    FPS_PSYCHO("FPSpsycho", YoutuberGroups.CustomZombies, R.drawable.fpspsycho_pfp),
    NOAH_J456("NoahJ456", YoutuberGroups.CustomZombies, R.drawable.noahj456_pfp),
    TIM_HANSEN("Tim Hansen", YoutuberGroups.CustomZombies, R.drawable.timhansen_pfp),
    KRAZY_RABB1T("KrazyRabb1t", YoutuberGroups.CustomZombies, R.drawable.krazyrabb1t_pfp),
    LEX_LOUNGE("Lex Lounge", YoutuberGroups.CustomZombies, R.drawable.lexlounge_pfp),
    YouAlwaysWin("YouAlwaysWin", YoutuberGroups.CustomZombies, R.drawable.youalwayswin_pfp),
    CODENAME_PIZZA("CodeNamePizza", YoutuberGroups.EasterEggHunter, R.drawable.codenamepizza_pfp),
    MR_DALEK_JD("MrDalekJD", YoutuberGroups.EasterEggHunter, R.drawable.mrdalekjd_pfp),
    GLITCHING_QUEEN("Glitching Queen", YoutuberGroups.EasterEggHunter, R.drawable.glitchingqueen_pfp),
    SMART_GUY("SmartGuy", YoutuberGroups.EasterEggHunter, R.drawable.app_icon),
    GLITCH("Glitch", YoutuberGroups.EasterEggHunter, R.drawable.app_icon),
    INVALID("Invalid", YoutuberGroups.EasterEggHunter, R.drawable.app_icon),
    YOTESLAYA("YOTESLAYA", YoutuberGroups.RestInPeace, R.drawable.yoteslaya_pfp),
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
