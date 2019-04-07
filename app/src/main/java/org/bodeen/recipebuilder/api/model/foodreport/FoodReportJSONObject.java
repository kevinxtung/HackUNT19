package org.bodeen.recipebuilder.api.model.foodreport;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FoodReportJSONObject {

    @SerializedName("foodHolders")

    private List<FoodHolder> foodHolders = null;
    @SerializedName("count")

    private int count;
    @SerializedName("notfound")

    private int notfound;
    @SerializedName("api")

    private int api;

    public List<FoodHolder> getFoodHolders() {
        return foodHolders;
    }

    public void setFoodHolders(List<FoodHolder> foodHolders) {
        this.foodHolders = foodHolders;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getNotfound() {
        return notfound;
    }

    public void setNotfound(int notfound) {
        this.notfound = notfound;
    }

    public int getApi() {
        return api;
    }

    public void setApi(int api) {
        this.api = api;
    }

}