package com.ivan.applistaalumnosivanazagra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var listaAlumnos: ListView

    val alumno = Alumno("Sergio", "la dirección de Sergio", "123001230", "asiessergiotengotusdatos@cuidao.com")
    val alumno2 = Alumno("Fran", "la dirección de Fran", "124001240", "asiesfrantengotusdatos@cuidao.com")
    val alumno3 = Alumno("Roberto", "la dirección de Roberto", "125001250", "asiesrobertotengotusdatos@cuidao.com")
    val alumno4 = Alumno("Medaperezapensarmas", "la dirección de buenapregunta", "223001231", "adatos@cuidao.com")
    var listAlumnos: List<Alumno> = listOf(alumno, alumno2, alumno3, alumno4)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listaAlumnos = findViewById(R.id.listaAlumnos)

        val adapter = AlumnoAdapter(this, listAlumnos)
        listaAlumnos.adapter = adapter

        listaAlumnos.setOnItemClickListener {
            parent, view, position, id ->
            val intent = Intent(this, AlumnoActivity::class.java)
            intent.putExtra("alumno", listAlumnos[position])

            startActivity(intent)
        }
    }


}