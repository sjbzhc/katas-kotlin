package io.katas

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions

class sortedArrayToBSTTest {

    @Test
    fun `empty array returns null`() {
        val list: IntArray = IntArray(0)
        Assertions.assertThat(sortedArrayToBST(list)).isEqualTo(null)
    }

    @Test
    fun `(1, 3) returns (1, 3)`() {
        val list: IntArray = intArrayOf(1, 3)
        val root = TreeNode(3)
        val left = TreeNode(1)
        root.left = left
        val result = sortedArrayToBST(list)
        Assertions.assertThat(inorderTraversal(result)).isEqualTo(inorderTraversal(root))
    }

    @Test
    fun `(-10,-3,0,5,9) returns tree of height (0,-3,9,-10,null,5)`() {
        val list: IntArray = intArrayOf(-10, -3, 0, 5, 9)
        val root = TreeNode(0)

        val left = TreeNode(-10)
        val left_r = TreeNode(-3)
        left.right = left_r

        val right = TreeNode(5)
        val right_r = TreeNode(9)
        right.right = right_r
        root.left = left
        root.right = right

        val result = sortedArrayToBST(list)
        Assertions.assertThat(inorderTraversal(result)).isEqualTo(inorderTraversal(root))
    }
}