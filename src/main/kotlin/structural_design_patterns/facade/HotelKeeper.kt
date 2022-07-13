package structural_design_patterns.facade

/**
 * Facade class
 */
class HotelKeeper {

    fun getVegMenu(): VegMenu {
        val v = VegRestaurant()
        return v.getMenus() as VegMenu
    }

    fun getNonVegMenu(): NonVegMenu {
        val v = NonVegRestaurant()
        return v.getMenus() as NonVegMenu
    }

    fun getVegNonMenu(): Both {
        val v = VegNonBothRestaurant()
        return v.getMenus() as Both
    }
}