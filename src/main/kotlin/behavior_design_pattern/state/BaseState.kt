package behavior_design_pattern.state

abstract class BaseState(var context: Context? = null) : State {

    override fun update(context: Context) {
        this.context = context
    }

    override fun handle1() {}

    override fun handle2() {}
}