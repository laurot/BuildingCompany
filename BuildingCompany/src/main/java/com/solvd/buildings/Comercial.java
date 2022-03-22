package main.java.com.solvd.buildings;

public class Comercial extends Buildings  {
    private static float priceMod = 400;
    private static float timeMod = 14;

    public Comercial(int floors, float sqMeters) {
        super(priceMod, timeMod, floors, sqMeters);
        
    }


    public static void checkValues() {

        System.out.println("The price modifier is set to:" + priceMod);
        System.out.println("The time modifier is set to:" + timeMod);
    }

    public static void changePrice(float priceMod) {

        Comercial.priceMod = priceMod;
        checkValues();
        
    }

    public static void changeTime(float timeMod) {

        Comercial.timeMod = timeMod;
        checkValues();
        
    }



}
