package behavior_design_pattern.state

fun main() {
    val context = Context(ConcreteStateA())
    context.request1()
    context.request2()
}