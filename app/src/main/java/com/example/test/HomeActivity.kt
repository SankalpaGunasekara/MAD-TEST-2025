package com.example.test

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val plumb = findViewById<ImageView>(R.id.plumbingbtn)
        plumb.setOnClickListener {
            val intent1 = Intent(this, PlumbingserviceActivity::class.java)
            startActivity(intent1)
        }

        val plumb1 = findViewById<ImageView>(R.id.home_nav)
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