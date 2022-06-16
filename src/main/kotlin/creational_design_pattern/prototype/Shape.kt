package creational_design_pattern.prototype


abstract class Shape constructor(
    target: Shape? = null
) {
    var x: Int? = target?.x
    var y: Int? = target?.y
    var color: String? = target?.color

    abstract fun clone(): Shape

    override fun equals(other: Any?): Boolean {
        if (other !is Shape) return false
        return other.x == x && other.y == y && other.color == color
    }

    override fun hashCode(): Int {
        var result = x ?: 0
        result = 31 * result + (y ?: 0)
        result = 31 * result + color.hashCode()
        return result
    }
}