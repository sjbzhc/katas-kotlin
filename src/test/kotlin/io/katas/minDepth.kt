package io.katas

import java.util.*

fun minDepth(root: TreeNode?): Int {
    if (root == null) return 0
    return if (root.left != null && root.right != null) Math.min(minDepth(root.left), minDepth(root.right)) + 1
    else if (root.left == null) minDepth(root.right) + 1
    else if (root.right == null) minDepth(root.left) + 1
    else 1
}

fun minDepthBFS(root: TreeNode?): Int {
    if (root == null) return 0
    val queue = LinkedList<TreeNode>()
    queue.add(root)
    var depth = 1
    while (!queue.isEmpty()) {
        val size = queue.size
        for(i in 0 until size) {
            val currentNode = queue.remove()
            if (currentNode.left == null && currentNode.right == null) return depth
            if (currentNode.left != null) queue.add(currentNode.left!!)
            if (currentNode.right != null) queue.add(currentNode.right!!)
        }
        depth++
    }
    return depth
}