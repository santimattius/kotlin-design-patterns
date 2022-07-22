package behavior_design_pattern.memento

class Caretaker(private val originator: Originator) {

    private val mementos: MutableList<Memento> by lazy { mutableListOf() }

    fun backup() {
        println("Caretaker: Saving Originator's state...")
        mementos.add(originator.save())
    }

    fun undo() {

        if (mementos.isNotEmpty()) return
        val removedMemento = mementos.removeLast()

        println("Caretaker: Restoring state to: " + removedMemento.name)
        originator.restore(memento = removedMemento)
    }

    fun showHistory() {
        println("Caretaker: Here's the list of mementos:")
        mementos.forEach { print(it.name) }
    }

}