package io.katas

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions

class IsSymmetricTest {

    @Test
    fun `(1,2,2,3,4,4,3) is symmetric`() {
        val root = TreeNode(1)
        val one_1 = TreeNode(2)
        val two_1 = TreeNode(3)
        val two_2 = TreeNode(4)
        one_1.left = two_1
        one_1.right = two_2


        val one_2 = TreeNode(2)
        val two_3 = TreeNode(4)
        val two_4 = TreeNode(3)
        one_2.left = two_3
        one_2.right = two_4

        root.left = one_1
        root.right = one_2


        Assertions.assertThat(isSymmetric(root)).isTrue
    }

    @Test
    fun `(1,2,2,null,3,null,3) is asymmetric`() {
        val root = TreeNode(1)
        val one_1 = TreeNode(2)
        val two_2 = TreeNode(3)
        one_1.right = two_2


        val one_2 = TreeNode(2)
        val two_4 = TreeNode(3)
        one_2.right = two_4

        root.left = one_1
        root.right = one_2


        Assertions.assertThat(isSymmetric(root)).isFalse
    }
}