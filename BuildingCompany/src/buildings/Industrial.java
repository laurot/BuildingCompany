package buildings;

public class Industrial extends Buildings {

    private static float pricePerSqMetre = 600;
    private static float timeMod = 24;

    public Industrial(int floors, float sqMeters) {
        super(pricePerSqMetre, timeMod, floors, sqMeters);
    }
    
}
