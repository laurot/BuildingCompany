package com.solvd.services;

import com.solvd.enums.*;

public class NormalService extends Service {

    public NormalService() {
        super(DefaultValues.NORMALS.getPriceMod(),
        DefaultValues.NORMALS.getTimeMod());
        print();
    }

    @Override
    public void print(){
        LOGGER.info("Normal Service default values: \n Price modifier: " 
        + DefaultValues.NORMALS.getPriceMod() + "\n Time modifier: "
        + DefaultValues.NORMALS.getTimeMod());
    }
}
