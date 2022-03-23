package com.solvd.buildings;

public class Industrial extends Buildings {

    private static float priceMod = 600;
    private static float timeMod = 24;

    public Industrial(int floors, float sqMeters) {
        super(priceMod, timeMod, floors, sqMeters);
    }
    

    public static void checkValues() {

        System.out.println("The price modifier is set to:" + priceMod);
        System.out.println("The time modifier is set to:" + timeMod);
    }

    public static void changePrice(float priceMod) {

        Industrial.priceMod = priceMod;
        checkValues();
        
    }

    public static void changeTime(float timeMod) {

        Industrial.timeMod = timeMod;
        checkValues();
        
    }
}
