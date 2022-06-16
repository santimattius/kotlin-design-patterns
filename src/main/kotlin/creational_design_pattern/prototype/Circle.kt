package creational_design_pattern.prototype

class Circle(
    target: Circle? = null,
) : Shape(target = target) {

    var radius: Int? = target?.radius

    override fun clone(): Shape {
        return Circle(this)
    }

    override fun equals(other: Any?): Boolean {
        if (other !is Circle || !super.equals(other)) return false
        return other.radius == radius
    }

    override fun hashCode(): Int {
        var result = super.hashCode()
        result = 31 * result + (radius ?: 0)
        return result
    }
}