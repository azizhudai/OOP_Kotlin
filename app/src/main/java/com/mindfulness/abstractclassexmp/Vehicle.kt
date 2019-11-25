package com.mindfulness.abstractclassexmp

abstract class Vehicle(val name: String,
                       val color: String,
                       val weight: Double) {   // Concrete (Non Abstract) Properties

    // Abstract Property (Must be overridden by Subclasses)
    abstract var maxSpeed: Double

    // Abstract Methods (Must be implemented by Subclasses)
    abstract fun start()

    abstract fun stop()

    // Concrete (Non Abstract) Method
    fun displayDetails() {
        println("Name: $name, Color: $color, Weight: $weight, Max Speed: $maxSpeed")
    }
    fun Int.extentionFun(deger :Int):Int{
        return this*deger
    }
    fun Int.carp(): Int {
        return this * 3
    }

}