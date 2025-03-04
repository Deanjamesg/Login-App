package com.example.loginapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val usernameDisplay: TextView = findViewById(R.id.username_display)
        val passwordDisplay: TextView = findViewById(R.id.password_display)

        val username = intent.getStringExtra("username")
        val password = intent.getStringExtra("password")

        usernameDisplay.text = username
        passwordDisplay.text = password
    }
}