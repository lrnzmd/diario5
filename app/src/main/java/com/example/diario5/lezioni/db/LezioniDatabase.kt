package com.example.diario5.lezioni.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Lezioni::class), version = 1)
abstract class LezioniDatabase : RoomDatabase() {
    abstract fun lezioniDao(): LezioniDao

    companion object {
        private var INSTANCE: LezioniDatabase? = null
        fun getDatabase(context: Context): LezioniDatabase? {
            if (INSTANCE == null) {
                synchronized(LezioniDatabase::class) {
                    INSTANCE = Room.databaseBuilder(
                        context.getApplicationContext(),
                        LezioniDatabase::class.java, "lezioni.db"
                    ).build()
                }
            }
            return INSTANCE
        }
    }
}

