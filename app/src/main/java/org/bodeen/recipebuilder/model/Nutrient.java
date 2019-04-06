package org.bodeen.recipebuilder.model;

public class Nutrient {
    private int id;         // Primary Key
    private String unit;    // Unit of measure (mg, g, micrograms, etc)
    private String name;    // Common Name of Nutrient
    private int round;      // Number of decimal places to round to

    // Boilerplate getters and setters.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }
}
