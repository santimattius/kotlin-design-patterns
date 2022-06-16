package creational_design_pattern.factory_method

interface Projector {

    val currentPage: Int

    fun present(info: String)

    fun sync(projector: Projector) {
        projector.update(currentPage)
    }

    fun update(page: Int)
}
