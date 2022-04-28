package com.solvd.weather;

import com.solvd.enums.*;

public class NormalSeason extends Weather {

    public NormalSeason() {
        super(DefaultValues.NORMALW.getPriceMod(), DefaultValues.NORMALW.getTimeMod());
    }

    @Override
    public void print(){
        LOGGER.info("Normal Season default values: \n Price modifier: " 
        + DefaultValues.NORMALW.getPriceMod() + "\n Time modifier: "
        + DefaultValues.NORMALW.getTimeMod());
    }
}
