package behavior_design_pattern.template_method

fun main() {
    println("Same client code can work with different subclasses:")
    Client.clientCode(use = ConcreteClass1())

    println("Same client code can work with different subclasses:")
    Client.clientCode(use = ConcreteClass2())
}