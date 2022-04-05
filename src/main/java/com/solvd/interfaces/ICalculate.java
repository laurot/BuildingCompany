package com.solvd.interfaces;

import com.solvd.exceptions.*;

public interface ICalculate<T> {

    //Calculates the price and time with the values given
    void calculate(ITax country,T lang) throws NotValidOptionException, NegativeNumberException, TooManyFloorsException;

}
