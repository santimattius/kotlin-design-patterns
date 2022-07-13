package structural_design_patterns.flyweight

class CounterTerrorist : Player {

    private val task = "DIFFUSE BOMB"
    private var weapon: String? = null

    override fun assignWeapon(weapon: String?) {
        this.weapon = weapon
    }

    override fun mission() {
        println("Counter Terrorist with weapon $weapon | Task is $task")
    }
}