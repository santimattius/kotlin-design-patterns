package behavior_design_pattern.mediator

interface Mediator {

    fun notify(sender: BaseComponent, event: String)
}

class ConcreteMediator(
    private val component1: Component1,
    private val component2: Component2,
) : Mediator {

    override fun notify(sender: BaseComponent, event: String) {
        if (event == "A") {
            println("Mediator reacts on A and triggers following operations:")
            component2.doC()
        } else if (event == "D") {
            println("Mediator reacts on D and triggers following operations:")
            component1.doB()
            component2.doC()
        }
    }

}