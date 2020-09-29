package com.example.contador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var contador = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        BtnIn.setOnClickListener{
            contador++
            TxtVista.text = "$contador"


        }

        BtnDec.setOnClickListener {
            contador--
            TxtVista.text = "$contador"
        }
    }
}