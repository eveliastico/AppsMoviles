package com.appsmoviles.practica04_thecheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val button: Button = findViewById(R.id.btn_signin)

        button.setOnClickListener {
            var intent: Intent = Intent(this, activity_menu::class.java)
            startActivity(intent)
        }

    }
}