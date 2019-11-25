package com.mindfulness.abstractclassexmp

class Car(name: String,
          color: String,
          weight: Double,
          engine:Int,
          override var maxSpeed: Double): Vehicle(name, color, weight)
,ICar,IFood
 {

    override fun start() {
        // Code to start a Car
        println("Car Started")
    }

    override fun stop() {
        // Code to stop a Car
        println("Car Stopped")
    }

     override fun start_interface() {
         TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
     }

     override fun startFood_interface() {
         TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
     }
 }