package org.bodeen.recipebuilder.model;

public class Amount {

    private double quantity;
    private String measureUnit;
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
