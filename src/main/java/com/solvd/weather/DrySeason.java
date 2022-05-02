package com.solvd.weather;

import com.solvd.enums.*;

public class DrySeason extends Weather {

    public DrySeason() {
        super(DefaultValues.DRY.getPriceMod(), DefaultValues.DRY.getTimeMod());
        print();
    }

    @Override
    public void print() {
        LOGGER.info("Dry Season default values: \n Price modifier: "
                + DefaultValues.DRY.getPriceMod() + "\n Time modifier: "
                + DefaultValues.DRY.getTimeMod());
    }
}
