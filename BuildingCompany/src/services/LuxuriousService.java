package services;

public class LuxuriousService extends Service{

    private static float priceMod = 3;
    private static float timeMod = 2;

    public LuxuriousService() {
        super(priceMod, timeMod);
    }
    
}
