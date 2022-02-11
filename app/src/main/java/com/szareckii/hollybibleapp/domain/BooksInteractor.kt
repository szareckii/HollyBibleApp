package com.szareckii.hollybibleapp.domain

import com.szareckii.hollybibleapp.presentation.BooksUi

interface BooksInteractor {

    fun fetchBooks() :  BooksUi
}