package com.carlostena.examengrupob

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.doAfterTextChanged
import androidx.core.widget.doBeforeTextChanged
import androidx.core.widget.doOnTextChanged
import com.carlostena.examengrupob.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.edTexto.doOnTextChanged { text, start, before, count ->
            text?.let { safeText ->
                var numComas = 0
                safeText.forEach {
                    if (it == ',') {
                        numComas++
                    }
                }
                binding.bNext.isEnabled = numComas >= 4
            }
        }

        binding.bNext.setOnClickListener {

            val intent = Intent(this, Actividad2::class.java)
            intent.putExtra("TEXTO", binding.edTexto.text.toString())
            startActivity(intent)
        }


    }
}