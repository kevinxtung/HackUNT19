package org.bodeen.recipebuilder.recyclers;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.bodeen.recipebuilder.R;

public class MainActivityRecyclerAdapter extends RecyclerView.Adapter<MainActivityRecyclerAdapter.ViewHolder> {

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(View recipeView){
            super(recipeView);

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
    public void onBindViewHOlder(MainActivityRecyclerAdapter.ViewHolder viewHolder, int position){

        Recipe recipe = mRecipes.get(position);

        //Create and initialize ui widgest
    }

    @Override
    public int getItemCount(){
        return mRecipes.size();
    }

}
