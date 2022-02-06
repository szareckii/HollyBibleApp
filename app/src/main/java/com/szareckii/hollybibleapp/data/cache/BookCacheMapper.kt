package com.szareckii.hollybibleapp.data.cache

import com.szareckii.hollybibleapp.core.Abstract
import com.szareckii.hollybibleapp.core.Book

interface BookCacheMapper : Abstract.Mapper {

    fun map(bookDb: BookDb): Book

    class Base : BookCacheMapper {
        override fun map(bookDb: BookDb) = Book(bookDb.id, bookDb.name)
    }
}