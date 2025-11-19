package com.example.islagorgonaap

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HistoriaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_historia)

        val buttonBack = findViewById<Button>(R.id.buttonBackHistory)

        // Botón para volver (RF-08)
        buttonBack.setOnClickListener {
            // Cierra la actividad actual y regresa a la anterior (MainActivity)
            finish()
        }
    }
}