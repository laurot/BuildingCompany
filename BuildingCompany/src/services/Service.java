package services;

public abstract class Service {
    private float servPriceMod;
    private float servTimeMod;

    public Service(float servPriceMod, float servTimeMod){
        this.servPriceMod = servPriceMod;
        this.servTimeMod = servTimeMod;
    }

    public float calcTime(float time){
        time = time*servTimeMod;
        return time;
    }
    public float calcPrice(float price){
        price = price*servPriceMod;
        return price;
    }
}
