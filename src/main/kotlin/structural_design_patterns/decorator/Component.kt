package structural_design_patterns.decorator

interface Component {
    fun operation(): String
}

class ConcreteComponent : Component {
    override fun operation(): String {
        return this::class.simpleName.orEmpty()
    }
}

open class Decorator(private var component: Component) : Component {
    override fun operation(): String {
        return component.operation()
    }
}

class ConcreteDecoratorA(component: Component) : Decorator(component) {

    override fun operation(): String {
        return "ConcreteDecoratorA(${super.operation()})"
    }
}

class ConcreteDecoratorB(component: Component) : Decorator(component) {

    override fun operation(): String {
        return "ConcreteDecoratorB(${super.operation()})"
    }
}

object Client {

    fun someClientCode(component: Component) {
        println("Result: ${component.operation()}")
    }
}