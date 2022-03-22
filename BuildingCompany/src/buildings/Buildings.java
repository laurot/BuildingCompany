package buildings;
import interfaces.*;


public abstract class Buildings implements ICalc{


    private float priceMod;
    private float timeMult;
    private float sqMeters;
    private int floors;

    public Buildings(float priceMod, float timeMult, int floors, float sqMeters){
        this.priceMod = priceMod;
        this.timeMult = timeMult;
        this.floors = floors;
        this.sqMeters = sqMeters;
    }
    
    @Override 
    public float calcPrice(float price){

        float totalP = (priceMod*sqMeters*floors);
        return totalP;
    }

    @Override 
    public float calcTime(float time){
        float totalT = (timeMult*floors*sqMeters);
        return totalT;
    }


}

