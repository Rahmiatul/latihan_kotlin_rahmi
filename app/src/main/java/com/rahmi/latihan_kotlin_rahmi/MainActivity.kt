package com.rahmi.latihan_kotlin_rahmi

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Buttons
        val btnManajemenInformatika = findViewById<Button>(R.id.btnManajemenInformatika)
        val btnTeknikKomputer = findViewById<Button>(R.id.btnTeknikKomputer)
        val btnGaleriPhoto = findViewById<Button>(R.id.btnGaleriPhoto)

        // Set button click listeners to open new activities
        btnManajemenInformatika.setOnClickListener {
            val intent = Intent(this, ManajemenInformatikaActivity::class.java)
            startActivity(intent)
        }

        btnTeknikKomputer.setOnClickListener {
            val intent = Intent(this, TeknikKomputerActivity::class.java)
            startActivity(intent)
        }

        btnGaleriPhoto.setOnClickListener {
            val intent = Intent(this, GalleryPhotoActivity::class.java)
            startActivity(intent)
        }
    }
}