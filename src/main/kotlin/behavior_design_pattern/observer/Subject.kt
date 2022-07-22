package behavior_design_pattern.observer

import kotlin.random.Random

class Subject {

    var state: Int = Random.nextInt()

    private val observers = mutableListOf<Observer>()

    fun attach(observer: Observer) {
        observers.add(observer)
    }

    fun detach(observer: Observer) {
        observers.removeIf { it == observer }
    }

    fun notifyChanges() {
        observers.forEach { it.update(this) }
    }

    fun someBusinessLogic() {
        println("Subject: I'm doing something important.")
        state = Random.nextInt()
        println("Subject: My state has just changed to: $state")
        notifyChanges()
    }
}