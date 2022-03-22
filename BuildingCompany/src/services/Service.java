package services;
import interfaces.ICalc;


public abstract class Service implements ICalc{
    
    private float priceMod;
    private float timeMod;

    public Service(float servPriceMod, float servTimeMod){
        this.priceMod = servPriceMod;
        this.timeMod = servTimeMod;
    }

    @Override
    public float calcTime(float time){
        time = time*timeMod;
        return time;
    }
    
    @Override 
    public float calcPrice(float price){
        price = price*priceMod;
        return price;
    }
}
