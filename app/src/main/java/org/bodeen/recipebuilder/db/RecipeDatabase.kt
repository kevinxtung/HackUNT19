package org.bodeen.recipebuilder.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import org.bodeen.recipebuilder.db.dao.RecipeDao
import org.bodeen.recipebuilder.model.entity.*

@Database(entities = [Recipe::class, Ingredient::class, Nutrient::class, RecipeIngredient::class, IngredientNutrient::class], version = 1)
@TypeConverters(Converters::class)
abstract class RecipeDatabase : RoomDatabase() {

    abstract fun recipeDao(): RecipeDao

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