package com.solvd.buildings;

import com.solvd.enums.*;

public class Comercial extends Buildings {

    public Comercial() {
        super(DefaultValues.COMMERCIAL.getPriceMod(),
                DefaultValues.COMMERCIAL.getTimeMod());
        print();
    }

    @Override
    public void print() {
        LOGGER.info("Commercial default values: \n Price modifier: "
                + DefaultValues.COMMERCIAL.getPriceMod() + "\n Time modifier: "
                + DefaultValues.COMMERCIAL.getTimeMod());
    }
}
