package structural_design_patterns.flyweight

class Terrorist : Player {

    private val task: String = "PLANT A BOMB"
    private var weapon: String? = null

    override fun assignWeapon(weapon: String?) {
        this.weapon = weapon
    }

    override fun mission() {
        println("Terrorist with weapon $weapon | Task is $task")
    }
}