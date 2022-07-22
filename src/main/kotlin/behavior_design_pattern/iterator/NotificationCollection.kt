package behavior_design_pattern.iterator

class NotificationCollection : Collection {
    var numberOfItems = 0
    var notificationList: Array<Notification> = arrayOf()

    init {
        addItem("Notification 1")
        addItem("Notification 2")
        addItem("Notification 3")
    }

    fun addItem(str: String) {
        val notification = Notification(str)
        if (numberOfItems >= MAX_ITEMS) {
            println("Full")
        } else {
            notificationList[numberOfItems] = notification
            numberOfItems += 1
        }
    }

    override fun makeIterator(): Iterator {
        return NotificationIterator(notificationList)
    }

    companion object {
        const val MAX_ITEMS = 6
    }
}