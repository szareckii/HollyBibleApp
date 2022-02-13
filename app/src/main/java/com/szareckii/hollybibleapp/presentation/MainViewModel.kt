package com.szareckii.hollybibleapp.presentation

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.szareckii.hollybibleapp.core.Abstract
import com.szareckii.hollybibleapp.core.Book
import com.szareckii.hollybibleapp.domain.BooksDomainToUiMapper
import com.szareckii.hollybibleapp.domain.BooksInteractor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(
    private val booksInteractor: BooksInteractor,
    private val mapper: BooksDomainToUiMapper,
    private val communication: BooksCommunication
) :
    ViewModel() {

    fun fetchBooks() = viewModelScope.launch(Dispatchers.IO) {
        val result = booksInteractor.fetchBooks().map(mapper)
        Dispatchers.Main.run {
            result.map(Abstract.Mapper.Empty())
        }
    }

    fun observe(owner: LifecycleOwner, observer: Observer<List<Book>>) {
        communication.observeSuccess(owner, observer)
    }
}