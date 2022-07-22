package behavior_design_pattern.state

interface State {

    fun update(context: Context)

    fun handle1()

    fun handle2()
}