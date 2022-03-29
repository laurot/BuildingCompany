package com.solvd;

import com.solvd.interfaces.ITax;

public class Country implements ITax <Float>{
    
    private float taxRate;
    private String name;

    public Country(String name, float taxRate){
        this.name = name;
        this.taxRate = taxRate;
    }
    
    public String getName() {
        return name;
    }

    @Override
    public Float tax(Float price) {
        float total = taxRate*price;
        return total;
    }


}
