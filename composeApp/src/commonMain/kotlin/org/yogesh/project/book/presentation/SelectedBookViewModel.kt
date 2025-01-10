package org.yogesh.project.book.presentation

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import org.yogesh.project.book.domain.Book

class SelectedBookViewModel: ViewModel() {

    private val _selectedBook = MutableStateFlow<Book?>(null)
    val selectedBook = _selectedBook.asStateFlow()

    fun onSelectBook(book: Book?) {
        _selectedBook.value = book
    }
}