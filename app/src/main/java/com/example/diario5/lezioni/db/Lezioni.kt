package com.example.diario5.lezioni.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "lezioni")
class Lezioni {
    @PrimaryKey
    @ColumnInfo(name = "orario")
    var orario: String = ""

    @ColumnInfo(name = "materia")
    var materia: String = ""

    @ColumnInfo(name = "giorno")
    var giorno: String = ""
}
