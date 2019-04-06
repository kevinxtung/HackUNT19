package org.bodeen.recipebuilder.db.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface IngredientDao {

    @Query("SELECT * FROM ingredient_table ORDER BY name ASC")
    fun getAllIngredients(): LiveData<List<Ingredient>>

    @Insert
    fun insert(ingredient: Ingredient)
}