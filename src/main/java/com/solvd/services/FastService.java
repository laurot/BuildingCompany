package com.solvd.services;
    
import com.solvd.enums.*;

public class FastService extends Service {

    public FastService() {
        super(Values.FAST.getDefVal().getPriceMod(),
              Values.FAST.getDefVal().getTimeMod());
    }

}
