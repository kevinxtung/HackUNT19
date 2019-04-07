package org.bodeen.recipebuilder.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView
import org.bodeen.recipebuilder.api.model.FoodSearchItem
import org.bodeen.recipebuilder.db.model.Amount
import org.bodeen.recipebuilder.db.model.IngredientAmount
import org.bodeen.recipebuilder.db.model.entity.Ingredient

class SearchAdapter(
    private var items: List<FoodSearchItem>,
    private var ingredientAdapter: IngredientAdapter,
    private var dialog: AlertDialog
) : RecyclerView.Adapter<SearchAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(android.R.layout.simple_list_item_1, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    fun updateItems(newItems: List<FoodSearchItem>) {
        items = newItems
        notifyDataSetChanged()
    }

    inner class ViewHolder(private var view: View) : RecyclerView.ViewHolder(view) {

        fun bind(item: FoodSearchItem) {
            (view as TextView).text = item.name
            view.setOnClickListener {
                val ingredientAmount = IngredientAmount()
                ingredientAmount.ingredient = Ingredient()
                ingredientAmount.ingredient.name = item.name
                ingredientAmount.ingredient.ingredientId = item.ndbno
                ingredientAmount.amount = Amount()
                ingredientAmount.amount.gramWeight = 0.0
                ingredientAmount.amount.measureUnit = "g"
                ingredientAmount.amount.quantity = 0.0

                ingredientAdapter.addIngredient(ingredientAmount)
                dialog.dismiss()
            }
        }
    }
}