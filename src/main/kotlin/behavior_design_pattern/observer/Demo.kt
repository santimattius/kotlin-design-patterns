package behavior_design_pattern.observer

fun main() {

    val subject = Subject()

    val observer1 = ConcreteObserverA()
    val observer2 = ConcreteObserverB()

    subject.attach(observer1)
    subject.attach(observer2)

    subject.someBusinessLogic()
    subject.someBusinessLogic()
    subject.detach(observer2)
    subject.someBusinessLogic()
}