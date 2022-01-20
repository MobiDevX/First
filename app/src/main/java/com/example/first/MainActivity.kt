package com.example.first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var editText: EditText
    lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        result = findViewById(R.id.result)
        editText = findViewById(R.id.editText)
        // Добавление слушателя для редактируемого поля
        editText.addTextChangedListener(textWatcher)
    }

    private val textWatcher = object : TextWatcher {
        override fun afterTextChanged(str: Editable?) {
        }
        override fun beforeTextChanged(str: CharSequence?, start: Int, count: Int, after: Int) {
        }
        override fun onTextChanged(str: CharSequence?, start: Int, before: Int, count: Int) {
            result.text = (str.toString().toDouble()*.7112).toString()
        }
    }
}

