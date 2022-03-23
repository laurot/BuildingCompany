package com.solvd.interfaces;

public interface ICalculate {

    //Calculates the price and time with the values given
    void calculate(int buildType,int weather, int serviceType, int floors, float sqMeters, ITax country);

}
