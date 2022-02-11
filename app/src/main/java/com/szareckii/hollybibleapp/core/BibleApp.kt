package com.szareckii.hollybibleapp.core

import android.app.Application
import com.szareckii.hollybibleapp.data.BooksRepository
import com.szareckii.hollybibleapp.domain.BaseBookDataToDomainMapper
import com.szareckii.hollybibleapp.domain.BooksInteractor

class BibleApp : Application() {

    override fun onCreate() {
        super.onCreate()

        val booksRepository : BooksRepository = TODO("merge")
        val booksInteractor = BooksInteractor.Base(booksRepository, BaseBookDataToDomainMapper())

    }
}