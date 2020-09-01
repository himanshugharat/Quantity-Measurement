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
    public void givenLength_whenZeroFeet_ShouldResultTrue() {
        quantityCalculator = new QuantityCalculator();
        boolean compare = quantityCalculator.compareLengths(new Feet(0), new Feet(0));
        Assert.assertTrue(compare);
    }

    @Test
    public void givenLength_whenNullFeet_ShouldReturnFalse() {
        quantityCalculator = new QuantityCalculator();
        Feet feet=null;
        boolean compare = quantityCalculator.compareLengths(feet, new Feet(0));
        Assert.assertFalse(compare);
    }

    @Test
    public void givenLength_whenCheckRefFeet_ShouldReturnTrue() {
        quantityCalculator = new QuantityCalculator();
        Feet feet = new Feet(0);
        boolean compare = quantityCalculator.compareLengths(feet,feet);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenLength_whenCheckTypeOfFeet_ShouldReturnTrue() {
        quantityCalculator = new QuantityCalculator();
        boolean compare = quantityCalculator.compareLengths(new Feet(0),new Feet(0));
        Assert.assertTrue(compare);
    }
    @Test
    public void givenLength_whenCheckSameFeet_ShouldReturnTrue() {
        quantityCalculator = new QuantityCalculator();
        boolean compare = quantityCalculator.compareLengths(new Feet(10),new Feet(10));
        Assert.assertTrue(compare);
    }
    @Test
    public void givenLength_whenNullInch_ShouldReturnFalse() {
        quantityCalculator = new QuantityCalculator();
        Inch inch=null;
        boolean compare = quantityCalculator.compareLengths(inch, new Inch(0));
        Assert.assertFalse(compare);
    }


}
