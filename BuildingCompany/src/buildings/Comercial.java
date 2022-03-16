package buildings;

public class Comercial extends Buildings {
    private static float pricePerSqMetre = 400;
    private static float timeMod = 14;

    public Comercial(int floors, float sqMeters) {
        super(pricePerSqMetre, timeMod, floors, sqMeters);
        
    }



}
