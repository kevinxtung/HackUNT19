package org.bodeen.recipebuilder.api.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NutrientReportFood {
    @SerializedName("ndbno")
    public String ndbno;
    @SerializedName("name")
    public String name;
    @SerializedName("weight")
    public double weight;
    @SerializedName("measure")
    public String measure;
    @SerializedName("nutrients")
    public List<NutrientReportNutrient> nutrients = null;

}