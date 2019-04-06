package org.bodeen.recipebuilder.db

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import org.bodeen.recipebuilder.model.Amount
import java.util.*

class Converters {

    @TypeConverter
    fun timestampToDate(value: Long?): Date? {
        return if (value == null) null else Date(value)
    }

    @TypeConverter
    fun dateToTimestamp(date: Date?): Long? {
        return date?.time
    }

    @TypeConverter
    fun stringToList(value: String?): List<String>? {
        val listType = object: TypeToken<List<String>>() {}.type
        return Gson().fromJson(value, listType)
    }

    @TypeConverter
    fun listToString(list: List<String>?): String? {
        return Gson().toJson(list)
    }

    @TypeConverter
    fun stringToAmount(value: String?): Amount? {
        return if (value == null) null else {
            val items = value.split("|")
            val amount = Amount()

            amount.quantity = items[0].toDouble()
            amount.measureUnit = items[1]
            amount.gramWeight = items[2].toDouble()

            amount
        }
    }

    @TypeConverter
    fun amountToString(amount: Amount?): String? {
        return if (amount == null) null else {
            amount.quantity.toString() + "|" + amount.measureUnit + "|" + amount.gramWeight.toString()
        }
    }
}