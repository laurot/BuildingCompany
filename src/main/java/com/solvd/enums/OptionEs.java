package com.solvd.enums;

public enum OptionEs {
    BUILDINGS("Construcciones"),
    SERVICES("Servicios"),
    WEATHERS("Climas");

    private String name;

    OptionEs(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
