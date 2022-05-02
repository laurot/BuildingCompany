package com.solvd.buildings;

import com.solvd.enums.*;

public class Residential extends Buildings {

    public Residential() {
        super(DefaultValues.RESIDENTIAL.getPriceMod(),
                DefaultValues.RESIDENTIAL.getTimeMod());
        print();
    }

    @Override
    public void print() {
        LOGGER.info("Residential default values: \n Price modifier: "
                + DefaultValues.RESIDENTIAL.getPriceMod() + "\n Time modifier: "
                + DefaultValues.RESIDENTIAL.getTimeMod());
    }
}
