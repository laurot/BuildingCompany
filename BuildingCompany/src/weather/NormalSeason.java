package weather;

public class NormalSeason extends Weather{

    private static float priceMod = 1;
    private static float timeMod = 1;

    public NormalSeason() {
        super(priceMod, timeMod);
    }
    
}
