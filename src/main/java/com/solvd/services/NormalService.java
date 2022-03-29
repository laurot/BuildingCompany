package com.solvd.services;

import org.apache.logging.log4j.*;

public class NormalService extends Service{

    private static final Logger LOGGER = LogManager.getLogger();
    private static float priceMod = 1;
    private static float timeMod = 1;

    public NormalService() {
        super(priceMod, timeMod);
    }
    

    public static void checkValues() {

        LOGGER.info("The price modifier is set to:" + priceMod);
        LOGGER.info("The time modifier is set to:" + timeMod);
    }


    public static void changePrice(float priceMod) {

        NormalService.priceMod = priceMod;
        checkValues();
        
    }


    public static void changeTime(float timeMod) {

        NormalService.timeMod = timeMod;
        checkValues();
        
    }
}
