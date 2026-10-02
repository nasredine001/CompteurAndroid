package com.example.compteurandroid

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var compteur: Int = 0

    private lateinit var textViewCompteur: TextView
    private lateinit var buttonIncrementer: Button
    private lateinit var buttonDecrementer: Button
    private lateinit var buttonReinitialiser: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        textViewCompteur = findViewById(R.id.textViewCompteur)
        buttonIncrementer = findViewById(R.id.buttonIncrementer)
        buttonDecrementer = findViewById(R.id.buttonDecrementer)
        buttonReinitialiser = findViewById(R.id.buttonReinitialiser)

        buttonIncrementer.setOnClickListener {
            compteur++
            afficherCompteur()
        }

        buttonDecrementer.setOnClickListener {
            compteur--
            afficherCompteur()
        }

        buttonReinitialiser.setOnClickListener {
            compteur = 0
            afficherCompteur()
        }
    }

    private fun afficherCompteur() {
        textViewCompteur.text = compteur.toString()
    }
}