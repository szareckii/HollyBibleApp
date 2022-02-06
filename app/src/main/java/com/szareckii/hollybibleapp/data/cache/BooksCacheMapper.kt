package com.szareckii.hollybibleapp.data.cache

import com.szareckii.hollybibleapp.core.Abstract
import com.szareckii.hollybibleapp.core.Book

interface BooksCacheMapper : Abstract.Mapper {

    fun map(books: List<BookDb>): List<Book>

    class Base(private val mapper: BookCacheMapper) : BooksCacheMapper {
        override fun map(books: List<BookDb>) = books.map { bookDb ->
            bookDb.map(mapper)
        }
    }
}
