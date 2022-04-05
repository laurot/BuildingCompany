package com.solvd.services;

import com.solvd.interfaces.ICalc;

public abstract class Service implements ICalc<Float> {

    private float priceMod;
    private float timeMod;

    public Service(float servPriceMod, float servTimeMod) {
        this.priceMod = servPriceMod;
        this.timeMod = servTimeMod;
    }

    @Override
    public Float calcTime(Float time) {
        time = time * timeMod;
        return time;
    }

    @Override
    public Float calcPrice(Float price) {
        price = price * priceMod;
        return price;
    }
}
