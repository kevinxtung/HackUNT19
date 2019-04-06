package org.bodeen.recipebuilder.db.model.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
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

    @ColumnInfo(name = "amount")
    private Amount amount;
}
