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
    public void setPriceMod(Double priceMod) {
        this.priceMod = priceMod;
    }
    public Double getTimeMod() {
        return timeMod;
    }
    public void setTimeMod(Double timeMod) {
        this.timeMod = timeMod;
    }

    public void checkValues(ILanguage lang) {
        LOGGER.info(lang.getCalculateAndText().get("priceSetted") + priceMod);
        LOGGER.info(lang.getCalculateAndText().get("timeSetted") + timeMod);
    }
    
    abstract void changePrice(Double priceMod);
    abstract void changeTime(Double timeMod);
}
