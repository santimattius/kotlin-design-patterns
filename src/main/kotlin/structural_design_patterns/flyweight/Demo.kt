package structural_design_patterns.flyweight

import structural_design_patterns.flyweight.PlayerFactory.getPlayer
import kotlin.random.Random

private val playerType = arrayOf("Terrorist", "CounterTerrorist")
private val weapons = arrayOf("AK-47", "Maverick", "Gut Knife", "Desert Eagle")

fun main() {
    repeat(10) {
        val p = getPlayer(getRandPlayerType()) ?: return
        p.assignWeapon(getRandWeapon())
        p.mission()
    }
}

fun getRandPlayerType(): String {
    val randInt = Random.nextInt(playerType.size)
    return playerType[randInt]
}

fun getRandWeapon(): String {
    val randInt = Random.nextInt(weapons.size)
    return weapons[randInt]
}