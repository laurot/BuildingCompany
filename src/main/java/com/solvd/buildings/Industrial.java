package com.solvd.buildings;

import com.solvd.enums.*;

public class Industrial extends Buildings {

    public Industrial() {
        super(DefaultValues.INDUSTRIAL.getPriceMod(),
                DefaultValues.INDUSTRIAL.getTimeMod());
        print();
    }

    @Override
    public void print() {
        LOGGER.info("Industrial default values: \n Price modifier: "
                + DefaultValues.INDUSTRIAL.getPriceMod() + "\n Time modifier: "
                + DefaultValues.INDUSTRIAL.getTimeMod());
    }
}
