package com.solvd.interfaces;
import com.solvd.exceptions.*;

public interface ICalculate {

    //Calculates the price and time with the values given
    void calculate(ITax country) throws NotValidOptionException, NegativeNumberException, TooManyFloorsException;

}
