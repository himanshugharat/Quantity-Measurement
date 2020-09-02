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
    public void given0FeetAnd0FeetLength_whenEqual_ShouldReturnTrue() {
        Feet feet = new Feet(0.0);
        Feet feet1 = new Feet(0.0);
        Assert.assertEquals(feet,feet1);
    }
    @Test
    public void given0FeetAnd1FeetLength_whenNotEqual_ShouldReturnFalse() {
        Feet feet = new Feet(0.0);
        Feet feet1 = new Feet(1.0);
        Assert.assertNotEquals(feet,feet1);
    }

    @Test
    public void givenLength_whenNullFeet_ShouldReturnFalse() {
        quantityCalculator = new QuantityCalculator();
        Feet feet = null;
        boolean compare = quantityCalculator.compareLengths(feet, new Feet(0));
        Assert.assertFalse(compare);
    }

    @Test
    public void givenLength_whenCheckRefFeet_ShouldReturnTrue() {
        quantityCalculator = new QuantityCalculator();
        Feet feet = new Feet(0);
        boolean compare = quantityCalculator.compareLengths(feet, feet);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenLength_whenCheckTypeOfFeet_ShouldReturnTrue() {
        quantityCalculator = new QuantityCalculator();
        boolean compare = quantityCalculator.compareLengths(new Feet(0), new Feet(0));
        Assert.assertTrue(compare);
    }

    @Test
    public void givenLength_whenCheckSameFeet_ShouldReturnTrue() {
        quantityCalculator = new QuantityCalculator();
        boolean compare = quantityCalculator.compareLengths(new Feet(10), new Feet(10));
        Assert.assertTrue(compare);
    }
    @Test
    public void given0InchAnd0InchLength_whenEqual_ShouldReturnTrue() {
        Inch inch = new Inch(0.0);
        Inch inch1 = new Inch(0.0);
        Assert.assertEquals(inch,inch1);
    }
    @Test
    public void given0InchAnd1InchLength_whenNotEqual_ShouldReturnFalse() {
        Inch inch = new Inch(0.0);
        Inch inch1 = new Inch(1.0);
        Assert.assertNotEquals(inch,inch1);
    }

    @Test
    public void givenLength_whenNullInch_ShouldReturnFalse() {
        quantityCalculator = new QuantityCalculator();
        Inch inch = null;
        boolean compare = quantityCalculator.compareLengths(inch, new Inch(0));
        Assert.assertFalse(compare);
    }

    @Test
    public void givenLength_whenCheckRefInch_ShouldReturnTrue() {
        quantityCalculator = new QuantityCalculator();
        Inch inch = new Inch(0);
        boolean compare = quantityCalculator.compareLengths(inch, inch);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenLength_whenCheckType_ShouldReturnTrue() {
        quantityCalculator = new QuantityCalculator();
        boolean compare = quantityCalculator.compareLengths(new Inch(0), new Inch(0));
        Assert.assertTrue(compare);
    }

    @Test
    public void givenLength_whenCheckSameInch_ShouldReturnTrue() {
        quantityCalculator = new QuantityCalculator();
        boolean compare = quantityCalculator.compareLengths(new Inch(10), new Inch(10));
        Assert.assertTrue(compare);
    }

    @Test
    public void given1FeetAnd12InchesLength_whenCompareEqual_ShouldReturnTrue() {
        quantityCalculator = new QuantityCalculator();
        boolean compare = quantityCalculator.compareLengths(new Feet(1), new Inch(12));
        Assert.assertTrue(compare);
    }

    @Test
    public void given1FeetAnd12InchesLength_whenCompareEqual_ShouldReturnFalse() {
        quantityCalculator = new QuantityCalculator();
        boolean compare = quantityCalculator.compareLengths(new Feet(12), new Inch(12));
        Assert.assertFalse(compare);
    }

    @Test
    public void given3FeetAnd1YardLength_whenCompareEqual_ShouldReturnTrue() {
        quantityCalculator = new QuantityCalculator();
        boolean compare = quantityCalculator.compareLengths(new Feet(3), new Yard(1));
        Assert.assertTrue(compare);
    }

    @Test
    public void given1FeetAnd1YardLength_whenCompareNotEqual_ShouldReturnFalse() {
        quantityCalculator = new QuantityCalculator();
        boolean compare = quantityCalculator.compareLengths(new Feet(1), new Yard(1));
        Assert.assertFalse(compare);
    }

    @Test
    public void given1InchAnd1YardLength_whenCompareNotEqual_ShouldReturnFalse() {
        quantityCalculator = new QuantityCalculator();
        boolean compare = quantityCalculator.compareLengths(new Inch(1), new Yard(1));
        Assert.assertFalse(compare);
    }

    @Test
    public void given1yardAnd36InchLength_whenCompareEqual_ShouldReturnTrue() {
        quantityCalculator = new QuantityCalculator();
        boolean compare = quantityCalculator.compareLengths(new Yard(1), new Inch(36));
        Assert.assertTrue(compare);
    }

    @Test
    public void given36InchAnd1YardLength_whenCompareEqual_ShouldReturnTrue() {
        quantityCalculator = new QuantityCalculator();
        boolean compare = quantityCalculator.compareLengths(new Inch(36), new Yard(1));
        Assert.assertTrue(compare);
    }

    @Test
    public void given1YardAnd3FeetLength_whenCompareEqual_ShouldReturnTrue() {
        quantityCalculator = new QuantityCalculator();
        boolean compare = quantityCalculator.compareLengths(new Yard(1), new Inch(36));
        Assert.assertTrue(compare);
    }


}
