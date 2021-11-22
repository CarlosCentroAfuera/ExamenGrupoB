package com.carlostena.examengrupob

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.carlostena.examengrupob.databinding.ActivityActividad2Binding

class Actividad2 : AppCompatActivity() {

    private lateinit var binding : ActivityActividad2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityActividad2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val texto = intent.getStringExtra("TEXTO")
        texto?.let {
            Toast.makeText(this, texto, Toast.LENGTH_LONG).show()
            val textoConEnter = texto.replace(",","\n")
            binding.tvTexto.text = textoConEnter
        }

    }
}