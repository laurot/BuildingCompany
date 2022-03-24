package com.solvd.interfaces;

import com.solvd.Country;
import com.solvd.exceptions.CountryNameException;
import com.solvd.exceptions.NegativeNumberException;
import com.solvd.exceptions.NotValidOptionException;
import com.solvd.exceptions.NotValidPercentageException;

public interface IChange {
    
    //To change the default values of each class
    void changeBuildings() throws NotValidOptionException;
    void changeServices() throws NotValidOptionException;
    void changeWeather() throws NotValidOptionException, NegativeNumberException;
    Country changeCountry() throws CountryNameException, NotValidPercentageException;
}
