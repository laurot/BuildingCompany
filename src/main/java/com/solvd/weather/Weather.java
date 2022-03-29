package com.solvd.weather;
import com.solvd.interfaces.ICalc;

public abstract class Weather implements ICalc <Float>{
    
    private float weatherPriceMod;
    private float weatherTimeMod;

    public Weather(float weatherPriceMod, float weatherTimeMod){
        this.weatherPriceMod = weatherPriceMod;
        this.weatherTimeMod = weatherTimeMod;
    }

    @Override
    public Float calcTime(Float time){
        time = time*weatherTimeMod;
        return time;
    }
    
    @Override
    public Float calcPrice(Float price){
        price = price*weatherPriceMod;
        return price;
    }
}
