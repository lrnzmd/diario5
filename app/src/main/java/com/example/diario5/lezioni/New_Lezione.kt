package com.example.diario5.lezioni

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import com.example.diario5.R
import kotlinx.android.synthetic.main.new_lezione.*


class New_Lezione : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.new_lezione)

        val button = findViewById<Button>(R.id.aggiungiBtn)

        val days = resources.getStringArray(R.array.Giorno)

        val spinner = findViewById<Spinner>(R.id.spinner)

        if (spinner != null) {
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, days)
            spinner.adapter = adapter

            spinner.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>?, view: View?, position: Int, id: Long
                ) {
                    parent?.getItemAtPosition(position).toString()
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    button.isClickable = false
                }
            }
        }

        button.setOnClickListener {
            val replyIntent = Intent()
            if (TextUtils.isEmpty(edit_materia.text)) {
                setResult(Activity.RESULT_CANCELED, replyIntent)
            } else {
                val materia = edit_materia.text.toString()
                val orario = edit_time.text.toString()
                val giorno = spinner.selectedItem.toString()
                replyIntent.putExtra(materia, orario, giorno)
                setResult(Activity.RESULT_OK, replyIntent)
            }
            finish()
        }

    }
}

