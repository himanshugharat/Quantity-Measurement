package com.bridglabz;

public enum UnitConverter {
    inch(1),
    feet(12),
    yard(36),
    cm(0.4),
    ml(1),
    liter(1000),
    gallon(3780);


    private final double unit;

    UnitConverter(double unit) {
        this.unit = unit;
    }

    public double getUnit() {
        return unit;
    }
}
