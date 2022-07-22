package behavior_design_pattern.command

fun main() {
    val invoker = Invoker()
    invoker.setOnStart(command = SimpleCommand(payload = "Say Hi!"))

    val receiver = Receiver()

    invoker.setOnFinish(
        command = ComplexCommand(
            receiver = receiver, a = "Send email", "Save report"
        )
    )
    invoker.doSomethingImportant()
}