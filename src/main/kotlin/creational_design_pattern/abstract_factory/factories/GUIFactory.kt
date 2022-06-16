package creational_design_pattern.abstract_factory.factories

import creational_design_pattern.abstract_factory.button.Button
import creational_design_pattern.abstract_factory.checkbox.Checkbox

interface GUIFactory {

    fun createButton(): Button

    fun createCheckbox(): Checkbox
}