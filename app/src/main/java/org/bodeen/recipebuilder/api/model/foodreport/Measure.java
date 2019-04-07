package org.bodeen.recipebuilder.api.model.foodreport;


import com.google.gson.annotations.SerializedName;

public class Measure {

    @SerializedName("label")

    private String label;
    @SerializedName("eqv")

    private int eqv;
    @SerializedName("eunit")

    private String eunit;
    @SerializedName("qty")

    private int qty;
    @SerializedName("value")

    private int value;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getEqv() {
        return eqv;
    }

    public void setEqv(int eqv) {
        this.eqv = eqv;
    }

    public String getEunit() {
        return eunit;
    }

    public void setEunit(String eunit) {
        this.eunit = eunit;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}