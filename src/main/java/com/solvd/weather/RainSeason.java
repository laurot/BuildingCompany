package com.solvd.weather;

import com.solvd.enums.*;

public class RainSeason extends Weather {

    public RainSeason() {
        super(DefaultValues.RAINY.getPriceMod(),
                DefaultValues.RAINY.getTimeMod());
        print();
    }

    @Override
    public void print() {
        LOGGER.info("Rainy season default values: \n Price modifier: "
                + DefaultValues.RAINY.getPriceMod() + "\n Time modifier: "
                + DefaultValues.RAINY.getTimeMod());
    }
}
