package io.katas

import kotlin.math.abs
import kotlin.math.max

class Solution {
    var result = true

    fun isBalanced(root: TreeNode?): Boolean {
        maxDepth(root)
        return result
    }

    fun maxDepth(root: TreeNode?): Int {
        if (root == null) return 0
        val l = maxDepth(root.left)
        val r = maxDepth(root.right)
        if (abs(l - r) > 1) result = false
        return 1 + max(l, r)
    }
}

