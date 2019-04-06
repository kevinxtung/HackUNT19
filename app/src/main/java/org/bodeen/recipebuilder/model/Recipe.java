package org.bodeen.recipebuilder.model;

import java.util.Date;
import java.util.List;

public class Recipe {
    private int recipeId;           // Primary key.
    private String name;            // Name of the recipe.
    private String description;     // Textual description of recipe.
    private int servings;           // Number of servings the recipe produces.
    private int cookingTime;        // Measured in minutes.
    private Date creationDate;      // Date recipe was created.

    private List<String> ingredients;   // Maps ingredient to string description of amount.
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
