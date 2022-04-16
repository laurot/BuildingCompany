package com.solvd.services;

import com.solvd.enums.Values;

public class NormalService extends Service {

    public NormalService() {
        super(Values.NORMALS.getDefVal().getPriceMod(),
              Values.NORMALS.getDefVal().getTimeMod());
    }

}
