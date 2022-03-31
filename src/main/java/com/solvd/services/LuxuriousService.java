package com.solvd.services;

import org.apache.logging.log4j.*;
import com.solvd.language.ILanguage;

public class LuxuriousService extends Service{

    private static final Logger LOGGER = LogManager.getLogger();
    private static float priceMod = 3;
    private static float timeMod = 2;

    public LuxuriousService() {
        super(priceMod, timeMod);
    }
    

    public static void checkValues(ILanguage lang) {

        LOGGER.info(lang.getCalculateAndText().get("priceSetted") + priceMod);
        LOGGER.info(lang.getCalculateAndText().get("timeSetted") + timeMod);
    }


    public static void changePrice(float priceMod) {

        LuxuriousService.priceMod = priceMod;
        
    }


    public static void changeTime(float timeMod) {

        LuxuriousService.timeMod = timeMod;
        
    }
}
