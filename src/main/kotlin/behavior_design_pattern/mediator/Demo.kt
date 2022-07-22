package behavior_design_pattern.mediator

fun main() {
    val component1 = Component1()
    val component2 = Component2()

    val mediator = ConcreteMediator(component1 = component1, component2 = component2)
    println("Client triggers operation A.")
    component1.doA()

    println("Client triggers operation D.")
    component2.doD()

    println(mediator)
}