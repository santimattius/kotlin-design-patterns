package structural_design_patterns.proxy

object Client {

    fun clientCode(subject: Subject) {
        subject.request()
    }
}