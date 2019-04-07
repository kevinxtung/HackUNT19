package org.bodeen.recipebuilder.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import org.bodeen.recipebuilder.R;
import org.bodeen.recipebuilder.db.model.entity.Recipe;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.ViewHolder> {

    private List<Recipe> recipes;

    public RecipeAdapter(List<Recipe> recipes) {
        this.recipes = recipes;
    }

    public void updateRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
        notifyDataSetChanged();
    }

    @NotNull
    @Override
    public RecipeAdapter.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType){
        View recipeView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recipelayout, parent, false);
        return new ViewHolder(recipeView);
    }

    @Override
    public void onBindViewHolder(@NotNull RecipeAdapter.ViewHolder viewHolder, int position){
        Recipe recipe = recipes.get(position);
        viewHolder.bind(recipe);
    }

    @Override
    public int getItemCount(){
        return recipes.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView nameView;

        ViewHolder(View recipeView){
            super(recipeView);
            nameView = itemView.findViewById(R.id.recipe_name);
        }

        void bind(Recipe recipe) {
            nameView.setText(recipe.getName());
        }
    }
}
