package structural_design_patterns.bridge.devices

class Radio : Device {

    private var on = false
    private var volume = 30
    private var channel = 1

    override fun isEnabled() = on

    override fun enable() {
        on = true
    }

    override fun disable() {
        on = false
    }

    override fun getVolume() = volume

    override fun setVolume(percent: Int) {
        volume = when {
            percent > 100 -> 100
            percent < 0 -> 0
            else -> percent
        }
    }

    override fun getChannel() = channel

    override fun setChannel(channel: Int) {
        this.channel = channel
    }

    override fun printStatus() {
        println("------------------------------------")
        println("| I'm radio.")
        println("| I'm " + if (on) "enabled" else "disabled")
        println("| Current volume is $volume%")
        println("| Current channel is $channel")
        println("------------------------------------\n")
    }
}