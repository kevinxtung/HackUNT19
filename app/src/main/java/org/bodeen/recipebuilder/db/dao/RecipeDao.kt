package org.bodeen.recipebuilder.db.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import org.bodeen.recipebuilder.db.model.IngredientAmount
import org.bodeen.recipebuilder.db.model.NutrientAmount
import org.bodeen.recipebuilder.db.model.entity.Recipe

@Dao
interface RecipeDao {

    @Query("SELECT * FROM recipe_table ORDER BY creation_date DESC")
    fun getAllRecipes(): LiveData<List<Recipe>>

    @Query(
        "SELECT ingredient_table.*, quantity, measure_unit, gram_weight FROM ingredient_table, recipe_ingredient_table " +
        "WHERE recipe_ingredient_table.recipe_id = :recipeId " +
        "AND recipe_ingredient_table.ingredient_id = ingredient_table.ingredient_id"
    )
    fun getIngredientsForRecipe(recipeId: Int): LiveData<List<IngredientAmount>>

    @Query(
        "SELECT nutrient_table.*, quantity, measure_unit, gram_weight FROM nutrient_table, ingredient_nutrient_table " +
        "WHERE ingredient_nutrient_table.ingredient_id = :ingredientId " +
        "AND ingredient_nutrient_table.nutrient_id = nutrient_table.nutrient_id"
    )
    fun getNutrientsForIngredient(ingredientId: Int): LiveData<List<NutrientAmount>>

    @Insert
    fun insert(recipe: Recipe)
}