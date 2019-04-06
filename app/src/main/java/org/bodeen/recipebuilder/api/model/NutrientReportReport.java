package org.bodeen.recipebuilder.api.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NutrientReportReport {
    @SerializedName("sr")
    public String sr;
    @SerializedName("groups")
    public String groups;
    @SerializedName("subset")
    public String subset;
    @SerializedName("end")
    public int end;
    @SerializedName("start")
    public int start;
    @SerializedName("total")
    public int total;
    @SerializedName("foods")
    public List<NutrientReportFood> foods = null;
}