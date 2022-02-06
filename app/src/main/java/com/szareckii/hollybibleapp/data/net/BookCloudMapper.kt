package com.szareckii.hollybibleapp.data.net

import com.szareckii.hollybibleapp.core.Abstract
import com.szareckii.hollybibleapp.core.Book

interface BookCloudMapper : Abstract.Mapper {

    fun map(id: Int, name: String): Book

    class Base : BookCloudMapper{
        override fun map(id: Int, name: String) = Book(id, name)
    }
}