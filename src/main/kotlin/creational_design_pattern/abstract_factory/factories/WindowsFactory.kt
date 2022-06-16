package creational_design_pattern.abstract_factory.factories

import creational_design_pattern.abstract_factory.button.Button
import creational_design_pattern.abstract_factory.button.WindowsButton
import creational_design_pattern.abstract_factory.checkbox.Checkbox
import creational_design_pattern.abstract_factory.checkbox.WindowsCheckbox

class WindowsFactory : GUIFactory {
    override fun createButton(): Button {
        return WindowsButton()
    }

    override fun createCheckbox(): Checkbox {
        return WindowsCheckbox()
    }
}