package com.solvd.services;

import org.apache.logging.log4j.*;
import com.solvd.enums.Values;
import com.solvd.language.ILanguage;

public class NormalService extends Service {

    private static final Logger LOGGER = LogManager.getLogger();
    private static float priceMod = (float) Values.NORMALS.getDefVal().getPriceMod();
    private static float timeMod = (float) Values.NORMALS.getDefVal().getTimeMod();

    public NormalService() {
        super(priceMod, timeMod);
    }

    public static void checkValues(ILanguage lang) {

        LOGGER.info(lang.getCalculateAndText().get("priceSetted") + priceMod);
        LOGGER.info(lang.getCalculateAndText().get("timeSetted") + timeMod);
    }

    public static void changePrice(float priceMod) {

        NormalService.priceMod = priceMod;

    }

    public static void changeTime(float timeMod) {

        NormalService.timeMod = timeMod;

    }
}
