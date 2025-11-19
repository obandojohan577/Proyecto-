package com.example.islagorgonaap

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        auth = FirebaseAuth.getInstance()

        val buttonHistory = findViewById<Button>(R.id.buttonHistory)
        val buttonSpecies = findViewById<Button>(R.id.buttonSpecies)
        val buttonLogout = findViewById<Button>(R.id.buttonLogout)

        // Navegar a la pantalla de Historia (RF-04)
        buttonHistory.setOnClickListener {
            val intent = Intent(this, HistoriaActivity::class.java)
            startActivity(intent)
        }

        // Navegar a la pantalla de Especies (RF-05)
        buttonSpecies.setOnClickListener {
            val intent = Intent(this, EspeciesActivity::class.java)
            startActivity(intent)
        }

        // Cerrar sesión (RF-09)
        buttonLogout.setOnClickListener {
            // Cerrar la sesión en Firebase
            auth.signOut()

            // Regresar a la pantalla de Login
            val intent = Intent(this, LoginActivity::class.java)
            // Limpiar el historial de pantallas para que no se pueda volver atrás
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            finish() // Cierra MainActivity
        }
    }
}