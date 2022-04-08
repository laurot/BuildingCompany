package com.solvd.services;

import org.apache.logging.log4j.*;
import com.solvd.enums.*;
import com.solvd.language.ILanguage;

public class FastService extends Service {

    private static final Logger LOGGER = LogManager.getLogger();
    private static float priceMod = (float) Values.FAST.getDefVal().getPriceMod();
    private static float timeMod = (float) Values.FAST.getDefVal().getTimeMod();

    public FastService() {
        super(priceMod, timeMod);
    }

    public static void checkValues(ILanguage lang) {

        LOGGER.info(lang.getCalculateAndText().get("priceSetted") + priceMod);
        LOGGER.info(lang.getCalculateAndText().get("timeSetted") + timeMod);
    }

    public static void changePrice(float priceMod) {

        FastService.priceMod = priceMod;

    }

    public static void changeTime(float timeMod) {

        FastService.timeMod = timeMod;

    }
}
