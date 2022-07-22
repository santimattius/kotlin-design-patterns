package behavior_design_pattern.visitor

interface ItemElement {
    fun accept(visitor: ShoppingCartVisitor): Int
}

class Book(val price: Int, val isbnNumber: String) : ItemElement {

    override fun accept(visitor: ShoppingCartVisitor): Int {
        return visitor.visit(this)
    }
}

class Fruit(val pricePerKg: Int, val weight: Int, val name: String) : ItemElement {

    override fun accept(visitor: ShoppingCartVisitor): Int {
        return visitor.visit(this)
    }
}