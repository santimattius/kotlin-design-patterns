package behavior_design_pattern.command

class SimpleCommand(
    private val payload: String
) : Command {

    override fun execute() {
        println("SimpleCommand: See, I can do simple things like printing ($payload)")
    }
}