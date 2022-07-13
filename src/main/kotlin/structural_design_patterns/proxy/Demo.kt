package structural_design_patterns.proxy

fun main() {
    println("Client: Executing the client code with a real subject:")
    val realSubject = RealSubject()
    Client.clientCode(subject = realSubject)

    println("Client: Executing the same client code with a proxy:")
    val proxy = Proxy(realSubject)
    Client.clientCode(subject = proxy)

}