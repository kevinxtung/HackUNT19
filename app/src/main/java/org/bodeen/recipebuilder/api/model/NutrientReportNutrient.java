package org.bodeen.recipebuilder.api.model;

import com.google.gson.annotations.SerializedName;

public class NutrientReportNutrient {
    @SerializedName("nutrient_id")
    public String nutrientId;
    @SerializedName("nutrient")
    public String nutrient;
    @SerializedName("unit")
    public String unit;
    @SerializedName("value")
    public String value;
    @SerializedName("gm")
    public double gm;
}