package org.bodeen.recipebuilder.api.model;

import com.google.gson.annotations.SerializedName;

public class FoodSearchList {
    @SerializedName("q")
    public String q;
    @SerializedName("sr")
    public String sr;
    @SerializedName("ds")
    public String ds;
    @SerializedName("start")
    public int start;
    @SerializedName("end")
    public int end;
    @SerializedName("total")
    public int total;
    @SerializedName("group")
    public String group;
    @SerializedName("sort")
    public String sort;
    @SerializedName("item")
    public java.util.List<FoodSearchItem> item = null;
}