package com.solvd.interfaces;
import com.solvd.Country;
import com.solvd.exceptions.*;

public interface ICalculate {

    //Calculates the price and time with the values given
    void calculate(Country country) throws NotValidOptionException, NegativeNumberException, TooManyFloorsException;

}
