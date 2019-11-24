package com.diegov22.crud_v11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.EditText

class Agregar : AppCompatActivity() {

    private var btnStore: Button? = null
    private var btnGetall: Button? = null
    private var etname: EditText? = null
    private var ethobby: EditText? = null
    private var databaseHelper: DatabaseHelper? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agregar)

        databaseHelper = DatabaseHelper(this)

        btnStore = findViewById(R.id.btnstore) as Button
        etname = findViewById(R.id.etname) as EditText
        ethobby = findViewById(R.id.ethobby) as EditText

        btnStore!!.setOnClickListener {
            databaseHelper!!.addUserDetail(etname!!.text.toString(), ethobby!!.text.toString())
            etname!!.setText("")
            ethobby!!.setText("")
            Toast.makeText(this@Agregar, "Stored Successfully!", Toast.LENGTH_SHORT).show()
        }
    }
}
