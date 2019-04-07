package org.bodeen.recipebuilder.db.model.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "nutrient_table")
public class Nutrient {

    @PrimaryKey
    @ColumnInfo(name = "nutrient_id")
    private int nutrientId;         // Primary Key

    @ColumnInfo(name = "unit")
    private String unit;    // Unit of measure (mg, g, micrograms, etc)

    @ColumnInfo(name = "name")
    private String name;    // Common Name of FRNutrient

    @ColumnInfo(name = "round")
    private int round;      // Number of decimal places to round to

    // Boilerplate getters and setters.
    public int getNutrientId() {
        return nutrientId;
    }

    public void setNutrientId(int nutrientId) {
        this.nutrientId = nutrientId;
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
