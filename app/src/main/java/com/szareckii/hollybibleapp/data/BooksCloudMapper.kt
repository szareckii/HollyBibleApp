package com.szareckii.hollybibleapp.data

import com.szareckii.hollybibleapp.core.Abstract
import com.szareckii.hollybibleapp.core.Book
import com.szareckii.hollybibleapp.data.net.BookCloud
import com.szareckii.hollybibleapp.data.net.BookCloudMapper

interface BooksCloudMapper : Abstract.Mapper {

    fun map(cloudList: List<BookCloud>): List<Book>

    class Base(private val bookMapper: BookCloudMapper) : BooksCloudMapper {
        override fun map(cloudList: List<BookCloud>) =  cloudList.map { bookCloud ->
                bookCloud.map(bookMapper)
        }
    }
}