package com.szareckii.hollybibleapp.presentation

import com.szareckii.hollybibleapp.core.Book
import com.szareckii.hollybibleapp.domain.BooksDomainToUiMapper
import com.szareckii.hollybibleapp.domain.ErrorType

class BaseBooksDomainToUiMapper(
    private val communication: BooksCommunication,
    private val resourceProvider: ResourceProvider
) :
    BooksDomainToUiMapper {

    override fun map(books: List<Book>) = BooksUI.Success(communication, books)

    override fun map(errorType: ErrorType) = BooksUI.Fail(communication, errorType, resourceProvider)
}