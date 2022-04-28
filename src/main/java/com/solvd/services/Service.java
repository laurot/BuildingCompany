package com.solvd.services;

import com.solvd.interfaces.ICalc;
import com.solvd.language.ILanguage;
import org.apache.logging.log4j.*;

public abstract class Service implements ICalc<Double> {

    private Double priceMod;
    private Double timeMod;
    protected Logger LOGGER = LogManager.getLogger();

    public Service(Double servPriceMod, Double servTimeMod) {
        this.priceMod = servPriceMod;
        this.timeMod = servTimeMod;
    }

    @Override
    public Double calcTime(Double time) {
        time = time * timeMod;
        return time;
    }

    @Override
    public Double calcPrice(Double price) {
        price = price * priceMod;
        return price;
    }

    
    public void checkValues(ILanguage lang) {

        LOGGER.info(lang.getCalculateAndText().get("priceSetted") + priceMod);
        LOGGER.info(lang.getCalculateAndText().get("timeSetted") + timeMod);
    }

    public void changePrice(Double priceMod) {

        this.priceMod = priceMod;

    }

    public void changeTime(Double timeMod) {

        this.timeMod = timeMod;

    }

    public abstract void print();
}
