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

    @Test
    public void givenLength_whenNullLengths_ShouldReturnNullException() {
        quantityCalculator = new QuantityCalculator();
        Feet feet=null;
        boolean compare = quantityCalculator.compareLengths(feet, new Feet(0));
        Assert.assertTrue(compare);
    }

    @Test
    public void givenLength_whenCheckRefLengths_ShouldReturnTrue() {
        quantityCalculator = new QuantityCalculator();
        Feet feet = new Feet(0);
        boolean compare = quantityCalculator.compareLengths(feet,feet);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenLength_whenCheckTypeOfLengths_ShouldReturnTrue() {
        quantityCalculator = new QuantityCalculator();
        boolean compare = quantityCalculator.compareLengths(new Feet(0),new Feet(0));
        Assert.assertTrue(compare);
    }
}
