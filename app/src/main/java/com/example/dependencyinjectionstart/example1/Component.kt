package com.example.dependencyinjectionstart.example1

class Component {

    fun getComponent(): Computer {
        val monitor = Monitor()
        val keyboard = Keyboard()
        val mouse = Mouse()
        val computerTower = ComputerTower(
            Storage(),
            Memory(),
            Processor()
        )
        return Computer(monitor, computerTower, keyboard, mouse)
    }

    fun inject(activity: Activity){
        activity.computer = getComponent()
        activity.keyboard = Keyboard()
    }
}