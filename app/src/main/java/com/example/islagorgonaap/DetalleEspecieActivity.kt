package com.example.islagorgonaap

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetalleEspecieActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_especie)

        val title = findViewById<TextView>(R.id.speciesDetailTitle)
        val image = findViewById<ImageView>(R.id.speciesDetailImage)
        val description = findViewById<TextView>(R.id.speciesDetailDescription)
        val buttonBack = findViewById<Button>(R.id.buttonBackDetail)

        // Recibimos el nombre de la especie que enviamos desde EspeciesActivity
        val speciesName = intent.getStringExtra("SPECIES_NAME")

        // Cargamos los datos correctos según la especie seleccionada
        when (speciesName) {
            "whale" -> {
                title.text = getString(R.string.species_whale)
                image.setImageResource(R.drawable.ballena)
                description.text = getString(R.string.whale_description)
            }
            "monkey" -> {
                title.text = getString(R.string.species_monkey)
                image.setImageResource(R.drawable.mono)
                description.text = getString(R.string.monkey_description)
            }
            "snake" -> {
                title.text = getString(R.string.species_snake)
                image.setImageResource(R.drawable.serpiente)
                description.text = getString(R.string.snake_description)
            }
        }

        // Botón para volver
        buttonBack.setOnClickListener {
            finish()
        }
    }
}