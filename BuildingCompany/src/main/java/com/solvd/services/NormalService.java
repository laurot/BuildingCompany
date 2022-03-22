package main.java.com.solvd.services;

public class NormalService extends Service{

    private static float priceMod = 1;
    private static float timeMod = 1;

    public NormalService() {
        super(priceMod, timeMod);
    }
    

    public static void checkValues() {

        System.out.println("The price modifier is set to:" + priceMod);
        System.out.println("The time modifier is set to:" + timeMod);
    }


    public static void changePrice(float priceMod) {

        NormalService.priceMod = priceMod;
        checkValues();
        
    }


    public static void changeTime(float timeMod) {

        NormalService.timeMod = timeMod;
        checkValues();
        
    }
}
