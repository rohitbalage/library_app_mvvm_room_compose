package com.rrbofficial.libraryapp.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface BookDAO {

    @Insert
    suspend fun addBook (bookEntity: BookEntity)


}