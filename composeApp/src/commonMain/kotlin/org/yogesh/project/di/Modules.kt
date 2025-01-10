package org.yogesh.project.di

import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import org.yogesh.project.book.data.network.KtorRemoteBookDataSource
import org.yogesh.project.book.data.network.RemoteBookDataSource
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module
import org.koin.core.module.dsl.viewModelOf
import org.yogesh.project.book.data.database.DatabaseFactory
import org.yogesh.project.book.data.database.FavoriteBookDatabase
import org.yogesh.project.book.data.repository.DefaultBookRepository
import org.yogesh.project.book.domain.BookRepository
import org.yogesh.project.book.presentation.SelectedBookViewModel
import org.yogesh.project.book.presentation.book_detail.BookDetailViewModel
import org.yogesh.project.book.presentation.book_list.BookListViewModel
import org.yogesh.project.core.data.HttpClientFactory

expect val platformModule: Module

val sharedModule = module {
    single { HttpClientFactory.create(get()) }
    singleOf(::KtorRemoteBookDataSource).bind<RemoteBookDataSource>()
    singleOf(::DefaultBookRepository).bind<BookRepository>()

    single {
        get<DatabaseFactory>().create()
            .setDriver(BundledSQLiteDriver())
            .build()
    }
    single { get<FavoriteBookDatabase>().favoriteBookDao }

    viewModelOf(::BookListViewModel)
    viewModelOf(::BookDetailViewModel)
    viewModelOf(::SelectedBookViewModel)
}