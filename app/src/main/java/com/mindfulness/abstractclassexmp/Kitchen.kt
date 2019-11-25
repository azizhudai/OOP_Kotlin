package com.mindfulness.abstractclassexmp

abstract class Kitchen(
    private val name: String,
    private val calorie: Int
) {   // Concrete (Non Abstract) Properties

    // Abstract Property (Must be overridden by Subclasses)
    abstract var maxSpeed: Double

    // Abstract Methods (Must be implemented by Subclasses)
    abstract fun stewed()

    abstract fun blowOut()

    // Concrete (Non Abstract) Method
    fun displayDetails() {
        println("Name: $name, Calorie: $calorie")
    }


}