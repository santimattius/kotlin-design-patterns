package behavior_design_pattern.memento

import java.util.Date

class ConcreteMemento( var state: String, override var date: Date = Date()) : Memento {

    override val name: String
        get() = "$state ${date.time}"
}