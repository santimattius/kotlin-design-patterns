package structural_design_patterns.adapter

import kotlin.math.pow

class RoundHole(val radius: Double) {

    fun fits(peg: RoundPeg): Boolean {
        return this.radius >= peg.radius
    }
}

open class RoundPeg(private val _radius: Double = 0.0) {

    open val radius: Double get() = _radius

}

class SquarePeg(val width: Double) {

    fun getSquare(): Double {
        return width.pow(2.0)
    }
}