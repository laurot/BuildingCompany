package com.solvd.interfaces;

import com.solvd.modifiers.Buildings;
import com.solvd.modifiers.Service;
import com.solvd.modifiers.Weather;

public interface ICalculate<T> {

    // Calculates the price and time with the values given
    void calculate(ITax country, T lang, int floors, double sqMeters, Buildings calcBuild, Weather calcWeath,
            Service calcServ);

}
