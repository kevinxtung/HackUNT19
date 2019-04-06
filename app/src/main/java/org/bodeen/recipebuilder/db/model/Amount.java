package org.bodeen.recipebuilder.db.model;

public class Amount {

    private double quantity;
    private String unit;
    private double gramWeight;

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getGramWeight() {
        return gramWeight;
    }

    public void setGramWeight(double gramWeight) {
        this.gramWeight = gramWeight;
    }
}
