package behavior_design_pattern.state

class ConcreteStateA : BaseState() {

    override fun handle1() {
        println("ConcreteStateA handles request1.")
        println("ConcreteStateA wants to change the state of the context.")
        context?.transitionTo(state = ConcreteStateB())
    }

    override fun handle2() {
        println("ConcreteStateA handles request2.")
    }
}