package com.example.the_ultimate_easter_egg_guide.StorylineData.CodZombiesYoutubersData;

import com.example.the_ultimate_easter_egg_guide.Models.Storyline.IStorylineItems;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.YoutuberGroups;
import com.example.the_ultimate_easter_egg_guide.R;

public enum CodZombies_Youtubers implements IStorylineItems
{
    TEST("TestTuber", YoutuberGroups.TEST, R.drawable.default_test_image, "shorts/aM4kt6OgvVo"),
    BLACK_OPS_AMAZING("BlackOpsAmazing", YoutuberGroups.Storyline, R.drawable.blackopsamazing_pfp, "@BlackOpsAmazing"),
    MR_ROFL_WAFFLES("MrRoflWaffles", YoutuberGroups.Storyline, R.drawable.mrroflwaffles_pfp, "@MrRoflWaffles"),
    THE_GAMING_REVOLUTION("TheGamingRevolution", YoutuberGroups.Storyline, R.drawable.thegamingrevolution_pfp, "@TheGamingRevo"),
    CH0PPER("Ch0pper", YoutuberGroups.Storyline, R.drawable.chopper_pfp, "@Ch0pper"),

    KUNJORA("Kunjora", YoutuberGroups.CustomZombies, R.drawable.kunjora_pfp, "@Kunjora"),
    FPS_PSYCHO("FPSpsycho", YoutuberGroups.CustomZombies, R.drawable.fpspsycho_pfp, "@FPSpsychoYT"),
    NOAH_J456("NoahJ456", YoutuberGroups.CustomZombies, R.drawable.noahj456_pfp, "@NoahJ456"),
    TIM_HANSEN("Tim Hansen", YoutuberGroups.CustomZombies, R.drawable.timhansen_pfp, "@TimHansenYT"),
    KRAZY_RABB1T("KrazyRabb1t", YoutuberGroups.CustomZombies, R.drawable.krazyrabb1t_pfp, "@KrazyRabb1t"),
    LEX_LOUNGE("Lex Lounge", YoutuberGroups.CustomZombies, R.drawable.lexlounge_pfp, "@LexLounge"),
    YouAlwaysWin("YouAlwaysWin", YoutuberGroups.CustomZombies, R.drawable.youalwayswin_pfp, "@YouAlwaysWin"),

    CODENAME_PIZZA("CodeNamePizza", YoutuberGroups.EasterEggHunter, R.drawable.codenamepizza_pfp, "@CodeNamePizza"),
    MR_DALEK_JD("MrDalekJD", YoutuberGroups.EasterEggHunter, R.drawable.mrdalekjd_pfp, "@MrDalekJD"),
    GLITCHING_QUEEN("Glitching Queen", YoutuberGroups.EasterEggHunter, R.drawable.glitchingqueen_pfp, "@GlitchingQueen"),
    INVALID("Invalid", YoutuberGroups.EasterEggHunter, R.drawable.invalid_pfp, "channel/UCOBOjTPphUGVJTsWn4ZIHSQ"),
    THE_SMITH_PLAYS("TheSmithPlays", YoutuberGroups.ZHouse, R.drawable.thesmithplays_pfp, "@TheSmithPlays"),
    MR_T_LEXIFY("MrTLexify", YoutuberGroups.ZHouse, R.drawable.mrtlexify_pfp, "@MrTLexify"),
    CHUCKY("Chucky", YoutuberGroups.ZHouse, R.drawable.chucky_pfp, "@chucky"),
    MC_SPORTZ_HAWK("McSportzHawk", YoutuberGroups.ZHouse, R.drawable.mcsportzhawk_pfp, "@mcsportzhawk"),
    LONELY_MAILBOX("LonelyMailbox", YoutuberGroups.ZHouse, R.drawable.lonelymailbox_pfp, "user/lonelymailbox"),
    SYNDICATE("Syndicate", YoutuberGroups.ZombiesOGs, R.drawable.syndicate_pfp, "@Syndicate"),
    TOPROFORUGAMES("ToProForuGames - Atom", YoutuberGroups.ZombiesOGs, R.drawable.toproforugames_pfp, "@ToProForuGames"),
    CHRRISM("Chrrism", YoutuberGroups.CustomZombies, R.drawable.chrrism_pfp, "@Chrrism"),
    YOTESLAYA("YOTESLAYA", YoutuberGroups.RestInPeace, R.drawable.yoteslaya_pfp, "user/yoteslaya");

    public final String channelName;
    public final YoutuberGroups youtuberGroup;
    public final int characterImage;
    public final String channelLink;

    CodZombies_Youtubers(String channelName, YoutuberGroups youtuberGroup, int characterImage, String channelCode)
    {
        this.channelName = channelName;
        this.youtuberGroup = youtuberGroup;
        this.characterImage = characterImage;
        this.channelLink = "https://www.youtube.com/" + channelCode;
    }

    @Override
    public int GetImage() {
        return characterImage;
    }

    @Override
    public String GetDisplayName() {
        return channelName;
    }

    @Override
    public Object GetGroup() {
        return youtuberGroup;
    }
}
