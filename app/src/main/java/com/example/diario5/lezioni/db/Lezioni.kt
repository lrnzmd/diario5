package com.example.diario5.lezioni.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "lezioni")
class Lezioni {
    @PrimaryKey
    @ColumnInfo(name = "orario")
    var orario: Int? = null

    @ColumnInfo(name = "materia")
    var materia: String? = null

    @ColumnInfo(name = "giorno")
    var giorno: String? = null
}
