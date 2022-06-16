package creational_design_pattern.abstract_factory.checkbox

class WindowsCheckbox : Checkbox {
    override fun paint() {
        println("You have created WindowsCheckbox.")
    }
}