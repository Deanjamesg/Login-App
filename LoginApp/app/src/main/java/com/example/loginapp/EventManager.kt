package com.example.loginapp

object EventManager {

    private val events: MutableList<Event> = mutableListOf()

    fun addEvent(event: Event) {
        events.add(event)
    }

    fun getEvents(): List<Event> {
        return events.toList()
    }

}