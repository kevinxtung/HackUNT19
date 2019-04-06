package org.bodeen.recipebuilder.repo

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import org.bodeen.recipebuilder.db.dao.IngredientDao

class IngredientRepository(private val ingredientDao: IngredientDao) {

    val allIngredients: LiveData<List<Ingredient>> = ingredientDao.getAllIngredients()

    @WorkerThread
    suspend fun insert(ingredient: Ingredient) {
        ingredientDao.insert(ingredient)
    }
}