package org.bodeen.recipebuilder.repo

import androidx.lifecycle.LiveData
import org.bodeen.recipebuilder.api.USDAService
import org.bodeen.recipebuilder.api.model.foodreport.FoodReportJSONObject
import org.bodeen.recipebuilder.db.dao.RecipeDao
import org.bodeen.recipebuilder.db.model.IngredientAmount
import org.bodeen.recipebuilder.db.model.entity.Ingredient
import org.bodeen.recipebuilder.db.model.entity.Recipe
import org.bodeen.recipebuilder.db.model.entity.RecipeIngredient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import timber.log.Timber

class RecipeRepository(private val recipeDao: RecipeDao) {

    val allRecipes: LiveData<List<Recipe>> = recipeDao.getAllRecipes()

    fun insert(recipe: Recipe, amounts: List<IngredientAmount>, service: USDAService) {
        recipeDao.insert(recipe)
        amounts.forEach {
            val call = service.retrieveIngredientReport(it.ingredient.ingredientId)
            call.enqueue(object: Callback<FoodReportJSONObject> {
                override fun onResponse(call: Call<FoodReportJSONObject>?, response: Response<FoodReportJSONObject>?) {
                    val ingredient = Ingredient(response!!.body())
                    recipeDao.insert(ingredient)

                    val ri = RecipeIngredient()
                    ri.recipeId = recipe.recipeId
                    ri.ingredientId = ingredient.ingredientId
                    ri.amount = it.amount
                    recipeDao.insert(ri)
                }

                override fun onFailure(call: Call<FoodReportJSONObject>?, t: Throwable?) {
                    Timber.e(t)
                }
            })
        }
    }
}