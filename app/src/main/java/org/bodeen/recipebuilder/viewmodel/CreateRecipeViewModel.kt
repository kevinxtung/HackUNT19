package org.bodeen.recipebuilder.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import kotlinx.coroutines.*
import kotlinx.coroutines.android.Main
import org.bodeen.recipebuilder.api.USDAService
import org.bodeen.recipebuilder.db.RecipeDatabase
import org.bodeen.recipebuilder.db.model.IngredientAmount
import org.bodeen.recipebuilder.db.model.entity.Recipe
import org.bodeen.recipebuilder.repo.RecipeRepository
import kotlin.coroutines.CoroutineContext

class CreateRecipeViewModel(application: Application) : AndroidViewModel(application) {

    private var parentJob = Job()
    private val coroutineContext: CoroutineContext
        get() = parentJob + Dispatchers.Main

    private val scope = CoroutineScope(coroutineContext)

    private val recipeRepository: RecipeRepository

    init {
        val recipeDao = RecipeDatabase.getDatabase(application).recipeDao()
        recipeRepository = RecipeRepository(recipeDao)
    }

    fun insert(recipe: Recipe, amounts: List<IngredientAmount>, service: USDAService) = scope.launch(Dispatchers.IO) {
        recipeRepository.insert(recipe, amounts, service)
    }

    override fun onCleared() {
        super.onCleared()
        parentJob.cancel()
    }
}