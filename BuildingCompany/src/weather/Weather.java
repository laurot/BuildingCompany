package weather;

public abstract class Weather {
    private float weatherPriceMod;
    private float weatherTimeMod;

    public Weather(float weatherPriceMod, float weatherTimeMod){
        this.weatherPriceMod = weatherPriceMod;
        this.weatherTimeMod = weatherTimeMod;
    }

    public float calcTime(float time){
        time = time*weatherTimeMod;
        return time;
    }
    public float calcPrice(float price){
        price = price*weatherPriceMod;
        return price;
    }
}
