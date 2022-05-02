package com.solvd.enums;

public enum DefaultValues {
    RESIDENTIAL(500, 12),
    COMMERCIAL(400, 14),
    INDUSTRIAL(600, 24),
    NORMALW(1, 1),
    RAINY(1.5, 2.5),
    DRY(1, 0.5),
    NORMALS(1, 1),
    FAST(2, 0.5),
    LUXURIOUS(3, 2);

    final double priceMod;
    final double timeMod;

    DefaultValues(double priceMod, double timeMod) {
        this.priceMod = priceMod;
        this.timeMod = timeMod;
    }

    public double getPriceMod() {
        return priceMod;
    }

    public double getTimeMod() {
        return timeMod;
    }
}
