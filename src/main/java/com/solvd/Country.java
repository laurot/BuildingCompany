package com.solvd;

import com.solvd.interfaces.ITax;

public class Country implements ITax {

    private Double taxRate;
    private String name;

    public Country(String name, Double taxRate) {
        this.name = name;
        this.taxRate = taxRate;
    }

    public String getName() {
        return name;
    }

    @Override
    public Double tax(Double price) {
        Double total = taxRate * price;
        return total;
    }

}
