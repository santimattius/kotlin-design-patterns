package behavior_design_pattern.state

class ConcreteStateB : BaseState() {

    override fun handle1() {
        println("ConcreteStateB handles request1.\n")
    }

    override fun handle2() {
        println("ConcreteStateB handles request2.")
        println("ConcreteStateB wants to change the state of the context.\n")
        context?.transitionTo(state = ConcreteStateA())
    }
}