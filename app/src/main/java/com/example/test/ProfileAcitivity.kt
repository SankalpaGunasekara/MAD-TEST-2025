package com.example.test

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProfileAcitivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile_acitivity)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val plumb1 = findViewById<ImageView>(R.id.nav_home)
        plumb1.setOnClickListener {
            val intent1 = Intent(this, HomeActivity::class.java)
            startActivity(intent1)
        }

        val plumb2 = findViewById<ImageView>(R.id.bookUI)
        plumb2.setOnClickListener {
            val intent1 = Intent(this, BookingsActivity::class.java)
            startActivity(intent1)
        }

        val plumb3 = findViewById<ImageView>(R.id.tipimg)
        plumb3.setOnClickListener {
            val intent1 = Intent(this, TipsActivity::class.java)
            startActivity(intent1)
        }

        val plumb4 = findViewById<ImageView>(R.id.profimg)
        plumb4.setOnClickListener {
            val intent1 = Intent(this, ProfileAcitivity::class.java)
            startActivity(intent1)
        }



    }
}