package org.valy.myapplication.model

import androidx.annotation.StringRes
import org.valy.myapplication.R

enum class AppCategory(@StringRes val titleRes: Int) {
    GAME(R.string.category_game),
    SOCIAL(R.string.category_social),
    PRODUCTIVITY(R.string.category_productivity),
    EDUCATION(R.string.category_education),
    MUSIC(R.string.category_music),
    PHOTOGRAPHY(R.string.category_photography),
    HEALTH(R.string.category_health),
    FINANCE(R.string.category_finance),
    TRAVEL(R.string.category_travel),
    UTILITIES(R.string.category_utilities),
}
