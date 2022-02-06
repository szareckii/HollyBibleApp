package com.szareckii.hollybibleapp.data

import com.szareckii.hollybibleapp.data.net.BookCloud
import com.szareckii.hollybibleapp.data.net.BooksService

interface BooksCloudDataSource {

    suspend fun fetchBooks() : List<BookCloud>

    class Base(private val service: BooksService) : BooksCloudDataSource{
        override suspend fun fetchBooks() = service.fetchBooks()
    }
}