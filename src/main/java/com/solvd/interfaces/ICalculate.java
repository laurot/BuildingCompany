package com.solvd.interfaces;
import com.solvd.exceptions.*;
import com.solvd.language.ILanguage;

public interface ICalculate {

    //Calculates the price and time with the values given
    void calculate(ITax country,ILanguage lang) throws NotValidOptionException, NegativeNumberException, TooManyFloorsException;

}
