package com.example.loginapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val usernameEditText: EditText = findViewById(R.id.username_input)
        val passwordEditText: EditText = findViewById(R.id.password_input)
        val registerButton: Button = findViewById(R.id.register_btn)
        val loginButton: Button = findViewById(R.id.login_nav_btn)

        // Validate Registration ->

        registerButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()
            val newUser = User(username, password)
            UserManager.addUser(newUser)

            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        loginButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
