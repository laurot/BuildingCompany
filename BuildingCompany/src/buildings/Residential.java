package buildings;

public class Residential extends Buildings {

    private static float pricePerSqMetre = 500;
    private static float timeMod = 12;

    public Residential(int floors, float sqMeters) {
        super(pricePerSqMetre, timeMod, floors, sqMeters);
    }
    
}
