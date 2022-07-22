package behavior_design_pattern.chain_of_responsibility

abstract class Handler {

    private var _nextHandler: Handler? = null
    val nextHandler: Handler? get() = _nextHandler

    abstract fun handle(request: String): String?

    fun setNext(handler: Handler): Handler {
        _nextHandler = handler
        return handler
    }
}