package creational_design_pattern.abstract_factory.factories

import creational_design_pattern.abstract_factory.button.Button
import creational_design_pattern.abstract_factory.button.MacOSButton
import creational_design_pattern.abstract_factory.checkbox.Checkbox
import creational_design_pattern.abstract_factory.checkbox.MacOSCheckbox

class MacOSFactory : GUIFactory {
    override fun createButton(): Button {
        return MacOSButton()
    }

    override fun createCheckbox(): Checkbox {
        return MacOSCheckbox()
    }
}