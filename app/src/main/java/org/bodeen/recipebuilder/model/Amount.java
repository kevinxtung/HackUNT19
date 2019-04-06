package org.bodeen.recipebuilder.model;

import androidx.room.ColumnInfo;

public class Amount {

    @ColumnInfo(name = "quantity")
    private double quantity;

    @ColumnInfo(name = "measure_unit")
    private String measureUnit;

    @ColumnInfo(name = "gram_weight")
    private double gramWeight;

    public String getMeasureUnit() {
        return measureUnit;
    }

    public void setMeasureUnit(String measureUnit) {
        this.measureUnit = measureUnit;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getGramWeight() {
        return gramWeight;
    }

    public void setGramWeight(double gramWeight) {
        this.gramWeight = gramWeight;
    }
}
