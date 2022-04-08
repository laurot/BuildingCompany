package com.solvd.enums;

public enum Options {
    BUILDINGS("Buildings"),
    SERVICES("Services"),
    WEATHERS("Weathers");

    private String name;
    Options(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
