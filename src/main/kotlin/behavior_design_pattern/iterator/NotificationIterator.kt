package behavior_design_pattern.iterator

// Notification iterator
class NotificationIterator(
    var notificationList: Array<Notification>
) : Iterator {
    // maintains curr pos of iterator over the array
    var pos = 0
    override fun next(): Any? {
        // return next element in the array and increment pos
        val notification = notificationList[pos]
        pos += 1
        return notification
    }

    override fun hasNext(): Boolean {
        return pos < notificationList.size
    }
}