package org.yogesh.project.book.data.repository

import androidx.sqlite.SQLiteException
import org.yogesh.project.book.domain.BookRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import org.yogesh.project.book.data.database.FavoriteBookDao
import org.yogesh.project.book.data.mappers.toBook
import org.yogesh.project.book.data.mappers.toBookEntity
import org.yogesh.project.book.data.network.RemoteBookDataSource
import org.yogesh.project.book.domain.Book
import org.yogesh.project.core.domain.DataError
import org.yogesh.project.core.domain.EmptyResult
import org.yogesh.project.core.domain.map

class DefaultBookRepository(
    private val remoteBookDataSource: RemoteBookDataSource,
    private val favoriteBookDao: FavoriteBookDao
): BookRepository {
    override suspend fun searchBooks(query: String): org.yogesh.project.core.domain.Result<List<Book>, DataError.Remote> {
        return remoteBookDataSource
            .searchBooks(query)
            .map { dto ->
                dto.results.map { it.toBook() }
            }
    }

    override suspend fun getBookDescription(bookId: String): org.yogesh.project.core.domain.Result<String?, DataError> {
        val localResult = favoriteBookDao.getFavoriteBook(bookId)

        return if(localResult == null) {
            remoteBookDataSource
                .getBookDetails(bookId)
                .map { it.description }
        } else {
            org.yogesh.project.core.domain.Result.Success(localResult.description)
        }
    }

    override fun getFavoriteBooks(): Flow<List<Book>> {
        return favoriteBookDao
            .getFavoriteBooks()
            .map { bookEntities ->
                bookEntities.map { it.toBook() }
            }
    }

    override fun isBookFavorite(id: String): Flow<Boolean> {
        return favoriteBookDao
            .getFavoriteBooks()
            .map { bookEntities ->
                bookEntities.any { it.id == id }
            }
    }

    override suspend fun markAsFavorite(book: Book): EmptyResult<DataError.Local> {
        return try {
            favoriteBookDao.upsert(book.toBookEntity())
            org.yogesh.project.core.domain.Result.Success(Unit)
        } catch(e: SQLiteException) {
            org.yogesh.project.core.domain.Result.Error(DataError.Local.DISK_FULL)
        }
    }

    override suspend fun deleteFromFavorites(id: String) {
        favoriteBookDao.deleteFavoriteBook(id)
    }
}