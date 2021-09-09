package io.katas

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions

class IsSameTreeTest {

    @Test
    fun `p = (1,2), q = (1,null,2) are different`() {
        val p_two = TreeNode(2)
        val p_one = TreeNode(1)
        p_one.left = p_two

        val q_two = TreeNode(2)
        val q_one = TreeNode(1)
        q_one.right = q_two

        Assertions.assertThat(isSameTree2(p_one, q_one)).isFalse
    }
}