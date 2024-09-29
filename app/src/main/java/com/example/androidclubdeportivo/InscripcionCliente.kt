package com.example.androidclubdeportivo

import android.os.Bundle
<<<<<<< HEAD
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
=======
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
>>>>>>> dani

class InscripcionCliente : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
<<<<<<< HEAD
        enableEdgeToEdge()
        setContentView(R.layout.activity_inscripcion_cliente)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
=======
        setContentView(R.layout.activity_inscripcion_cliente)


        // Referencia al Spinner en el layout
        val spinnerDocumentType: Spinner = findViewById(R.id.spinnerDocumentType)

        // Crear el ArrayAdapter con los valores del array de strings
        val adapter = ArrayAdapter.createFromResource(
            this,
            R.array.document_type_array,  // Referencia al array en strings.xml
            android.R.layout.simple_spinner_item
        )

        // Especificar el layout para las opciones desplegables del Spinner
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Asignar el adapter al Spinner
        spinnerDocumentType.adapter = adapter
>>>>>>> dani
    }
}