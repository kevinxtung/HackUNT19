package org.bodeen.recipebuilder.api.model.foodreport;


import com.google.gson.annotations.SerializedName;

public class Source {

    @SerializedName("id")

    private int id;
    @SerializedName("title")

    private String title;
    @SerializedName("authors")

    private String authors;
    @SerializedName("vol")

    private String vol;
    @SerializedName("iss")

    private String iss;
    @SerializedName("year")

    private String year;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getVol() {
        return vol;
    }

    public void setVol(String vol) {
        this.vol = vol;
    }

    public String getIss() {
        return iss;
    }

    public void setIss(String iss) {
        this.iss = iss;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

}
