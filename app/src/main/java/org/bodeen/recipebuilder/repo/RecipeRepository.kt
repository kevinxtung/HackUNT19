package org.bodeen.recipebuilder.repo

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import org.bodeen.recipebuilder.db.dao.RecipeDao
import org.bodeen.recipebuilder.model.entity.Recipe

class RecipeRepository(private val recipeDao: RecipeDao) {

    val allRecipes: LiveData<List<Recipe>> = recipeDao.getAllRecipes()

    @WorkerThread
    suspend fun insert(recipe: Recipe) {
        recipeDao.insert(recipe)
    }
}