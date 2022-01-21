package com.example.first

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

    const val EXTRA_ONE = "one"
    const val EXTRA_TWO = "two"
class MainActivity : AppCompatActivity() {
    lateinit var editText: EditText
    lateinit var result: TextView
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        result = findViewById(R.id.result)
        editText = findViewById(R.id.editText)
        // Добавление слушателя для редактируемого поля
        editText.addTextChangedListener(textWatcher)

        // Добавление кнопки для вызова NextActivity
        button = findViewById(R.id.button)
        button.setOnClickListener {
            // Вызов NextActivity
            val intent = Intent(this, NextActivity::class.java)
            val one = editText.text.toString()
            val two = one.toDouble() * 0.7112
            intent.putExtra(EXTRA_ONE, one)
            intent.putExtra(EXTRA_TWO, two)
            startActivity(intent)
        }
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

