package com.szareckii.hollybibleapp.core

import android.app.Application
import com.szareckii.hollybibleapp.domain.BooksInteractor
import com.szareckii.hollybibleapp.presentation.BaseBooksDomainToUiMapper
import com.szareckii.hollybibleapp.presentation.BooksCommunication
import com.szareckii.hollybibleapp.presentation.MainViewModel
import com.szareckii.hollybibleapp.presentation.ResourceProvider

class BibleApp : Application() {

    lateinit var mainViewModel: MainViewModel
    override fun onCreate() {
        super.onCreate()

        val booksInteractor: BooksInteractor = TODO()

        mainViewModel = MainViewModel(
            booksInteractor,
            BaseBooksDomainToUiMapper(
                BooksCommunication.Base(),
                ResourceProvider.Base(this)
            ),
            BooksCommunication.Base(),
        )
    }
}