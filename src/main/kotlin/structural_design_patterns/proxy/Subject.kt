package structural_design_patterns.proxy

/**
 * The Subject interface declares common operations for both RealSubject and
 * the Proxy. As long as the client works with RealSubject using this
 * interface, you'll be able to pass it a proxy instead of a real subject.
 */
interface Subject {

    fun request()
}

/**
 * he RealSubject contains some core business logic. Usually, RealSubjects are
 * capable of doing some useful work which may also be very slow or sensitive -
 * e.g. correcting input data. A Proxy can solve these issues without any
 * changes to the RealSubject's code.
 */
class RealSubject : Subject {
    override fun request() {
        println("RealSubject: Handling request.")
    }
}