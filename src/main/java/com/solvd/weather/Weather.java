package com.solvd.weather;

import com.solvd.interfaces.DoubleBiFunction;
import com.solvd.interfaces.ICalc;
import com.solvd.language.ILanguage;
import org.apache.logging.log4j.*;

public abstract class Weather implements ICalc <Double>{
    
    private Double priceMod;
    private Double timeMod;
    private static final Logger LOGGER = LogManager.getLogger();
    private DoubleBiFunction<Double> mult = (value, mod) -> value*mod;

    public Weather(Double weatherPriceMod, Double weatherTimeMod){
        this.priceMod = weatherPriceMod;
        this.timeMod = weatherTimeMod;
    }

    @Override
    public Double calcTime(Double time){
        return mult.apply(time, timeMod);
    }
    
    @Override
    public Double calcPrice(Double price){
        return mult.apply(price, priceMod);
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
}
