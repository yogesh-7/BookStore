package org.yogesh.project.book.presentation.book_detail

import org.yogesh.project.book.domain.Book

data class BookDetailState(
    val isLoading: Boolean = true,
    val isFavorite: Boolean = false,
    val book: Book? = null
)
