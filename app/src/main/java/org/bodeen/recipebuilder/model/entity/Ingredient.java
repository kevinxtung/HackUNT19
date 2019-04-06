package org.bodeen.recipebuilder.model.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.List;

@Entity(tableName = "ingredient_table")
public class Ingredient {

    @PrimaryKey
    @ColumnInfo(name = "ingredient_id")
    private int ingredientId;           // Primary Key. Corresponds to ndbno field in USDA database.

    @ColumnInfo(name = "name")
    private String name;                // Common name of an ingredient, from USDA database. (i.e. eggplant)

    @ColumnInfo(name = "alt_names")
    private List<String> altNames;      // Other names of an ingredient. (i.e. aubergine)

    @ColumnInfo(name = "description")
    private String description;         // Description of an ingredient.

    @ColumnInfo(name = "refuse_percentage")
    private double refusePercentage;    // Percentage of refuse weight in ingredient.

    @ColumnInfo(name = "refuse_description")
    private String refuseDescription;   // Description of the refuse in ingredient. (i.e. bones)

    // Calorie factors from amounts, by gram.
    // Multiply the nutrient gram weight with the respective factor to obtain calorie amounts.
    @ColumnInfo(name = "hundred_factor")
    private double hundredFactor;   // Amount of calories in 100 grams.

    @ColumnInfo(name = "protein_factor")
    private double proteinFactor;   // Usually 4

    @ColumnInfo(name = "fat_factor")
    private double fatFactor;       // Usually 9

    @ColumnInfo(name = "carb_factor")
    private double carbFactor;      // Usually 4

    // Boilerplate getters and setters.
    public int getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(int ingredientId) {
        this.ingredientId = ingredientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAltNames() {
        return altNames;
    }

    public void setAltNames(List<String> altNames) {
        this.altNames = altNames;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRefusePercentage() {
        return refusePercentage;
    }

    public void setRefusePercentage(double refusePercentage) {
        this.refusePercentage = refusePercentage;
    }

    public String getRefuseDescription() {
        return refuseDescription;
    }

    public void setRefuseDescription(String refuseDescription) {
        this.refuseDescription = refuseDescription;
    }

    public double getHundredFactor() {
        return hundredFactor;
    }

    public void setHundredFactor(double hundredFactor) {
        this.hundredFactor = hundredFactor;
    }

    public double getProteinFactor() {
        return proteinFactor;
    }

    public void setProteinFactor(double proteinFactor) {
        this.proteinFactor = proteinFactor;
    }

    public double getFatFactor() {
        return fatFactor;
    }

    public void setFatFactor(double fatFactor) {
        this.fatFactor = fatFactor;
    }

    public double getCarbFactor() {
        return carbFactor;
    }

    public void setCarbFactor(double carbFactor) {
        this.carbFactor = carbFactor;
    }
}
