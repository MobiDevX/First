package com.example.first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var editText: EditText
    lateinit var result: TextView
    // Добавление радиогруппы с радиокнопками
    lateinit var radioGroup: RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        result = findViewById(R.id.result)
        editText = findViewById(R.id.editText)
        // Добавление слушателя для редактируемого поля
        editText.addTextChangedListener(textWatcher)
        // Связывание переменной radioGroup с макетом радиогруппы
        radioGroup = findViewById(R.id.radioGroup)
    }

    private val textWatcher = object : TextWatcher {
        override fun afterTextChanged(str: Editable?) {
        }
        override fun beforeTextChanged(str: CharSequence?, start: Int, count: Int, after: Int) {
        }
        override fun onTextChanged(str: CharSequence?, start: Int, before: Int, count: Int) {
            val idRadioButton = radioGroup.checkedRadioButtonId
            val k: Double = when(idRadioButton) {
                R.id.radioButton1 -> 0.7112
                R.id.radioButton2 -> 1066.8
                R.id.radioButton3 -> 2.134
                R.id.radioButton4 -> 0.42
                R.id.radioButton5 -> 0.178
                else -> 1.0
            }
            val number = str.toString().toDouble()*k
            result.text = "%.3f".format(number)
        }
    }
}
