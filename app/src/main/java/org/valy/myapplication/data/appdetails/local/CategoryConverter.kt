package org.valy.myapplication.data.appdetails.local

import androidx.room.TypeConverter
import org.valy.myapplication.domain.appdetails.Category

class CategoryConverter {
    @TypeConverter
    fun fromCategory(category: Category): String = category.name

    @TypeConverter
    fun toCategory(categoryName: String): Category = Category.valueOf(categoryName)
}