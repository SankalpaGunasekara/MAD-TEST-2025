package com.example.test

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView
import com.example.test.databinding.ActivityLogin2Binding

class Login2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        // Find the Sign Up TextView and set click listener
        val tvSignUp = findViewById<TextView>(R.id.tvSignUp)
        tvSignUp.setOnClickListener {
            // Navigate to SignupActivity
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }
        class Login2Activity : AppCompatActivity() {
            private lateinit var binding: ActivityLogin2Binding

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                binding = ActivityLogin2Binding.inflate(layoutInflater)
                setContentView(binding.root)

                binding.tvSignUp.setOnClickListener {
                    val intent = Intent(this, SignupActivity::class.java)
                    startActivity(intent)
                }
            }
        }
        //stay without onboard 2
        val newButton: Button = findViewById(R.id.btnSignIn)

        newButton.setOnClickListener {
            // Navigate to Home
            val intent = Intent(this, com.example.test.HomeActivity::class.java)
            startActivity(intent)
        }
    }
}