package com.solvd.weather;

import org.apache.logging.log4j.*;
import com.solvd.language.ILanguage;

public class RainSeason extends Weather{

    private static final Logger LOGGER = LogManager.getLogger();
    private static float priceMod = (float) 1.5;
    private static float timeMod = (float) 2.5;

    public RainSeason() {
        super(priceMod, timeMod);
    }
    

    public static void checkValues(ILanguage lang) {

        LOGGER.info(lang.getCalculateAndText().get("priceSetted") + priceMod);
        LOGGER.info(lang.getCalculateAndText().get("timeSetted") + timeMod);
    }

    public static void changePrice(float priceMod) {

        RainSeason.priceMod = priceMod;
        
    }

    public static void changeTime(float timeMod) {

        RainSeason.timeMod = timeMod;
        
    }
}
