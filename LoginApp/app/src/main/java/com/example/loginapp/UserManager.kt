package com.example.loginapp

import android.widget.TextView

object UserManager {

    private val users: MutableList<User> = mutableListOf()

    fun addUser(user: User) {
        users.add(user)
    }

    fun getUserList(): List<User> {
        return users.toList()
    }

    fun loginUser(username: String, password: String): Boolean {
        for (user in users) {
            if (user.username == username && user.password == password) {
                return true
            }
        }
        return false
    }

    fun getUser(username: String): User? {
        for (user in users) {
            if (user.username == username) {
                return user
            }
        }
        return null
    }

}