package com.bridglabz;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void given0FeetAnd0FeetLength_whenEqual_ShouldReturnEqual() {
        QuantityUnits quantityUnits = new QuantityUnits(UnitConverter.feet.getUnit(), 0);
        QuantityUnits quantityUnits1 = new QuantityUnits(UnitConverter.feet.getUnit(), 0);
        Assert.assertEquals(quantityUnits, quantityUnits1);
    }

    @Test
    public void given0FeetAnd1FeetLength_whenNotEqual_ShouldReturnNotEqual() {
        QuantityUnits quantityUnits = new QuantityUnits(UnitConverter.feet.getUnit(), 0);
        QuantityUnits quantityUnits1 = new QuantityUnits(UnitConverter.feet.getUnit(), 1);
        Assert.assertNotEquals(quantityUnits, quantityUnits1);
    }

    @Test
    public void givenFeet_whenNullFeet_ShouldNotEqual() {
        QuantityUnits quantityUnits = null;
        QuantityUnits quantityUnits1 = new QuantityUnits(UnitConverter.feet.getUnit(), 1);
        Assert.assertNotEquals(quantityUnits, quantityUnits1);
    }

    @Test
    public void givenFeet_whenCheckRefFeet_ShouldReturnEqual() {
        QuantityUnits quantityUnits = new QuantityUnits(UnitConverter.feet.getUnit(), 1);
        QuantityUnits quantityUnits1 = new QuantityUnits(UnitConverter.feet.getUnit(), 1);
        Assert.assertEquals(quantityUnits, quantityUnits1);
    }

    @Test
    public void givenFeet_whenCheckTypeOfFeet_ShouldReturnEqual() {
        QuantityUnits quantityUnits = new QuantityUnits(UnitConverter.feet.getUnit(), 1);
        QuantityUnits quantityUnits1 = new QuantityUnits(UnitConverter.feet.getUnit(), 1);
        Assert.assertEquals(quantityUnits, quantityUnits1);
    }

    @Test
    public void given_whenFeetCheckSameFeet_ShouldReturnEqual() {
        QuantityUnits quantityUnits = new QuantityUnits(UnitConverter.feet.getUnit(), 1);
        QuantityUnits quantityUnits1 = new QuantityUnits(UnitConverter.feet.getUnit(), 1);
        Assert.assertEquals(quantityUnits, quantityUnits1);
    }

    @Test
    public void given0InchAnd0InchLength_whenEqual_ShouldReturnEqual() {
        QuantityUnits quantityUnits = new QuantityUnits(UnitConverter.inch.getUnit(), 0);
        QuantityUnits quantityUnits1 = new QuantityUnits(UnitConverter.inch.getUnit(), 0);
        Assert.assertEquals(quantityUnits, quantityUnits1);
    }

    @Test
    public void given0InchAnd1InchLength_whenNotEqual_ShouldReturnNotEqual() {
        QuantityUnits quantityUnits = new QuantityUnits(UnitConverter.inch.getUnit(), 0);
        QuantityUnits quantityUnits1 = new QuantityUnits(UnitConverter.inch.getUnit(), 1);
        Assert.assertNotEquals(quantityUnits, quantityUnits1);
    }

    @Test
    public void givenInch_whenNullInch_ShouldReturnNotEqual() {
        QuantityUnits quantityUnits = null;
        QuantityUnits quantityUnits1 = new QuantityUnits(UnitConverter.inch.getUnit(), 1);
        Assert.assertNotEquals(quantityUnits, quantityUnits1);
    }

    @Test
    public void givenInch_whenCheckRefInch_ShouldReturnEqual() {
        QuantityUnits quantityUnits = new QuantityUnits(UnitConverter.inch.getUnit(), 1);
        QuantityUnits quantityUnits1 = new QuantityUnits(UnitConverter.inch.getUnit(), 1);
        Assert.assertEquals(quantityUnits, quantityUnits1);
    }

    @Test
    public void givenInch_whenCheckType_ShouldReturnEqual() {
        QuantityUnits quantityUnits = new QuantityUnits(UnitConverter.inch.getUnit(), 1);
        QuantityUnits quantityUnits1 = new QuantityUnits(UnitConverter.inch.getUnit(), 1);
        Assert.assertEquals(quantityUnits, quantityUnits1);
    }

    @Test
    public void givenInch_whenCheckSameInch_ShouldReturnEqual() {
        QuantityUnits quantityUnits = new QuantityUnits(UnitConverter.inch.getUnit(), 1);
        QuantityUnits quantityUnits1 = new QuantityUnits(UnitConverter.inch.getUnit(), 1);
        Assert.assertEquals(quantityUnits, quantityUnits1);
    }

    @Test
    public void given1FeetAnd12InchesLength_whenCompareEqual_ShouldReturnEqual() {
        QuantityUnits quantityUnits = new QuantityUnits(UnitConverter.feet.getUnit(), 1);
        QuantityUnits quantityUnits1 = new QuantityUnits(UnitConverter.inch.getUnit(), 12);
        Assert.assertEquals(quantityUnits, quantityUnits1);
    }

    @Test
    public void given3FeetAnd1YardLength_whenCompareEqual_ShouldReturnEqual() {
        QuantityUnits quantityUnits = new QuantityUnits(UnitConverter.feet.getUnit(), 3);
        QuantityUnits quantityUnits1 = new QuantityUnits(UnitConverter.yard.getUnit(), 1);
        Assert.assertEquals(quantityUnits, quantityUnits1);
    }

    @Test
    public void given1FeetAnd1YardLength_whenCompareNotEqual_ShouldReturnNotEqual() {
        QuantityUnits quantityUnits = new QuantityUnits(UnitConverter.feet.getUnit(), 1);
        QuantityUnits quantityUnits1 = new QuantityUnits(UnitConverter.yard.getUnit(), 1);
        Assert.assertNotEquals(quantityUnits, quantityUnits1);
    }

    @Test
    public void given1InchAnd1YardLength_whenCompareNotEqual_ShouldReturnNotEqual() {
        QuantityUnits quantityUnits = new QuantityUnits(UnitConverter.inch.getUnit(), 1);
        QuantityUnits quantityUnits1 = new QuantityUnits(UnitConverter.yard.getUnit(), 1);
        Assert.assertNotEquals(quantityUnits, quantityUnits1);
    }

    @Test
    public void given1yardAnd36InchLength_whenCompareEqual_ShouldReturnEqual() {
        QuantityUnits quantityUnits = new QuantityUnits(UnitConverter.yard.getUnit(), 1);
        QuantityUnits quantityUnits1 = new QuantityUnits(UnitConverter.inch.getUnit(), 36);
        Assert.assertEquals(quantityUnits, quantityUnits1);
    }

    @Test
    public void given36InchAnd1YardLength_whenCompareEqual_ShouldReturnEqual() {
        QuantityUnits quantityUnits = new QuantityUnits(UnitConverter.inch.getUnit(), 36);
        QuantityUnits quantityUnits1 = new QuantityUnits(UnitConverter.yard.getUnit(), 1);
        Assert.assertEquals(quantityUnits, quantityUnits1);
    }

    @Test
    public void given1YardAnd3FeetLength_whenCompareEqual_ShouldReturnEqual() {
        QuantityUnits quantityUnits = new QuantityUnits(UnitConverter.yard.getUnit(), 1);
        QuantityUnits quantityUnits1 = new QuantityUnits(UnitConverter.feet.getUnit(), 3);
        Assert.assertEquals(quantityUnits, quantityUnits1);
    }
    @Test
    public void given2InchAnd5cmLength_whenCompareEqual_ShouldReturnEqual() {
        QuantityUnits quantityUnits = new QuantityUnits(UnitConverter.inch.getUnit(), 2);
        QuantityUnits quantityUnits1 = new QuantityUnits(UnitConverter.cm.getUnit(), 5);
        Assert.assertEquals(quantityUnits, quantityUnits1);
    }
}
