package com.szareckii.hollybibleapp.data

import com.szareckii.hollybibleapp.core.Abstract
import com.szareckii.hollybibleapp.core.Book
import com.szareckii.hollybibleapp.data.net.BookCloud
import com.szareckii.hollybibleapp.domain.BooksDomain

interface BooksDataToDomainMapper : Abstract.Mapper {

    fun map (books: List<Book>): BooksDomain

    fun map (e: Exception): BooksDomain
}