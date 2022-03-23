package com.solvd.services;

import org.apache.logging.log4j.*;

public class FastService extends Service {

    private static final Logger LOGGER = LogManager.getLogger();
    private static float priceMod = 2;
    private static float timeMod = (float) 0.5;

    public FastService() {
        super(priceMod, timeMod);
    }
    

    public static void checkValues() {

        LOGGER.info("The price modifier is set to:" + priceMod);
        LOGGER.info("The time modifier is set to:" + timeMod);
    }
    

    public static void changePrice(float priceMod) {

        FastService.priceMod = priceMod;
        checkValues();
        
    }

    public static void changeTime(float timeMod) {

        FastService.timeMod = timeMod;
        checkValues();
        
    }
}
