package com.solvd.interfaces;

import com.solvd.buildings.Buildings;
import com.solvd.services.Service;
import com.solvd.weather.Weather;

public interface ICalculate<T> {

    // Calculates the price and time with the values given
    void calculate(ITax country, T lang, int floors, double sqMeters, Buildings calcBuild, Weather calcWeath,
            Service calcServ);

}
