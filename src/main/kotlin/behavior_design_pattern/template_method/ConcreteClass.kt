package behavior_design_pattern.template_method

class ConcreteClass1 : AbstractProtocol {

    override fun requiredOperations1() {
        println("ConcreteClass1 says: Implemented Operation1")
    }

    override fun requiredOperation2() {
        println("ConcreteClass1 says: Implemented Operation2")
    }

    override fun hook2() {
        println("ConcreteClass1 says: Overridden Hook2")
    }
}

class ConcreteClass2 : AbstractProtocol {

    override fun requiredOperations1() {
        println("ConcreteClass2 says: Implemented Operation1")
    }

    override fun requiredOperation2() {
        println("ConcreteClass2 says: Implemented Operation2")
    }

    override fun hook1() {
        println("ConcreteClass2 says: Overridden Hook1")
    }
}