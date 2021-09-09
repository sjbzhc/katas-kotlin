package io.katas

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class isBalancedTest {

    @Test
    fun `(3,9,20,null,null,15,7) is balanced`() {
        val root = TreeNode(3)
        val left = TreeNode(9)
        val right = TreeNode(20)
        val right_l = TreeNode(15)
        val right_r = TreeNode(7)
        right.left = right_l
        right.right = right_r

        root.left = left
        root.right = right

        val solution = Solution()

        Assertions.assertThat(solution.isBalanced(root)).isTrue
    }

    @Test
    fun `(1,2,null,3) is not balanced`() {
        val root = TreeNode(1)
        val left = TreeNode(2)
        val left_l = TreeNode(3)
        left.left = left_l

        root.left = left


        val solution = Solution()

        Assertions.assertThat(solution.isBalanced(root)).isFalse
    }

    @Test
    fun `() is balanced`() {
        val root = null

        val solution = Solution()

        Assertions.assertThat(solution.isBalanced(root)).isTrue
    }
}