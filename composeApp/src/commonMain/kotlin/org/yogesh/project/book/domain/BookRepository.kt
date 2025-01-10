package org.yogesh.project.book.domain


import kotlinx.coroutines.flow.Flow

import org.yogesh.project.core.domain.DataError
import org.yogesh.project.core.domain.EmptyResult

interface BookRepository {
    suspend fun searchBooks(query: String): org.yogesh.project.core.domain.Result<List<Book>, DataError.Remote>
    suspend fun getBookDescription(bookId: String): org.yogesh.project.core.domain.Result<String?, DataError>

    fun getFavoriteBooks(): Flow<List<Book>>
    fun isBookFavorite(id: String): Flow<Boolean>
    suspend fun markAsFavorite(book: Book): EmptyResult<DataError.Local>
    suspend fun deleteFromFavorites(id: String)
}