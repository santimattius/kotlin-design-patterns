package behavior_design_pattern.visitor

fun main() {
    val items = arrayOf(
        Book(price = 20, isbnNumber = "1234"),
        Book(price = 100, isbnNumber = "5678"),
        Fruit(pricePerKg = 10, weight = 2, name = "Banana"),
        Fruit(pricePerKg = 5, weight = 5, name = "Apple")
    )
    val total = calculatePrice(items)
    println("Total Cost = $total")
}

private fun calculatePrice(items: Array<ItemElement>): Int {
    val visitor: ShoppingCartVisitor = ShoppingCartVisitorImpl()
    return items.sumOf { it.accept(visitor) }
}