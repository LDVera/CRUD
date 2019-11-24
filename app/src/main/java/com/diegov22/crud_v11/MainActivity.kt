package com.diegov22.crud_v11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var AgregarAct: ImageView? = null
    private var ObtenerRegistrossAct: ImageView? = null
    private var EliminarRegistrosAct: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AgregarAct = findViewById(R.id.AgregarUsuarioImagen) as ImageView
        ObtenerRegistrossAct = findViewById(R.id.ObtenerUsuarios) as ImageView


        AgregarAct!!.setOnClickListener() {
            val intent = Intent(this@MainActivity, Agregar::class.java)
            startActivity(intent)

            Toast.makeText(this@MainActivity, "Bienvenido al registro de usuarios", Toast.LENGTH_LONG).show()
        }

        ObtenerRegistrossAct!!.setOnClickListener() {
            val intent = Intent(this@MainActivity, GetAllUsersActivity::class.java)
            startActivity(intent)

            Toast.makeText(this@MainActivity, "Mostrando registros de usuarios", Toast.LENGTH_SHORT).show()
        }



    }
}
