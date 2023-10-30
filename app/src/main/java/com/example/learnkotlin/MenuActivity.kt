package com.example.learnkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.learnkotlin.ImcCalculator.ImcCalculatorActivity
import com.example.learnkotlin.firstapp.FirstAppActivity
import com.example.learnkotlin.firstapp.ResultActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        //vinculamos con el elemento
        val saludoApp = findViewById<Button>(R.id.btnSaludoApp)
        val imcApp = findViewById<Button>(R.id.btnImcApp)

        //creamos el llamado al boton
        saludoApp.setOnClickListener {navegationToSaludoApp()}
        imcApp.setOnClickListener {navegationToImcApp()}
    }

    private fun navegationToImcApp() {
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navegationToSaludoApp (){
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)


    }
}