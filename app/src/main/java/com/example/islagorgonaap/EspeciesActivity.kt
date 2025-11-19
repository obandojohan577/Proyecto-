package com.example.islagorgonaap

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class EspeciesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_especies)

        val cardWhale = findViewById<CardView>(R.id.cardWhale)
        val cardMonkey = findViewById<CardView>(R.id.cardMonkey)
        val cardSnake = findViewById<CardView>(R.id.cardSnake)
        val buttonBack = findViewById<Button>(R.id.buttonBackSpecies) // ID corregido

        // Función para abrir el detalle de una especie
        fun openDetail(speciesName: String) {
            val intent = Intent(this, DetalleEspecieActivity::class.java)
            // Enviamos el nombre de la especie a la siguiente pantalla (RF-06)
            intent.putExtra("SPECIES_NAME", speciesName)
            startActivity(intent)
        }

        cardWhale.setOnClickListener {
            openDetail("whale")
        }

        cardMonkey.setOnClickListener {
            openDetail("monkey")
        }

        cardSnake.setOnClickListener {
            openDetail("snake")
        }

        // Botón para volver (RF-08)
        buttonBack.setOnClickListener {
            // Cierra la actividad actual y regresa a la anterior (MainActivity)
            finish()
        }
    }
}