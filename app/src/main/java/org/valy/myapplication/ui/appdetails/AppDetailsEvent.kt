package org.valy.myapplication.ui.appdetails

sealed interface AppDetailsEvent {
    data object UnderDevelopment : AppDetailsEvent
}