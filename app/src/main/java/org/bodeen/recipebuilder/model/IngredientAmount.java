package org.bodeen.recipebuilder.model;

import androidx.room.Embedded;
import org.bodeen.recipebuilder.model.entity.Ingredient;

public class IngredientAmount {

    @Embedded private Ingredient ingredient;
    @Embedded private Amount amount;

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
