package com.example.loginapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val usernameEditText: EditText = findViewById(R.id.username_input)
        val passwordEditText: EditText = findViewById(R.id.password_input)
        val registerButton: Button = findViewById(R.id.register_btn)
        val loginButton: Button = findViewById(R.id.login_btn)

        registerButton.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (UserManager.loginUser(username, password)) {
                val user = UserManager.getUser(username)
                if (user != null) {
                    val intent = Intent(this, ProfileActivity::class.java)
                    intent.putExtra("username", user.username)
                    intent.putExtra("password", user.password)
                    startActivity(intent)
                }
            } else {
                Toast.makeText(this, "Invalid credentials", Toast.LENGTH_SHORT).show()
            }
        }
    }
}