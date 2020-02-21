package com.example.diario5.lezioni.db

class LezioniRepository(private val lezioniDao: LezioniDao) {

    suspend fun insertOrario(orario: String) {
        lezioniDao.insertOrario(orario)
    }

    suspend fun insertMateria(materia: String) {
        lezioniDao.insertOrario(materia)
    }


}