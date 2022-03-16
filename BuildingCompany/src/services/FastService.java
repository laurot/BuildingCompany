package services;

public class FastService extends Service {

    private static float priceMod = 2;
    private static float timeMod = (float) 0.5;

    public FastService() {
        super(priceMod, timeMod);
    }
    
}
