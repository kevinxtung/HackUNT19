package org.bodeen.recipebuilder.api.model.foodreport;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Food {

    @SerializedName("sr")

    private String sr;
    @SerializedName("type")

    private String type;
    @SerializedName("desc")

    private Desc desc;
    @SerializedName("FRNutrients")

    private List<FRNutrient> FRNutrients = null;
    @SerializedName("sources")

    private List<Source> sources = null;
    @SerializedName("footnotes")

    private List<Object> footnotes = null;
    @SerializedName("langual")

    private List<Object> langual = null;

    public String getSr() {
        return sr;
    }

    public void setSr(String sr) {
        this.sr = sr;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Desc getDesc() {
        return desc;
    }

    public void setDesc(Desc desc) {
        this.desc = desc;
    }

    public List<FRNutrient> getFRNutrients() {
        return FRNutrients;
    }

    public void setFRNutrients(List<FRNutrient> FRNutrients) {
        this.FRNutrients = FRNutrients;
    }

    public List<Source> getSources() {
        return sources;
    }

    public void setSources(List<Source> sources) {
        this.sources = sources;
    }

    public List<Object> getFootnotes() {
        return footnotes;
    }

    public void setFootnotes(List<Object> footnotes) {
        this.footnotes = footnotes;
    }

    public List<Object> getLangual() {
        return langual;
    }

    public void setLangual(List<Object> langual) {
        this.langual = langual;
    }

}