package com.example.diario5.lezioni.db

import androidx.room.*
import com.example.diario5.lezioni.db.Lezioni

@Dao
interface LezioniDao {
    @Query("SELECT * FROM lezioni")
    fun getAll(): Array<Lezioni>

    @Query(value = "SELECT * FROM lezioni ORDER BY orario")
    fun findByOrario(orario: Int): Lezioni

    @Insert
    fun insertLezione(vararg lezione: Lezioni)

    @Insert
    fun insertOrario(vararg orario: Lezioni)

    @Delete
    fun delete(lezioni: Lezioni)

    @Update
    fun updateLezioni(vararg lezioni: Lezioni)

}
