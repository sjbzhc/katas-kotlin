package io.katas.day5

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class middleNodeTest {
    @Test
    fun `list (1,2,3,4,5) returns (3,4,5)`() {
        val node1 = ListNode(1)
        val node2 = ListNode(2)
        val node3 = ListNode(3)
        val node4 = ListNode(4)
        val node5 = ListNode(5)

        node1.next = node2
        node2.next = node3
        node3.next = node4
        node4.next = node5

        Assertions.assertThat(middleNode(node1)).isEqualTo(node3)
        Assertions.assertThat(middleNode2(node1)).isEqualTo(node3)
    }

    @Test
    fun `list (1,2,3,4,5,6) returns (4,5,6)`() {
        val node1 = ListNode(1)
        val node2 = ListNode(2)
        val node3 = ListNode(3)
        val node4 = ListNode(4)
        val node5 = ListNode(5)
        val node6 = ListNode(6)

        node1.next = node2
        node2.next = node3
        node3.next = node4
        node4.next = node5
        node5.next = node6

        Assertions.assertThat(middleNode(node1)).isEqualTo(node4)
        Assertions.assertThat(middleNode2(node1)).isEqualTo(node4)
    }
}