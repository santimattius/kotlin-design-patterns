package creational_design_pattern.factory_method

class BluetoothProjector : Projector {

    private var _currentPage = 0

    override val currentPage: Int
        get() = _currentPage

    override fun present(info: String) {
        println("Info is presented over Bluetooth: $info")
    }

    override fun update(page: Int) {
        _currentPage = page
    }
}