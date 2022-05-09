package com.solvd.modifiers;

import com.solvd.interfaces.DoubleBiFunction;
import org.apache.logging.log4j.*;

public class Weather extends Modifier {

    protected Logger LOGGER = LogManager.getLogger();
    private DoubleBiFunction<Double> mult = (value, mod) -> value * mod;

    public Weather(Double weatherPriceMod, Double weatherTimeMod) {
        this.priceMod = weatherPriceMod;
        this.timeMod = weatherTimeMod;
    }

    @Override
    public Double calcTime(Double time) {
        return mult.apply(time, timeMod);
    }

    @Override
    public Double calcPrice(Double price) {
        return mult.apply(price, priceMod);
    }

    @Override
    public void setPriceMod(Double priceMod) {
        this.priceMod = priceMod;
    }

    @Override
    public void setTimeMod(Double timeMod) {
        this.timeMod = timeMod;
    }
}
