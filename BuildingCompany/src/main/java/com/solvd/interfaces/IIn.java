package com.solvd.interfaces;

public interface IIn {

    //Ask for an option from a set of choices
    int askBuildingType();
    int askServiceType();
    int askWeather();
    //Ask for a value to use later
    float askSqMetres();
    int askFloors();
}
