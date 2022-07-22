package behavior_design_pattern.visitor


interface ShoppingCartVisitor {
    fun visit(book: Book): Int
    fun visit(fruit: Fruit): Int
}

class ShoppingCartVisitorImpl : ShoppingCartVisitor {
    override fun visit(book: Book): Int {
        var cost = 0
        //apply 5$ discount if book price is greater than 50
        cost = if (book.price > 50) {
            book.price - 5
        } else book.price
        println("Book ISBN::" + book.isbnNumber + " cost =" + cost)
        return cost
    }

    override fun visit(fruit: Fruit): Int {
        val cost = fruit.pricePerKg * fruit.weight
        println(fruit.name + " cost = " + cost)
        return cost
    }
}