package com.bridglabz;

import org.junit.Assert;
import org.junit.Test;

public class MeasurementTest {
    QuantityCalculator quantityCalculator = null;


    @Test
    public void given0FeetAnd0FeetLength_whenEqual_ShouldReturnEqual() {
        QuantityCalculator quantityCalculator = new QuantityCalculator(UnitConverter.feet.getUnit(), 0);
        QuantityCalculator quantityCalculator1 = new QuantityCalculator(UnitConverter.feet.getUnit(), 0);
        Assert.assertEquals(quantityCalculator, quantityCalculator1);
    }

    @Test
    public void given0FeetAnd1FeetLength_whenNotEqual_ShouldReturnNotEqual() {
        QuantityCalculator quantityCalculator = new QuantityCalculator(UnitConverter.feet.getUnit(), 0);
        QuantityCalculator quantityCalculator1 = new QuantityCalculator(UnitConverter.feet.getUnit(), 1);
        Assert.assertNotEquals(quantityCalculator, quantityCalculator1);
    }

    @Test
    public void givenFeet_whenNullFeet_ShouldNotEqual() {
        QuantityCalculator quantityCalculator = null;
        QuantityCalculator quantityCalculator1 = new QuantityCalculator(UnitConverter.feet.getUnit(), 1);
        Assert.assertNotEquals(quantityCalculator, quantityCalculator1);
    }

    @Test
    public void givenFeet_whenCheckRefFeet_ShouldReturnEqual() {
        QuantityCalculator quantityCalculator = new QuantityCalculator(UnitConverter.feet.getUnit(), 1);
        QuantityCalculator quantityCalculator1 = new QuantityCalculator(UnitConverter.feet.getUnit(), 1);
        Assert.assertEquals(quantityCalculator, quantityCalculator1);
    }

    @Test
    public void givenFeet_whenCheckTypeOfFeet_ShouldReturnEqual() {
        QuantityCalculator quantityCalculator = new QuantityCalculator(UnitConverter.feet.getUnit(), 1);
        QuantityCalculator quantityCalculator1 = new QuantityCalculator(UnitConverter.feet.getUnit(), 1);
        Assert.assertEquals(quantityCalculator, quantityCalculator1);
    }

    @Test
    public void given_whenFeetCheckSameFeet_ShouldReturnEqual() {
        QuantityCalculator quantityCalculator = new QuantityCalculator(UnitConverter.feet.getUnit(), 1);
        QuantityCalculator quantityCalculator1 = new QuantityCalculator(UnitConverter.feet.getUnit(), 1);
        Assert.assertEquals(quantityCalculator, quantityCalculator1);
    }

    @Test
    public void given0InchAnd0InchLength_whenEqual_ShouldReturnEqual() {
        QuantityCalculator quantityCalculator = new QuantityCalculator(UnitConverter.inch.getUnit(), 0);
        QuantityCalculator quantityCalculator1 = new QuantityCalculator(UnitConverter.inch.getUnit(), 0);
        Assert.assertEquals(quantityCalculator, quantityCalculator1);
    }

    @Test
    public void given0InchAnd1InchLength_whenNotEqual_ShouldReturnNotEqual() {
        QuantityCalculator quantityCalculator = new QuantityCalculator(UnitConverter.inch.getUnit(), 0);
        QuantityCalculator quantityCalculator1 = new QuantityCalculator(UnitConverter.inch.getUnit(), 1);
        Assert.assertNotEquals(quantityCalculator, quantityCalculator1);
    }

    @Test
    public void givenInch_whenNullInch_ShouldReturnNotEqual() {
        QuantityCalculator quantityCalculator = null;
        QuantityCalculator quantityCalculator1 = new QuantityCalculator(UnitConverter.inch.getUnit(), 1);
        Assert.assertNotEquals(quantityCalculator, quantityCalculator1);
    }

    @Test
    public void givenInch_whenCheckRefInch_ShouldReturnEqual() {
        QuantityCalculator quantityCalculator = new QuantityCalculator(UnitConverter.inch.getUnit(), 1);
        QuantityCalculator quantityCalculator1 = new QuantityCalculator(UnitConverter.inch.getUnit(), 1);
        Assert.assertEquals(quantityCalculator, quantityCalculator1);
    }

