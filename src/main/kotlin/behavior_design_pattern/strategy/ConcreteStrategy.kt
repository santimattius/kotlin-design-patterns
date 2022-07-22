package behavior_design_pattern.strategy

class ConcreteStrategyA : Strategy {

    override fun <T : Comparable<T>> doAlgorithm(values: Array<T>): Array<T> {
        return values.run {
            sort()
            this
        }
    }
}

class ConcreteStrategyB : Strategy {

    override fun <T : Comparable<T>> doAlgorithm(values: Array<T>): Array<T> {
        return values.run {
            sortDescending()
            this
        }
    }
}