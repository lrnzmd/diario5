package com.example.diario5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.diario5.appunti.Appunti
import com.example.diario5.lezioni.Settimana
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            val intent = Intent(this, Appunti::class.java)
            startActivity(intent)
        }

        val button6 = findViewById<Button>(R.id.button6)
        button6.setOnClickListener {
            val intent = Intent(this, impostazioni::class.java)
            startActivity(intent)
        }
        val button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener {
            val intent = Intent(this, Settimana::class.java)
            startActivity(intent)
        }


    }


    fun AddCalendarEvent(view: View?) {
        val calendarEvent: Calendar = Calendar.getInstance()
        val i = Intent(Intent.ACTION_EDIT)
        i.type = "vnd.android.cursor.item/event"
        i.putExtra("beginTime", calendarEvent.getTimeInMillis())
        i.putExtra("allDay", false)
        i.putExtra("rule", "FREQ=YEARLY")
        i.putExtra("endTime", calendarEvent.getTimeInMillis() + 60 * 60 * 1000)
        i.putExtra("title", "Calendar Event")
        startActivity(i)
    }

    fun AddHomeWork(view: View?) {
        val calendarEvent: Calendar = Calendar.getInstance()
        val i = Intent(Intent.ACTION_EDIT)
        i.type = "vnd.android.cursor.item/event"
        i.putExtra("allDay", false)
        i.putExtra("rule", "FREQ=YEARLY")
        i.putExtra("title", "Calendar Event")
        startActivity(i)
    }
}





