package com.example.diario5.lezioni

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "lezioni")
class Lezioni {
    @PrimaryKey
    @ColumnInfo(name = "orario")
    var orario: Int? = null

    @ColumnInfo(name = "lezione")
    var lezione: String? = null
}
