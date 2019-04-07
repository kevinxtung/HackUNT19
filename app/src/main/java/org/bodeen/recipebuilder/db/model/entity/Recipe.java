package org.bodeen.recipebuilder.db.model.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;
import java.util.List;

@Entity(tableName = "recipe_table")
public class Recipe {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "recipe_id")
    private int recipeId;           // Primary key.

    @ColumnInfo(name = "name")
    private String name;            // Name of the recipe.

    @ColumnInfo(name = "description")
    private String description;     // Textual description of recipe.

    @ColumnInfo(name = "servings")
    private int servings;           // Number of servings the recipe produces.

    @ColumnInfo(name = "cooking_time")
    private int cookingTime;        // Measured in minutes.

    @ColumnInfo(name = "creation_date")
    private Date creationDate;      // Date recipe was created.

    @ColumnInfo(name = "ingredients")
    private List<String> ingredients;   // Maps ingredient to string description of amount.

    @ColumnInfo(name = "directions")
    private List<String> directions;    // List of directions for a recipe.

    // Boilerplate getters and setters.
    public int getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(int recipeId) {
        this.recipeId = recipeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getServings() {
        return servings;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public List<String> getDirections() {
        return directions;
    }

    public void setDirections(List<String> directions) {
        this.directions = directions;
    }
}
