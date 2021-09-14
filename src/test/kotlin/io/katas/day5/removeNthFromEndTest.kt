package io.katas.day5

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class removeNthFromEndTest {
    @Test
    fun `(1,2,3,4,5) and 2 returns (1,2,3,5)`() {
        val node1 = ListNode(1)
        val node2 = ListNode(2)
        val node3 = ListNode(3)
        val node4 = ListNode(4)
        val node5 = ListNode(5)

        node1.next = node2
        node2.next = node3
        node3.next = node4
        node4.next = node5

        val node1_2 = ListNode(1)
        val node2_2 = ListNode(2)
        val node3_2 = ListNode(3)
        val node5_2 = ListNode(5)

        node1_2.next = node2_2
        node2_2.next = node3_2
        node3_2.next = node5_2

        Assertions.assertThat(removeNthFromEnd(node1, 2).toString()).isEqualTo(node1_2.toString())
    }

    @Test
    fun `(1) and 1 returns ()`() {
        val node1 = ListNode(1)

        Assertions.assertThat(removeNthFromEnd(node1, 1)).isEqualTo(null)
    }
}