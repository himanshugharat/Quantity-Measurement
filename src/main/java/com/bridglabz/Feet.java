package com.bridglabz;

import static com.bridglabz.QuantityCalculator.feetToInch;

public class Feet extends Units {
    public Feet(double length) {
        super(feetToInch(length));
    }
}
