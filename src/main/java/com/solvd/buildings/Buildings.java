package com.solvd.buildings;

import com.solvd.language.ILanguage;
import org.apache.logging.log4j.*;

public abstract class Buildings {

    private Double priceMod;
    private Double timeMod;
    private static final Logger LOGGER = LogManager.getLogger();

    public Buildings(Double priceMod, Double timeMult) {
        this.priceMod = priceMod;
        this.timeMod = timeMult;

    }

    public Double calcPrice(double sqMeters, int floors) {
        Double totalP = (priceMod * sqMeters * floors);
        return totalP;
    }

    public Double calcTime(double sqMeters, int floors) {
        Double totalT = (timeMod * floors * sqMeters);
        return totalT;
    }

    public void changePrice(Double priceMod) {
        this.priceMod = priceMod;
    }

    public void changeTime(Double timeMod) {
        this.timeMod = timeMod;
    }

    public void checkValues(ILanguage lang) {
        LOGGER.info(lang.getCalculateAndText().get("priceSetted") + priceMod);
        LOGGER.info(lang.getCalculateAndText().get("timeSetted") + timeMod);
    }

    public Double getPriceMod() {
        return priceMod;
    }

    public Double getTimeMod() {
        return timeMod;
    }
}
