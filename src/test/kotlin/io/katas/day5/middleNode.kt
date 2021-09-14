package io.katas.day5

fun middleNode(head: ListNode?): ListNode? {
    var node = head
    var counter = 1
    while (node?.next != null) {
        node = node.next
        counter++
    }
    node = head

    counter /= 2

    while (counter > 0) {
        node = node?.next
        counter--
    }
    return node
}

fun middleNode2(head: ListNode?): ListNode? {
    var slow = head
    var fast = head

    while(fast?.next != null) {
        slow = slow?.next
        fast = fast?.next?.next
    }
    return slow
}