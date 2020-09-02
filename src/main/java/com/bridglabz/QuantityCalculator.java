package com.bridglabz;

public class QuantityCalculator {

    private final double quantity;

    public QuantityCalculator(double conversionType, double quantity) {
        this.quantity = conversionType * quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityCalculator that = (QuantityCalculator) o;
        return Double.compare(that.quantity, quantity) == 0;
    }
}
