package com.example.diario5.lezioni.giorni

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.diario5.R


class Lunedi : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lunedi)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        // Restore UI state from the savedInstanceState.
// This bundle has also been passed to onCreate
        val myString = savedInstanceState.getString("MyString")
    }
}
