package behavior_design_pattern.chain_of_responsibility

class DogHandler : Handler() {
    override fun handle(request: String): String? {
        return if (request == "MeatBall") {
            "Dog: I'll eat the $request."
        } else {
            nextHandler?.handle(request = request)
        }
    }
}