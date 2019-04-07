package org.bodeen.recipebuilder.api.model.foodreport;


import com.google.gson.annotations.SerializedName;

public class Desc {

    @SerializedName("ndbno")

    private String ndbno;
    @SerializedName("name")

    private String name;
    @SerializedName("sd")

    private String sd;
    @SerializedName("fg")

    private String fg;
    @SerializedName("sn")

    private String sn;
    @SerializedName("cn")

    private String cn;
    @SerializedName("manu")

    private String manu;
    @SerializedName("nf")

    private int nf;
    @SerializedName("cf")

    private int cf;
    @SerializedName("ff")

    private int ff;
    @SerializedName("pf")

    private int pf;
    @SerializedName("r")

    private String r;
    @SerializedName("rd")

    private String rd;
    @SerializedName("ds")

    private String ds;
    @SerializedName("ru")

    private String ru;

    public String getNdbno() {
        return ndbno;
    }

    public void setNdbno(String ndbno) {
        this.ndbno = ndbno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSd() {
        return sd;
    }

    public void setSd(String sd) {
        this.sd = sd;
    }

    public String getFg() {
        return fg;
    }

    public void setFg(String fg) {
        this.fg = fg;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public String getManu() {
        return manu;
    }

    public void setManu(String manu) {
        this.manu = manu;
    }

    public int getNf() {
        return nf;
    }

    public void setNf(int nf) {
        this.nf = nf;
    }

    public int getCf() {
        return cf;
    }

    public void setCf(int cf) {
        this.cf = cf;
    }

    public int getFf() {
        return ff;
    }

    public void setFf(int ff) {
        this.ff = ff;
    }

    public int getPf() {
        return pf;
    }

    public void setPf(int pf) {
        this.pf = pf;
    }

    public String getR() {
        return r;
    }

    public void setR(String r) {
        this.r = r;
    }

    public String getRd() {
        return rd;
    }

    public void setRd(String rd) {
        this.rd = rd;
    }

    public String getDs() {
        return ds;
    }

    public void setDs(String ds) {
        this.ds = ds;
    }

    public String getRu() {
        return ru;
    }

    public void setRu(String ru) {
        this.ru = ru;
    }

}