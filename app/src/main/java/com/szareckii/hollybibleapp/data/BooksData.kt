package com.szareckii.hollybibleapp.data

import com.szareckii.hollybibleapp.core.Abstract
import com.szareckii.hollybibleapp.core.Book
import com.szareckii.hollybibleapp.data.net.BookCloud
import com.szareckii.hollybibleapp.domain.BooksDomain

sealed class BooksData : Abstract.Object<BooksDomain, BooksDataToDomainMapper>() {
    class Success(private val books: List<Book>) : BooksData() {
        override fun map(mapper: BooksDataToDomainMapper) = mapper.map(books)
    }

    class Fail(private val e: Exception) : BooksData() {
        override fun map(mapper: BooksDataToDomainMapper) = mapper.map(e)
    }
}