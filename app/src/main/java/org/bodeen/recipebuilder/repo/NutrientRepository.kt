package org.bodeen.recipebuilder.repo

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import org.bodeen.recipebuilder.db.dao.NutrientDao

class NutrientRepository(private val nutrientDao: NutrientDao) {

    val allNutrients: LiveData<List<Nutrient>> = nutrientDao.getAllNutrients()

    @WorkerThread
    suspend fun insert(nutrient: Nutrient) {
        nutrientDao.insert(nutrient)
    }
}