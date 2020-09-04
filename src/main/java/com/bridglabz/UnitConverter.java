package com.bridglabz;

public enum UnitConverter {
    inch(1),
    feet(12),
    yard(36),
    cm(0.4),
    ml(0.001),
    liter(1),
    gallon(3.78),
    kg(1),
    gram(0.001),
    tonne(1000),
    celsius(1),
    fahrenheit(1);

    private final double unit;

    UnitConverter(double unit) {
        this.unit = unit;
    }

    public static double temperatureConversion(double temperature) {
        return (temperature * 9 / 5) + 32;
    }
    public double getUnit() {
        return unit;
    }
}
