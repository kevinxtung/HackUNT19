package org.bodeen.recipebuilder.db.model;

import org.bodeen.recipebuilder.db.model.entity.Nutrient;

public class NutrientAmount {

    private Nutrient nutrient;
    private Amount amount;

    public Nutrient getNutrient() {
        return nutrient;
    }

    public void setNutrient(Nutrient nutrient) {
        this.nutrient = nutrient;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }
}
