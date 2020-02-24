package com.example.diario5.lezioni

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.diario5.R
import com.example.diario5.appunti.Appunti
import com.example.diario5.lezioni.giorni.*
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Settimana : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lezioni)

        val lunedi = findViewById<Button>(R.id.lunedi)
        lunedi.setOnClickListener {
            val intent = Intent(this, Lunedi::class.java)
            startActivity(intent)
        }

        val martedi = findViewById<Button>(R.id.martedi)
        martedi.setOnClickListener {
            val intent = Intent(this, Martedi::class.java)
            startActivity(intent)
        }

        val mercoledi = findViewById<Button>(R.id.mercoledi)
        mercoledi.setOnClickListener {
            val intent = Intent(this, Mercoledi::class.java)
            startActivity(intent)
        }

        val giovedi = findViewById<Button>(R.id.giovedi)
        giovedi.setOnClickListener {
            val intent = Intent(this, Giovedi::class.java)
            startActivity(intent)
        }

        val venerdi = findViewById<Button>(R.id.venerdi)
        venerdi.setOnClickListener {
            val intent = Intent(this, Venerdi::class.java)
            startActivity(intent)
        }

        val sabato = findViewById<Button>(R.id.sabato)
        sabato.setOnClickListener {
            val intent = Intent(this, Sabato::class.java)
            startActivity(intent)
        }

        val fab = findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener {
            val intent = Intent(this, New_Lezione::class.java)
            startActivity(intent)
        }


    }
}
