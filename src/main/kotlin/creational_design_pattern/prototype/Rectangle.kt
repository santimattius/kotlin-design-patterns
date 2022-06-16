package creational_design_pattern.prototype

class Rectangle constructor(
    target: Rectangle? = null
) : Shape(target) {

    var width: Int? = target?.width
    var height: Int? = target?.height

    override fun clone(): Shape = Rectangle(this)

    override fun equals(other: Any?): Boolean {
        if (other !is Rectangle || !super.equals(other)) return false
        return other.width == width && other.height == height
    }

    override fun hashCode(): Int {
        var result = super.hashCode()
        result = 31 * result + (width ?: 0)
        result = 31 * result + (height ?: 0)
        return result
    }
}