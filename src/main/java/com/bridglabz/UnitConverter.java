package com.bridglabz;

public enum UnitConverter {
    inch(1),
    feet(12),
    yard(36);

    private double unit;

    UnitConverter(double unit) {
        this.unit = unit;
    }

    public double getUnit() {
        return unit;
    }
}
