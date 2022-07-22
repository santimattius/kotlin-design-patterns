package behavior_design_pattern.iterator

class NotificationBar(private var notifications: NotificationCollection) {
    fun printNotifications() {
        val iterator = notifications.makeIterator()
        println("-------NOTIFICATION BAR------------")
        while (iterator.hasNext()) {
            val n = iterator.next() as Notification
            println(n.notification)
        }
    }
}