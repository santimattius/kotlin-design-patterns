package behavior_design_pattern.command

class Invoker {

    private var start: Command? = null
    private var finish: Command? = null

    fun setOnStart(command: Command) {
        start = command
    }

    fun setOnFinish(command: Command) {
        finish = command
    }

    fun doSomethingImportant() {

        println("Invoker: Does anybody want something done before I begin?")

        start?.execute()

        println("Invoker: ...doing something really important...")
        println("Invoker: Does anybody want something done after I finish?")

        finish?.execute()
    }
}