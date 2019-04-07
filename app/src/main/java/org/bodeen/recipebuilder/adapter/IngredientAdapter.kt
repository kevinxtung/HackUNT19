package org.bodeen.recipebuilder.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_ingredient.view.*
import org.bodeen.recipebuilder.R
import org.bodeen.recipebuilder.db.model.IngredientAmount

class IngredientAdapter(var ingredients: ArrayList<IngredientAmount>) : RecyclerView.Adapter<IngredientAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_ingredient, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return ingredients.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(ingredients[position])
    }

    fun addIngredient(ing: IngredientAmount) {
        ingredients.add(ing)
        notifyDataSetChanged()
    }

    class ViewHolder(private var view: View) : RecyclerView.ViewHolder(view) {

        fun bind(ingredient: IngredientAmount) {
            view.ingredientName.text = ingredient.ingredient.name
            view.ingredientAmount.text = "${ingredient.amount.quantity} ${ingredient.amount.measureUnit}"
        }
    }
}