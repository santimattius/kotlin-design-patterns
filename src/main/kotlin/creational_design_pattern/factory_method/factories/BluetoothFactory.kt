package creational_design_pattern.factory_method.factories

import creational_design_pattern.factory_method.BluetoothProjector
import creational_design_pattern.factory_method.Projector

class BluetoothFactory : ProjectorFactory {
    override fun createProjector(): Projector {
        return BluetoothProjector()
    }
}