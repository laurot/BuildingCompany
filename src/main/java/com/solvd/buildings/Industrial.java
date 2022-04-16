package com.solvd.buildings;

import com.solvd.enums.*;

public class Industrial extends Buildings {

    public Industrial() {
        super(Values.INDUSTRIAL.getDefVal().getPriceMod(), 
              Values.INDUSTRIAL.getDefVal().getTimeMod());
    }

}
