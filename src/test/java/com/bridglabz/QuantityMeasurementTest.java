package com.bridglabz;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
    @Test
    public void given0FeetAnd0FeetLength_whenEqual_ShouldReturnEqual() {
        QuantityUnits unit1 = new QuantityUnits(UnitConverter.feet.getUnit(), 0);
        QuantityUnits unit2 = new QuantityUnits(UnitConverter.feet.getUnit(), 0);
        Assert.assertEquals(unit1, unit2);
    }

    @Test
    public void given0FeetAnd1FeetLength_whenNotEqual_ShouldReturnNotEqual() {
        QuantityUnits unit1= new QuantityUnits(UnitConverter.feet.getUnit(), 0);
        QuantityUnits unit2 = new QuantityUnits(UnitConverter.feet.getUnit(), 1);
        Assert.assertNotEquals(unit1, unit2);
    }

    @Test
    public void givenFeet_whenNullFeet_ShouldNotEqual() {
        QuantityUnits unit1 = null;
        QuantityUnits unit2 = new QuantityUnits(UnitConverter.feet.getUnit(), 1);
        Assert.assertNotEquals(unit1, unit2);
    }

    @Test
    public void givenFeet_whenCheckRefFeet_ShouldReturnEqual() {
        QuantityUnits unit1 = new QuantityUnits(UnitConverter.feet.getUnit(), 1);
        QuantityUnits unit2 = new QuantityUnits(UnitConverter.feet.getUnit(), 1);
        Assert.assertEquals(unit1, unit2);
    }

    @Test
    public void givenFeet_whenCheckTypeOfFeet_ShouldReturnEqual() {
        QuantityUnits unit1 = new QuantityUnits(UnitConverter.feet.getUnit(), 1);
        QuantityUnits unit2 = new QuantityUnits(UnitConverter.feet.getUnit(), 1);
        Assert.assertEquals(unit1, unit2);
    }

    @Test
    public void given_whenFeetCheckSameFeet_ShouldReturnEqual() {
        QuantityUnits unit1 = new QuantityUnits(UnitConverter.feet.getUnit(), 1);
        QuantityUnits unit2 = new QuantityUnits(UnitConverter.feet.getUnit(), 1);
        Assert.assertEquals(unit1, unit2);
    }

    @Test
    public void given0InchAnd0InchLength_whenEqual_ShouldReturnEqual() {
        QuantityUnits unit1 = new QuantityUnits(UnitConverter.inch.getUnit(), 0);
        QuantityUnits unit2 = new QuantityUnits(UnitConverter.inch.getUnit(), 0);
        Assert.assertEquals(unit1, unit2);
    }

    @Test
    public void given0InchAnd1InchLength_whenNotEqual_ShouldReturnNotEqual() {
        QuantityUnits unit1 = new QuantityUnits(UnitConverter.inch.getUnit(), 0);
        QuantityUnits unit2 = new QuantityUnits(UnitConverter.inch.getUnit(), 1);
        Assert.assertNotEquals(unit1, unit2);
    }

    @Test
    public void givenInch_whenNullInch_ShouldReturnNotEqual() {
        QuantityUnits unit1 = null;
        QuantityUnits unit2 = new QuantityUnits(UnitConverter.inch.getUnit(), 1);
        Assert.assertNotEquals(unit1, unit2);
    }

    @Test
    public void givenInch_whenCheckRefInch_ShouldReturnEqual() {
        QuantityUnits unit1 = new QuantityUnits(UnitConverter.inch.getUnit(), 1);
        QuantityUnits unit2 = new QuantityUnits(UnitConverter.inch.getUnit(), 1);
        Assert.assertEquals(unit1, unit2);
    }

    @Test
    public void givenInch_whenCheckType_ShouldReturnEqual() {
        QuantityUnits unit1 = new QuantityUnits(UnitConverter.inch.getUnit(), 1);
        QuantityUnits unit2 = new QuantityUnits(UnitConverter.inch.getUnit(), 1);
        Assert.assertEquals(unit1, unit2);
    }

    @Test
    public void givenInch_whenCheckSameInch_ShouldReturnEqual() {
        QuantityUnits unit1 = new QuantityUnits(UnitConverter.inch.getUnit(), 1);
        QuantityUnits unit2 = new QuantityUnits(UnitConverter.inch.getUnit(), 1);
        Assert.assertEquals(unit1, unit2);
    }

    @Test
    public void given1FeetAnd12InchesLength_whenCompareEqual_ShouldReturnEqual() {
        QuantityUnits unit1 = new QuantityUnits(UnitConverter.feet.getUnit(), 1);
        QuantityUnits unit2 = new QuantityUnits(UnitConverter.inch.getUnit(), 12);
        Assert.assertEquals(unit1, unit2);
    }

    @Test
    public void given3FeetAnd1YardLength_whenCompareEqual_ShouldReturnEqual() {
        QuantityUnits unit1 = new QuantityUnits(UnitConverter.feet.getUnit(), 3);
        QuantityUnits unit2 = new QuantityUnits(UnitConverter.yard.getUnit(), 1);
        Assert.assertEquals(unit1, unit2);
    }

    @Test
    public void given1FeetAnd1YardLength_whenCompareNotEqual_ShouldReturnNotEqual() {
        QuantityUnits unit1 = new QuantityUnits(UnitConverter.feet.getUnit(), 1);
        QuantityUnits unit2 = new QuantityUnits(UnitConverter.yard.getUnit(), 1);
        Assert.assertNotEquals(unit1, unit2);
    }

    @Test
    public void given1InchAnd1YardLength_whenCompareNotEqual_ShouldReturnNotEqual() {
        QuantityUnits unit1 = new QuantityUnits(UnitConverter.inch.getUnit(), 1);
        QuantityUnits unit2 = new QuantityUnits(UnitConverter.yard.getUnit(), 1);
        Assert.assertNotEquals(unit1, unit2);
    }

    @Test
    public void given1yardAnd36InchLength_whenCompareEqual_ShouldReturnEqual() {
        QuantityUnits unit1 = new QuantityUnits(UnitConverter.yard.getUnit(), 1);
        QuantityUnits unit2 = new QuantityUnits(UnitConverter.inch.getUnit(), 36);
        Assert.assertEquals(unit1, unit2);
    }

    @Test
    public void given36InchAnd1YardLength_whenCompareEqual_ShouldReturnEqual() {
        QuantityUnits unit1 = new QuantityUnits(UnitConverter.inch.getUnit(), 36);
        QuantityUnits unit2 = new QuantityUnits(UnitConverter.yard.getUnit(), 1);
        Assert.assertEquals(unit1, unit2);
    }

    @Test
    public void given1YardAnd3FeetLength_whenCompareEqual_ShouldReturnEqual() {
        QuantityUnits unit1 = new QuantityUnits(UnitConverter.yard.getUnit(), 1);
        QuantityUnits unit2 = new QuantityUnits(UnitConverter.feet.getUnit(), 3);
        Assert.assertEquals(unit2, unit2);
    }

    @Test
    public void given2InchAnd5cmLength_whenCompareEqual_ShouldReturnEqual() {
        QuantityUnits unit1 = new QuantityUnits(UnitConverter.inch.getUnit(), 2);
        QuantityUnits unit2 = new QuantityUnits(UnitConverter.cm.getUnit(), 5);
        Assert.assertEquals(unit1, unit2);
    }

    @Test
    public void given2InchAnd2Inch_WhenAdded_ShouldReturn4Inch() {
        QuantityUnits unit1 = new QuantityUnits(UnitConverter.inch.getUnit(), 2);
        QuantityUnits unit2 = new QuantityUnits(UnitConverter.inch.getUnit(), 2);
        double add = QuantityUnits.add(unit1, unit2);
        Assert.assertEquals(add, 4, 0.0);
    }

    @Test
    public void given1FeetAnd2Inch_WhenAdded_ShouldReturn14Inch() {
        QuantityUnits unit1 = new QuantityUnits(UnitConverter.feet.getUnit(), 1);
        QuantityUnits unit2 = new QuantityUnits(UnitConverter.inch.getUnit(), 2);
        double add = QuantityUnits.add(unit1, unit2);
        Assert.assertEquals(add, 14, 0.0);
    }

    @Test
    public void given1FeetAnd1Feet_WhenAdded_ShouldReturn24Inch() {
        QuantityUnits unit1 = new QuantityUnits(UnitConverter.feet.getUnit(), 1);
        QuantityUnits unit2 = new QuantityUnits(UnitConverter.feet.getUnit(), 1);
        double add = QuantityUnits.add(unit1, unit2);
        Assert.assertEquals(add, 24, 0.0);
    }

    @Test
    public void given2InchAnd2point5CM_WhenAdded_ShouldReturn3Inch() {
        QuantityUnits unit1 = new QuantityUnits(UnitConverter.inch.getUnit(), 2);
        QuantityUnits unit2 = new QuantityUnits(UnitConverter.cm.getUnit(), 2.5);
        double add = QuantityUnits.add(unit1, unit2);
        Assert.assertEquals(add, 3, 0.0);
    }

    @Test
    public void given1GallonAnd3point78Liter_WhenEqual_ShouldReturnEqual() {
        QuantityUnits unit1 = new QuantityUnits(UnitConverter.gallon.getUnit(), 1);
        QuantityUnits unit2 = new QuantityUnits(UnitConverter.liter.getUnit(), 3.78);
        Assert.assertEquals(unit1, unit2);
    }

    @Test
    public void given1LiterAnd1000Ml_WhenEqual_ShouldReturnEqual() {
        QuantityUnits unit1 = new QuantityUnits(UnitConverter.liter.getUnit(), 1);
        QuantityUnits unit2 = new QuantityUnits(UnitConverter.ml.getUnit(), 1000);
        Assert.assertEquals(unit1, unit2);
    }

    @Test
    public void given1GallonAnd3point78Liters_WhenAdded_ShouldReturn7point57Liters() {
        QuantityUnits unit1 = new QuantityUnits(UnitConverter.gallon.getUnit(), 1);
        QuantityUnits unit2 = new QuantityUnits(UnitConverter.liter.getUnit(), 3.78);
        double add = QuantityUnits.add(unit1, unit2);
        Assert.assertEquals(7.57, add, 0.1);
    }

    @Test
    public void given1kgAnd1000grams_WhenCompare_ShouldReturnEqual() {
        QuantityUnits unit1 = new QuantityUnits(UnitConverter.kg.getUnit(), 1);
        QuantityUnits unit2 = new QuantityUnits(UnitConverter.gram.getUnit(), 1000);
        Assert.assertEquals(unit1, unit2);
    }

    @Test
    public void given1TonneAnd1000Kgs_WhenCompare_ShouldReturnEqual() {
        QuantityUnits unit1 = new QuantityUnits(UnitConverter.tonne.getUnit(), 1);
        QuantityUnits unit2 = new QuantityUnits(UnitConverter.kg.getUnit(), 1000);
        Assert.assertEquals(unit1, unit2);
    }

    @Test
    public void given1TonneAnd1000grams_WhenAdded_ShouldReturn1001Kg() {
        QuantityUnits unit1 = new QuantityUnits(UnitConverter.tonne.getUnit(), 1);
        QuantityUnits unit2 = new QuantityUnits(UnitConverter.gram.getUnit(), 1000);
        double add = QuantityUnits.add(unit1, unit2);
        Assert.assertEquals(1001, add, 0.0);
    }

    @Test
    public void given212FahrenheitAnd100Celsius_WhenCompare_ShouldReturnEqual() {
        double temperature = QuantityUnits.temperatureConversion(100);
        QuantityUnits unit1 = new QuantityUnits(UnitConverter.celsius.getUnit(), temperature);
        QuantityUnits unit2 = new QuantityUnits(UnitConverter.fahrenheit.getUnit(), 212);
        Assert.assertEquals(unit1, unit2);
    }

    @Test
    public void given212FahrenheitAnd100Celsius_WhenCompare_ShouldReturnNotEqual() {
        double temperature = QuantityUnits.temperatureConversion(100);
        QuantityUnits unit1 = new QuantityUnits(UnitConverter.gram.getUnit(), temperature);
        QuantityUnits unit2 = new QuantityUnits(UnitConverter.fahrenheit.getUnit(), 212);
        Assert.assertNotEquals(unit1, unit2);
    }

    @Test
    public void givenNegativeFeetAnd0FeetLength_whenEqual_ShouldReturnEqual() {
        QuantityUnits unit1 = new QuantityUnits(UnitConverter.feet.getUnit(), -9);
        QuantityUnits unit2 = new QuantityUnits(UnitConverter.feet.getUnit(), 0);
        Assert.assertEquals(unit1, unit2);
    }

}
