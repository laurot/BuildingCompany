package com.solvd.weather;

public class NormalSeason extends Weather{

    private static float priceMod = 1;
    private static float timeMod = 1;

    public NormalSeason() {
        super(priceMod, timeMod);
    }


    public static void checkValues() {

        System.out.println("The price modifier is set to:" + priceMod);
        System.out.println("The time modifier is set to:" + timeMod);
    }

    public static void changePrice(float priceMod) {

        NormalSeason.priceMod = priceMod;
        checkValues();
        
    }

    public static void changeTime(float timeMod) {

        NormalSeason.timeMod = timeMod;
        checkValues();
        
    }
}
