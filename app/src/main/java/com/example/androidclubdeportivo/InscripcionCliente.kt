package com.example.androidclubdeportivo

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class InscripcionCliente : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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
    }
}