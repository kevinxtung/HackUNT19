package org.bodeen.recipebuilder.db.model;

import org.bodeen.recipebuilder.db.model.entity.Ingredient;

public class IngredientAmount {

    private Ingredient ingredient;
    private Amount amount;

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }
}
