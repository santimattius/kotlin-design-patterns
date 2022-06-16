package creational_design_pattern.abstract_factory.button

class MacOSButton : Button {
    override fun paint() {
        println("You have created MacOSButton.")
    }
}