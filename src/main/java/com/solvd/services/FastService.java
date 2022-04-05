package com.solvd.services;

import org.apache.logging.log4j.*;
import com.solvd.language.ILanguage;

public class FastService extends Service {

    private static final Logger LOGGER = LogManager.getLogger();
    private static float priceMod = 2;
    private static float timeMod = (float) 0.5;

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
