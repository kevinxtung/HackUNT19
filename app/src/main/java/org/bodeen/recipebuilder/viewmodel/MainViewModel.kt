package org.bodeen.recipebuilder.viewmodel

import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import kotlinx.coroutines.*
import kotlinx.coroutines.android.Main
import org.bodeen.recipebuilder.RecipeApp
import org.bodeen.recipebuilder.db.RecipeDatabase
import org.bodeen.recipebuilder.db.model.entity.Recipe
import org.bodeen.recipebuilder.repo.RecipeRepository
import kotlin.coroutines.CoroutineContext

class MainViewModel(app: RecipeApp) : AndroidViewModel(app) {

    private var parentJob = Job()
    private val coroutineContext: CoroutineContext
        get() = parentJob + Dispatchers.Main

    private val scope = CoroutineScope(coroutineContext)

    private val recipeRepository: RecipeRepository
    val allRecipes: LiveData<List<Recipe>>

    init {
        val recipeDao = RecipeDatabase.getDatabase(app).recipeDao()
        recipeRepository = RecipeRepository(recipeDao)
        allRecipes = recipeRepository.allRecipes
    }

    fun insert(recipe: Recipe) = scope.launch(Dispatchers.IO) {
        recipeRepository.insert(recipe)
    }

    override fun onCleared() {
        super.onCleared()
        parentJob.cancel()
    }
}