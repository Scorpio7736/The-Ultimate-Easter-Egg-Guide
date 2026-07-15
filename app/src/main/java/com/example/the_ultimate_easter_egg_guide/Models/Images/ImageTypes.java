package com.example.the_ultimate_easter_egg_guide.Models.Images;

public enum ImageTypes
{
    Test("tst"),
    MapCover("mapcover"),
    CharacterPortrait("charpfp"),
    YouTuberPortrait("youtuberpfp"),
    Background("bkg"),
    Default("DEFAULT"),
    EasterEggStep("step");

    public final String typeCode;

    ImageTypes(String typeCode)
    {
        this.typeCode = typeCode;
    }
}
