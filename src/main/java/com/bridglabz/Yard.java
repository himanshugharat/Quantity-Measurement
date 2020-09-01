package com.bridglabz;

import static com.bridglabz.QuantityCalculator.feetToInch;
import static com.bridglabz.QuantityCalculator.yardToFeet;

public class Yard extends Units {

    public Yard(double length) {
        super(yardToFeet(feetToInch(length)));
    }
}

