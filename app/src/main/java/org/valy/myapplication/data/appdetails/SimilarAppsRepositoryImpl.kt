package org.valy.myapplication.data.appdetails

import org.valy.myapplication.domain.appdetails.SimilarApp
import org.valy.myapplication.domain.appdetails.SimilarAppsRepository
import javax.inject.Inject

class SimilarAppsRepositoryImpl @Inject constructor(
    private val api: SimilarAppsApi,
    private val mapper: SimilarAppMapper,
) : SimilarAppsRepository {
    override suspend fun getSimilarApps(): List<SimilarApp> =
        api.getSimilarApps().map(mapper::toDomain)
}
