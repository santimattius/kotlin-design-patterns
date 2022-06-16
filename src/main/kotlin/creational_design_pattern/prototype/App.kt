package creational_design_pattern.prototype


fun main() {
    val shapes = buildList {
        val circle = Circle().apply {
            this.x = 10
            this.y = 20
            this.radius = 15
            this.color = "red"
        }
        add(circle)
        add(circle.clone() as Circle)
        add(Rectangle().apply {
            width = 10
            height = 20
            color = "blue"
        })
    }

    cloneAndCompare(shapes)
}

fun cloneAndCompare(shapes: List<Shape>) {
    val shapesCloned = shapes.map { it.clone() }
    shapesCloned.zip(shapesCloned).forEachIndexed { index, pair ->
        if (pair.first != pair.second) {
            println("${index}: Shapes are different objects (yay!)")
        } else {
            println("${index}: Shape objects are the same (booo!)")
        }
    }
}
