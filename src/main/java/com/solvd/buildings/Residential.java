package com.solvd.buildings;

import org.apache.logging.log4j.*;
import com.solvd.enums.*;
import com.solvd.language.ILanguage;

public class Residential extends Buildings {

    private static final Logger LOGGER = LogManager.getLogger();
    private static float priceMod = (float) Values.RESIDENTIAL.getDefVal().getPriceMod();
    private static float timeMod = (float) Values.RESIDENTIAL.getDefVal().getTimeMod();

    public Residential(int floors, float sqMeters) {
        super(priceMod, timeMod, floors, sqMeters);
    }

    public static void checkValues(ILanguage lang) {

        LOGGER.info(lang.getCalculateAndText().get("priceSetted") + priceMod);
        LOGGER.info(lang.getCalculateAndText().get("timeSetted") + timeMod);
    }

    public static void changePrice(float priceMod) {

        Residential.priceMod = priceMod;

    }

    public static void changeTime(float timeMod) {

        Residential.timeMod = timeMod;

    }
}
