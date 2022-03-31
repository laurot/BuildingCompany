package com.solvd.interfaces;

import com.solvd.Country;
import com.solvd.exceptions.CountryNameException;
import com.solvd.exceptions.NegativeNumberException;
import com.solvd.exceptions.NotValidOptionException;
import com.solvd.exceptions.NotValidPercentageException;
import com.solvd.language.ILanguage;

public interface IChange {
    
    //To change the default values of each class
    void changeBuildings(ILanguage lang) throws NotValidOptionException;
    void changeServices(ILanguage lang) throws NotValidOptionException;
    void changeWeather(ILanguage lang) throws NotValidOptionException, NegativeNumberException;
    Country changeCountry(ILanguage lang) throws CountryNameException, NotValidPercentageException;
}
