package com.example.first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        val strOne = intent.getStringExtra(EXTRA_ONE)
        val strTwo = intent.getDoubleExtra(EXTRA_TWO, 7112.0)
        val textView = findViewById<TextView>(R.id.next)
        textView.text = strOne + " аршин равно " + strTwo.toString() + " метров"
    }
}