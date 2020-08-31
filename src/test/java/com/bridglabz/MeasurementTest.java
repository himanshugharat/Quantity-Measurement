package com.bridglabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MeasurementTest {
    QuantityCalculator quantityCalculator = null;

    @Before
    public void setup() {
        quantityCalculator = new QuantityCalculator();
    }

    @Test
    public void givenLength_whenSame_ResultTrue() {
        quantityCalculator = new QuantityCalculator();
        double lengthInFeet = 1;
        double LengthInInch = 12;
        boolean result = quantityCalculator.compareLengths(lengthInFeet, LengthInInch);
        Assert.assertTrue(result);
    }
}
