package com.bridglabz;

public class QuantityUnits {

    private final double quantity;

    public QuantityUnits(double conversionType, double quantity) {
        this.quantity = conversionType * quantity;
    }
    public static double add(QuantityUnits quantityUnits,QuantityUnits quantityUnits1){
        return quantityUnits.quantity+quantityUnits1.quantity;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityUnits that = (QuantityUnits) o;
        return Double.compare(that.quantity, quantity) == 0;
    }
}
