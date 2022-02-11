package com.szareckii.hollybibleapp.data

import com.szareckii.hollybibleapp.core.Abstract
import com.szareckii.hollybibleapp.domain.BookDomain

sealed class BooksData : Abstract.Object<BookDomain, BooksDataToDomainMapper>() {
}