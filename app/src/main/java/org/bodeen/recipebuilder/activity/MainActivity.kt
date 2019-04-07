package org.bodeen.recipebuilder.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import org.bodeen.recipebuilder.R
import org.bodeen.recipebuilder.adapter.RecipeAdapter
import org.bodeen.recipebuilder.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = RecipeAdapter(ArrayList())
        recipeList.layoutManager = LinearLayoutManager(this)
        recipeList.adapter = adapter

        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        viewModel.allRecipes.observe(this, Observer {
            adapter.updateRecipes(it)
        })

        createRecipe.setOnClickListener {
            val intent = Intent(this, CreateRecipeActivity::class.java)
            startActivityForResult(intent, CREATE_RECIPE_CODE)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK) {
            when (requestCode) {
                CREATE_RECIPE_CODE -> {
                    recreate()
                }
            }
        }
    }

    companion object {

        private const val CREATE_RECIPE_CODE = 123
    }
}
