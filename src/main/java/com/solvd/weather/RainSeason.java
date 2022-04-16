package com.solvd.weather;

import com.solvd.enums.Values;

public class RainSeason extends Weather {

    public RainSeason() {
        super(Values.RAINY.getDefVal().getPriceMod(),
              Values.RAINY.getDefVal().getTimeMod());
    }
}
