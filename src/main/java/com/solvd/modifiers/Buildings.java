package com.solvd.modifiers;

import com.solvd.interfaces.ToDoubleTriFunction;

public class Buildings extends Modifier{

    private ToDoubleTriFunction<Double, Integer, Double> mult = (mod, floors, sqMeters) -> {
        return mod * floors * sqMeters;
    };

    public Buildings(Double priceMod, Double timeMod) {
        this.priceMod = priceMod;
        this.timeMod = timeMod;
    }

    public Double calcPrice(double sqMeters, int floors) {
        Double totalP = mult.applyAsDouble(priceMod, floors, sqMeters);
        return totalP;
    }

    public Double calcTime(double sqMeters, int floors) {
        Double totalT = mult.applyAsDouble(timeMod, floors, sqMeters);
        return totalT;
    }

    @Override
    public void setPriceMod(Double priceMod) {
        this.priceMod = priceMod;
    }

    @Override
    public void setTimeMod(Double timeMod) {
        this.timeMod = timeMod;
    }

    @Override
    public Double calcTime(Double time) {
        return time*timeMod/2;
    }

    @Override
    public Double calcPrice(Double price) {
        return price*priceMod/2;
    }
}
