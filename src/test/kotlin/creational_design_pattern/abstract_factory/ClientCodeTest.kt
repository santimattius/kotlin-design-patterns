package creational_design_pattern.abstract_factory

import creational_design_pattern.factory_method.factories.BluetoothFactory
import creational_design_pattern.factory_method.factories.WifiFactory
import creational_design_pattern.factory_method.ClientCode
import kotlin.test.Test

class ClientCodeTest {

    @Test
    fun testSum() {

        val info = "Very important info of the presentation"

        val clientCode = ClientCode()

        //Wifi implementation
        clientCode.present(info, WifiFactory())
        //Bluetooth implementation
        clientCode.present(info, BluetoothFactory())
    }
}