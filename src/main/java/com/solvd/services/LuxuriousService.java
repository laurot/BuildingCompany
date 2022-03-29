package com.solvd.services;

import org.apache.logging.log4j.*;

public class LuxuriousService extends Service{

    private static final Logger LOGGER = LogManager.getLogger();
    private static float priceMod = 3;
    private static float timeMod = 2;

    public LuxuriousService() {
        super(priceMod, timeMod);
    }
    

    public static void checkValues() {

        LOGGER.info("The price modifier is set to:" + priceMod);
        LOGGER.info("The time modifier is set to:" + timeMod);
    }


    public static void changePrice(float priceMod) {

        LuxuriousService.priceMod = priceMod;
        checkValues();
        
    }


    public static void changeTime(float timeMod) {

        LuxuriousService.timeMod = timeMod;
        checkValues();
        
    }
}
