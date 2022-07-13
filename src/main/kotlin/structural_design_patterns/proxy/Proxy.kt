package structural_design_patterns.proxy

/**
 * The Proxy has an interface identical to the RealSubject.
 */
class Proxy(
    private val realSubject: RealSubject
) : Subject {

    override fun request() {
        if (checkAccess()) {
            realSubject.request()
            logAccess()
        }
    }

    private fun checkAccess(): Boolean {
        println("Proxy: Checking access prior to firing a real request.")
        return true
    }

    private fun logAccess() {
        println("Proxy: Logging the time of request.")
    }
}