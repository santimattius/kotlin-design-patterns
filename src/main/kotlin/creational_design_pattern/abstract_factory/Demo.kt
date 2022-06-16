package creational_design_pattern.abstract_factory

import creational_design_pattern.abstract_factory.factories.MacOSFactory
import creational_design_pattern.abstract_factory.factories.WindowsFactory
import java.util.Locale

private fun configureApplication(): Application {
    val osName = System.getProperty("os.name").lowercase(Locale.getDefault())
    val factory = if (osName.contains("mac")) {
        MacOSFactory()
    } else {
        WindowsFactory()
    }
    return Application(factory)
}

fun main() {
    val application = configureApplication()
    application.print()
}