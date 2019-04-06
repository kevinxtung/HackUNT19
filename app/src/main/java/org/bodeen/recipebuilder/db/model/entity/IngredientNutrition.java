package org.bodeen.recipebuilder.db.model.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
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
public class IngredientNutrition {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "ingredient_id")
    private int ingredientId;

    @ColumnInfo(name = "nutrient_id")
    private int nutritientId;

    @ColumnInfo(name = "amount")
    private Amount amount;
}
