package structural_design_patterns.flyweight

object PlayerFactory {

    private val hm = HashMap<String, Player>()

    fun getPlayer(type: String): Player? {
        return if (hm.containsKey(type)) {
            hm[type]
        } else {
            val p = when (type) {
                "Terrorist" -> {
                    println("Terrorist Created")
                    Terrorist()
                }
                "CounterTerrorist" -> {
                    println("Counter Terrorist Created")
                    CounterTerrorist()
                }
                else -> {
                    println("Unreachable code!")
                    null
                }
            } ?: return null
            hm[type] = p
            p
        }
    }
}