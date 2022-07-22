package behavior_design_pattern.chain_of_responsibility

object Client {

    fun someClientCode(handler: Handler) {
        val food = arrayOf("Nut", "Banana", "Cup of coffee")
        food.forEach {
            println("Client: Who wants a $it?")

            val message = handler.handle(request = it)

            println(message ?: " $it was left untouched.")
        }
    }
}