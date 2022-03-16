package buildings;

public abstract class Buildings {


    private float pricePerSqMetre;
    private float timeMult;
    private float sqMeters;
    private int floors;

    public Buildings(float pricePerSqMetre, float timeMult, int floors, float sqMeters){
        this.pricePerSqMetre = pricePerSqMetre;
        this.timeMult = timeMult;
        this.floors = floors;
        this.sqMeters = sqMeters;
    }
    
    public float calculatePrice(){

        float total = (pricePerSqMetre*sqMeters*floors);
        return total;
    }

    public float calcTime(){
        float time = (timeMult*floors);
        return time;
    }


}

