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
        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        val btn4 = findViewById<Button>(R.id.btn4)
        val btn5 = findViewById<Button>(R.id.btn5)
        val btn6 = findViewById<Button>(R.id.btn6)
        val btn7 = findViewById<Button>(R.id.btn7)

        btn1.setOnClickListener {
            if (tvResult.text.toString() == "0") {
                tvResult.text = "1"
            } else {
                tvResult.append("1")
            }
        }

        btn2.setOnClickListener {
            if (tvResult.text.toString() == "0") {
                tvResult.text = "2"
            } else {
                tvResult.append("2")
            }
        }

        btn3.setOnClickListener {
            if (tvResult.text.toString() == "0") {
                tvResult.text = "3"
            } else {
                tvResult.append("3")
            }
        }

        btn4.setOnClickListener {
            if (tvResult.text.toString() == "0") {
                tvResult.text = "4"
            } else {
                tvResult.append("4")
            }
        }

        btn5.setOnClickListener {
            if (tvResult.text.toString() == "0") {
                tvResult.text = "5"
            } else {
                tvResult.append("5")
            }
        }

        btn6.setOnClickListener {
            if (tvResult.text.toString() == "0") {
                tvResult.text = "6"
            } else {
                tvResult.append("6")
            }
        }

        btn7.setOnClickListener {
            if (tvResult.text.toString() == "0") {
                tvResult.text = "7"
            } else {
                tvResult.append("7")
            }
        }






    }
}