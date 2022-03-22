package interfaces;
public interface ICalc {
    
    //Calculates the price and time depending on the modifiers and the variable sent
    float calcTime(float timeMod);
    float calcPrice(float priceMod);

}
