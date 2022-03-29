package com.solvd.interfaces;
public interface ICalc <T> {
    
    //Calculates the price and time depending on the modifiers and the variable sent
    T calcTime(T timeMod);
    T calcPrice(T priceMod);

}   /*I don't really like doing this kind of stuff but I have no idea how 
    else to do it without making something new or implementing a database*/
