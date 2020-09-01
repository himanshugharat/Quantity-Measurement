package com.bridglabz;
public class QuantityCalculator {
    public static double feetToInch(double length){
        return length*12;
    }
    public static double yardToFeet(double length){
        return length*3;
    }

    public boolean compareLengths(Units lengthOne, Units lengthTwo) {
        if(lengthOne == null || lengthTwo ==null){
            return false;
        }
        return lengthOne.equals(lengthTwo);
    }
}
