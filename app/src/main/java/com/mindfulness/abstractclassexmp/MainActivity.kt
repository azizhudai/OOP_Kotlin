package com.mindfulness.abstractclassexmp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(),ICar,IFood {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val car = Car("Ferrari 812 Superfast", "red", 1525.0, 150,339.60)

        car.displayDetails()

        car.start()

        fun Int.carp(): Int {
            return this * 3
        }
        5.carp()
    }

    override fun start_interface() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun startFood_interface() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
