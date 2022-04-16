package com.solvd.weather;

import com.solvd.enums.Values;

public class NormalSeason extends Weather {

    public NormalSeason() {
        super(Values.NORMALW.getDefVal().getPriceMod(), Values.NORMALW.getDefVal().getTimeMod());
    }
}
