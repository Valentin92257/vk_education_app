package org.valy.myapplication.ui.appdetails

import androidx.compose.runtime.Immutable
import org.valy.myapplication.domain.appdetails.AppDetails
import org.valy.myapplication.domain.appdetails.SimilarApp

@Immutable
sealed interface AppDetailsState {
    data object Error : AppDetailsState
    data object Loading : AppDetailsState
    data class Content(
        val appDetails: AppDetails,
        val similarApps: List<SimilarApp>,
        val descriptionCollapsed: Boolean,
    ) : AppDetailsState
}