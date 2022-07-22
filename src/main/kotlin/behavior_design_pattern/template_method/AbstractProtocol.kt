package behavior_design_pattern.template_method

interface AbstractProtocol {
    /// The template method defines the skeleton of an algorithm.
    fun templateMethod() {
        baseOperation1()
        requiredOperations1()
        baseOperation2()
        hook1()
        requiredOperation2()
        baseOperation3()
        hook2()
    }

    /// These operations already have implementations.
    fun baseOperation1() {
        println("AbstractProtocol says: I am doing the bulk of the work")
    }

    fun baseOperation2() {
        println("AbstractProtocol says: But I let subclasses override some operations")
    }

    fun baseOperation3() {
        println("AbstractProtocol says: But I am doing the bulk of the work anyway")
    }

    /// These operations have to be implemented in subclasses.
    fun requiredOperations1()
    fun requiredOperation2()

    /// These are "hooks." Subclasses may override them, but it's not mandatory
    /// since the hooks already have default (but empty) implementation. Hooks
    /// provide additional extension points in some crucial places of the
    /// algorithm.
    fun hook1(){}
    fun hook2(){}
}
