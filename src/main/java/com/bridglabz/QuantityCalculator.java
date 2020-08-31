package com.bridglabz;

public class QuantityCalculator {
    public boolean compareLengths(double lengthInFeet, double lengthInInch) {
        double convertResult = lengthInFeet * 12;
        return convertResult == lengthInInch;
    }
}
