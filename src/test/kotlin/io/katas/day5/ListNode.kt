package io.katas.day5

class ListNode(var `val`: Int) {
    var next: ListNode? = null

    override fun toString(): String {
        var str = StringBuilder()
        str.append(this.`val`)
        var node = this
        while (node.next != null) {
            node = node?.next!!
            str.append(node.`val`)
        }
        return str.toString()
    }
}