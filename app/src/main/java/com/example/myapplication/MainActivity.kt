package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val autotextView = findViewById<AutoCompleteTextView>(R.id.autoTextView)

        val languages = resources.getStringArray(R.array.Languages)

        val adapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_single_choice, languages)

        autotextView.setAdapter(adapter)
    }
}
