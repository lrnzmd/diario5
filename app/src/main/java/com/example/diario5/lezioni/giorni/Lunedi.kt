package com.example.diario5.lezioni.giorni

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.diario5.R
import com.example.diario5.lezioni.db.LezioniAdapter


class Lunedi : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lunedi)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_lunedi)
        val adapter = LezioniAdapter(this)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)



    }

}
