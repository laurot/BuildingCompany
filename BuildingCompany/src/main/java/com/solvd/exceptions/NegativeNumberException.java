package com.solvd.exceptions;

public class NegativeNumberException extends Exception {
    
    public NegativeNumberException(){

        super("This can't have a negative value");
    }
}
