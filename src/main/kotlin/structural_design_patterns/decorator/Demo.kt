package structural_design_patterns.decorator

fun main() {
    println("Client: I've got a simple component")
    val simple = ConcreteComponent()
    Client.someClientCode(component = simple)

    val decoratorA = ConcreteDecoratorA(simple)
    val decoratorB = ConcreteDecoratorB(simple)

    println("Client: Now I've got a decorated component")
    Client.someClientCode(component = decoratorA)
}