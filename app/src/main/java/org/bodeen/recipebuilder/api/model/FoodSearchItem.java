package org.bodeen.recipebuilder.api.model;

import com.google.gson.annotations.SerializedName;

public class FoodSearchItem {
    @SerializedName("offset")
    public int offset;
    @SerializedName("group")
    public String group;
    @SerializedName("name")
    public String name;
    @SerializedName("ndbno")
    public String ndbno;
    @SerializedName("ds")
    public String ds;
    @SerializedName("manu")
    public String manu;
}
