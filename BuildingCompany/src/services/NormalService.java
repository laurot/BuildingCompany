package services;

public class NormalService extends Service{

    private static float priceMod = 1;
    private static float timeMod = 1;

    public NormalService() {
        super(priceMod, timeMod);
    }
    
}
