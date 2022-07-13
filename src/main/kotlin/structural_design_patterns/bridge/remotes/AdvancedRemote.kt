package structural_design_patterns.bridge.remotes

import structural_design_patterns.bridge.devices.Device

class AdvancedRemote(device: Device) : BasicRemote(device) {

    fun mute() {
        println("Remote: mute")
        device.setVolume(0)
    }
}