package com.solvd.interfaces;

import com.solvd.exceptions.NegativeNumberException;
import com.solvd.exceptions.NotValidOptionException;
import com.solvd.exceptions.TooManyFloorsException;

public interface ICalculate {

    //Calculates the price and time with the values given
    void calculate(ITax country) throws NotValidOptionException, NegativeNumberException, TooManyFloorsException;

}
