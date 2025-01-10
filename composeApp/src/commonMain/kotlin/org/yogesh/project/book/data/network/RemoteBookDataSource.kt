package org.yogesh.project.book.data.network


import org.yogesh.project.book.data.dto.BookWorkDto
import org.yogesh.project.book.data.dto.SearchResponseDto
import org.yogesh.project.core.domain.DataError

interface RemoteBookDataSource {
    suspend fun searchBooks(
        query: String,
        resultLimit: Int? = null
    ): org.yogesh.project.core.domain.Result<SearchResponseDto, DataError.Remote>

    suspend fun getBookDetails(bookWorkId: String): org.yogesh.project.core.domain.Result<BookWorkDto, DataError.Remote>
}