package io.katas

import java.util.*
import kotlin.collections.ArrayList

fun inorderTraversal(root: TreeNode?): List<Int> {
    val stack : Stack<TreeNode> = Stack()
    var current = root
    val list : ArrayList<Int> = ArrayList()

    while(current != null || !stack.isEmpty()) {
        while(current != null) {
            stack.add(current)
            current = current.left
        }

        current = stack.pop()
        list.add(current.`val`)
        current = current.right
    }
return list
}