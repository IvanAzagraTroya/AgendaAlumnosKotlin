package com.ivan.applistaalumnosivanazagra

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView


class AlumnoAdapter(
    val mContext: Context,
    val listAlumnos: List<Alumno>

): ArrayAdapter<Alumno>(mContext, 0, listAlumnos) {
    private lateinit var nombre: TextView
    private lateinit var telefono: TextView
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layout = LayoutInflater.from(mContext).inflate(R.layout.datos_alumno,parent, false)
        val alumno = listAlumnos[position]

        nombre = layout.findViewById(R.id.nombre)
        telefono = layout.findViewById(R.id.telefono)

        nombre.text = alumno.nombre
        telefono.text = alumno.telefono

        return layout
    }
}