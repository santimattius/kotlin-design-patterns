package behavior_design_pattern.memento

import java.util.Date

interface Memento {
    val name: String
    var date: Date
}