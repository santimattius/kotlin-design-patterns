package creational_design_pattern.abstract_factory

import creational_design_pattern.abstract_factory.factories.GUIFactory

class Application(factory: GUIFactory) {

    private val button = factory.createButton()
    private val checkbox = factory.createCheckbox()

    fun print() {
        button.paint()
        checkbox.paint()
    }
}