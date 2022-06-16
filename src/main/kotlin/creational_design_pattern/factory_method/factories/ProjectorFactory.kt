package creational_design_pattern.factory_method.factories

import creational_design_pattern.factory_method.Projector

interface ProjectorFactory {

    fun createProjector(): Projector

    fun syncedProjector(projector: Projector): Projector {
        val newProjector = createProjector()
        newProjector.sync(projector = projector)
        return newProjector
    }
}
