package com.example.test

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.LinearLayout

class PlumbingserviceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_plumbingservice)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.plumb
        )) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //stay without onboard 2
//        val newButton: Button = findViewById(R.id.plumbingbtn)
//
//        newButton.setOnClickListener {
//            // Navigate to Home
//            val intent = Intent(this, PlumbingserviceActivity ::class.java)
//            startActivity(intent)
//        }
        val plumb = findViewById<LinearLayout>(R.id.kasun)
        plumb.setOnClickListener {
            val intent1 = Intent(this, ProviderDetailsActivity::class.java)
            startActivity(intent1)
        }
    }
}