package com.example.the_ultimate_easter_egg_guide.Models.Tools.RecommendedGobbleGums;

public enum PlayerCount {
    SOLO("Solo", 1),
    TWO_PLAYERS("2 Players", 2),
    THREE_PLAYERS("3 Players", 3),
    FOUR_PLAYERS("4 Players", 4);

    public final String displayName;
    public final int count;

    PlayerCount(String displayName, int count) {
        this.displayName = displayName;
        this.count = count;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
