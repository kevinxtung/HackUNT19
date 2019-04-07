package org.bodeen.recipebuilder.db.model.entity;

import androidx.annotation.NonNull;
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
    @NonNull
    private String ingredientId;

    @ColumnInfo(name = "nutrient_id")
    @NonNull
    private String nutritientId;

    @Embedded
    private Amount amount;

    public String getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(String ingredientId) {
        this.ingredientId = ingredientId;
    }

    public String getNutritientId() {
        return nutritientId;
    }

    public void setNutritientId(String nutritientId) {
        this.nutritientId = nutritientId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }
}
