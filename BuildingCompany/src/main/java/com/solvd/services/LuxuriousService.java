package com.solvd.services;

public class LuxuriousService extends Service{

    private static float priceMod = 3;
    private static float timeMod = 2;

    public LuxuriousService() {
        super(priceMod, timeMod);
    }
    

    public static void checkValues() {

        System.out.println("The price modifier is set to:" + priceMod);
        System.out.println("The time modifier is set to:" + timeMod);
    }


    public static void changePrice(float priceMod) {

        LuxuriousService.priceMod = priceMod;
        checkValues();
        
    }


    public static void changeTime(float timeMod) {

        LuxuriousService.timeMod = timeMod;
        checkValues();
        
    }
}
