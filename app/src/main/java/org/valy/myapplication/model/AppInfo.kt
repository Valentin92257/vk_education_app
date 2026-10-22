package org.valy.myapplication.model

import androidx.annotation.DrawableRes

data class AppInfo(
    val id: String,
    @DrawableRes val iconRes: Int,
    val name: String,
    val description: String,
    val category: AppCategory,
)
