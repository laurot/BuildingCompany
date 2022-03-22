package weather;

public class RainSeason extends Weather{

    private static float priceMod = (float) 1.5;
    private static float timeMod = (float) 2.5;

    public RainSeason() {
        super(priceMod, timeMod);
    }
    

    public static void checkValues() {

        System.out.println("The price modifier is set to:" + priceMod);
        System.out.println("The time modifier is set to:" + timeMod);
    }

    public static void changePrice(float priceMod) {

        RainSeason.priceMod = priceMod;
        checkValues();
        
    }

    public static void changeTime(float timeMod) {

        RainSeason.timeMod = timeMod;
        checkValues();
        
    }
}
