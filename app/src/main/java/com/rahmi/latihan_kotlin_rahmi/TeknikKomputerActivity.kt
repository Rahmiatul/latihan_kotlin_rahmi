package com.rahmi.latihan_kotlin_rahmi

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class TeknikKomputerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teknik_komputer)

        // Back button functionality
        val btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener {
            finish() // Closes the activity and goes back to the previous screen
        }
    }
}