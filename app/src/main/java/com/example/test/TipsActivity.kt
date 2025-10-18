package com.example.test

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TipsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tips)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val homeButton = findViewById<ImageView>(R.id.nav_home)
        homeButton.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        val bookingsButton = findViewById<ImageView>(R.id.bookUI)
        bookingsButton.setOnClickListener {
            val intent = Intent(this, BookingsActivity::class.java)
            startActivity(intent)
        }

        val profileButton = findViewById<ImageView>(R.id.profimg)
        profileButton.setOnClickListener {
            val intent = Intent(this, ProfileAcitivity::class.java)
            startActivity(intent)
        }

        val tipsButton = findViewById<ImageView>(R.id.tipimg)
        tipsButton.setOnClickListener {
            val intent = Intent(this, TipsActivity::class.java)
            startActivity(intent)
        }

        val backArrow = findViewById<ImageView>(R.id.back_arrow)
        backArrow.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
}