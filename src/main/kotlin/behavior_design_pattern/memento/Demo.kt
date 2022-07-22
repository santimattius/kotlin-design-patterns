package behavior_design_pattern.memento

fun main() {
    val originator = Originator(state= "Super-duper-super-puper-super.")
    val caretaker = Caretaker(originator= originator)

    caretaker.backup()
    originator.doSomething()

    caretaker.backup()
    originator.doSomething()

    caretaker.backup()
    originator.doSomething()

    println("")
    caretaker.showHistory()

    println("Client: Now, let's rollback!")
    caretaker.undo()

    println("Client: Once more!")
    caretaker.undo()
}