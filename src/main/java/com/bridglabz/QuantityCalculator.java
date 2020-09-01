package com.bridglabz;

public class QuantityCalculator {
    public boolean compareLengths(Units lengthOne, Units lengthTwo) {
        if(lengthOne == null || lengthTwo ==null){
            return false;
        }
        return lengthOne.equals(lengthTwo);
    }
}
