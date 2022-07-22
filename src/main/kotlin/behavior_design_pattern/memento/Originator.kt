package behavior_design_pattern.memento

import java.util.UUID

class Originator(var state: String) {

    init {
        println("Originator: My initial state is: $state")
    }

    fun doSomething() {
        print("Originator: I'm doing something important.")
        state = generateRandomString()
        print("Originator: and my state has changed to: $(state)")
    }

    private fun generateRandomString(): String {
        return UUID.randomUUID().toString()
    }

    /// Saves the current state inside a memento.
    fun save(): Memento {
        return ConcreteMemento(state = state)
    }

    /// Restores the Originator's state from a memento object.
    fun restore(memento: Memento) {
        val concreteMemento = memento as? ConcreteMemento ?: return
        state = concreteMemento.state
        print("Originator: My state has changed to: $state")
    }
}