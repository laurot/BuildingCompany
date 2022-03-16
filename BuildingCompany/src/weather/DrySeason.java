package weather;

public class DrySeason extends Weather{

    private static float priceMod = 1;
    private static float timeMod = (float) 0.5;

    public DrySeason() {
        super(priceMod, timeMod);
    }
    
}
