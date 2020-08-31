package com.bridglabz;

import org.junit.Assert;
import org.junit.Test;

public class MeasurementTest {
    @Test
    public void givenLength_whenSame_ResultTrue() {
        QuantityCalculator quantityCalculator = new QuantityCalculator();
        double lengthInFeet = 1;
        double LengthInInch = 12;
        boolean result = quantityCalculator.compareLengths(lengthInFeet, LengthInInch);
        Assert.assertTrue(result);
    }
}
