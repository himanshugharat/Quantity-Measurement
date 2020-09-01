package com.bridglabz;

import static com.bridglabz.UnitConversion.feetToInch;
import static com.bridglabz.UnitConversion.yardToFeet;

public class Yard extends Units {

    public Yard(double length) {
        super(yardToFeet(feetToInch(length)));
    }
}

