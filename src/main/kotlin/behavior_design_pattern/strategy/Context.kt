package behavior_design_pattern.strategy

class Context(
    private var strategy: Strategy
) {

    /// The Context maintains a reference to one of the Strategy objects. The
    /// Context does not know the concrete class of a strategy. It should work
    /// with all strategies via the Strategy interface.


    /// Usually, the Context allows replacing a Strategy object at runtime.
    fun update(strategy: Strategy) {
        this.strategy = strategy
    }

    /// The Context delegates some work to the Strategy object instead of
    /// implementing multiple versions of the algorithm on its own.
    fun doSomeBusinessLogic() {
        print("Context: Sorting data using the strategy (not sure how it'll do it)\n")

        val result = strategy.doAlgorithm(arrayOf("a", "b", "c", "d", "e"))
        println(result.joinToString())
    }
}