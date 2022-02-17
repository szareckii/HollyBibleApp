package com.szareckii.hollybibleapp.domain

import com.szareckii.hollybibleapp.core.Book
import com.szareckii.hollybibleapp.data.BooksDataToDomainMapper

class BaseBookDataToDomainMapper : BooksDataToDomainMapper {

    override fun map(books: List<Book>) = BooksDomain.Success(books)
    override fun map(e: Exception) = BooksDomain.Fail(e)
}