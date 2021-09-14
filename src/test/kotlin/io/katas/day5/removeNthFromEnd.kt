package io.katas.day5

fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    var node = head
    var last = 1
    var curr = node
    var previous = node

    while(node != null) {
        node = node.next
        if (node == null) break

        if(last == n) {
            previous = curr
            curr = curr!!.next
        } else last++
    }

    if (curr == head) return curr?.next

    previous!!.next = curr?.next

    return head

}