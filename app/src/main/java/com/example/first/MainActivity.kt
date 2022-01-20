package com.example.first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var editText: EditText
    lateinit var result: TextView
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.editText)
        result = findViewById(R.id.result)
        button = findViewById(R.id.button)
        // Интерфейс слушателя для кнопки
        button.setOnClickListener{
            val str = editText.text.toString()
            result.text = (str.toDouble()*.7112).toString()
        }
    }
}

