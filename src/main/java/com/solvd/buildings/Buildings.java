package com.solvd.buildings;

import com.solvd.interfaces.*;

public abstract class Buildings implements ICalc<Float> {

    private float priceMod;
    private float timeMult;
    private float sqMeters;
    private int floors;

    public Buildings(float priceMod, float timeMult, int floors, float sqMeters) {
        this.priceMod = priceMod;
        this.timeMult = timeMult;
        this.floors = floors;
        this.sqMeters = sqMeters;
    }

    @Override
    public Float calcPrice(Float price) {

        float totalP = (priceMod * sqMeters * floors);
        return totalP;
    }

    @Override
    public Float calcTime(Float time) {
        float totalT = (timeMult * floors * sqMeters);
        return totalT;
    }

}
