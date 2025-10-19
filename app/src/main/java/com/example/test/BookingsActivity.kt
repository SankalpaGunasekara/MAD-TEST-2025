package com.example.test

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BookingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bookings)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val homeButton = findViewById<Button>(R.id.home_nav)
        homeButton.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        // --- FIX 3: Use the correct ID (navBookings) and correct type (Button) ---
        val bookingsButton = findViewById<Button>(R.id.navBookings)
        bookingsButton.setOnClickListener {
            val intent = Intent(this, BookingsActivity::class.java)
            startActivity(intent)
        }

        // --- FIX 4: Use the correct ID (navTips) and correct type (Button) ---
        val tipsButton = findViewById<Button>(R.id.navTips)
        tipsButton.setOnClickListener {
            val intent = Intent(this, TipsActivity::class.java)
            startActivity(intent)
        }

        // --- FIX 5: Use the correct ID (navProfile) and correct type (Button) ---
        val profileButton = findViewById<Button>(R.id.nav_Profile)
        profileButton.setOnClickListener {
            val intent = Intent(this, ProfileAcitivity::class.java)
            startActivity(intent)
        }
    }

}