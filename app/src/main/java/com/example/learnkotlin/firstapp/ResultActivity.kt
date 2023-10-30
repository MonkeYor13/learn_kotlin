package com.example.learnkotlin.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.learnkotlin.R
import com.example.learnkotlin.R.id.tvResult

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvResult= findViewById<TextView>(tvResult)

        //aqui recibimos la informacion ingresada desde la primera pantalla
        val texto = intent.extras?.getString("EXTRA_TEXTO").orEmpty()

        //aqui agregamos la info recibida para qeu se muestre
        tvResult.text = "Hola $texto"


    }
}