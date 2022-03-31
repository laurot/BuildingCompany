package com.solvd.interfaces;

import com.solvd.exceptions.NegativeNumberException;
import com.solvd.exceptions.NotValidOptionException;
import com.solvd.exceptions.TooManyFloorsException;
import com.solvd.language.ILanguage;

public interface IIn <T> {

    //Ask for an option from a set of choices
    int askBuildingType(ILanguage lang) throws NotValidOptionException;
    int askServiceType(ILanguage lang) throws NotValidOptionException;
    int askWeather(ILanguage lang) throws NotValidOptionException;
    //Ask for a value to use later
    T askSqMetres(ILanguage lang) throws NegativeNumberException;
    int askFloors(ILanguage lang) throws NegativeNumberException, TooManyFloorsException;
}
