package org.yogesh.project.book.data.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.yogesh.project.book.data.dto.SearchedBookDto

@Serializable
data class SearchResponseDto(
    @SerialName("docs") val results: List<SearchedBookDto>
)
