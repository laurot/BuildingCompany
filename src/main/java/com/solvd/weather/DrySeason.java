package com.solvd.weather;

import com.solvd.enums.Values;

public class DrySeason extends Weather {

    public DrySeason() {
        super(Values.DRY.getDefVal().getPriceMod(), Values.DRY.getDefVal().getTimeMod());
    }
}
