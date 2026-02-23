package com.kp.projectcalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private var first = ""
    private var second = ""
    private var action = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val tvResult = findViewById<TextView>(R.id.tvResult)
        val buttons = listOf(
            findViewById<Button>(R.id.btn0),
            findViewById<Button>(R.id.btn1),
            findViewById<Button>(R.id.btn2),
            findViewById<Button>(R.id.btn3),
            findViewById<Button>(R.id.btn4),
            findViewById<Button>(R.id.btn5),
            findViewById<Button>(R.id.btn6),
            findViewById<Button>(R.id.btn7),
            findViewById<Button>(R.id.btn8),
            findViewById<Button>(R.id.btn9)
        )

        buttons.forEachIndexed { index, button ->
            button.setOnClickListener {
                appendNumber(index.toString())
                tvResult.text = if (action.isEmpty()) first else second
            }
        }
        val btnPlus = findViewById<Button>(R.id.btnPlus)
        val btnMinus = findViewById<Button>(R.id.btnMinus)
        val btnMultiply = findViewById<Button>(R.id.btnMultiply)
        val btnDivide = findViewById<Button>(R.id.btnDivide)
        val btnEquals = findViewById<Button>(R.id.btnEquals)

        btnPlus.setOnClickListener {
            action = "+"
        }
        btnMinus.setOnClickListener {
            action = "-"
        }
        btnMultiply.setOnClickListener {
            action = "*"
        }
        btnDivide.setOnClickListener {
            action = "/"
        }
        btnEquals.setOnClickListener {
            val num1 = first.toIntOrNull() ?: 0
            val num2 = second.toIntOrNull() ?: 0
            val result = when(action) {
                "+" -> num1 + num2
                "-" -> num1 - num2
                "*" -> num1 * num2
                "/" -> if (num2 != 0) num1 / num2 else 0
                else -> 0
            }
            tvResult.text = result.toString()
            first = result.toString()
            second = ""
            action = ""
        }
    }
    private fun appendNumber(number: String) {
        if (action.isEmpty()) {
            first += number
        } else {
            second += number
        }
    }
}