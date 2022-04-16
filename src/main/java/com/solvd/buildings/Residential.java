package com.solvd.buildings;

import com.solvd.enums.*;

public class Residential extends Buildings {

    public Residential() {
        super(Values.RESIDENTIAL.getDefVal().getPriceMod(),
              Values.RESIDENTIAL.getDefVal().getTimeMod());
    }

}
