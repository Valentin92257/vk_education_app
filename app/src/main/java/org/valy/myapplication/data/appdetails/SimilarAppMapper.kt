package org.valy.myapplication.data.appdetails

import org.valy.myapplication.domain.appdetails.SimilarApp

class SimilarAppMapper {
    fun toDomain(dto: SimilarAppDto): SimilarApp = SimilarApp(
        id = dto.id,
        name = dto.name,
        iconUrl = dto.iconUrl,
    )
}
