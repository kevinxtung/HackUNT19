package org.bodeen.recipebuilder.db.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface NutrientDao {

    @Query("SELECT * FROM nutrient_table")
    fun getAllNutrients(): LiveData<List<Nutrient>>

    @Insert
    fun insert(nutrient: Nutrient)
}