package com.solvd.interfaces;   

public interface ICalculate<T> {

    //Calculates the price and time with the values given
    void calculate(ITax country,T lang);

}
