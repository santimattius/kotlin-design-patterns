package behavior_design_pattern.strategy

fun main() {
    /// The client code picks a concrete strategy and passes it to the
    /// context. The client should be aware of the differences between
    /// strategies in order to make the right choice.

    val context = Context(strategy = ConcreteStrategyA())
    println("Client: Strategy is set to normal sorting.")
    context.doSomeBusinessLogic()

    println("Client: Strategy is set to reverse sorting.")
    context.update(strategy = ConcreteStrategyB())
    context.doSomeBusinessLogic()
}