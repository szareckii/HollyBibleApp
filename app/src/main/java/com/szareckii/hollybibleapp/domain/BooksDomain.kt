package com.szareckii.hollybibleapp.domain

import com.szareckii.hollybibleapp.core.Abstract
import com.szareckii.hollybibleapp.presentation.BookUI

sealed class BooksDomain : Abstract.Object<BookUI, Abstract.Mapper.Empty>() {

/*
   class Success() : BooksDomain() {
        override fun map(mapper: Abstract.Mapper.Empty): BookUI {
            TODO("Not yet implemented")
        }
    }

    class Fael() : BooksDomain() {
        override fun map(mapper: Abstract.Mapper.Empty): BookUI {
            TODO("Not yet implemented")
        }
    }
*/
}