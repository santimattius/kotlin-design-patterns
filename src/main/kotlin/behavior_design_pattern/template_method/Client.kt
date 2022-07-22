package behavior_design_pattern.template_method

object Client {

    fun clientCode(use: AbstractProtocol) {
        use.templateMethod()
    }
}