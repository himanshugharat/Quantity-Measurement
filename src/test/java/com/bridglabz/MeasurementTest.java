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
    public void givenLength_whenZeroLengths_ShouldResultTrue() {
        quantityCalculator = new QuantityCalculator();
        boolean compare = quantityCalculator.compareLengths(new Feet(0), new Feet(0));
        Assert.assertTrue(compare);
    }

}
