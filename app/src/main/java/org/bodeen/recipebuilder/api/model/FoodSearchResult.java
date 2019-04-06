package org.bodeen.recipebuilder.api.model;

import com.google.gson.annotations.SerializedName;

public class FoodSearchResult {
    @SerializedName("list")
    public FoodSearchList foodSearchList;
}
