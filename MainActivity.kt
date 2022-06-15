package com.example.kotlinegitim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnOrder.setOnClickListener {
            val chechekMeatRadioId = rgMeat.checkedRadioButtonId
            val meat = findViewById<RadioButton>(chechekMeatRadioId)
            val cheese = cbCheese.isChecked
            val onions = cbOnions.isChecked
            val salad = cbSalad.isChecked
            val orderString = "You ordered a burger with:\n" +
                    "${meat.text}" +
                    (if (cheese) "\nCheese" else "")+
                    (if (onions)"\nOnions" else "") +
                    (if (salad)"\nSalad" else "")
            tvOrder.text=orderString
        }
    }
}
