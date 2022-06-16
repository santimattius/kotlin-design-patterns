package creational_design_pattern.factory_method.factories

import creational_design_pattern.factory_method.Projector
import creational_design_pattern.factory_method.WifiProjector

class WifiFactory : ProjectorFactory {
    override fun createProjector(): Projector {
        return WifiProjector()
    }
}