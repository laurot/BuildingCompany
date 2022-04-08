package com.solvd.weather;

import org.apache.logging.log4j.*;
import com.solvd.enums.Values;
import com.solvd.language.ILanguage;

public class DrySeason extends Weather {

    private static final Logger LOGGER = LogManager.getLogger();

    private static float priceMod = (float) Values.DRY.getDefVal().getPriceMod();
    private static float timeMod = (float) Values.DRY.getDefVal().getTimeMod();

    public DrySeason() {
        super(priceMod, timeMod);
    }

    public static void checkValues(ILanguage lang) {

        LOGGER.info(lang.getCalculateAndText().get("priceSetted") + priceMod);
        LOGGER.info(lang.getCalculateAndText().get("timeSetted") + timeMod);
    }

    public static void changePrice(float priceMod) {

        DrySeason.priceMod = priceMod;

    }

    public static void changeTime(float timeMod) {

        DrySeason.timeMod = timeMod;

    }
}
