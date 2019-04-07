package org.bodeen.recipebuilder.api.model.foodreport;


import com.google.gson.annotations.SerializedName;

public class FoodHolder {

    @SerializedName("food")

    private Food food;

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

}