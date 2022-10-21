package com.ivan.applistaalumnosivanazagra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AlumnoActivity : AppCompatActivity() {
    private lateinit var nombre: TextView
    private lateinit var direccion: TextView
    private lateinit var telefono: TextView
    private lateinit var correo: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alumno)

        val alumno = intent.getSerializableExtra("alumno") as Alumno

        nombre = findViewById(R.id.nombre)
        direccion = findViewById(R.id.direccion)
        telefono = findViewById(R.id.telefono)
        correo = findViewById(R.id.correo)

        nombre.text = alumno.nombre
        direccion.text = alumno.direccion
        telefono.text = alumno.telefono
        telefono.text = alumno.correo
    }
}