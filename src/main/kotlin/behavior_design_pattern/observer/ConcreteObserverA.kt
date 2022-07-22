package behavior_design_pattern.observer

class ConcreteObserverA : Observer {
    override fun update(subject: Subject) {
        if (subject.state < 3) {
            println("ConcreteObserverA: Reacted to the event.")
        }
    }
}

class ConcreteObserverB : Observer {
    override fun update(subject: Subject) {
        if (subject.state >= 3) {
            println("ConcreteObserverB: Reacted to the event.")
        }
    }
}