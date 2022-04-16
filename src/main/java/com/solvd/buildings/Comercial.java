package com.solvd.buildings;

import com.solvd.enums.*;

public class Comercial extends Buildings {

    public Comercial() {
        super(Values.COMMERCIAL.getDefVal().getPriceMod(), 
              Values.COMMERCIAL.getDefVal().getTimeMod());
    }
}
