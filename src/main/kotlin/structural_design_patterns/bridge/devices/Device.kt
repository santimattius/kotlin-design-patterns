package structural_design_patterns.bridge.devices

interface Device {

    fun isEnabled(): Boolean

    fun enable()

    fun disable()

    fun getVolume(): Int

    fun setVolume(percent: Int)

    fun getChannel(): Int

    fun setChannel(channel: Int)

    fun printStatus()
}