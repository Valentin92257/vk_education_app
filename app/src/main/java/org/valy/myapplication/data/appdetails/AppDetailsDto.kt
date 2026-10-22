package org.valy.myapplication.data.appdetails

import org.valy.myapplication.domain.appdetails.Category
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AppDetailsDto(
    val id: String,
    val name: String,
    val developer: String,
    val category: Category,
    val ageRating: Int,
    val size: Double,
    @SerialName("iconUrl")
    val icon: String,
    val screenshots: List<String>? = null,
    val description: String,
)