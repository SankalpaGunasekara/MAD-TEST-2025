package com.example.test

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PaymentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_payment)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val payNowButton: Button = findViewById(R.id.paynowbtn)

        payNowButton.setOnClickListener {
            // Navigate to Home
            val intent = Intent(this, PaymentSuccessActivity::class.java)
            startActivity(intent)
        }

        val backArrow = findViewById<android.widget.ImageView>(R.id.back_arrow)
        backArrow.setOnClickListener {
            onBackPressed()
        }
    }

}