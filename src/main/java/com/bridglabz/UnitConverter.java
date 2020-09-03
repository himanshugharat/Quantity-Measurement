package com.bridglabz;

public enum UnitConverter {
    inch(1),
    feet(12),
    yard(36),
    cm(0.4),
    ml(0.001),
    liter(1),
    gallon(3.79),
    kg(1),
    gram(0.001),
    tonne(1000);


    private final double unit;

    UnitConverter(double unit) {
        this.unit = unit;
    }

    public double getUnit() {
        return unit;
    }
}
