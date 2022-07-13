package structural_design_patterns.facade

interface Hotel {

    fun getMenus(): Menus
}

class NonVegRestaurant : Hotel {

    override fun getMenus(): Menus {
        return NonVegMenu()
    }
}

class VegRestaurant : Hotel {

    override fun getMenus(): Menus {
        return VegMenu()
    }
}

class VegNonBothRestaurant: Hotel{

    override fun getMenus(): Menus {
        return Both()
    }
}