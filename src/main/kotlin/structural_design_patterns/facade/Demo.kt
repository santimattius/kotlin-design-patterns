package structural_design_patterns.facade


fun main() {
    val keeper = HotelKeeper()

    val v = keeper.getVegMenu()
    val nv = keeper.getNonVegMenu()
    val both = keeper.getVegNonMenu()
}