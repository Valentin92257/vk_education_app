package org.valy.myapplication.domain.appdetails

interface SimilarAppsRepository {
    suspend fun getSimilarApps(): List<SimilarApp>
}
