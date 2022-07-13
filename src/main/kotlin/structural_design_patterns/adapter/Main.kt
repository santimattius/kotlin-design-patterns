package structural_design_patterns.adapter

fun main() {
    val hole = RoundHole(radius = 5.0)
    val rpeg = RoundPeg(_radius = 5.0)

    if (hole.fits(rpeg)) {
        println("Round peg r5 fits round hole r5.")
    }
    val smallSqPeg = SquarePeg(width = 2.0)
    val largeSqPeg = SquarePeg(width = 20.0)
    // hole.fits(smallSqPeg); // Won't compile.

    // Adapter solves the problem.
    // hole.fits(smallSqPeg); // Won't compile.

    // Adapter solves the problem.
    val smallSqPegAdapter = SquarePegAdapter(smallSqPeg)
    val largeSqPegAdapter = SquarePegAdapter(largeSqPeg)

    if (hole.fits(smallSqPegAdapter)) {
        println("Square peg w2 fits round hole r5.")
    }
    if (!hole.fits(largeSqPegAdapter)) {
        println("Square peg w20 does not fit into round hole r5.")
    }

}