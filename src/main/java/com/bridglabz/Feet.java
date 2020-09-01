package com.bridglabz;

import static com.bridglabz.UnitConversion.feetToInch;

public class Feet extends Units {
    public Feet(double length) {
        super(feetToInch(length));
    }
}
