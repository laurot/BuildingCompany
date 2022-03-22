package weather;

public class DrySeason extends Weather{

    private static float priceMod = 1;
    private static float timeMod = (float) 0.5;

    public DrySeason() {
        super(priceMod, timeMod);
    }
    

    public static void checkValues() {

        System.out.println("The price modifier is set to:" + priceMod);
        System.out.println("The time modifier is set to:" + timeMod);
    }


    public static void changePrice(float priceMod) {

        DrySeason.priceMod = priceMod;
        checkValues();
        
    }

    public static void changeTime(float timeMod) {

        DrySeason.timeMod = timeMod;
        checkValues();
        
    }
}
