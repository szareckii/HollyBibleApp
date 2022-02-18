package com.szareckii.hollybibleapp.data

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.szareckii.hollybibleapp.data.net.BookCloud
import com.szareckii.hollybibleapp.data.net.BooksService
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.test.withTestContext
import okhttp3.Dispatcher
import okhttp3.ResponseBody

interface BooksCloudDataSource {

    suspend fun fetchBooks(): List<BookCloud>

    class Base(private val service: BooksService) : BooksCloudDataSource {
        private val gson = Gson()
        private val type = object : TypeToken<List<BookCloud>>() {}.type

        override suspend fun fetchBooks(): List<BookCloud> =
            gson.fromJson(service.fetchBooks().string(), type)
    }
}
