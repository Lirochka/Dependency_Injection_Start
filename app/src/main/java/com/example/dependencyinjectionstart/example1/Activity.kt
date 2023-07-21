package com.example.dependencyinjectionstart.example1

class Activity {

    lateinit var computer: Computer
    lateinit var keyboard: Keyboard

    init {
        Component().inject(this)
        Component().inject(this)
    }
}