package behavior_design_pattern.command

class ComplexCommand(
    private val receiver: Receiver,
    private val a: String,
    private val b: String
) : Command {

    override fun execute() {
        println("ComplexCommand: Complex stuff should be done by a receiver object.")
        receiver.doSomething(a)
        receiver.doSomethingElse(b)
    }
}

class Receiver {

    fun doSomething(a: String) {
        println("Receiver: Working on ($a)")
    }

    fun doSomethingElse(b: String) {
        println("Receiver: Also working on ($b)")
    }
}