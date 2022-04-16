package com.solvd.services;

import com.solvd.enums.Values;

public class LuxuriousService extends Service {

    public LuxuriousService() {
        super(Values.LUXURIOUS.getDefVal().getPriceMod(),
              Values.LUXURIOUS.getDefVal().getTimeMod());
    }
}
