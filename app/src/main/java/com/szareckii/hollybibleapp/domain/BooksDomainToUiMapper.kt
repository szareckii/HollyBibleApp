package com.szareckii.hollybibleapp.domain

import com.szareckii.hollybibleapp.core.Abstract
import com.szareckii.hollybibleapp.core.Book
import com.szareckii.hollybibleapp.presentation.BooksUi

interface BooksDomainToUiMapper: Abstract.Mapper {

    fun map(books: List<Book>) : BooksUi

    fun map(errorType: ErrorType) : BooksUi
}