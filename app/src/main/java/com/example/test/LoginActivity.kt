package com.example.test

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val forgotPassword = findViewById<android.widget.TextView>(R.id.tvForgotPassword)
        forgotPassword.setOnClickListener {
            val intent = android.content.Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }

        val signUp = findViewById<android.widget.TextView>(R.id.tvSignUp)
        signUp.setOnClickListener {
            val intent = android.content.Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }

        val signIn = findViewById<android.widget.Button>(R.id.btnSignIn)
        signIn.setOnClickListener {
            val intent = android.content.Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}