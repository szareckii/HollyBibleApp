package com.szareckii.hollybibleapp.core

import android.app.Application
import com.szareckii.hollybibleapp.data.BooksCloudDataSource
import com.szareckii.hollybibleapp.data.BooksCloudMapper
import com.szareckii.hollybibleapp.data.BooksRepository
import com.szareckii.hollybibleapp.data.cache.BookCacheMapper
import com.szareckii.hollybibleapp.data.cache.BooksCacheDataSource
import com.szareckii.hollybibleapp.data.cache.BooksCacheMapper
import com.szareckii.hollybibleapp.data.cache.RealmProvider
import com.szareckii.hollybibleapp.data.net.BookCloudMapper
import com.szareckii.hollybibleapp.data.net.BooksService
import retrofit2.Retrofit

class BibleApp : Application() {

    private companion object {
        const val BASE_URL = "https://bible-go-api.rkeplin.com/v1/"
    }

    override fun onCreate() {
        super.onCreate()

        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .build()
        val service = retrofit.create(BooksService::class.java)

        val cloudDataSource = BooksCloudDataSource.Base(service)
        val cacheDataSource = BooksCacheDataSource.Base(RealmProvider.Base())
        val booksCloudMapper = BooksCloudMapper.Base(BookCloudMapper.Base())
        val booksCacheMapper = BooksCacheMapper.Base(BookCacheMapper.Base())

        val booksRepository = BooksRepository.Base(
            cloudDataSource,
            cacheDataSource,
            booksCloudMapper,
            booksCacheMapper,
        )
    }
}