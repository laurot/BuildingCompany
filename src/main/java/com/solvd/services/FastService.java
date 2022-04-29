package com.solvd.services;
    
import com.solvd.enums.*;

public class FastService extends Service {

    public FastService() {
        super(DefaultValues.FAST.getPriceMod(),
        DefaultValues.FAST.getTimeMod());
        print();
    }

    @Override
    public void print(){
        LOGGER.info("Fast service default values: \n Price modifier: " 
        + DefaultValues.FAST.getPriceMod() + "\n Time modifier: "
        + DefaultValues.FAST.getTimeMod());
    }
}
