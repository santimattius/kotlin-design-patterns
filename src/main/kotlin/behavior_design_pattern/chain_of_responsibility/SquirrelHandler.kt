package behavior_design_pattern.chain_of_responsibility

class SquirrelHandler : Handler() {
    override fun handle(request: String): String? {
        return if (request == "MeatBall") {
            "Dog: I'll eat the $request.\n"
        } else {
            nextHandler?.handle(request = request)
        }
    }
}