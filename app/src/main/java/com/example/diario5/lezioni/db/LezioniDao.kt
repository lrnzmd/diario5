package com.example.diario5.lezioni.db

import androidx.room.*

@Dao
interface LezioniDao {
    @Query("SELECT * FROM lezioni")
    fun getAll(): Array<Lezioni>

//    @Query("SELECT * FROM lezioni ORDER BY orario")
//    fun findByOrario(orario: Int): Lezioni
//
//    @Query("SELECT * FROM lezioni ORDER BY giorno")
//    fun findByGiorno(giorno: String): Lezioni

    @Insert
    fun insertMateria(vararg materia: Lezioni)

    @Insert
    fun insertOrario(vararg orario: String)

    @Insert
    fun insertGiorno(vararg giorno: Lezioni)

    @Update
    fun updateLezioni(vararg lezioni: Lezioni)

    @Delete
    fun delete(lezioni: Lezioni)



}
