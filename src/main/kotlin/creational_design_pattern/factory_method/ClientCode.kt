package creational_design_pattern.factory_method

import creational_design_pattern.factory_method.factories.ProjectorFactory

class ClientCode {
    private var currentProjector: Projector? = null


    fun present(info: String, factory: ProjectorFactory) {

        val projector = currentProjector ?: run {
            val newProjector = factory.createProjector()
            newProjector.present(info)
            this@ClientCode.currentProjector = newProjector
            return
        }

        currentProjector = factory.syncedProjector(projector)
        currentProjector?.present(info)
    }
}