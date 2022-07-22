package behavior_design_pattern.mediator

abstract class BaseComponent {

    protected var mediator: Mediator? = null

    fun update(mediator: Mediator) {
        this.mediator = mediator
    }

}

class Component1 : BaseComponent() {

    fun doA() {
        println("Component 1 does A.")
        mediator?.notify(sender = this, event = "A")
    }

    fun doB() {
        println("Component 1 does B.")
        mediator?.notify(sender = this, event = "B")
    }
}

class Component2 : BaseComponent() {

    fun doC() {
        println("Component 2 does C.")
        mediator?.notify(sender = this, event = "C")
    }

    fun doD() {
        println("Component 2 does D.")
        mediator?.notify(sender = this, event = "D")
    }
}
