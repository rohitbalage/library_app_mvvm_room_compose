package com.rrbofficial.libraryapp.room

import android.icu.text.CaseMap.Title
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class BookEntity(
    @PrimaryKey (autoGenerate = true)
    val id: Int,

//    @ColumnInfo (name = "book_title")
    val title: String,

)
