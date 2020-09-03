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

    @Test
    public void given2InchAnd2Inch_WhenAdded_ShouldReturn4Inch() {
        QuantityUnits quantityUnits = new QuantityUnits(UnitConverter.inch.getUnit(), 2);
        QuantityUnits quantityUnits1 = new QuantityUnits(UnitConverter.inch.getUnit(), 2);
        double add = QuantityUnits.add(quantityUnits, quantityUnits1);
        Assert.assertEquals(add, 4, 0.0);
    }

    @Test
    public void given1FeetAnd2Inch_WhenAdded_ShouldReturn14Inch() {
        QuantityUnits quantityUnits = new QuantityUnits(UnitConverter.feet.getUnit(), 1);
        QuantityUnits quantityUnits1 = new QuantityUnits(UnitConverter.inch.getUnit(), 2);
        double add = QuantityUnits.add(quantityUnits, quantityUnits1);
        Assert.assertEquals(add, 14, 0.0);
    }

    @Test
    public void given1FeetAnd1Feet_WhenAdded_ShouldReturn24Inch() {
        QuantityUnits quantityUnits = new QuantityUnits(UnitConverter.feet.getUnit(), 1);
        QuantityUnits quantityUnits1 = new QuantityUnits(UnitConverter.feet.getUnit(), 1);
        double add = QuantityUnits.add(quantityUnits, quantityUnits1);
        Assert.assertEquals(add, 24, 0.0);
    }

    @Test
    public void given2InchAnd2point5CM_WhenAdded_ShouldReturn3Inch() {
        QuantityUnits quantityUnits = new QuantityUnits(UnitConverter.inch.getUnit(), 2);
        QuantityUnits quantityUnits1 = new QuantityUnits(UnitConverter.cm.getUnit(), 2.5);
        double add = QuantityUnits.add(quantityUnits, quantityUnits1);
        Assert.assertEquals(add, 3, 0.0);
    }

    @Test
    public void given1GallonAnd3point78Liter_WhenEqual_ShouldReturnEqual() {
        QuantityUnits quantityUnits = new QuantityUnits(UnitConverter.gallon.getUnit(), 1);
        QuantityUnits quantityUnits1 = new QuantityUnits(UnitConverter.liter.getUnit(), 3.78);
        Assert.assertEquals(quantityUnits, quantityUnits1);
    }

    @Test
    public void given1LiterAnd1000Ml_WhenEqual_ShouldReturnEqual() {
        QuantityUnits quantityUnits = new QuantityUnits(UnitConverter.liter.getUnit(), 1);
        QuantityUnits quantityUnits1 = new QuantityUnits(UnitConverter.ml.getUnit(), 1000);
        Assert.assertEquals(quantityUnits, quantityUnits1);
    }

    @Test
    public void given1GallonAnd3point78Liters_WhenAdded_ShouldReturn7point57Liters() {
        QuantityUnits quantityUnits = new QuantityUnits(UnitConverter.gallon.getUnit(), 1);
        QuantityUnits quantityUnits1 = new QuantityUnits(UnitConverter.liter.getUnit(), 3.78);
        double add = QuantityUnits.add(quantityUnits, quantityUnits1);
        Assert.assertEquals(7.57, add, 0.0);
    }

    @Test
    public void given1kgAnd1000grams_WhenCompare_ShouldReturnEqual() {
        QuantityUnits quantityUnits = new QuantityUnits(UnitConverter.kg.getUnit(), 1);
        QuantityUnits quantityUnits1 = new QuantityUnits(UnitConverter.gram.getUnit(), 1000);
        Assert.assertEquals(quantityUnits, quantityUnits1);
    }

    @Test
    public void given1TonneAnd1000Kgs_WhenCompare_ShouldReturnEqual() {
        QuantityUnits quantityUnits = new QuantityUnits(UnitConverter.tonne.getUnit(), 1);
        QuantityUnits quantityUnits1 = new QuantityUnits(UnitConverter.kg.getUnit(), 1000);
        Assert.assertEquals(quantityUnits, quantityUnits1);
    }
    @Test
    public void given1TonneAnd1000grams_WhenAdded_ShouldReturn1001Kg() {
        QuantityUnits quantityUnits = new QuantityUnits(UnitConverter.tonne.getUnit(), 1);
        QuantityUnits quantityUnits1 = new QuantityUnits(UnitConverter.gram.getUnit(), 1000);
        double add = QuantityUnits.add(quantityUnits, quantityUnits1);
        Assert.assertEquals(1001,add,0.0);
    }


}