    @Test
    public void givenInch_whenCheckType_ShouldReturnEqual() {
        QuantityCalculator quantityCalculator = new QuantityCalculator(UnitConverter.inch.getUnit(), 1);
        QuantityCalculator quantityCalculator1 = new QuantityCalculator(UnitConverter.inch.getUnit(), 1);
        Assert.assertEquals(quantityCalculator, quantityCalculator1);
    }

    @Test
    public void givenInch_whenCheckSameInch_ShouldReturnEqual() {
        QuantityCalculator quantityCalculator = new QuantityCalculator(UnitConverter.inch.getUnit(), 1);
        QuantityCalculator quantityCalculator1 = new QuantityCalculator(UnitConverter.inch.getUnit(), 1);
        Assert.assertEquals(quantityCalculator, quantityCalculator1);
    }

    @Test
    public void given1FeetAnd12InchesLength_whenCompareEqual_ShouldReturnEqual() {
        QuantityCalculator quantityCalculator = new QuantityCalculator(UnitConverter.feet.getUnit(), 1);
        QuantityCalculator quantityCalculator1 = new QuantityCalculator(UnitConverter.inch.getUnit(), 12);
        Assert.assertEquals(quantityCalculator, quantityCalculator1);
    }

    @Test
    public void given3FeetAnd1YardLength_whenCompareEqual_ShouldReturnEqual() {
        QuantityCalculator quantityCalculator = new QuantityCalculator(UnitConverter.feet.getUnit(), 3);
        QuantityCalculator quantityCalculator1 = new QuantityCalculator(UnitConverter.yard.getUnit(), 1);
        Assert.assertEquals(quantityCalculator, quantityCalculator1);
    }

    @Test
    public void given1FeetAnd1YardLength_whenCompareNotEqual_ShouldReturnNotEqual() {
        QuantityCalculator quantityCalculator = new QuantityCalculator(UnitConverter.feet.getUnit(), 1);
        QuantityCalculator quantityCalculator1 = new QuantityCalculator(UnitConverter.yard.getUnit(), 1);
        Assert.assertNotEquals(quantityCalculator, quantityCalculator1);
    }

    @Test
    public void given1InchAnd1YardLength_whenCompareNotEqual_ShouldReturnNotEqual() {
        QuantityCalculator quantityCalculator = new QuantityCalculator(UnitConverter.inch.getUnit(), 1);
        QuantityCalculator quantityCalculator1 = new QuantityCalculator(UnitConverter.yard.getUnit(), 1);
        Assert.assertNotEquals(quantityCalculator, quantityCalculator1);
    }

    @Test
    public void given1yardAnd36InchLength_whenCompareEqual_ShouldReturnEqual() {
        QuantityCalculator quantityCalculator = new QuantityCalculator(UnitConverter.yard.getUnit(), 1);
        QuantityCalculator quantityCalculator1 = new QuantityCalculator(UnitConverter.inch.getUnit(), 36);
        Assert.assertEquals(quantityCalculator, quantityCalculator1);
    }

    @Test
    public void given36InchAnd1YardLength_whenCompareEqual_ShouldReturnEqual() {
        QuantityCalculator quantityCalculator = new QuantityCalculator(UnitConverter.inch.getUnit(), 36);
        QuantityCalculator quantityCalculator1 = new QuantityCalculator(UnitConverter.yard.getUnit(), 1);
        Assert.assertEquals(quantityCalculator, quantityCalculator1);
    }

    @Test
    public void given1YardAnd3FeetLength_whenCompareEqual_ShouldReturnTrue() {
        QuantityCalculator quantityCalculator = new QuantityCalculator(UnitConverter.yard.getUnit(), 1);
        QuantityCalculator quantityCalculator1 = new QuantityCalculator(UnitConverter.feet.getUnit(), 3);
        Assert.assertEquals(quantityCalculator, quantityCalculator1);
    }
}
