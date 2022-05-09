package com.solvd.modifiers;

import com.solvd.interfaces.ICalc;
import com.solvd.language.ILanguage;

import org.apache.logging.log4j.*;


public abstract class Modifier implements ICalc<Double> {
    protected Double priceMod;
    protected Double timeMod;
    private Logger LOGGER = LogManager.getLogger();

    public Double getPriceMod() {
        return priceMod;
    }

    public Double getTimeMod() {
        return timeMod;
    }

    public void checkValues(ILanguage lang) {
        LOGGER.info(lang.getCalculateAndText().get("priceSetted") + priceMod);
        LOGGER.info(lang.getCalculateAndText().get("timeSetted") + timeMod);
    }
    
    abstract void setPriceMod(Double priceMod);
    abstract void setTimeMod(Double timeMod);
}
