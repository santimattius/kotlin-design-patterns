package creational_design_pattern.abstract_factory.checkbox

class MacOSCheckbox : Checkbox {
    override fun paint() {
        println("You have created MacOSCheckbox.")
    }
}