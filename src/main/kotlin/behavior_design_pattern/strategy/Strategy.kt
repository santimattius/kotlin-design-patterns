package behavior_design_pattern.strategy

interface Strategy {
    fun <T : Comparable<T>> doAlgorithm(values: Array<T>): Array<T>
}
