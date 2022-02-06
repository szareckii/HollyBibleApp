package com.szareckii.hollybibleapp.data.net

import com.google.gson.annotations.SerializedName
import com.szareckii.hollybibleapp.core.Abstract
import com.szareckii.hollybibleapp.core.Book

data class BookCloud(
    @SerializedName("id")
    private val id: Int,
    @SerializedName("name")
    private val name: String
) : Abstract.Object<Book, BookCloudMapper>() {
    override fun map(mapper: BookCloudMapper) = mapper.map(id, name)
}