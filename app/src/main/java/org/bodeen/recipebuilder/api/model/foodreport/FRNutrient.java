package org.bodeen.recipebuilder.api.model.foodreport;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FRNutrient {

    @SerializedName("nutrient_id")

    private int nutrientId;
    @SerializedName("name")

    private String name;
    @SerializedName("group")

    private String group;
    @SerializedName("unit")

    private String unit;
    @SerializedName("value")

    private int value;
    @SerializedName("derivation")

    private String derivation;
    @SerializedName("sourcecode")

    private String sourcecode;
    @SerializedName("dp")

    private String dp;
    @SerializedName("se")

    private String se;
    @SerializedName("measures")

    private List<Measure> measures = null;

    public int getNutrientId() {
        return nutrientId;
    }

    public void setNutrientId(int nutrientId) {
        this.nutrientId = nutrientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDerivation() {
        return derivation;
    }

    public void setDerivation(String derivation) {
        this.derivation = derivation;
    }

    public String getSourcecode() {
        return sourcecode;
    }

    public void setSourcecode(String sourcecode) {
        this.sourcecode = sourcecode;
    }

    public String getDp() {
        return dp;
    }

    public void setDp(String dp) {
        this.dp = dp;
    }

    public String getSe() {
        return se;
    }

    public void setSe(String se) {
        this.se = se;
    }

    public List<Measure> getMeasures() {
        return measures;
    }

    public void setMeasures(List<Measure> measures) {
        this.measures = measures;
    }

}