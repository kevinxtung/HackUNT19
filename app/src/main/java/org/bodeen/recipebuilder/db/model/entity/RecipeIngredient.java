package org.bodeen.recipebuilder.db.model.entity;

import androidx.room.*;
import org.bodeen.recipebuilder.db.model.Amount;

@Entity(
        foreignKeys = {
                @ForeignKey(
                        entity = Recipe.class,
                        parentColumns = "recipe_id",
                        childColumns = "recipe_id"
                ),
                @ForeignKey(
                        entity = Ingredient.class,
                        parentColumns = "ingredient_id",
                        childColumns = "ingredient_id"
                )
        }, tableName = "recipe_ingredient_table"
)
public class RecipeIngredient {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "recipe_id")
    private int recipeId;

    @ColumnInfo(name = "ingredient_id")
    private int ingredientId;

    @Embedded
    private Amount amount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(int recipeId) {
        this.recipeId = recipeId;
    }

    public int getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(int ingredientId) {
        this.ingredientId = ingredientId;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }
}
