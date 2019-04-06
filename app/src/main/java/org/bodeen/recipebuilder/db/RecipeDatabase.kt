package org.bodeen.recipebuilder.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import org.bodeen.recipebuilder.db.dao.IngredientDao
import org.bodeen.recipebuilder.db.dao.NutrientDao
import org.bodeen.recipebuilder.db.dao.RecipeDao

@Database(entities = [Recipe::class, Ingredient::class, Nutrient::class], version = 1)
abstract class RecipeDatabase : RoomDatabase() {

    abstract fun recipeDao(): RecipeDao
    abstract fun ingredientDao(): IngredientDao
    abstract fun nutrientDao(): NutrientDao

    companion object {

        @Volatile
        private var INSTANCE: RecipeDatabase? = null

        fun getDatabase(context: Context): RecipeDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    RecipeDatabase::class.java,
                    "recipe_database"
                ).build()

                INSTANCE = instance
                instance
            }
        }
    }
}