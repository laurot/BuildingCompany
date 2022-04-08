package com.solvd.weather;

import org.apache.logging.log4j.*;
import com.solvd.enums.Values;
import com.solvd.language.ILanguage;

public class NormalSeason extends Weather {

    private static final Logger LOGGER = LogManager.getLogger();
    private static float priceMod = (float) Values.NORMALW.getDefVal().getPriceMod();
    private static float timeMod = (float) Values.NORMALW.getDefVal().getTimeMod();

    public NormalSeason() {
        super(priceMod, timeMod);
    }

    public static void checkValues(ILanguage lang) {

        LOGGER.info(lang.getCalculateAndText().get("priceSetted") + priceMod);
        LOGGER.info(lang.getCalculateAndText().get("timeSetted") + timeMod);
    }

    public static void changePrice(float priceMod) {

        NormalSeason.priceMod = priceMod;

    }

    public static void changeTime(float timeMod) {

        NormalSeason.timeMod = timeMod;

    }
}
