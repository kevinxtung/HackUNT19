package org.bodeen.recipebuilder.recyclers;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import org.bodeen.recipebuilder.R;
import org.bodeen.recipebuilder.model.Recipe;
import org.w3c.dom.Text;

import java.util.List;

public class MainActivityRecyclerAdapter extends RecyclerView.Adapter<MainActivityRecyclerAdapter.ViewHolder> {

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView nameView;
        public ViewHolder(View recipeView){
            super(recipeView);
            nameView = (TextView) itemView.findViewById(R.id.recipe_name);
        }
    }

    private List<Recipe> mRecipes;

    public MainActivityRecyclerAdapter(List<Recipe> recipes){
        mRecipes = recipes;
    }
    @Override
    public MainActivityRecyclerAdapter.ViewHolder onCreateViewHolder(
    ViewGroup parent, int viewType){

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View recipeView = inflater.inflate(R.layout.recipelayout, parent, false);
        ViewHolder viewHolder = new ViewHolder(recipeView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MainActivityRecyclerAdapter.ViewHolder viewHolder, int position){

        Recipe recipe = mRecipes.get(position);

        //Create and initialize ui widgest
        TextView textView = viewHolder.nameView;
        textView.setText(recipe.getName());
    }

    @Override
    public int getItemCount(){
        return mRecipes.size();
    }

}
