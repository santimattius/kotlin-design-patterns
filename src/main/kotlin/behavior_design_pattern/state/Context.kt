package behavior_design_pattern.state

class Context(private var state: State) {

    init {
        transitionTo(state = state)
    }

    fun transitionTo(state: State) {
        print("Context: Transition to $state")
        this.state = state
        this.state.update(context = this)
    }

    fun request1() {
        state.handle1()
    }

    fun request2() {
        state.handle2()
    }
}