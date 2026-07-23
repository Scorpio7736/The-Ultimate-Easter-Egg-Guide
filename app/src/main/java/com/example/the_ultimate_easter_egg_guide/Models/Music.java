package com.example.the_ultimate_easter_egg_guide.Models;

import com.example.the_ultimate_easter_egg_guide.R;

public enum Music
{
    DAMNED_80S(R.raw.damned_80s, "Damned 80s"),
    DAMNED_BOI(R.raw.damned_boi, "Damned Black Ops"),
    DAMNED_BOII(R.raw.damned_boii, "Damned Black Ops 2"),
    DAMNED_BOIII(R.raw.damned_boiii, "Damned Black Ops 3"),
    DAMNED_BOIV(R.raw.damned_boiv, "Damned Black Ops 4"),
    DAMNED_ORCHESTRAL(R.raw.damned_orchestral, "Damned Orchestral"),

    ;
    public int songID;
    public String displayName;

    Music(int songID, String displayName)
    {
        this.songID = songID;
        this.displayName = displayName;
    }
}
