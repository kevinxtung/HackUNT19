package org.bodeen.recipebuilder.model;

import java.util.LinkedHashMap;
import java.util.List;

public class Recipe {
    private int id;                 // Primary key.
    private String name;            // Name of the recipe.
    private String description;     // Textual description of recipe.
    private int servings;           // Number of servings the recipe produces.
    private int cookingTime;        // Measured in minutes.
    private String creationDate;    // Date recipe was created.

    private LinkedHashMap<Ingredient, String> ingredientAmountMap;    // Maps ingredient to string description of amount.
    private List<String> directions;    // List of directions for a recipe.

    // Boilerplate getters and setters.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public LinkedHashMap<Ingredient, String> getIngredientAmountMap() {
        return ingredientAmountMap;
    }

    public void setIngredientAmountMap(LinkedHashMap<Ingredient, String> ingredientAmountMap) {
        this.ingredientAmountMap = ingredientAmountMap;
    }

    public List<String> getDirections() {
        return directions;
    }

    public void setDirections(List<String> directions) {
        this.directions = directions;
    }
