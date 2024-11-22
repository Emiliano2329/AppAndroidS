package com.appsmoviles.android

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import androidx.activity.ComponentActivity
import coil.load // Importación correcta para Coil

class MainActivity : ComponentActivity() {
    // URL base para cargar imágenes de gatos
    private val url: String = "https://cataas.com/cat?type=square"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Vinculación de vistas desde el layout XML
        val buttonLeft: Button = findViewById(R.id.buttonleft)
        val myImageView: ImageView = findViewById(R.id.imageView)

        // Listener para el botón
        buttonLeft.setOnClickListener {
            Log.d("MIAPP", "Botón izquierdo presionado")
            // Cargar la imagen usando Coil
            myImageView.load("$url&t=${System.currentTimeMillis()}")
        }
    }
}
