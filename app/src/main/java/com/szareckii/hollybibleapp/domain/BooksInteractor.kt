package com.szareckii.hollybibleapp.domain

import com.szareckii.hollybibleapp.data.BooksDataToDomainMapper
import com.szareckii.hollybibleapp.data.BooksRepository

interface BooksInteractor {

    suspend fun fetchBooks(): BooksDomain

    class Base(
        private val booksRepository: BooksRepository,
        private val mapper: BooksDataToDomainMapper
    ) : BooksInteractor {
        override suspend fun fetchBooks() = booksRepository.fetchBooks().map(mapper)
    }
}