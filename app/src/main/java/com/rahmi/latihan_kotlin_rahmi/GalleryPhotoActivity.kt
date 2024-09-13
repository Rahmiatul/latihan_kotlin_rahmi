package com.rahmi.latihan_kotlin_rahmi

import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity
import com.rahmi.latihan_kotlin_rahmi.adapter.PhotoGridAdapter

class GalleryPhotoActivity : AppCompatActivity() {

    // Sample image resource array
    private val imageList = arrayOf(
        R.drawable.logo_pnp,
        R.drawable.logo_ti,
        R.drawable.logo_trpl,
        R.drawable.logo_tekom,
        R.drawable.logo_mi,
        R.drawable.foto_poli
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery_photo)

        // Set up the GridView for photos
        val gridView = findViewById<GridView>(R.id.gridView)
        val adapter = PhotoGridAdapter(this, imageList)
        gridView.adapter = adapter

        // Set up onClickListener for grid items
        gridView.setOnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, PhotoDetailActivity::class.java)
            intent.putExtra("imageResId", imageList[position]) // Pass the selected image ID to detail activity
            startActivity(intent)
        }
    }
}