package weather;
import interfaces.ICalc;


public abstract class Weather implements ICalc{
    
    private float weatherPriceMod;
    private float weatherTimeMod;

    public Weather(float weatherPriceMod, float weatherTimeMod){
        this.weatherPriceMod = weatherPriceMod;
        this.weatherTimeMod = weatherTimeMod;
    }

    @Override
    public float calcTime(float time){
        time = time*weatherTimeMod;
        return time;
    }
    
    @Override
    public float calcPrice(float price){
        price = price*weatherPriceMod;
        return price;
    }
}
