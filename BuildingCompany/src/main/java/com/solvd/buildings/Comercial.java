package com.solvd.buildings;

import org.apache.logging.log4j.*;

public class Comercial extends Buildings  {

    private static final Logger LOGGER = LogManager.getLogger();
    private static float priceMod = 400;
    private static float timeMod = 14;

    public Comercial(int floors, float sqMeters) {
        super(priceMod, timeMod, floors, sqMeters);
        
    }


    public static void checkValues() {

        LOGGER.info("The price modifier is set to:" + priceMod);
        LOGGER.info("The time modifier is set to:" + timeMod);
    }

    public static void changePrice(float priceMod) {

        Comercial.priceMod = priceMod;
        checkValues();
        
    }

    public static void changeTime(float timeMod) {

        Comercial.timeMod = timeMod;
        checkValues();
        
    }



}
