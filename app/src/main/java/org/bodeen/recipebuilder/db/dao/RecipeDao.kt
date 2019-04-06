package org.bodeen.recipebuilder.db.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface RecipeDao {

    @Query("SELECT * FROM recipe_table ORDER BY date DESC")
    fun getAllRecipes(): LiveData<List<Recipe>>

    @Insert
    fun insert(recipe: Recipe)
}