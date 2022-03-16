package weather;

public class RainSeason extends Weather{

    private static float priceMod = (float) 1.5;
    private static float timeMod = (float) 2.5;

    public RainSeason() {
        super(priceMod, timeMod);
    }
    
}
