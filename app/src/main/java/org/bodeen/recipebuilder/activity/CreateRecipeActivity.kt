package org.bodeen.recipebuilder.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_create_recipe.*
import kotlinx.android.synthetic.main.dialog_ingredient_search.view.*
import org.bodeen.recipebuilder.R
import org.bodeen.recipebuilder.adapter.IngredientAdapter
import org.bodeen.recipebuilder.adapter.SearchAdapter
import org.bodeen.recipebuilder.api.ApiClient
import org.bodeen.recipebuilder.api.USDAService
import org.bodeen.recipebuilder.api.model.FoodSearchResult
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import timber.log.Timber

class CreateRecipeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_recipe)

        val ingredientAdapter = IngredientAdapter(ArrayList())
        ingredientList.layoutManager = LinearLayoutManager(this)
        ingredientList.adapter = ingredientAdapter

        val service = ApiClient.getClient().create(USDAService::class.java)

        addIngredient.setOnClickListener {
            val view = View.inflate(this, R.layout.dialog_ingredient_search, null)
            val dialog = AlertDialog.Builder(this)
                .setView(view)
                .setTitle("Search")
                .create()

            val searchAdapter = SearchAdapter(ArrayList(), ingredientAdapter, dialog)

            view.searchList.layoutManager = LinearLayoutManager(this)
            view.searchList.adapter = searchAdapter

            view.search.setOnClickListener {
                val call = service.searchForIngredient(view.searchInput.text.toString(), 0)
                call.enqueue(object: Callback<FoodSearchResult> {
                    override fun onResponse(call: Call<FoodSearchResult>?, response: Response<FoodSearchResult>?) {
                        searchAdapter.updateItems(response!!.body().foodSearchList.item)
                    }

                    override fun onFailure(call: Call<FoodSearchResult>?, t: Throwable?) {
                        Timber.e(t)
                    }
                })
            }

            dialog.show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return when (item!!.itemId) {
            R.id.action_save -> {
                saveRecipeToDB()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun saveRecipeToDB() {

    }
}
