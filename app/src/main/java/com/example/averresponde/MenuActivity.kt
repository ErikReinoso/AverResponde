package com.example.averresponde

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.example.averresponde.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)



        //asisgnar accion al boton pintura normalmente
        /**/
        var btnPintura = findViewById<ImageButton>(R.id.btnPintura)
        btnPintura.setOnClickListener {
            //para cambiar a la otra activity
            var intent= Intent(this,PreguntasActivity::class.java)
            startActivity(intent)
        }
        // asisgnar accion al boton Musica con binding
        binding.btnMusica.setOnClickListener(){
            //para cambiar a la otra activity
            var intent= Intent(this,PreguntasActivity::class.java)
            startActivity(intent)

            binding.textViewCategoria.text = "GENIAL"
        }





    }
}