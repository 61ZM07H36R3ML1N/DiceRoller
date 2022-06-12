package com.example.diceroller

// Dice Roller Program in Kotlin
fun main() {
    val diceRange = 1..6
    val randomNumber = diceRange.random()
    println("Random number: $randomNumber")
}