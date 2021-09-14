package io.katas

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions

class minDepthTest {
    @Test
    fun `min depth of (3,9,20,null,null,15,7) is 2`() {

        val root = TreeNode(3)
        val one_1 = TreeNode(9)


        val one_2 = TreeNode(20)
        val two_3 = TreeNode(15)
        val two_4 = TreeNode(7)
        one_2.left = two_3
        one_2.right = two_4

        root.left = one_1
        root.right = one_2

//        Assertions.assertThat(minDepth(root)).isEqualTo(2)
        Assertions.assertThat(minDepthBFS(root)).isEqualTo(2)
    }
}