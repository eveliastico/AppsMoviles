package com.appsmoviles.practica04_thecheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class activity_menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnHotDrinks = findViewById<Button>(R.id.btn_hot_drinks)
        val btnColdDrinks = findViewById<Button>(R.id.btn_cold_drinks)
        val btnSalties = findViewById<Button>(R.id.btn_salties)
        val btnSweets = findViewById<Button>(R.id.btn_sweets)

        btnHotDrinks.setOnClickListener {
            navigateToProductosActivity(R.drawable.hotdrinks, "hotDrinks")
        }

        btnColdDrinks.setOnClickListener {
            navigateToProductosActivity(R.drawable.colddrinks, "coldDrinks")
        }

        btnSalties.setOnClickListener {
            navigateToProductosActivity(R.drawable.salties, "salties")
        }

        btnSweets.setOnClickListener {
            navigateToProductosActivity(R.drawable.sweets, "sweets")
        }

    }

    private fun navigateToProductosActivity(imageResId: Int, productType: String) {
        val intent = Intent(this, ProductosActivity::class.java).apply {
            putExtra("IMAGE_RES_ID", imageResId)
            putExtra("PRODUCT_TYPE", productType)
        }
        startActivity(intent)
    }

}