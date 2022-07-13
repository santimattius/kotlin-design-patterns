package structural_design_patterns.bridge

import structural_design_patterns.bridge.devices.Device
import structural_design_patterns.bridge.devices.Radio
import structural_design_patterns.bridge.devices.Tv
import structural_design_patterns.bridge.remotes.AdvancedRemote

import structural_design_patterns.bridge.remotes.BasicRemote


fun main() {
    testDevice(Tv())
    testDevice(Radio())
}

private fun testDevice(device: Device) {
    println("Tests with basic remote.")
    val basicRemote = BasicRemote(device)
    basicRemote.power()
    device.printStatus()

    println("Tests with advanced remote.")
    val advancedRemote = AdvancedRemote(device)
    advancedRemote.power()
    advancedRemote.mute()
    device.printStatus()
}