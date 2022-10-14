package com.example.problemapropuesto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val contra = "abc123"

        btn_verificar.setOnClickListener {
            if (contra == txt_contrasena.text.toString()){
                Toast.makeText(this, "Contraseña correcta", Toast.LENGTH_LONG).show()
                val boton = Intent(this, BienvenidoActivity::class.java)
                startActivity(boton)
            }else{
                Toast.makeText(this, "Contraseña incorrecta vuelve a intentarlo", Toast.LENGTH_LONG).show()
            }

        }
    }
}