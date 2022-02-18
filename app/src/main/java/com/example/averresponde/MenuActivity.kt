package com.example.averresponde

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.example.averresponde.databinding.ActivityMenuBinding
import android.view.View

import android.R
import android.R.id
import android.R.id.button1







class MenuActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)



        //asisgnar accion al boton pintura con binding
        /**/
        binding.imgButtJuegos.setOnClickListener(){
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

        // asisgnar accion al boton Cerrar con binding
        binding.buttonCerrar.setOnClickListener(){
            //para cerrar la actividad
            val cerrar = findViewById<View>(id.closeButton) as Button
            cerrar.setOnClickListener { finish() }
        }





    }
}