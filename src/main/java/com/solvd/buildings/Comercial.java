package com.solvd.buildings;

import org.apache.logging.log4j.*;
import com.solvd.language.ILanguage;

public class Comercial extends Buildings  {

    private static final Logger LOGGER = LogManager.getLogger();
    private static float priceMod = 400;
    private static float timeMod = 14;

    public Comercial(int floors, float sqMeters) {
        super(priceMod, timeMod, floors, sqMeters);
        
    }


    public static void checkValues(ILanguage lang) {

        LOGGER.info(lang.getCalculateAndText().get("priceSetted") + priceMod);
        LOGGER.info(lang.getCalculateAndText().get("timeSetted") + timeMod);
    }

    public static void changePrice(float priceMod) {

        Comercial.priceMod = priceMod;
        
    }

    public static void changeTime(float timeMod) {

        Comercial.timeMod = timeMod;
        
    }



}
