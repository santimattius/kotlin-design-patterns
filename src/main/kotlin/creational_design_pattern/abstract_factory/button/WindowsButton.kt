package creational_design_pattern.abstract_factory.button

class WindowsButton : Button {
    override fun paint() {
        println("You have created WindowsButton.")
    }
}