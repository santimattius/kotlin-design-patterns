package behavior_design_pattern.chain_of_responsibility

fun main() {

    /// The other part of the client code constructs the actual chain.

    val monkey = MonkeyHandler()
    val squirrel = SquirrelHandler()
    val dog = DogHandler()

    monkey
        .setNext(handler = squirrel)
        .setNext(handler = dog)

    /// The client should be able to send a request to any handler, not just
    /// the first one in the chain.

    println("Chain= Monkey > Squirrel > Dog")

    Client.someClientCode(handler = monkey)

    print("Subchain= Squirrel > Dog")

    Client.someClientCode(handler = squirrel)

}