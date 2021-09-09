package io.katas

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class InOrderTraversalTest {

    @Test
    internal fun `in order traversal`() {
        val treeNode1 = TreeNode(1);
        val treeNode2 = TreeNode(2);
        val treeNode3 = TreeNode(3);

        treeNode1.right = treeNode2;
        treeNode2.left = treeNode3;
        Assertions.assertThat(inorderTraversal(treeNode1)).isEqualTo(listOf(1, 3, 2))
    }
}
