package structural_design_patterns.adapter

import kotlin.math.pow
import kotlin.math.sqrt

class SquarePegAdapter(private val peg: SquarePeg) : RoundPeg() {

    override val radius: Double
        get() = sqrt((peg.width / 2).pow(2) * 2)
}