package behavior_design_pattern.chain_of_responsibility

class MonkeyHandler : Handler() {

    override fun handle(request: String): String? {
        return if (request == "Banana") {
            "Monkey: I'll eat the $request.\n"
        } else {
            nextHandler?.handle(request = request)
        }
    }
}