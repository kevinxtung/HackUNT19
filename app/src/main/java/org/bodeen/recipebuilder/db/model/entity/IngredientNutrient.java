package org.bodeen.recipebuilder.db.model.entity;

import androidx.room.*;
import org.bodeen.recipebuilder.db.model.Amount;

@Entity(
        foreignKeys = {
                @ForeignKey(
                        entity = Ingredient.class,
                        parentColumns = "ingredient_id",
                        childColumns = "ingredient_id"
                ),
                @ForeignKey(
                        entity = Nutrient.class,
                        parentColumns = "nutrient_id",
                        childColumns = "nutrient_id"
                )
        }, tableName = "ingredient_nutrient_table"
)
public class IngredientNutrient {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "ingredient_id")
    private int ingredientId;

    @ColumnInfo(name = "nutrient_id")
    private int nutritientId;

    @Embedded
    private Amount amount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(int ingredientId) {
        this.ingredientId = ingredientId;
    }

    public int getNutritientId() {
        return nutritientId;
    }

    public void setNutritientId(int nutritientId) {
        this.nutritientId = nutritientId;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }
}
