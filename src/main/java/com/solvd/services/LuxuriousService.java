package com.solvd.services;

import com.solvd.enums.*;

public class LuxuriousService extends Service {

    public LuxuriousService() {
        super(DefaultValues.LUXURIOUS.getPriceMod(),
                DefaultValues.LUXURIOUS.getTimeMod());
        print();
    }

    @Override
    public void print() {
        LOGGER.info("Luxurious Service default values: \n Price modifier: "
                + DefaultValues.LUXURIOUS.getPriceMod() + "\n Time modifier: "
                + DefaultValues.LUXURIOUS.getTimeMod());
    }
}
