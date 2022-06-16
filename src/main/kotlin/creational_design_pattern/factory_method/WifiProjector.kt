package creational_design_pattern.factory_method

class WifiProjector : Projector {

    private var _currentPage = 0

    override val currentPage: Int
        get() = _currentPage

    override fun present(info: String) {
        println("Info is presented over Wifi: $info")
    }

    override fun update(page: Int) {
        _currentPage = page
    }
}