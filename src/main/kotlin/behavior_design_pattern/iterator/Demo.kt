package behavior_design_pattern.iterator

fun main() {
    val nc = NotificationCollection()
    val nb = NotificationBar(nc)
    nb.printNotifications()
}