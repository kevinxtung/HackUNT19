package org.bodeen.recipebuilder.repo

import androidx.lifecycle.LiveData
import org.bodeen.recipebuilder.api.USDAService
import org.bodeen.recipebuilder.db.dao.RecipeDao
import org.bodeen.recipebuilder.db.model.IngredientAmount
import org.bodeen.recipebuilder.db.model.entity.Recipe

class RecipeRepository(private val recipeDao: RecipeDao, private val service: USDAService) {

    val allRecipes: LiveData<List<Recipe>> = recipeDao.getAllRecipes()

    fun insert(recipe: Recipe, amounts: List<IngredientAmount>) {
        recipeDao.insert(recipe)
        amounts.forEach {

        }
    }
}