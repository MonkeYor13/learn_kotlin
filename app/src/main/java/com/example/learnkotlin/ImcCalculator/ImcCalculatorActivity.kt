package com.example.learnkotlin.ImcCalculator

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.example.learnkotlin.R

class ImcCalculatorActivity : AppCompatActivity() {

    private var isCardMale = true
    private var isCardFemale = false

    private lateinit var cardMale:CardView
    private lateinit var cardFemale:CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc_calculator)

        initComponent()
        initListners()
    }

    private fun initComponent() {
        cardMale = findViewById(R.id.cardMale)
        cardFemale = findViewById(R.id.cardFemale)
    }

    //funcion al hacer click sobre cada boton
    private fun initListners() {
        cardMale.setOnClickListener { setChangedColor() }
        cardFemale.setOnClickListener { setChangedColor() }
    }

    private fun setChangedColor(){
        cardMale.setCardBackgroundColor(colorReal(isCardMale))
        cardFemale.setCardBackgroundColor(colorReal(isCardFemale))
    }

    private fun colorReal(isSeletedComponent:Boolean): Int {
        val colorReference = if (isSeletedComponent){
            R.color.bg_component_selected
        } else {
            R.color.bg_component
        }
        return ContextCompat.getColor(this, colorReference)
    }




}