package com.solvd.interfaces;

import com.solvd.exceptions.NegativeNumberException;
import com.solvd.exceptions.NotValidOptionException;
import com.solvd.exceptions.TooManyFloorsException;

public interface IIn <T> {

    //Ask for an option from a set of choices
    int askBuildingType() throws NotValidOptionException;
    int askServiceType() throws NotValidOptionException;
    int askWeather() throws NotValidOptionException;
    //Ask for a value to use later
    T askSqMetres() throws NegativeNumberException;
    int askFloors() throws NegativeNumberException, TooManyFloorsException;
}
