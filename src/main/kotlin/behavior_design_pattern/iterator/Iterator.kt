package behavior_design_pattern.iterator

data class Notification(
    val notification: String
)

interface Collection {
    fun makeIterator(): Iterator?
}

// We could also use Iterator
interface Iterator {
    // indicates whether there are more elements to
    // iterate over
    operator fun hasNext(): Boolean

    // returns the next element
    operator fun next(): Any?
}


